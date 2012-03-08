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
#include     <stdarg.h>
#include    "scanst.h"

Local int sty_lc = 0;                 /* line count */
Local int sty_tc = 0;                 /* total count */
Local int sty_ec = 0;                 /* error count */

Public unsigned char    idx_keyword[ARRAY_MAX] =  IDX_KEYWORD;
Public 		char    idx_aopen = 		 IDX_AOPEN;
Public 		char    idx_aclose = 		 IDX_ACLOSE;
Public 		char    idx_level = 		 IDX_LEVEL;
Public 		char    idx_ropen = 		 IDX_ROPEN;
Public 		char    idx_rclose = 		 IDX_RCLOSE;
Public 		char    idx_quote = 		 IDX_QUOTE;
Public 		char    idx_actual = 		 IDX_ACTUAL;
Public 		char    idx_encap = 		 IDX_ENCAP;
Public 		char    idx_escape = 		 IDX_ESCAPE;

Public char    preamble[ARRAY_MAX] 	= PREAMBLE_DEF;
Public char    postamble[ARRAY_MAX] 	= POSTAMBLE_DEF;
Public int     prelen 			= PREAMBLE_LEN;
Public int     postlen 			= POSTAMBLE_LEN;

Public char    setpage_open[ARRAY_MAX] 	= SETPAGEOPEN_DEF;
Public char    setpage_close[ARRAY_MAX] = SETPAGECLOSE_DEF;
Public int     setpagelen 		= SETPAGE_LEN;

Public char    group_skip[ARRAY_MAX] 	= GROUPSKIP_DEF;
Public int     skiplen 			= GROUPSKIP_LEN;

Public int     headings_flag 		= HEADINGSFLAG_DEF;
Public char    heading_pre[ARRAY_MAX] 	= HEADINGPRE_DEF;
Public char    heading_suf[ARRAY_MAX] 	= HEADINGSUF_DEF;
Public int     headprelen 		= HEADINGPRE_LEN;
Public int     headsuflen 		= HEADINGSUF_LEN;

Public char    symhead_pos[ARRAY_MAX] 	= SYMHEADPOS_DEF;
Public char    symhead_neg[ARRAY_MAX] 	= SYMHEADNEG_DEF;

Public char    numhead_pos[ARRAY_MAX] 	= NUMHEADPOS_DEF;
Public char    numhead_neg[ARRAY_MAX] 	= NUMHEADNEG_DEF;

Public char    item_r[FIELD_MAX][ARRAY_MAX] = {ITEM0_DEF, ITEM1_DEF, ITEM2_DEF,
								    ITEM3_DEF};
Public char    item_u[FIELD_MAX][ARRAY_MAX] = {"", ITEM1_DEF, ITEM2_DEF,
								    ITEM3_DEF};
Public char    item_x[FIELD_MAX][ARRAY_MAX] = {"", ITEM1_DEF, ITEM2_DEF,
								    ITEM3_DEF};

Public int     ilen_r[FIELD_MAX] = {ITEM_LEN, ITEM_LEN, ITEM_LEN, ITEM_LEN};
Public int     ilen_u[FIELD_MAX] = {0, ITEM_LEN, ITEM_LEN, ITEM_LEN};
Public int     ilen_x[FIELD_MAX] = {0, ITEM_LEN, ITEM_LEN, ITEM_LEN};

Public char    delim_p[FIELD_MAX][ARRAY_MAX] = {DELIM_DEF, DELIM_DEF, DELIM_DEF,
							DELIM_DEF};
Public char    delim_n[ARRAY_MAX] = DELIM_DEF;
						    /* page number separator */
Public char    delim_r[ARRAY_MAX] = DELIMR_DEF;
						    /* page range designator */
Public char    delim_t[ARRAY_MAX] = DELIMT_DEF;
					   /* page list terminating delimiter */

