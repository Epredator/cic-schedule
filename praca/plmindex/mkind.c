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

#define MKIND_C	1
#include    "mkind.h"
#undef MKIND_C
#include <stdarg.h>

Public language Language	= DEFAULT_LANGUAGE;
Public Logical 	blank_ignore	= False;
Public Logical 	special_flag	= False;
Public Logical  compress_blanks = False;
Public Logical  merge_page 	= True;
Public Logical  init_page 	= False;
Public int     	even_odd 	= -1;
Public Logical  verbose 	= True;
Public int     	fn_no 		= -1;	    /* total number of files */
Public Logical  idx_dot 	= True;	    /* flag which shows dot in ilg being
					* active */
Public int     idx_tt = 0;	       /* total entry count (all files) */
Public int     idx_et = 0;	       /* erroneous entry count (all files) */
Public int     idx_gt = 0;	       /* good entry count (all files) */

Public FIELD_PTR *idx_key;
Public FILE   	  *log_fp;
Public FILE   	  *sty_fp;
Public FILE   	  *idx_fp;
Public FILE   	  *ind_fp;
Public FILE   	  *ilg_fp;

Public char   *pgm_fn;
Public char    sty_fn[LINE_MAX];
Public char   *idx_fn;
Public char    ind[STRING_MAX];
Public char   *ind_fn;
Public char    ilg[STRING_MAX];
Public char   *ilg_fn;
Public char    pageno[NUMBER_MAX];

Local char    log_fn[STRING_MAX];
Local char    base[STRING_MAX];
Local Logical need_version = True;

Local	void	check_all (char *fn, Logical ind_given, Logical ilg_given,
							 Logical log_given);
Local	void	check_idx (char *fn,int open_fn);
Local	void	find_pageno (void);
Local	void	open_sty (char *fn);
Local	void	prepare_idx (void);
Local	void	process_idx (char * *fn, Logical use_stdin, 
		    Logical sty_given, Logical ind_given, Logical ilg_given, 
							Logical log_given);

#if OS_ATARI
Public long    _stksize = 20000L;       /* make the stack larger than 2KB */
					/* size must  be given */
#endif				       /* OS_ATARI */

#ifdef DEBUG
Public long totmem = 0L;		/* for debugging memory usage */
#endif /* DEBUG */

Public int
main(int argc, char *argv[])

