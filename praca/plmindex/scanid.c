#include    "mkind.h"
#include    "scanid.h"
#include    <stdarg.h>

#define CHECK_LENGTH()	\
	if(i > len_field)\
	    goto OVERFLOW

Local  int     idx_lc;		       /* line count */
Local  int     idx_tc;		       /* total entry count */
Local  int     idx_ec;		       /* erroneous entry count */

Public int     idx_dc;		       /* number of dots printed so far */

Local 		Logical 	first_entry = True;
Local 		int 	comp_len;
Local unsigned  char 	key[ARGUMENT_MAX];
Local 		char 	no[NUMBER_MAX];

NODE_PTR head;
NODE_PTR tail;

Local   void    Idx_Error (const char *fmt, ...);
Local   int     Idx_Skipline (VOID_ARG);
Local	void	flush_to_eol (void);
Local	Logical	make_key (void);
Local	void	make_string (unsigned char **ppstr, int n);
Local	Logical	scan_alpha_lower (unsigned char *no, short *npg, \
								short *count);
Local	Logical	scan_alpha_upper (unsigned char *no, short *npg, \
								short *count);
Local	Logical	scan_arabic (unsigned char *no,short *npg, short *count);
Local	Logical	scan_arg1 (void);
Local	Logical	scan_arg2 (void);
Local	Logical	scan_field (int *n, unsigned char field[], int len_field,
		     Logical ck_level, Logical ck_encap, Logical ck_actual);
Local	Logical	scan_key (struct KFIELD *data);
Local	Logical	scan_no (unsigned char *no, short *npg, short *count, \
								short *type);
Local	Logical	scan_roman_lower (unsigned char *no, short *npg, \
								short *count);
Local	Logical	scan_roman_upper (unsigned char *no, short *npg, \
								short *count);

Public void
scan_idx(VOID_ARG)

{
    unsigned    char    	*keyword;
		int     	c;
		int     	i = 0;
		Logical     	not_eof = True;
		int     	arg_count = -1;

    if((keyword = (unsigned char *) calloc(1, ARRAY_MAX)) == NULL) 
	Fatal("Not enough core...abort.\n");
    Message("Scanning input file %s...", idx_fn);
    idx_lc = idx_tc = idx_ec = idx_dc = 0;
    comp_len = strlen(page_comp);
    while(not_eof) 
       {
	switch(c = GET_CHAR(idx_fp)) 
	   {
	    case EOF:
		if(arg_count == 2) 
		   {
		    idx_lc++;
		    if(make_key())
		       { 
			idx_dot = True; 
			if(idx_dc++ == 0) 
			    Message(DOT);
			if(idx_dc == DOT_MAX) 
			    idx_dc = 0; 
		       }
		    arg_count = -1;
		   }
		 else
		    not_eof = False;
		break;

	    case LFD:
		idx_lc++;
		if(arg_count == 2) 
		   {
		    if(make_key())
		       { 
			idx_dot = True; 
			if(idx_dc++ == 0) 
			    Message(DOT);
			if(idx_dc == DOT_MAX) 
			    idx_dc = 0; 
		       }
		    arg_count = -1;
		   }
		 else if(arg_count > -1) 
		   {
		    Idx_Error("Missing arguments -- need two " \
		    					"(premature LFD).\n");
		    arg_count = -1;
		   }
	    case TAB:
	    case SPC:
		break;

	    default:
		switch(arg_count) 
		   {
		    case -1:
			i = 0;
			keyword[i++] = (unsigned char) c;
			arg_count++;
			idx_tc++;
			break;
		    case 0:
			if(c == idx_aopen) 
			   {
			    arg_count++;
			    keyword[i] = EOS;
			    if(STREQ(keyword, idx_keyword)) 
			       {
				if(!scan_arg1()) 
				    arg_count = -1;
			       }
			     else 
			       {
				arg_count = Idx_Skipline();
				Idx_Error("Unknown index keyword %s.\n", 
								    keyword);
			       }
			   }
			 else 
			   {
			    if(i < ARRAY_MAX)
				keyword[i++] = (char) c;
			    else 
			       {
				arg_count = Idx_Skipline();
				Idx_Error("Index keyword %s too long " \
					    "(max %d).\n", keyword, ARRAY_MAX);
			       }
			   }
			break;
		    case 1:
			if(c == idx_aopen) 
			   {
			    arg_count++;
			    if(!scan_arg2()) 
				arg_count = -1;
			   }
			 else 
			   {
			    arg_count = Idx_Skipline();
			    Idx_Error("No opening delimiter for second " \
				    "argument (illegal character `%c').\n", c);
			   }
			break;
		    case 2:
			arg_count = Idx_Skipline();
			Idx_Error("No closing delimiter for second argument " \
					    "(illegal character `%c').\n", c);
			break;
		   }
		break;
	   }
       }
/*       {
        NODE_PTR aqq;

	aqq = head;

	while(aqq->next != NULL)
	   {
	    int i = 0;

	    for(i = 0; i < FIELD_MAX; i++)
	        printf("%s\n", aqq->data.sf[i]);
	    aqq = aqq->next;
	   }
       }*/

					/* fixup the total counts */
    idx_tt += idx_tc;
    idx_et += idx_ec;

    free(keyword);
    CLOSE(idx_fp);
    Message("done (%d %s, %d %s).\n", idx_tc - idx_ec, "entries accepted", 
							    idx_ec, "rejected");
}