Public char    suffix_2p[ARRAY_MAX] = "";      /* suffix for two page ranges */
Public char    suffix_3p[ARRAY_MAX] = "";      /* suffix for three page ranges*/
Public char    suffix_mp[ARRAY_MAX] = "";
					   /* suffix for multiple page ranges */

Public char    encap_p[ARRAY_MAX] = ENCAP0_DEF;       /* encapsulator prefix */
Public char    encap_i[ARRAY_MAX] = ENCAP1_DEF;       /* encapsulator infix */
Public char    encap_s[ARRAY_MAX] = ENCAP2_DEF;       /* encapsulator postfix */

Public int     linemax = LINE_MAX;

Public int     indent_length 		= INDENTLEN_DEF;
Public char    indent_space[ARRAY_MAX] 	= INDENTSPC_DEF;

Public char    page_comp[ARRAY_MAX] 	= COMPOSITOR_DEF;
Public int     page_offset[PAGETYPE_MAX] =
   {
    0,
    ROMAN_LOWER_OFFSET,
    ROMAN_LOWER_OFFSET + ARABIC_OFFSET,
    ROMAN_LOWER_OFFSET + ARABIC_OFFSET + ALPHA_LOWER_OFFSET,
    ROMAN_LOWER_OFFSET + ARABIC_OFFSET + ALPHA_LOWER_OFFSET + ROMAN_UPPER_OFFSET
   };

Local char page_prec[ARRAY_MAX] = PRECEDENCE_DEF;

Local int put_dot;

Local   void    Sty_Error_prec(const char ch, const char *str);
Local   void    Sty_Error(const char *F, ...);
Local   void    Sty_Skipline (void);
Local	int	count_lfd (char *str);
Local	int	next_nonblank (void);
Local	Logical	process_precedence (void);
Local	Logical	scan_char (unsigned char *c);
Local	Logical	scan_spec (unsigned char *spec);
Local	Logical	scan_string (unsigned char *str);

Public void
scan_sty(VOID_ARG)