{
    char       **fns;
    char       *ap;
    Logical     use_stdin = False;
    Logical     sty_given = False;
    Logical     ind_given = False;
    Logical     ilg_given = False;
    Logical     log_given = False;

    /* determine program name */

    if((fns = (char **) calloc(sizeof(*fns), ARRAY_MAX)) == NULL) 
	Fatal("Not enough core...abort.\n");
#if(OS_ATARI | OS_VAXVMS | OS_MVSXA | OS_VMCMS)
    pgm_fn = "MakeIndex";	       /* Use symbolic name on some systems */
#else

#if OS_PCDOS
    {
     char *last = NULL,
	  *beg;

     pgm_fn = argv[0];
     for(beg = pgm_fn; *beg != EOS; beg++)
        {
	 if(*beg == ':' || *beg == '/' || *beg == '\\')
	     last = beg;
	}
     if(last++ != NULL)
	{
	 char *beg = pgm_fn;

	 while(*beg++ = *last++)
	    ;
	}
     last = (char *)mystrrchr((unsigned char *)pgm_fn, (unsigned char)('.'));
     if(last != NULL)
         *last = EOS;
    }
    (void)strlwr((unsigned char *)pgm_fn);
#else
    pgm_fn = (char *)mystrrchr((unsigned char *)*argv, (unsigned char)DIR_DELIM);
    if(pgm_fn == NULL)
	pgm_fn = *argv;
    else
	pgm_fn++;
#endif					/* OS_PCDOS */

#endif				       /* OS_VAXVMS | OS_MVSXA */

			    /* process command line options */
    while(--argc > 0) 
       {
	if(**++argv == SW_PREFIX) 
	   {
	    if(*(*argv + 1) == EOS)
		break;
	    for(ap = ++*argv; *ap != EOS; ap++)
		switch(*ap) 
		   {
		    case '!':
			special_flag = True;
			break;
		    case 'l':
			blank_ignore = True;
			break;
					    /* use standard input */
		    case 'i':
		    case 'I':
			use_stdin = True;
			break;

					    /* disable range merge */
		    case 'r':
		    case 'R':
			merge_page = False;
			break;

			    /* supress progress message -- quiet mode */
		    case 'q':
		    case 'Q':
			verbose = False;
			break;

			/* compress blanks */
		    case 'c':
		    case 'C':
			compress_blanks = True;
			break;

			/* style file */
		    case 's':
		    case 'S':
			argc--;
			if(argc <= 0)
			    Fatal("Expected -s <stylefile>\n");
			open_sty(*++argv);
			sty_given = True;
			break;

					    /* output index file name */
		    case 'o':
		    case 'O':
			argc--;
			if(argc <= 0)
			    Fatal("Expected -o <ind>\n");
			ind_fn = *++argv;
			ind_given = True;
			break;

			/* transcript file name */
		    case 't':
		    case 'T':
			argc--;
			if(argc <= 0)
			    Fatal("Expected -t <logfile>\n");
			ilg_fn = *++argv;
			ilg_given = True;
			break;

		    case 'L':
		       {
		        int i;
			char *lang_name;

			argc--;
			if(argc <= 0)
			    Fatal("Expected -L <language>\n");
			lang_name = *++argv;
			for(i = 0; multilanguage[i].id != NULL;)
			   {
			    if(mystrcmp((unsigned char *)(multilanguage[i].id), 
					    (unsigned char *)lang_name) == 0)
			        break;
			    i++;
			   }
			if(multilanguage[i].id == NULL)
			    Fatal("Illegal  language\n");
			Language = (language)i;
		       }
			break;

			/* initial page */
		    case 'p':
		    case 'P':
			argc--;
			if(argc <= 0)
			    Fatal("Expected -p <num>\n");
			strcpy(pageno, *++argv);
			init_page = True;
			if(STREQ(pageno, EVEN)) 
			   {
			    log_given = True;
			    even_odd = 2;
			   }
			else if(STREQ(pageno, ODD)) 
			   {
			    log_given = True;
			    even_odd = 1;
			   }
			else if(STREQ(pageno, ANY)) 
			   {
			    log_given = True;
			    even_odd = 0;
			   }
			break;

    		    case 'h':
    		    case 'H':
    		    case '?':
			usage(pgm_fn);
			return(1);
			/* bad option */
		    default:
			Fatal("Unknown option -%c.\n", *ap);
			break;
		   }
	   }
	else 
	   {
	    if(fn_no < ARRAY_MAX) 
	       {
		check_idx(*argv, False);
		fns[++fn_no] = *argv;
	       }
	    else 
		Fatal("Too many input files (max %d).\n", ARRAY_MAX);
	   }
       }

    if(special_flag)
       multilanguage[Language].flags |= SPECIAL_FLAG;


/* changes for 2.12 (May 20, 1993) by Julian Reschke (jr@ms.maus.de):
   if only one input file and no explicit style file was given */

	if(fn_no == 0 && !sty_given)
	   {
	    char tmp[STRING_MAX + 5];
		
				/* base set by last call to check_idx */
	    sprintf(tmp, "%s%s", base, INDEX_STY);
	    if(0 == access(tmp, R_OK)) 
	       {
		open_sty (tmp);
		sty_given = True;
	       }
	   }
 
    process_idx(fns, use_stdin, sty_given, ind_given, ilg_given, log_given);

    idx_gt = idx_tt - idx_et;
    if(fn_no > 0) 
	Message("Overall %d files read (%d entries accepted, %d rejected).\n", \
						    fn_no + 1, idx_gt, idx_et); 
    if(idx_gt > 0) 
       {
        prepare_idx();
	sort_idx();
	gen_ind();
/*{
        NODE_PTR aqq;
	int i = 0;
	int j = 0;

	aqq = head;

	do
	   {

	    printf("type=%d\n", aqq->data.type);
	    for(i = 0; i < FIELD_MAX; i++)
	        if(aqq->data.sf[i][0] != EOS)
		    printf("%s\n", aqq->data.sf[i]);
	    aqq = aqq->next;
	   }while(aqq != NULL);
       for(j = 0; j < idx_gt; j++)
          {
	    printf("type=%d\n", idx_key[j]->type);
	    for(i = 0; i < FIELD_MAX; i++)
	        if(idx_key[j]->sf[i][0] != EOS)
		    printf("%s\n", idx_key[j]->sf[i]);
	  }
       }*/
	Message("Output written in %s.\n", ind_fn);
       }
    else
	Message("Nothing written in %s.\n", ind_fn);

    Message("Transcript written in %s.\n", ilg_fn);
    CLOSE(ind_fp);
    CLOSE(ilg_fp);
    free(fns);

    return(0);
}