Local void
flush_to_eol(VOID_ARG)

{	/* flush to end-of-line, or end-of-file, whichever is first */
    int a;

    while(((a = GET_CHAR(idx_fp)) != LFD) && (a != EOF))
    	;/* NO-OP */
}

Local Logical
make_key(VOID_ARG)

{
    NODE_PTR ptr;
    int     i;

    /* allocate and initialize a node */

#ifdef DEBUG
	totmem += sizeof(NODE);
	(void)fprintf(stderr,"make_key(): malloc(%d)\ttotmem = %ld\n",
							sizeof(NODE), totmem);
#endif /* DEBUG */

    if((ptr = (NODE_PTR) malloc(sizeof(NODE))) == NULL)
	Fatal("Not enough core...abort.\n");

    for(i = 0; i < FIELD_MAX; i++)
       {
	ptr->data.sf[i] = EMPTY_STRING;	 /* initialize fields to pointers */;
	ptr->data.af[i] = EMPTY_STRING;		/* to constant empty strings */
       }
    ptr->data.encap = EMPTY_STRING;
    ptr->data.lpg[0] = EOS;
    ptr->data.count = 0;
    ptr->data.type = EMPTY;

						/* process index key */
    if(!scan_key(&(ptr->data)))
	return(False);				/* WM OK*/

						    /* determine group type */
    ptr->data.group = group_type(ptr->data.sf[0]);

						/* process page number */
    strcpy(ptr->data.lpg, no);
    if(!scan_no((unsigned char *)no, ptr->data.npg, &(ptr->data.count), 
    							&(ptr->data.type)))
	return(False);

    if(first_entry) 
       {
	head = tail = ptr;
	first_entry = False;
       }
     else 
       {
	tail->next = ptr;
	tail = ptr;
       }
    ptr->data.lc = idx_lc;
    ptr->data.fn = idx_fn;
    tail->next = NULL;

    return(True);
}

Local void
make_string(unsigned char **ppstr, int n)

{
    if((*ppstr)[0] == EOS)		/* then we have an empty string */
       {
	(*ppstr) = (unsigned char*)malloc(n);
	if((*ppstr) == (unsigned char*)NULL)
	    Fatal("Not enough core...abort.\n");
	(*ppstr)[0] = EOS;
       }
}

Local Logical
scan_key(FIELD_PTR data)