{
    unsigned char    *spec;
    	     int     tmp;

    if((spec = (unsigned char *)calloc(1, STRING_MAX)) == NULL)
	Fatal("Not enough core...abort.\n");
    Message("Scanning style file %s...", sty_fn);
    while(scan_spec(spec))
       {
	sty_tc++;
	put_dot = True;

					/* output pre- and post-ambles */
	if(STREQ(spec, PREAMBLE))
	   {
	    (void) scan_string((unsigned char *)preamble);
	    prelen = count_lfd(preamble);
	   }
        else if(STREQ(spec, POSTAMBLE))
	   {
	    (void) scan_string((unsigned char *)postamble);
	    postlen = count_lfd(postamble);
	   }
        else if(STREQ(spec, GROUP_SKIP))
	   {
	    (void) scan_string((unsigned char *)group_skip);
	    skiplen = count_lfd(group_skip);
	   }

	else if(STREQ(spec, HEADINGS_FLAG))
	    fscanf(sty_fp, "%d", &headings_flag);
        else if(STREQ(spec, HEADING_PRE))
	   {
	    (void) scan_string((unsigned char *)heading_pre);
	    headprelen = count_lfd(heading_pre);
	   }
        else if(STREQ(spec, HEADING_SUF))
	   {
	    (void) scan_string((unsigned char *)heading_suf);
	    headsuflen = count_lfd(heading_suf);
	   }
        else if(STREQ(spec, SYMHEAD_POS))
	   {
	    (void) scan_string((unsigned char *)symhead_pos);
	   }
        else if(STREQ(spec, SYMHEAD_NEG))
	   {
	    (void) scan_string((unsigned char *)symhead_neg);
	   }
        else if(STREQ(spec, NUMHEAD_POS))
	   {
	    (void) scan_string((unsigned char *)numhead_pos);
	   }
        else if(STREQ(spec, NUMHEAD_NEG))
	   {
	    (void) scan_string((unsigned char *)numhead_neg);
	   }
        else if(STREQ(spec, SETPAGEOPEN))
	   {
	    (void) scan_string((unsigned char *)setpage_open);
	    setpagelen = count_lfd(setpage_open);
	   }
        else if(STREQ(spec, SETPAGECLOSE))
	   {
	    (void) scan_string((unsigned char *)setpage_close);
	    setpagelen = count_lfd(setpage_close);
					/* output index item commands */
	   }
        else if(STREQ(spec, ITEM_0))
	   {
	    (void) scan_string((unsigned char *)item_r[0]);
	    ilen_r[0] = count_lfd(item_r[0]);
	   }
        else if(STREQ(spec, ITEM_1))
	   {
	    (void) scan_string((unsigned char *)item_r[1]);
	    ilen_r[1] = count_lfd(item_r[1]);
	   }
        else if(STREQ(spec, ITEM_2))
	   {
	    (void) scan_string((unsigned char *)item_r[2]);
	    ilen_r[2] = count_lfd(item_r[2]);
	   }
        else if(STREQ(spec, ITEM_01))
	   {
	    (void) scan_string((unsigned char *)item_u[1]);
	    ilen_u[1] = count_lfd(item_u[1]);
	   }
        else if(STREQ(spec, ITEM_12))
	   {
	    (void) scan_string((unsigned char *)item_u[2]);
	    ilen_u[2] = count_lfd(item_u[2]);
	   }
        else if(STREQ(spec, ITEM_x1))
	   {
	    (void) scan_string((unsigned char *)item_x[1]);
	    ilen_x[1] = count_lfd(item_x[1]);
	   }
        else if(STREQ(spec, ITEM_x2))
	   {
	    (void) scan_string((unsigned char *)item_x[2]);
	    ilen_x[2] = count_lfd(item_x[2]);
					    /* output encapsulators */
	   }
        else if(STREQ(spec, ENCAP_0))
	    (void) scan_string((unsigned char *)encap_p);
	else if(STREQ(spec, ENCAP_1))
	    (void) scan_string((unsigned char *)encap_i);
	else if(STREQ(spec, ENCAP_2))
	    (void) scan_string((unsigned char *)encap_s);
					    /* output delimiters */
	else if(STREQ(spec, DELIM_0))
	    (void) scan_string((unsigned char *)delim_p[0]);
	else if(STREQ(spec, DELIM_1))
	    (void) scan_string((unsigned char *)delim_p[1]);
	else if(STREQ(spec, DELIM_2))
	    (void) scan_string((unsigned char *)delim_p[2]);
	else if(STREQ(spec, DELIM_N))
	    (void) scan_string((unsigned char *)delim_n);
	else if(STREQ(spec, DELIM_R))
	    (void) scan_string((unsigned char *)delim_r);
	else if(STREQ(spec, DELIM_T))
	    (void) scan_string((unsigned char *)delim_t);
	else if(STREQ(spec, SUFFIX_2P))
	    (void) scan_string((unsigned char *)suffix_2p);
	else if(STREQ(spec, SUFFIX_3P))
	    (void) scan_string((unsigned char *)suffix_3p);
	else if(STREQ(spec, SUFFIX_MP))
	    (void) scan_string((unsigned char *)suffix_mp);
						/* output line width */
	else if(STREQ(spec, LINEMAX))
	   {
	    fscanf(sty_fp, "%d", &tmp);
	    if(tmp > 0)
		linemax = tmp;
	    else
		Sty_Error("%s must be positive (got %d)", LINEMAX, tmp);
				    /* output line indentation length */
	   }
        else if(STREQ(spec, INDENT_LENGTH))
	   {
	    fscanf(sty_fp, "%d", &tmp);
	    if(tmp >= 0)
		indent_length = tmp;
	    else
		Sty_Error("%s must be nonnegative (got %d)", INDENT_LENGTH,
									tmp);
			    /* output line indentation */
	   }
        else if(STREQ(spec, INDENT_SPACE))
	   {
	    (void) scan_string((unsigned char *)indent_space);
					    /* composite page delimiter */
	   }
        else if(STREQ(spec, COMPOSITOR))
	   {
	    (void) scan_string((unsigned char *)page_comp);
						/* page precedence */
	   }
        else if(STREQ(spec, PRECEDENCE))
	   {
	    (void) scan_string((unsigned char *)page_prec);
	    (void) process_precedence();
						/* index input format */
	   }
        else if(STREQ(spec, KEYWORD))
	    (void) scan_string(idx_keyword);
	else if(STREQ(spec, AOPEN))
	    (void) scan_char((unsigned char *)&idx_aopen);
	else if(STREQ(spec, ACLOSE))
	    (void) scan_char((unsigned char *)&idx_aclose);
	else if(STREQ(spec, LEVEL))
	    (void) scan_char((unsigned char *)&idx_level);
	else if(STREQ(spec, ROPEN))
	    (void) scan_char((unsigned char *)&idx_ropen);
	else if(STREQ(spec, RCLOSE))
	    (void) scan_char((unsigned char *)&idx_rclose);
	else if(STREQ(spec, QUOTE))
	    (void) scan_char((unsigned char *)&idx_quote);
	else if(STREQ(spec, ACTUAL))
	    (void) scan_char((unsigned char *)&idx_actual);
	else if(STREQ(spec, ENCAP))
	    (void) scan_char((unsigned char *)&idx_encap);
	else if(STREQ(spec, ESCAPE))
	    (void) scan_char((unsigned char *)&idx_escape);
	else
	   {
	    (void) next_nonblank();
	    Sty_Skipline();
	    Sty_Error("Unknown specifier %s.\n", spec);
	    put_dot = False;
	   }
	if(put_dot)
	   {
	    idx_dot = True;
	    Message(DOT);
	   }
       }

    /* check if quote and escape are distinct */
    if(idx_quote == idx_escape)
       {
	Sty_Error(
	       "Quote and escape symbols must be distinct (both `%c' now).\n",
								   idx_quote);
	idx_quote = IDX_QUOTE;
	idx_escape = IDX_ESCAPE;
       }
    CLOSE(sty_fp);
    free(spec);
    Message("done (%d %s, %d %s).\n", sty_tc - sty_ec, "attributes redefined",
							    sty_ec, "ignored");
}