Local void
prepare_idx(VOID_ARG)

{
    NODE_PTR ptr = head;
    int      i = 0;

#ifdef DEBUG
    totmem += idx_gt * sizeof(FIELD_PTR);
    (void)fprintf(stderr,"prepare_idx(): calloc(%d,%d)\ttotmem = %ld\n",
					    idx_gt,sizeof(FIELD_PTR),totmem);
#endif /* DEBUG */

    if(head == (NODE_PTR)NULL)
	Fatal("No valid index entries collected.\n");

    if((idx_key = (FIELD_PTR *) calloc(idx_gt, sizeof(FIELD_PTR))) == NULL) 
	Fatal("Not enough core...abort.\n");
    for(i = 0; i < idx_gt; i++) 
       {
	idx_key[i] = &(ptr->data);
	ptr = ptr->next;
       }
}

Local void
process_idx(char *fn[], Logical use_stdin, Logical sty_given, Logical ind_given,
					Logical ilg_given, Logical log_given)

{
    int     i;

    if(fn_no == -1)
				/* use stdin if no input files specified */
	use_stdin = True;
    else 
       {
	check_all(fn[0], ind_given, ilg_given, log_given);
	PUT_VERSION;
	if(sty_given)
	    scan_sty();
	scan_idx();
	ind_given = True;
	ilg_given = True;
	for(i = 1; i <= fn_no; i++) 
	   {
	    check_idx(fn[i], True);
	    scan_idx();
	   }
       }
       

    if(use_stdin) 
       {
	idx_fn = "stdin";
	idx_fp = stdin;

	if(ind_given) 
	   {
	    if(!ind_fp && ((ind_fp = OPEN_OUT(ind_fn)) == NULL))
		Fatal("Can't create output index file %s.\n", ind_fn);
	   }
	else 
	   {
	    ind_fn = "stdout";
	    ind_fp = stdout;
	   }

	if(ilg_given) 
	   {
	    if(!ilg_fp && ((ilg_fp = OPEN_OUT(ilg_fn)) == NULL))
		Fatal("Can't create transcript file %s.\n", ilg_fn);
	   }
	else 
	   {
	    ilg_fn = "stderr";
	    ilg_fp = stderr;
	   }

	if((fn_no == -1) && (sty_given))
	    scan_sty();
	if(need_version) 
	   {
	    PUT_VERSION;
	   }
	   
	scan_idx();
	fn_no++;
       }
}

Local void
check_idx(char *fn, int open_fn)

{
    char   *ptr = fn;
    char   *ext;
    int     with_ext = False;
    int     i = 0;

    ext = (char *)mystrrchr((unsigned char *)fn, (unsigned char)EXT_DELIM);
    if((ext != NULL) && (ext != fn) && (*(ext + 1) != DIR_DELIM)) 
       {
	with_ext = True;
	while((ptr != ext) && (i < STRING_MAX))
	    base[i++] = *ptr++;
       }
    else
	while((*ptr != EOS) && (i < STRING_MAX))
	    base[i++] = *ptr++;

    if(i < STRING_MAX)
	base[i] = EOS;
    else
	Fatal("Index file name %s too long (max %d).\n", base, STRING_MAX);

    idx_fn = fn;

    if((open_fn && ((idx_fp = OPEN_IN(idx_fn)) == NULL)) ||
				((!open_fn) && (access(idx_fn, R_OK) != 0)))
	if(with_ext) 
	    Fatal("Input index file %s not found.\n", idx_fn);
	else 
	   {

#ifdef DEBUG
	    totmem += STRING_MAX;
	    (void)fprintf(stderr,"check_idx()-2: malloc(%d)\ttotmem = %ld\n",
							    STRING_MAX,totmem);
#endif /* DEBUG */

	    if((idx_fn = (char *) malloc(STRING_MAX)) == NULL)
		Fatal("Not enough core...abort.\n");
	    sprintf(idx_fn, "%s%s", base, INDEX_IDX);
	    if((open_fn && ((idx_fp = OPEN_IN(idx_fn)) == NULL)) ||
				((!open_fn) && (access(idx_fn, R_OK) != 0))) 
		Fatal("Couldn't find input index file %s or %s.\n", base,
								       idx_fn);
	}
}