{
    int     i = 0;		       /* current level */
    int     n = 0;		       /* index to the key[] array */
    int     second_round = False;
    int     last = FIELD_MAX - 1;

    while(True) 
       {
	if(key[n] == EOS)
	    break;
	if(key[n] == idx_encap)
	   {
	    n++;
	    make_string(&(data->encap), strlen((char *)key) + 1);
	    if(scan_field(&n, data->encap, strlen((char *)key), False, False, 
	    								False))
		break;
	    else
		return(False);
	   }
	if(key[n] == idx_actual) 
	   {
	    n++;
	    make_string(&(data->af[i]), strlen((char *)key) + 1);
	    if(i == last)
	       {
		if(!scan_field(&n, data->af[i], strlen((char *)key),
							False, True, False))
		    return(False);
	       }
	    else
	       {
		if(!scan_field(&n, data->af[i], strlen((char *)key), True, 
								True, False))
		    return(False);
	       }
	   }
         else 
	   {
						/* Next nesting level */
	    if(second_round) 
	       {
		i++;
		n++;
	       }
	    make_string(&(data->sf[i]), strlen((char *)key) + 1);
	    if(i == last)
	       {
		if(!scan_field(&n, data->sf[i], strlen((char *)key), False, 
								True, True))
		    return(False);
	       }
	    else
	       {
		if(!scan_field(&n, data->sf[i], strlen((char *)key), True, 
								    True, True))
		    return(False);
	       }
	    second_round = True;
	   }
	if((multilanguage[Language].flags & SPECIAL_FLAG) &&
		      multilanguage[Language]._special != NULL &&
			    (isdigit(data->sf[i][0]) && data->af[i][0] == EOS))
	   {
	    data->af[i] = data->sf[i];
	    data->sf[i] = (unsigned char *)
	      (*(multilanguage[Language]._special))(atol((char *)data->af[i]));
	   } 
       }

			/* check for empty fields which shouldn't be empty */
    if(*data->sf[0] == EOS) 
       {
	Idx_Error("Illegal null field.\n");
	return(False); 
       }
    for(i = 1; i < FIELD_MAX - 1; i++)
	if((*data->sf[i] == EOS) &&
			((*data->af[i] != EOS) || (*data->sf[i + 1] != EOS))) 
	   {
	    Idx_Error("Illegal null field.\n");
	    return(False); 
	   }
							/* i == FIELD_MAX-1 */
    if((*data->sf[i] == EOS) && (*data->af[i] != EOS)) 
       {
	Idx_Error("Illegal null field.\n");
	return(False); 
       }
    return(True);
}

Local Logical
scan_field(int *n, unsigned char field[], int len_field, Logical  ck_level, 
					Logical  ck_encap, Logical  ck_actual)

{
    int     i = 0;
    int     nbsh;		       /* backslash count */

    if(compress_blanks && ((key[*n] == SPC) || (key[*n] == TAB)))
	++* n;

    while(True) 
       {
	nbsh = 0;
	while(key[*n] == idx_escape)
	   {
	    nbsh++;
	    field[i++] = key[*n];
	    CHECK_LENGTH();
	    ++*n;
	   }

	if(key[*n] == idx_quote)
	   {
	    if(nbsh % 2 == 0)
		field[i++] = key[++*n];
	    else
		field[i++] = key[*n];
	    CHECK_LENGTH();
	   }
	else if((ck_level && (key[*n] == idx_level)) ||
			     (ck_encap && (key[*n] == idx_encap)) ||
				 (ck_actual && (key[*n] == idx_actual)) ||
							     (key[*n] == EOS))
	   {
	    if((i > 0) && compress_blanks && (field[i - 1] == SPC))
		field[i - 1] = EOS;
	    else
		field[i] = EOS;
	    return(True);
	   }
         else 
	   {
	    field[i++] = key[*n];
	    CHECK_LENGTH();
	    if((!ck_level) && (key[*n] == idx_level)) 
	       {
		Idx_Error("Extra `%c' at position %d of first argument.\n",
							   idx_level, *n + 1);
		return(False);
	       }
	     else if((!ck_encap) && (key[*n] == idx_encap)) 
	       {
		Idx_Error("Extra `%c' at position %d of first argument.\n",
							   idx_encap, *n + 1);
		return(False);
	       }
	     else if((!ck_actual) && (key[*n] == idx_actual)) 
	       {
		Idx_Error("Extra `%c' at position %d of first argument.\n",
							   idx_actual, *n + 1);
		return(False);
	       }
	   }
				/* check if max field length is reached */
	if(i > len_field)
	   {
OVERFLOW:
	    if(!ck_encap) 
		Idx_Error("Encapsulator of page number too long (max. %d).\n",
								  len_field);
	     else if(ck_actual) 
		Idx_Error("Index sort key too long (max. %d).\n", len_field);
	     else 
		Idx_Error("Text of key entry too long (max. %d).\n", len_field);
	    return(False);
	   }
	++*n;
       }
}

