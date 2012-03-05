/*
 *
 *  This file is part of
 *	MakeIndex - A formatter and format independent index processor
 *
 *  Copyright (C) 1989 by Chen & Harrison International Systems, Inc.
 *  Copyright (C) 1988 by Olivetti Research Center
 *  Copyright (C) 1987 by Regents of the University of California
 *
 *  Author:
 *	Pehong Chen
 *	Chen & Harrison International Systems, Inc.
 *	Palo Alto, California
 *	USA
 *	(phc@renoir.berkeley.edu or chen@orc.olivetti.com)
 *
 *  Contributors:
 *	Please refer to the CONTRIB file that comes with this release
 *	for a list of people who have contributed to this and/or previous
 *	release(s) of MakeIndex.
 *
 *  All rights reserved by the copyright holders.  See the copyright
 *  notice distributed with this software for a complete description of
 *  the conditions under which it is made available.
 *
 */

#include    "mkind.h"
#include    <stdarg.h>

#if sun				/* avoid conflict with symbol in */
				/* /usr/lang/SC1.0/include/CC/stdlib.h */
#define end	the_end
#endif

Local 		FIELD_PTR curr 		= NULL;
Local 		FIELD_PTR prev 		= NULL;
Local 		FIELD_PTR begin 	= NULL;
Local 		FIELD_PTR end 		= NULL;
Local 		FIELD_PTR range_ptr;
Local 		int 	level 		= 0;
Local 		int 	prev_level 	= 0;
Local unsigned  char     *encap 	= NULL;
Local unsigned  char     *prev_encap 	= NULL;
Local 		Logical 	in_range 	= False;
Local 		Logical 	encap_range 	= False;
Local 		char 	buff[2 * ARGUMENT_MAX];
Local 		char 	line[2 * ARGUMENT_MAX];	/* output buffer */
Local 		int 	ind_lc 		= 0;	/* overall line count */
Local 		int 	ind_ec 		= 0;	/* erroneous line count */
Local 		int 	ind_indent;

Local   void    Ind_Error (const char *F, ...);
Local	void	flush_line (int print);
Local	void	insert_page (void);
Local	int	make_entry (int n);
Local	void	make_item (unsigned char* term);
Local	void	new_entry (void);
Local	void	old_entry (void);
Local	int	page_diff (struct KFIELD *a, struct KFIELD *b);
Local	void	put_header (unsigned char let);
Local	void	wrap_line (int print);

Public void
gen_ind(VOID_ARG)

{
    int     n;
    int     tmp_lc;

    Message("Generating output file %s...", ind_fn);
    fputs(preamble, ind_fp);
    ind_lc += prelen;
    if(init_page)
	insert_page();

			    /* reset counters for putting out dots */
    idx_dc = 0;
    for(n = 0; n < idx_gt; n++)
       {
	if(idx_key[n]->type != DUPLICATE)
	    if(make_entry(n))
	       {
		idx_dot = True;
		if(idx_dc++ == 0)
		    Message(DOT);
		if(idx_dc == DOT_MAX)
		    idx_dc = 0;
	       }
       }
    tmp_lc = ind_lc;
    if(in_range)
       {
	curr = range_ptr;
	Ind_Error("Unmatched range opening operator %c.\n", idx_ropen);
       }
    prev = curr;
    flush_line(True);
    fputs(delim_t, ind_fp);
    fputs(postamble, ind_fp);
    tmp_lc = ind_lc + postlen;
    if(ind_ec == 1)
	Message("done (%d %s, %d %s).\n", tmp_lc, "lines written", ind_ec,
								    "warning");
    else
	Message("done (%d %s, %d %s).\n", tmp_lc, "lines written", ind_ec,
								    "warnings");
   }


Local int
make_entry(int n)

{
    unsigned char     let;

				/* determine current and previous pointer */
    prev = curr;
    curr = idx_key[n];
				/* check if current entry is in range */

    if((*curr->encap == idx_ropen) || (*curr->encap == idx_rclose))
	encap = &(curr->encap[1]);
     else
	encap = curr->encap;

				/* determine the current nesting level */
    if(n == 0)
       {
	prev_level = level = 0;
	let = *curr->sf[0];
	put_header(let);
	make_item(EMPTY_STRING);
       }
     else
       {
	prev_level = level;
	for(level = 0; level < FIELD_MAX; level++)
	    if(STRNEQ(curr->sf[level], prev->sf[level]) ||
				    STRNEQ(curr->af[level], prev->af[level]))
		break;
	if(level < FIELD_MAX)
	    new_entry();
	 else
	    old_entry();
       }

    if(*curr->encap == idx_ropen)
	if(in_range)
	    Ind_Error("Extra range opening operator %c.\n", idx_ropen);
	 else
	   {
	    in_range = True;
	    range_ptr = curr;
	   }
     else if(*curr->encap == idx_rclose)
	if(in_range)
	   {
	    in_range = False;
	    if(STRNEQ(&(curr->encap[1]), EMPTY_STRING) &&
				    STRNEQ(prev_encap, &(curr->encap[1])))
		Ind_Error("Range closing operator has an " \
			"inconsistent encapsulator %s.\n", &(curr->encap[1]));
	   }
	 else
	    Ind_Error("Unmatched range closing operator %c.\n", idx_rclose);
     else if((*curr->encap != EOS) &&
				 STRNEQ(curr->encap, prev_encap) && in_range)
	Ind_Error("Inconsistent page encapsulator %s within range.\n",
							      curr->encap);
    return(1);
}