Local void
check_all(char *fn, Logical ind_given, Logical ilg_given, Logical log_given)

{
    check_idx(fn, True);

    /* index output file */
    if(!ind_given) 
       {
	sprintf(ind, "%s%s", base, INDEX_IND);
	ind_fn = ind;
       }
    if((ind_fp = OPEN_OUT(ind_fn)) == NULL)
	Fatal("Can't create output index file %s.\n", ind_fn);

    /* index transcript file */
    if(!ilg_given) 
       {
	sprintf(ilg, "%s%s", base, INDEX_ILG);
	ilg_fn = ilg;
       }
    if((ilg_fp = OPEN_OUT(ilg_fn)) == NULL)
	Fatal("Can't create transcript file %s.\n", ilg_fn);

    if(log_given) 
       {
	sprintf(log_fn, "%s%s", base, INDEX_LOG);
#if OS_PCDOS			       /* open in binary mode (CR-LF) */
	if((log_fp = OPEN_IN_B(log_fn)) == NULL) 
#else
	if((log_fp = OPEN_IN(log_fn)) == NULL) 
#endif				       /* OS_PCDOS */
	    Fatal("Source log file %s not found.\n", log_fn);
	else 
	   {
	    find_pageno();
	    CLOSE(log_fp);
	   }
       }
}

Local void
find_pageno(VOID_ARG)

{
    int     i = 0;
    unsigned char     p, 
		      c;

#if(OS_VAXVMS | OS_MVSXA)
    /*
     * Scan forward through the file for VMS, because fseek doesn't work on
     * variable record files
     */
    c = GET_CHAR(log_fp);
    while(c != EOF) 
       {
	p = c;
	c = GET_CHAR(log_fp);
	if(p == LSQ && isdigit(c)) 
	   {
	    i = 0;
	    do 
	       {
		pageno[i++] = c;
		c = GET_CHAR(log_fp);
	       } while(isdigit(c));
	    pageno[i] = EOS;
	   }
       }
    if(i == 0) 
       {
	fprintf(ilg_fp, "Couldn't find any page number in %s...ignored\n",
								    log_fn);
	init_page = False;
       }
#else				       /* NOT (OS_VAXVMS | ...) */
    fseek(log_fp, -1L, 2);
    p = GET_CHAR(log_fp);
    fseek(log_fp, -2L, 1);
    do 
       {
	c = p;
	p = GET_CHAR(log_fp);
       }while(!(((p == LSQ) && isdigit(c)) || (fseek(log_fp, -2L, 1) != 0)));
    if(p == LSQ) 
       {
	while((c = GET_CHAR(log_fp)) == SPC);
	do 
	   {
	    pageno[i++] = (char) c;
	    c = GET_CHAR(log_fp);
	   } while(isdigit(c));
	pageno[i] = EOS;
       }
    else 
       {
	fprintf(ilg_fp, "Couldn't find any page number in %s...ignored\n",
									log_fn);
	init_page = False;
       }
#endif				       /* (OS_VAXVMS | ...) */
}

Local void
open_sty(char *fn)