Public int
group_type(unsigned char *str)

{
    int     i = 0;

    while((str[i] != EOS) && ISDIGIT(str[i]))
	i++;

    if(str[i] == EOS) 
       {
	sscanf((char *)str, "%d", &i);
	return(i);
       }
     else if(ISSYMBOL(str[0]))
	return(SYMBOL);
    else
	return(ALPHA);
}

Local Logical
scan_no(unsigned char no[], short npg[], short *count, short *type)

{
    int     i = 1;

    if(isdigit(no[0])) 
       {
	*type = ARAB;
	if(!scan_arabic(no, npg, count))
	    return(False);
	    /* simple heuristic to determine if a letter is Roman or Alpha */
       }
     else if(IS_ROMAN_LOWER(no[0]) && (!IS_COMPOSITOR)) 
       {
	*type = ROML;
	if(!scan_roman_lower(no, npg, count))
	    return(False);
	    /* simple heuristic to determine if a letter is Roman or Alpha */
       }
     else if(IS_ROMAN_UPPER(no[0]) &&
				   ((no[0] == ROMAN_I) || (!IS_COMPOSITOR))) 
       {
	*type = ROMU;
	if(!scan_roman_upper(no, npg, count))
	    return(False);
       }
     else if(IS_ALPHA_LOWER(no[0])) 
       {
	*type = ALPL;
	if(!scan_alpha_lower(no, npg, count))
	    return(False);
       }
     else if(IS_ALPHA_UPPER(no[0])) 
       {
	*type = ALPU;
	if(!scan_alpha_upper(no, npg, count))
	    return(False);
       }
     else 
       {
	Idx_Error("Illegal page number %s.\n", no);
	return(False);
       }
    return(True);
}


Local Logical
scan_arabic(unsigned char no[], short npg[], short *count)

{
    short   i = 0;
    char    str[ARABIC_MAX + 1];		/* space for trailing EOS */

    while((no[i] != EOS) && (i <= ARABIC_MAX) && (!IS_COMPOSITOR))
       {
	if(isdigit(no[i])) 
	   {
	    str[i] = no[i];
	    i++;
	   }
         else 
	   {
	    Idx_Error("Illegal Arabic digit: position %d in %s.\n", i + 1, no);
	    return(False);
	   }
       }
    if(i > ARABIC_MAX) 
       {
	Idx_Error("Arabic page number %s too big (max %d digits).\n",
							       no, ARABIC_MAX);
	return(False);
       }
    str[i] = EOS;

    if(*count >= PAGEFIELD_MAX) 
       { 
	Idx_Error("Page number %s has too many fields (max. %d).", 
							   no, PAGEFIELD_MAX); 
	return(False); 
       } 
    npg[*count] = (strtoint(str) + page_offset[ARAB]); 
    ++*count; 

    if(IS_COMPOSITOR)
	return(scan_no(&no[i + comp_len], npg, count, &i));
    else
	return(True);
}

Local Logical
scan_roman_lower(unsigned char no[], short npg[], short *count)