Local Logical
scan_spec(unsigned char spec[])

{
    int     i = 0;
    int     c;

    while(True)
	if((c = next_nonblank()) == -1)
	    return(False);
	else if(c == COMMENT)
	    Sty_Skipline();
        else
	    break;

    spec[0] = TOLOWER(c);
    while((i++ < STRING_MAX) && ((c = GET_CHAR(sty_fp)) != SPC) &&
				       (c != TAB) && (c != LFD) && (c != EOF))
	spec[i] = TOLOWER(c);
    if(i < STRING_MAX)
       {
	spec[i] = EOS;
	if(c == EOF)
	   {
	    Sty_Error("No attribute for specifier %s (premature EOF)\n", spec);
	    return(False);
	   }
	if(c == LFD)
	    sty_lc++;
	return(True);
       }
    else
       {
	Sty_Error("Specifier %s too long (max %d).\n", spec, STRING_MAX);
	return(False);
       }
}

Local int
next_nonblank(VOID_ARG)

{
    int     c;

    while(True)
       {
	switch(c = GET_CHAR(sty_fp))
	   {
	    case EOF:
		return(-1);
	    case LFD:
		sty_lc++;
	    case SPC:
	    case TAB:
		break;
	    default:
		return(c);
	   }
       }
}

Local Logical
scan_string(unsigned char str[])