{
    char   *path;
    char   *local_fn;
    char   *ptr;
    int     i;
    int     len;

    if((local_fn = (char *)malloc(LINE_MAX)) == NULL)
	Fatal("Not enough core...abort.\n");
    strcpy(local_fn, fn);
    if((mystrrchr((unsigned char *)local_fn, (unsigned char)'.') == NULL) && 
	    				(strlen(local_fn) + 4) < LINE_MAX)
	strcat(local_fn, INDEX_STY);
    if((path = getenv(STYLE_PATH)) == NULL) 
       {
					/* style input path not defined */
	strcpy(sty_fn, local_fn);
	sty_fp = OPEN_IN(sty_fn);
       }
    else 
       {
#if OS_VAXVMS
	if((strlen(STYLE_PATH) + strlen(local_fn) + 1) > LINE_MAX) 
	    Fatal("Path %s too long (max %d).\n", STYLE_PATH, LINE_MAX);
	else 
	   {
	    sprintf(sty_fn, "%s:%s", STYLE_PATH, local_fn);
	    sty_fp = OPEN_IN(sty_fn);
	   }
#else				       /* NOT OS_VAXVMS */
	len = LINE_MAX - strlen(local_fn) - 1;
	while(*path != EOS) 
	   {
	    ptr = (char *)mystrchr((unsigned char *)path, 
		    				(unsigned char)ENV_SEPAR);
	    i = 0;
	    if(ptr == (char*)NULL)
	       {
		int j = strlen(path);

		while(i < j)
		    sty_fn[i++] = *path++;
	       }
	    else
	       {
		while((path != ptr) && (i < len))
		    sty_fn[i++] = *path++;
	       }
	    if(i == len) 
		Fatal("Path %s too long (max %d).\n", sty_fn, LINE_MAX);
	    else 
	       {
#ifdef OS_VAXVMS
		if(sty_fn[i - 1] != ']')
		    sty_fn[i++] = DIR_DELIM;
#else
		sty_fn[i++] = DIR_DELIM;
#endif
		sty_fn[i] = EOS;
		strcat(sty_fn, local_fn);
		if((sty_fp = OPEN_IN(sty_fn)) == NULL)
		    path++;
		else
		    break;
	       }
	   }
#endif				       /* OS_VAXVMS */
       }

    if(sty_fp == NULL)
	Fatal("Index style file %s not found.\n", local_fn);
    free(local_fn);
}

Public int
strtoint(char *str)

{
    int     val = 0;

    while(*str != EOS) 
       {
#if (OS_MVSXA)
	val = 10 * val + *str - '0';
#else
	val = 10 * val + *str - 48;
#endif				       /* (OS_MVSXA) */
	str++;
       }
    return(val);
}

Public void
usage(char *program_name)

{
    int i;

    fprintf(stderr,
"Usage: \n    %s [<opt>] [-s <sty>] [-o <ind>] [-t <log>] [-p <num>] "\
					    "[<idx0> ...]\n"\
	"\t<opt> = -l        - ignore interword space\n"\
   	"\t        -i        - use standard input (stdin) as input file\n"\
   	"\t        -q        - quiet mode\n"\
   	"\t        -r        - disable range merge\n"\
   	"\t        -c        - compress blanks\n"\
   	"\t        -L <lang> - language\n",
					program_name);
    fprintf(stderr, "\t\t\t\t<lang> - %s\n", multilanguage[0].id);
    for(i = 1; multilanguage[i].id != NULL; i++)
	fprintf(stderr, "\t\t\t\t       - %s\n", multilanguage[i].id);
    fprintf(stderr,
	"\t\t-s <sty>  - style file (default extension .mst)\n"\
	"\t\t-o <ind>  - output file (default extension .ind)\n"\
	"\t\t-t <log>  - log file (default extension .ilg)\n"\
	"\t\t-p <num>  - starting page count \n"\
					"\t\t\t\t<num> - <number>\n"\
					"\t\t\t\t      - odd\n"\
					"\t\t\t\t      - even\n"\
					"\t\t\t\t      - any\n"\
	"\t\t   <idx0> - source file (index; default extension .idx)\n");
}

Public void
Fatal(const char *fmt, ...)

{
    va_list arg_ptr;
							
    va_start(arg_ptr, fmt);
    vfprintf(stderr, fmt, arg_ptr);
    va_end(arg_ptr);
    EXIT(1);
}

Public void
Message(const char *fmt, ...)

{
    va_list arg_ptr;
							
    va_start(arg_ptr, fmt);
    if(verbose) 
	vfprintf(stderr, fmt, arg_ptr); 
    if((ilg_fp != stderr) || !verbose) 
	vfprintf(ilg_fp, fmt, arg_ptr); 
    va_end(arg_ptr);
}