{
    short   i = 0;
    int     inp = 0;
    int     prev = 0;
    int     the_new;

    while((no[i] != EOS) && (i < ROMAN_MAX) && (!IS_COMPOSITOR)) 
       {
	if((IS_ROMAN_LOWER(no[i])) &&
				    ((the_new = ROMAN_LOWER_VAL(no[i])) != 0)) 
	   {
	    if(prev == 0)
		prev = the_new;
	    else 
	       {
		if(prev < the_new) 
		   {
		    prev = the_new - prev;
		    the_new = 0;
		   }
		inp += prev;
		prev = the_new;
	       }
	   }
         else 
	   {
	    Idx_Error("Illegal Roman number: position %d in %s.\n", i + 1, no);
	    return(False);
	   }
	i++;
    }
    if(i == ROMAN_MAX) 
       {
	Idx_Error("Roman page number %s too big (max %d digits).\n",
							       no, ROMAN_MAX);
	return(False);
       }
    inp += prev;

    if(*count >= PAGEFIELD_MAX) 
       { 
	Idx_Error("Page number %s has too many fields (max. %d).", 
							   no, PAGEFIELD_MAX); 
	return(False); 
       } 
    npg[*count] = (inp + page_offset[ROML]); 
    ++*count; 

    if(IS_COMPOSITOR)
	return(scan_no(&no[i + comp_len], npg, count, &i));
    else
	return(True);
}

Local Logical
scan_roman_upper(unsigned char no[], short npg[], short *count)

{
    short   i = 0;
    int     inp = 0;
    int     prev = 0;
    int     the_new;

    while((no[i] != EOS) && (i < ROMAN_MAX) && (!IS_COMPOSITOR)) 
       {
	if((IS_ROMAN_UPPER(no[i])) &&
				    ((the_new = ROMAN_UPPER_VAL(no[i])) != 0)) 
	   {
	    if(prev == 0)
		prev = the_new;
	    else 
	       {
		if(prev < the_new) 
		   {
		    prev = the_new - prev;
		    the_new = 0;
		   }
		inp += prev;
		prev = the_new;
	       }
	   }
         else 
	   {
	    Idx_Error("Illegal Roman number: position %d in %s.\n", i + 1, no);
	    return(False);
	   }
	i++;
       }
    if(i == ROMAN_MAX) 
       {
	Idx_Error("Roman page number %s too big (max %d digits).\n",
							       no, ROMAN_MAX);
	return(False);
       }
    inp += prev;
    
    if(*count >= PAGEFIELD_MAX) 
       { 
	Idx_Error("Page number %s has too many fields (max. %d).", 
							   no, PAGEFIELD_MAX); 
	return(False); 
       } 
    npg[*count] = (inp + page_offset[ROMU]); 
    ++*count; 

    if(IS_COMPOSITOR)
	return(scan_no(&no[i + comp_len], npg, count, &i));
    else
	return(True);
}

Local Logical
scan_alpha_lower(unsigned char no[], short npg[], short *count)

{
    short   i;

    if(*count >= PAGEFIELD_MAX) 
       { 
	Idx_Error("Page number %s has too many fields (max. %d).", 
							   no, PAGEFIELD_MAX); 
	return(False); 
       } 
    npg[*count] = (ALPHA_VAL(no[0]) + page_offset[ALPL]); 
    ++*count; 

    i = 1;
    if(IS_COMPOSITOR)
	return(scan_no(&no[comp_len + 1], npg, count, &i));
    else
	return(True);
}

Local Logical
scan_alpha_upper(unsigned char no[], short npg[], short *count)

{
    short   i;

    if(*count >= PAGEFIELD_MAX) 
       { 
	Idx_Error("Page number %s has too many fields (max. %d).", 
							   no, PAGEFIELD_MAX); 
	return(False); 
       } 
    npg[*count] = (ALPHA_VAL(no[0]) + page_offset[ALPU]); 
    ++*count; 

    i = 1;
    if(IS_COMPOSITOR)
	return(scan_no(&no[comp_len + 1], npg, count, &i));
    else
	return(True);
}

Local Logical
scan_arg1(VOID_ARG)