{
    char    *clone;
    int     i = 0;
    int     c;

    if((clone = (char *) calloc(1, ARRAY_MAX)) == NULL)
	Fatal("Not enough core...abort.\n");
    switch(c = next_nonblank())
       {
	case STR_DELIM:
	    while(True)
		switch(c = GET_CHAR(sty_fp))
		   {
		    case EOF:
			Sty_Error("No closing delimiter in %s.\n", clone);
			free(clone);
			return(False);
		    case STR_DELIM:
			clone[i] = EOS;
			strcpy((char *)str, clone);
			free(clone);
			return(True);
		    case BSH:
			switch(c = GET_CHAR(sty_fp))
			   {
			    case 't':
				clone[i++] = TAB;
				break;
			    case 'n':
				clone[i++] = LFD;
				break;

			    default:
				clone[i++] = (char) c;
			   }
			break;
		    default:
			if(c == LFD)
			    sty_lc++;
			if(i < ARRAY_MAX)
			    clone[i++] = (char) c;
			else
			   {
			    Sty_Skipline();
			    Sty_Error(
				   "Attribute string %s too long (max %d).\n",
							   clone, ARRAY_MAX);
			    free(clone);
			    return(False);
			   }
		   }
	case COMMENT:
	    Sty_Skipline();
	    break;
	default:
	    Sty_Skipline();
	    Sty_Error("No opening delimiter.\n");
	    free(clone);
	    return(False);
       }
    free(clone);
    return(True);                     /* function value no longer used */
}

Local Logical
scan_char(unsigned char *c)

{
    int     clone;

    switch(clone = next_nonblank())
       {
    case CHR_DELIM:
	switch(clone = GET_CHAR(sty_fp))
	   {
	    case CHR_DELIM:
		Sty_Skipline();
		Sty_Error("Premature closing delimiter.\n");
		return(False);
	    case LFD:
		sty_lc++;
	    case EOF:
		Sty_Error("No character (premature EOF).\n");
		return(False);
	    case BSH:
		clone = GET_CHAR(sty_fp);
	    default:
		if(GET_CHAR(sty_fp) == CHR_DELIM)
		   {
		    *c = (char) clone;
		    return(True);
		   }
		else
		   {
		    Sty_Error("No closing delimiter or too many letters.\n");
		    return(False);
		   }
	   }
	/* break; */				/* NOT REACHED */
    case COMMENT:
	Sty_Skipline();
	break;
    default:
	Sty_Skipline();
	Sty_Error("No opening delimiter.\n");
	return(False);
       }
    return(True);                     /* function value no longer used */
}


Local int
count_lfd(char *str)

{
    register int     i = 0;
    register int     n = 0;

    while(str[i] != EOS)
       {
	if(str[i] == LFD)
	    n++;
	i++;
       }
    return(n);
}

Local Logical
process_precedence(VOID_ARG)

