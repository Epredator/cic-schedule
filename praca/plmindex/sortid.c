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

Local	long	idx_gc;

Local	int	check_mixsym (unsigned char *x, unsigned char *y);
Local	int	compare (struct KFIELD * *a,struct KFIELD * *b);
Local	int	compare_one (unsigned char *x, unsigned char *y);
Local	int	compare_page (struct KFIELD * *a,struct KFIELD * *b);
Local	int	compare_string (unsigned char *a,unsigned char *b);

Public void
sort_idx(VOID_ARG)

{
    Message("Sorting entries...");
    idx_dc = 0;
    idx_gc = 0L;
    qqsort((char *) idx_key, (int) idx_gt, (int) sizeof(FIELD_PTR), 
				(int (*) (char*, char*))compare);
    Message("done (%ld comparisons).\n", idx_gc);
}

Local int
compare(FIELD_PTR *a, FIELD_PTR *b)

{
    int     i;
    int     dif;

    idx_gc++;
    idx_dot = True; 
    if(idx_dc++ == 0) 
	Message(DOT); 
    if(idx_dc == CMP_MAX) 
	idx_dc = 0; 

    for(i = 0; i < FIELD_MAX; i++) 
       {
					    /* compare the sort fields */
	if((dif = compare_one((*a)->sf[i], (*b)->sf[i])) != 0)
	    break;

	if((dif = compare_one((*a)->af[i], (*b)->af[i])) != 0)
	    break;
       }

		/* both key aggregates are identical, compare page numbers */
    if(i == FIELD_MAX)
	dif = compare_page(a, b);
    return(dif);
}

Local int
compare_one(unsigned char *x, unsigned char *y)

{
    int     m;
    int     n;

    if((x[0] == EOS) && (y[0] == EOS))
	return(0);

    if(x[0] == EOS)
	return(-1);

    if(y[0] == EOS)
	return(1);

    m = group_type(x);
    n = group_type(y);

					/* both pure digits */
    if((m >= 0) && (n >= 0))
	return(m - n);

					/* x digit, y non-digit */
    if(m >= 0) 
	return((n == -1) ? 1 : -1);
					/* x non-digit, y digit */
    if(n >= 0) 
	return((m == -1) ? -1 : 1);
		    /* strings started with a symbol (including digit) */
    if((m == SYMBOL) && (n == SYMBOL))
	return(check_mixsym(x, y));

				/* x symbol, y non-symbol */
    if(m == SYMBOL)
	return(-1);

				/* x non-symbol, y symbol */
    if(n == SYMBOL)
	return(1);

    /* strings with a leading letter, the ALPHA type */

    return(compare_string((unsigned char*)x, (unsigned char*)y));
}

Local int
check_mixsym(unsigned char *x, unsigned char *y)

{
    int     m;
    int     n;

    m = ISDIGIT(x[0]);
    n = ISDIGIT(y[0]);

    if(m && !n)
	return(1);

    if(!m && n)
	return(-1);

    return(mystrcmp(x, y));
}


Local int
compare_string(unsigned char *a, unsigned char *b)

{
    int     i = 0;
    int     j = 0;
    unsigned char      al;
    unsigned char      bl;

    while((a[i] != EOS) || (b[j] != EOS)) 
       {
	if(a[i] == EOS)
	    return(-1);
	if(b[j] == EOS)
	    return(1);
        
	if(blank_ignore)
	   {
	    if(a[i] == SPC)
		i++;
	    if(b[j] == SPC)
		j++;
	   }
	al = TOLOWER(a[i]);
	bl = TOLOWER(b[j]);

	if(al != bl)
	    return(charcmp(al, bl));
	i++;
	j++;
       }
    return(mystrcmp(a, b));
}

Local int
compare_page(FIELD_PTR *a, FIELD_PTR *b)

{
    int     m = 0;
    short   i = 0;

    while((i < (*a)->count) && (i < (*b)->count) &&
				   ((m = (*a)->npg[i] - (*b)->npg[i]) == 0))
       {
	i++;
       }
    if(m == 0)
       {				/* common leading page numbers match */
	if((i == (*a)->count) && (i == (*b)->count))
	   {			/* all page numbers match */

	    /***********************************************************
	    We have identical entries, except possibly in encap fields.
	    The ordering is tricky here.  Consider the following input
	    sequence of index names, encaps, and page numbers:

		foo|(	2
		foo|)	6
		foo|(	6
		foo|)	10

	    This might legimately occur when a page range ends, and
	    subsequently, a new range starts, on the same page.  If we
	    just order by range_open and range_close (here, parens),
	    then we will produce

		foo|(	2
		foo|(	6
		foo|)	6
		foo|)	10

	    This will later generate the index entry

		foo, 2--6, \({6}, 10

	    which is not only wrong, but has also introduced an illegal
	    LaTeX macro, \({6}, because the merging step treated this
	    like a \see{6} entry.

	    The solution is to preserve the original input order, which
	    we can do by treating range_open and range_close as equal,
	    and then ordering by input line number.  This will then
	    generate the correct index entry

		foo, 2--10

	    Ordering inconsistencies from missing range open or close
	    entries, or mixing roman and arabic page numbers, will be
	    detected later.
	    ***********************************************************/

#define isrange(c) ( ((c) == idx_ropen) || ((c) == idx_rclose) )

	    /* Order two range values by input line number */

	    if(isrange(*(*a)->encap) && isrange(*(*b)->encap))
		m = (*a)->lc - (*b)->lc;

	    /* Handle identical encap fields; neither is a range delimiter */

	    else if(STREQ((*a)->encap, (*b)->encap))
	       {
		    /* If neither are yet marked duplicate, mark the second
		of them to be ignored. */

		if(((*a)->type != DUPLICATE) && ((*b)->type != DUPLICATE)) 
		    (*b)->type = DUPLICATE;

		/* leave m == 0 to show equality */
	       }

	    /* Encap fields differ: only one may be a range delimiter, */
	    /* or else neither of them is.   If either of them is a range */
	    /* delimiter, order by input line number; otherwise, order */
	    /* by name. */

	    else
	       {
		if(isrange(*(*a)->encap) || isrange(*(*b)->encap))
		    m = (*a)->lc - (*b)->lc; /* order by input line number */
		else			/* order non-range items by */
					/* their encap strings */
		    m = compare_string((unsigned char*)((*a)->encap),
					       (unsigned char*)((*b)->encap));
	       }
	    }
	else if((i == (*a)->count) && (i < (*b)->count))
	    m = -1;
	else if((i < (*a)->count) && (i == (*b)->count))
	    m = 1;
	}
    return(m);
}