Local void
make_item(unsigned char *term)

{
    int     i;

    if(level > prev_level)
       {
							/* ascending level */
	if(*curr->af[level] == EOS)
	    sprintf(line, "%s%s%s", term, item_u[level], curr->sf[level]);
	 else
	    sprintf(line, "%s%s%s", term, item_u[level], curr->af[level]);
	ind_lc += ilen_u[level];
       }
     else
       {
					/* same or descending level */
	if(*curr->af[level] == EOS)
	    sprintf(line, "%s%s%s", term, item_r[level], curr->sf[level]);
	 else
	    sprintf(line, "%s%s%s", term, item_r[level], curr->af[level]);
	ind_lc += ilen_r[level];
       }

    i = level + 1;
    while(i < FIELD_MAX && *curr->sf[i] != EOS)
       {
	fputs(line, ind_fp);
	if(*curr->af[i] == EOS)
	    sprintf(line, "%s%s", item_x[i], curr->sf[i]);
	 else
	    sprintf(line, "%s%s", item_x[i], curr->af[i]);
	ind_lc += ilen_x[i];
	level = i;		/* Added at 2.11 <brosig@gmdzi.gmd.de> */
	i++;
       }

    ind_indent = 0;
    strcat(line, delim_p[level]);
    begin = end = curr;
    prev_encap = encap;
}

Local void
new_entry(VOID_ARG)

{
    unsigned char    let;
    FIELD_PTR ptr;

    if(in_range)
       {
	ptr = curr;
	curr = range_ptr;
	Ind_Error("Unmatched range opening operator %c.\n", idx_ropen);
	in_range = False;
	curr = ptr;
       }
    flush_line(True);

    /* beginning of a new group? */

    if(((curr->group != ALPHA) && (curr->group != prev->group) &&
	     (prev->group == SYMBOL)) || ((curr->group == ALPHA) &&
			 ((let = TOLOWER(curr->sf[0][0])) !=
						   (TOLOWER(prev->sf[0][0])))))
       {
	fputs(delim_t, ind_fp);
	fputs(group_skip, ind_fp);
	ind_lc += skiplen;
				    /* beginning of a new letter? */
	put_header(let);
	make_item(EMPTY_STRING);
       }
     else
	make_item((unsigned char *)delim_t);
}

Local void
old_entry(VOID_ARG)

{
    int     diff;

    /* current entry identical to previous one: append pages */

    diff = page_diff(end, curr);

    if((prev->type == curr->type) && (diff != -1) &&
	(((diff == 0) && (prev_encap != NULL) && STREQ(encap, prev_encap)) ||
					     (merge_page && (diff == 1) &&
	      (prev_encap != NULL) && STREQ(encap, prev_encap)) || in_range))
       {
	end = curr;
				    /* extract in-range encaps out */

	if(in_range && (*curr->encap != EOS) &&
		(*curr->encap != idx_rclose) && STRNEQ(curr->encap, prev_encap))
	   {
	    sprintf(buff, "%s%s%s%s%s", encap_p, curr->encap,
						encap_i, curr->lpg, encap_s);
	    wrap_line(False);
	   }
	if(in_range)
	    encap_range = True;
       }
     else
       {
	flush_line(False);
	if((diff == 0) && (prev->type == curr->type))
	    Ind_Error("Conflicting entries: multiple encaps for the same " \
						    "page under same key.\n");
	 else if(in_range && (prev->type != curr->type))
	    Ind_Error("Illegal range formation: starting & ending pages are " \
						    "of different types.\n");
	 else if(in_range && (diff == -1))
	    Ind_Error("Illegal range formation: starting & ending pages " \
						    "cross chap/sec breaks.\n");
	begin = end = curr;
	prev_encap = encap;
       }
}

Local int
#if STDC
page_diff(FIELD_PTR a, FIELD_PTR b)
# else
page_diff(a, b)
FIELD_PTR a;
FIELD_PTR b;
#endif

{
    short   i;

    if(a->count != b->count)
	return(-1);
    for(i = 0; i < a->count - 1; i++)
	if(a->npg[i] != b->npg[i])
	    return(-1);
    return(b->npg[b->count - 1] - a->npg[a->count - 1]);
}

Local void
put_header(unsigned char let)