{
    int     i = 0;
    int     n = 0;		       /* delimiter count */
    int     a;

    if(compress_blanks)
	while(((a = GET_CHAR(idx_fp)) == SPC) || (a == TAB))
	    ;
    else
	a = GET_CHAR(idx_fp);

    while((i < ARGUMENT_MAX) && (a != EOF))
       {
	if((a == idx_quote) || (a == idx_escape))
	   {				/* take next character literally */
	    key[i++] = (char) a;	/* but preserve quote or escape */
	    a = GET_CHAR(idx_fp);
	    key[i++] = (unsigned char)a;	/* save literal character */
	   }
	else if(a == idx_aopen)
	   {		/* opening delimiters within the argument list */
	    key[i++] = (unsigned char)a;
	    n++;
	   }
	else if(a == idx_aclose)
	   {
	    if(n == 0)			/* end of argument */
	       {
		if(compress_blanks && key[i - 1] == SPC)
		    key[i - 1] = EOS;
		else
		    key[i] = EOS;
		return(True);
	       }
	    else			/* nested delimiters */
	       {
		key[i++] = (unsigned char) a;
		n--;
	       }
	   }
	else
	   {
	    switch(a)
	       {
		case LFD:
		    idx_lc++;
		    Idx_Error("Incomplete first argument (premature LFD).\n");
		    return(False);
		case TAB:
		case SPC:
		    /* compress successive SPC's to one SPC */
		    if(compress_blanks)
		       {
			if((i > 0) && (key[i - 1] != SPC) && 
							    (key[i - 1] != TAB))
			    key[i++] = SPC;
			break;
		       }
		default:
		    key[i++] = (unsigned char) a;
		    break;
	       }
	   }
	a = GET_CHAR(idx_fp);
       }

    flush_to_eol();			/* Skip to end of line */
    idx_lc++;
    Idx_Error("First argument too long (max %d).\n", ARGUMENT_MAX);
    return(False);
}

Local Logical
scan_arg2(VOID_ARG)

{
    int     i = 0;
    int     a;
    int     hit_blank = False;

    while(((a = GET_CHAR(idx_fp)) == SPC) || (a == TAB))
	;

    while(i < NUMBER_MAX) 
       {
	if(a == idx_aclose) 
	   {
	    no[i] = EOS;
	    return(True);
	   }
         else
	    switch(a) 
	       {
		case LFD:
		    idx_lc++;
		    Idx_Error("Incomplete second argument (premature LFD).\n");
		    return(False);
		case TAB:
		case SPC:
		    hit_blank = True;
		    break;
		default:
		    if(hit_blank) 
		       {
			flush_to_eol();	/* Skip to end of line */
			idx_lc++;
			Idx_Error("Illegal space within numerals in second " \
								"argument.\n");
			return(False);
		       }
		    no[i++] = (char)a;
		    break;
	       }
	a = GET_CHAR(idx_fp);
       }
    flush_to_eol();	/* Skip to end of line */
    idx_lc++;
    Idx_Error("Second argument too long (max %d).\n", NUMBER_MAX);
    return(False);
}

Local void
Idx_Error(const char *fmt, ...) 

{ 
    va_list arg_ptr;
							
    va_start(arg_ptr, fmt);
    if(idx_dot) 
       { 
	fprintf(ilg_fp, "\n"); 
	idx_dot = False; 
       } 
    fprintf(ilg_fp, 
#if   KCC_20
	    "!! Input index error (file = %s, line = %d):\n\040\040 -- ", 
#else
	    "!! Input index error (file = %s, line = %d):\n   -- ", 
#endif
							    idx_fn, idx_lc); 
    vfprintf(ilg_fp, fmt, arg_ptr); 
    va_end(arg_ptr);
    idx_ec++; 
}

Local int
Idx_Skipline(VOID_ARG)

{
    int tmp; 

    while((tmp = GET_CHAR(idx_fp)) != LFD) 
	if(tmp == EOF) 
	    break; 
    idx_lc++; 
    return(-1); 
}