{
    int     	order[PAGETYPE_MAX];
    int     	type[PAGETYPE_MAX];
    int     	i = 0;
    int     	last;
    Logical     roml = False;
    Logical     romu = False;
    Logical     arab = False;
    Logical     alpl = False;
    Logical     alpu = False;

				    /* check for llegal specifiers first */

    while((i < PAGETYPE_MAX) && (page_prec[i] != EOS))
       {
	switch(page_prec[i])
	   {
	    case ROMAN_LOWER:
		if(roml)
		   {
		    Sty_Error_prec(ROMAN_LOWER, page_prec);
		    return(False);
		   }
		else
		    roml = True;
		break;
	    case ROMAN_UPPER:
		if(romu)
		   {
		    Sty_Error_prec(ROMAN_UPPER, page_prec);
		    return(False);
		   }
		else
		    romu = True;
		break;
	    case ARABIC:
		if(arab)
		   {
		    Sty_Error_prec(ARABIC, page_prec);
		    return(False);
		   }
		else
		    arab = True;
		break;
	    case ALPHA_LOWER:
		if(alpl)
		   {
		    Sty_Error_prec(ALPHA_LOWER, page_prec);
		    return(False);
		   }
		else
		    alpl = True;
		break;
	    case ALPHA_UPPER:
		if(alpu)
		   {
		    Sty_Error_prec(ALPHA_UPPER, page_prec);
		    return(False);
		   }
		else
		    alpu = True;
		break;
	    default:
		Sty_Skipline();
		Sty_Error("Unknow type `%c' in page precedence " \
					    "specification.\n", page_prec[i]);
		return(False);
	   }
	i++;
       }
    if(page_prec[i] != EOS)
       {
	Sty_Skipline();
	Sty_Error("Page precedence specification string too long.\n");
	return(False);
       }
    last = i;
    switch(page_prec[0])
       {
	case ROMAN_LOWER:
	    order[0] = ROMAN_LOWER_OFFSET;
	    type[0] = ROML;
	    break;
	case ROMAN_UPPER:
	    order[0] = ROMAN_UPPER_OFFSET;
	    type[0] = ROMU;
	    break;
	case ARABIC:
	    order[0] = ARABIC_OFFSET;
	    type[0] = ARAB;
	    break;
	case ALPHA_LOWER:
	    order[0] = ALPHA_LOWER_OFFSET;
	    type[0] = ALPL;
	    break;
	case ALPHA_UPPER:
	    order[0] = ALPHA_LOWER_OFFSET;
	    type[0] = ALPU;
	    break;
       }

    i = 1;
    while(i < last)
       {
	switch(page_prec[i])
	   {
	    case ROMAN_LOWER:
		order[i] = order[i - 1] + ROMAN_LOWER_OFFSET;
		type[i] = ROML;
		break;
	    case ROMAN_UPPER:
		order[i] = order[i - 1] + ROMAN_UPPER_OFFSET;
		type[i] = ROMU;
		break;
	    case ARABIC:
		order[i] = order[i - 1] + ARABIC_OFFSET;
		type[i] = ARAB;
		break;
	    case ALPHA_LOWER:
		order[i] = order[i - 1] + ALPHA_LOWER_OFFSET;
		type[i] = ALPL;
		break;
	    case ALPHA_UPPER:
		order[i] = order[i - 1] + ALPHA_LOWER_OFFSET;
		type[i] = ALPU;
		break;
	   }
	i++;
       }

    for(i = 0; i < PAGETYPE_MAX; i++)
	page_offset[i] = -1;

    page_offset[type[0]] = 0;
    for(i = 1; i < last; i++)
       {
	page_offset[type[i]] = order[i - 1];
       }
    for(i = 0; i < PAGETYPE_MAX; i++)
       {
	if(page_offset[i] == -1)
	   {
	    switch(type[last - 1])
	       {
		case ROML:
		    order[last] = order[last - 1] + ROMAN_LOWER_OFFSET;
		    break;
		case ROMU:
		    order[last] = order[last - 1] + ROMAN_UPPER_OFFSET;
		    break;
		case ARAB:
		    order[last] = order[last - 1] + ARABIC_OFFSET;
		    break;
		case ALPL:
		    order[last] = order[last - 1] + ALPHA_LOWER_OFFSET;
		    break;
		case ALPU:
		    order[last] = order[last - 1] + ALPHA_UPPER_OFFSET;
		    break;
	       }
	    type[last] = i;
	    page_offset[i] = order[last];
	    last++;
	   }
       }
    return(True);                     /* function value no longer used */
}

Local void
Sty_Skipline(VOID_ARG)

{
    register int a;

    while(((a = GET_CHAR(sty_fp)) != LFD) && (a != EOF))
       ;
    sty_lc++;
}

Local void
Sty_Error(const char *fmt, ...)

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
	    "** Input style error (file = %s, line = %d):\n\040\040 -- ",
#else
	    "** Input style error (file = %s, line = %d):\n   -- ",
#endif                                 /* KCC_20 */
							    sty_fn, sty_lc);
    vfprintf(ilg_fp, fmt, arg_ptr);

    va_end(arg_ptr);

    sty_ec++;
    put_dot = False;
}

Local void
Sty_Error_prec(const char ch, const char *str)

{

    Sty_Skipline();
    Sty_Error("Multiple instances of type `%c' " \
			"in page precedence specification `%s'.\n", ch, str);
}