{
    if(headings_flag != 0)
       {
	fputs(heading_pre, ind_fp);
	ind_lc += headprelen;
	switch(curr->group)
	   {
	    case SYMBOL:
		if(headings_flag > 0)
		    fputs(symhead_pos, ind_fp);
		 else
		    fputs(symhead_neg, ind_fp);
		break;
	    case ALPHA:
		if(headings_flag > 0)
		    fputc(TOUPPER(let), ind_fp);
		 else
		    fputc(TOLOWER(let), ind_fp);
		break;
	    default:
		if(headings_flag > 0)
		    fputs(numhead_pos, ind_fp);
		 else
		    fputs(numhead_neg, ind_fp);
		break;
	   }
	fputs(heading_suf, ind_fp);
	ind_lc += headsuflen;
       }
}

/* changes for 2.12 (May 20, 1993) by Julian Reschke (jr@ms.maus.de):
   Use keywords suffix_2p, suffix_3p or suffix_mp for one, two or
   multiple page ranges (when defined) */

Local void
#if STDC
flush_line(int print)
# else
flush_line(print)
int     print;
#endif

{
    char    *tmp;

    if((tmp = (char *) calloc(1, sizeof(buff))) == NULL)
	Fatal("Not enough core...abort.\n");
    if(page_diff(begin, end) != 0)
	if(encap_range || (page_diff(begin, prev) > (*suffix_2p ? 0 : 1)))
	   {
	    int diff = page_diff(begin, end);

	    if((diff == 1) && *suffix_2p)
		sprintf(buff, "%s%s", begin->lpg, suffix_2p);
	     else if((diff == 2) && *suffix_3p)
		sprintf(buff, "%s%s", begin->lpg, suffix_3p);
	     else if((diff >= 2) && *suffix_mp)
		sprintf(buff, "%s%s", begin->lpg, suffix_mp);
	     else
		sprintf(buff, "%s%s%s", begin->lpg, delim_r, end->lpg);

	    encap_range = False;
	   }
	 else
	    sprintf(buff, "%s%s%s", begin->lpg, delim_n, end->lpg);
     else
       {
	encap_range = False; /* might be true from page range on same page */
	strcpy(buff, begin->lpg);
       }

    if(*prev_encap != EOS)
       {
	strcpy(tmp, buff);
	sprintf(buff, "%s%s%s%s%s", encap_p, prev_encap, encap_i, tmp, encap_s);
       }
    wrap_line(print);
    free(tmp);
}

Local void
#if STDC
wrap_line(int print)
# else
wrap_line(print)
int     print;
#endif

{
    int     len;

    len = strlen(line) + strlen(buff) + ind_indent;
    if(print)
       {
	if(len > linemax)
	   {
	    fputs(line, ind_fp);
	    fputc('\n', ind_fp);
	    ind_lc++;
	    fputs(indent_space, ind_fp);
	    ind_indent = indent_length;
	   }
	 else
	    fputs(line, ind_fp);
	fputs(buff, ind_fp);
       }
     else
       {
	if(len > linemax)
	   {
	    fputs(line, ind_fp);
	    fputc('\n', ind_fp);
	    ind_lc++;
	    sprintf(line, "%s%s%s", indent_space, buff, delim_n);
	    ind_indent = indent_length;
	   }
	 else
	   {
	    strcat(buff, delim_n);
	    strcat(line, buff);
	   }
       }
}

Local void
insert_page(VOID_ARG)

{
    int     i = 0;
    int     j = 0;
    int     page = 0;

    if(even_odd >= 0)
       {
					    /* find the rightmost digit */
	while(pageno[i++] != EOS)
	    ;
	j = --i;
					    /* find the leftmost digit */
	while(isdigit(pageno[--i]) && i > 0)
	    ;
	if(!isdigit(pageno[i]))
	    i++;
				    /* convert page from literal to numeric */
	page = strtoint(&pageno[i]) + 1;

					    /* check even-odd numbering */

	if(((even_odd == 1) && (page % 2 == 0)) ||
					((even_odd == 2) && (page % 2 == 1)))
	    page++;
	pageno[j + 1] = EOS;
				    /* convert page back to literal */
	while(page >= 10)
	   {
	    pageno[j--] = DIGTOASCII(page % 10);
	    page = page / 10;
	   }
	pageno[j] = DIGTOASCII(page);
	if(i < j)
	   {
	    while(pageno[j] != EOS)
		pageno[i++] = pageno[j++];
	    pageno[i] = EOS;
	   }
       }
    fputs(setpage_open, ind_fp);
    fputs(pageno, ind_fp);
    fputs(setpage_close, ind_fp);
    ind_lc += setpagelen;
}

Local void
Ind_Error(const char *fmt, ...)

{
    va_list arg_ptr;

    va_start(arg_ptr, fmt);
    if(idx_dot)
       {
	fprintf(ilg_fp, "\n");
	idx_dot = False;
       }
    fprintf(ilg_fp,
#if    KCC_20
"## Warning (input = %s, line = %d; output = %s, line = %d):\n\040\040 -- ",
#else
    "## Warning (input = %s, line = %d; output = %s, line = %d):\n   -- ",
#endif
				    curr->fn, curr->lc, ind_fn, ind_lc + 1);
    vfprintf(ilg_fp, fmt, arg_ptr);
    va_end(arg_ptr);
    ind_ec++;
}
