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

/***********************************************************************

			   INSTALLATION NOTES
			      <11-Nov-1989>

   At compile-time (or here, if compile-time definition is not
   available), set non-zero ONE OS_xxxx operating system flag, and if
   more than one compiler is available, ONE compiler flag:

    Operating Systems        Compiler(s)
    =================        ===========
    OS_ATARI
    OS_UNIX
    OS_MVSXA                 IBM_C370
    OS_VMCMS                 IBM_C370
    OS_TOPS20                KCC_20 or PCC_20
    OS_VAXVMS
    =================        ===========

   If Standard C prototypes are supported, define the symbol
   STDC_PROTOTYPES in the appropriate OS_xxxx section below, and insert
   #include's for the standard system files which define library
   prototypes.  STDC_PROTOTYPES will be defined automatically if
   __STDC__ is; the latter must be defined by all Standard C conformant
   implementations.

   All function declarations in MakeIndex are contained at the end of
   this file.  If 185STDC_PROTOTYPES is not selected, then all the standard
   library functions must be declared explicitly.

   If the host system restricts Globalal names to 6 characters, set
   SHORTNAMES non-zero in the appropriate OS_xxxx section below.

   Installing MakeIndex under BS2000 requires at least Version 8.5
   supporting Multiple Public Volume Sets (MPVS). Define WORK in this
   file to your CATID (default :w:) for temporary files (.ilg, .ind),
   in case of no MPVS support define WORK to NIL.

*/

/**********************************************************************/

#define STDC	(__STDC__ || __cplusplus)

/*
 * Establish needed operating symbols (defaulting to OS_UNIX if none
 * specified at compile time).  If you add one, add it to the check
 * list at the end of this section, too.
 */

#ifndef    OS_ATARI
#define OS_ATARI 0
#endif

#ifndef    OS_PCDOS
#define OS_PCDOS 0
#endif

#ifndef    OS_TOPS20
#define OS_TOPS20 0
#endif

#ifndef    KCC_20
#define KCC_20 0
#endif

#ifndef    PCC_20
#define PCC_20 0
#endif

#ifndef    OS_UNIX
#define OS_UNIX 0
#endif

#ifndef    OS_VAXVMS
#define OS_VAXVMS 0
#endif

#ifndef    IBM_C370
#define IBM_C370 0
#endif

#if    OS_TOPS20
#if    (KCC_20 || PCC_20)
#else
#undef PCC_20
#define PCC_20 1                       /* PCC-20 is default for Tops-20 */
#endif                                 /* KCC_20 || PCC_20) */
#endif                                 /* OS_TOPS20 */

#ifndef    OS_MVSXA
#define OS_MVSXA 0
#endif

#ifndef    OS_VMCMS
#define OS_VMCMS 0
#endif

#if	(OS_ATARI || OS_UNIX || OS_MVSXA || OS_PCDOS || OS_VMCMS)
#else
#if	(OS_TOPS20 || OS_VAXVMS)
#else
#undef OS_UNIX
#define OS_UNIX 1                      /* Unix is default operating system */
#endif
#endif

#if    (OS_MVSXA || OS_VMCMS)
#undef IBM_C370
#define IBM_C370 1	/* IBM_C370 is default for OS_MVSXA and OS_VMCMS */
#endif


#if    (OS_MVSXA || OS_TOPS20 || OS_VMCMS)
#define SHORTNAMES 1
#else
#define SHORTNAMES 0
#endif

#define STDC_PROTOTYPES STDC

/**********************************************************************/

#include    <stdio.h>

#if    OS_PCDOS

#	include    <io.h>                     /* for function declarations */

#	include    <stddef.h>                 /* for function declarations */
#	include    <stdlib.h>                 /* for function declarations */
#	undef STDC_PROTOTYPES
#	define STDC_PROTOTYPES    1           /* so we get full argument
					  type checking */
#endif					/* OS_PCDOS */
#include    "myctype.h"

#if    (OS_VMCMS || OS_MVSXA)
#	include    <stdefs.h>                 /* for function declarations */
#	undef STDC_PROTOTYPES
#	define STDC_PROTOTYPES    1           /* so we get full argument
                                          type checking */
#	if 0
#		undef __STDC__
#		define __STDC__           1
#	endif
#endif                                 /* OS_MVSXA || OS_VMCMS */

#if    OS_ATARI

#	if    ATARI_ST_TURBO
#	define access(fn, mode) 0             /* function not available */
#	endif

#	if    __GNUC__
#	include <string.h>
#	include <types.h>
#	endif

#	undef STDC_PROTOTYPES
#	define STDC_PROTOTYPES    1     /* so we get full argument checking */

#endif                     /* OS_ATARI */

#if    IBM_C370
#	define access(fn, mode) 0             /* function not available */
#endif

#if    SHORTNAMES
/*
 * Provide alternate Globalal names which are unique in the first SIX
 * characters as required for portability (and Standard C)
 */
#define check_all          chk_all
#define check_idx          chk_idx
#define check_mixsym       chk_mix
#define compare_one        cmp_one
#define compare_page       cmp_page
#define compare_string     cmp_string
#define delim_n            dlm_n
#define delim_p            dlm_p
#define delim_r            dlm_r
#define delim_t            dlm_t
#define encap_i            ecp_i
#define encap_p            ecp_p
#define encap_range        ecp_range
#define encap_s            ecp_s
#define group_skip         grp_skip
#define group_type         grp_type
#define idx_aclose         idxaclose
#define idx_actual         idxactual
#define idx_keyword        idx_kwd
#define indent_length      ind_length
#define indent_space       ind_space
#define headings_flag      hd_flag
#define heading_pre        hd_pre
#define heading_suf        hd_suf
#define symhead_pos        sym_pos
#define symhead_neg        sym_neg
#define numhead_pos        num_pos
#define numhead_neg        num_neg
#define process_idx        prc_idx
#define process_precedence prc_pre
#define range_ptr          rng_ptr
#define scan_alpha_lower   scnalw
#define scan_alpha_upper   scnaup
#define scan_arabic        scnarabic
#define scan_arg1          scna1
#define scan_arg2          scna2
#define scan_char          scnchr
#define scan_field         scnfld
#define scan_idx           scnidx
#define scan_key           scnkey
#define scan_no            scnno
#define scan_roman_lower   scnrlw
#define scan_roman_upper   scnrup
#define scan_spec          scnspc
#define scan_string        scnstr
#define scan_style         scnsty
#define setpagelen         spg_len
#define setpage_close      spg_close
#define setpage_open       spg_open
#define suffix_2p          suf_2p
#define suffix_3p          suf_3p
#define suffix_mp          suf_mp
#endif                                 /* SHORTNAMES */

#if    OS_VAXVMS
#define EXIT(code) exit( ((code) == 0) ? 1 : (1 << 28) + 2 )
#else                                  /* NOT OS_VAXVMS */
#define EXIT exit
#endif                                 /* OS_VAXVMS */

#define Local static
#define Global extern
#define Public

enum _logical {False,True};
typedef enum _logical Logical;

#define	EOS		'\0'
#define EMPTY_STRING 	(unsigned char *)""

#define TAB 		'\t'
#define LFD 		'\n'
#define SPC 		' '
#define LSQ 		'['
#define RSQ 		']'
#define BSH 		'\\'

#if    OS_ATARI
#define ENV_SEPAR ';'
#define DIR_DELIM '\\'
#endif                                 /* OS_ATARI */

#if    (OS_UNIX)
#define ENV_SEPAR ':'
#define DIR_DELIM '/'
#endif                                 /* (OS_UNIX)*/


#if    (OS_MVSXA || OS_VMCMS)
#define ENV_SEPAR '.'
#define DIR_DELIM '.'
#endif                                 /* OS_MVSXA || OS_VMCMS */

#if    OS_PCDOS
#define ENV_SEPAR ';'
#define DIR_DELIM '\\'
#endif                                 /* OS_PCDOS */

#if    OS_TOPS20
#define ENV_SEPAR ','
#define DIR_DELIM ':'
#endif                                 /* OS_TOPS20 */

#if    OS_VAXVMS
#define ENV_SEPAR ','                  /* In fact these aren't used */
#define DIR_DELIM ':'
#endif                                 /* OS_VAXVMS */

#ifndef SW_PREFIX			/* can override at compile time */
#define SW_PREFIX  '-'
#endif

#define EXT_DELIM  '.'
#define ROMAN_SIGN '*'
#define EVEN       "even"
#define ODD        "odd"
#define ANY        "any"

#define GET_CHAR getc


#define TOLOWER(C) 	mytolower((unsigned char)C)
#define TOUPPER(C) 	mytoupper((unsigned char)C)
#define	TOASCII(i)	toascii((unsigned char)i)
#define	STRNEQ(A, B)		((((A) == NULL) && ((B) == NULL)) ? False : \
			       ((((A) == NULL) || ((B) == NULL)) ? True : \
		(mystrcmp((unsigned char *)(A), (unsigned char *)(B)) != 0)))

#define	STREQ(A, B)		((((A) == NULL) && ((B) == NULL)) ? True : \
			       ((((A) == NULL) || ((B) == NULL)) ? False : \
		(mystrcmp((unsigned char *)(A), (unsigned char *)(B)) == 0)))

#if    (OS_MVSXA)
#define DIGTOASCII(i) (char)((i) + '0')
#else
#define DIGTOASCII(i) (char)((i) + 48)
#endif                                 /* (OS_MVSXA) */

#if    OS_PCDOS                        /* open file in binary mode */
#define OPEN_IN_B(FP) fopen(FP, "rb")
#endif

#define OPEN_IN(FP)   fopen(FP, "r")
#define OPEN_OUT(FP)  fopen(FP, "w")
#define CLOSE(FP)     fclose(FP)

#define ISDIGIT(C)  isdigit(C)
#define ISSYMBOL(C) (!(isdigit(C) || isalpha(C) || iscntrl(C) || C == SPC))

/*====================================================================
Many arrays in MakeIndex are dimensioned [xxx_MAX], where the xxx_MAX
values are defined below.  The use of each of these is described in
comments.  However, no run-time check is made to ensure that these are
consistent, or reasonable!  Therefore, change them only with great
care.

The array sizes should be made generously large: there are a great
many uses of strings in MakeIndex with the strxxx() and sprintf()
functions where no checking is done for adequate target storage sizes.
Although some input checking is done to avoid this possibility, it is
highly likely that there are still several places where storage
violations are possible, with core dumps, or worse, incorrect output,
ensuing.
======================================================================*/

#define ARABIC_MAX    5		/* maximum digits in an Arabic page */
				/* number field */

#define ARGUMENT_MAX  1024	/* maximum length of sort or actual key */
				/* in index entry */

#define ARRAY_MAX     1024	/* maximum length of constant values in */
				/* style file */

#define FIELD_MAX	4	/* maximum levels of index entries (item, */
				/* subitem, subsubitem); cannot be */
				/* increased beyond 3 without */
				/* significant design changes (no field */
				/* names are known beyond 3 levels) */

#ifdef LINE_MAX		/* IBM RS/6000 AIX has this in <sys/limits.h> */
#undef LINE_MAX
#endif
#define LINE_MAX      72	/* maximum output line length (longer */
				/* ones wrap if possible) */

#define NUMBER_MAX    16	/* maximum digits in a Roman or Arabic */
				/* page number */
				/* (MAX(ARABIC_MAX,ROMAN_MAX)) */

#define PAGEFIELD_MAX 10	/* maximum fields in a composite page */
				/* number */

#define PAGETYPE_MAX  5		/* fixed at 5; see use in scanst.c */

#define ROMAN_MAX     16	/* maximum length of Roman page number */
				/* field */

#define STRING_MAX    256	/* maximum length of host filename */

/*====================================================================*/

#define VERSION       "Version 2.12wm [28-Feb-1999]"

#if 0
#define VERSION       "Version 2.12wm [28-Feb-1999]"
#define VERSION       "Version 2.12a [25-May-1995]"
#define VERSION       "portable version 2.11 [19-Oct-1991]"
#define VERSION       "portable version 2.10 [05-Jul-1991]"
#define VERSION       "portable version 2.9.1 [21-Jun-1990]"
#define VERSION       "portable version 2.9 [13-Dec-1989]"
#define VERSION       "portable version 2.8 [11-Nov-1989]"
#define VERSION       "portable version 2.7 [01-Oct-1988]"
#define VERSION       "portable version 2.6 [14-Jul-1988]"
#define VERSION       "portable version 2.5 [14-Apr-1988]"
#define VERSION       "portable version 2.4 [20-Mar-1988]"
#define VERSION       "portable version 2.3 [20-Jan-1988]"
#define VERSION       "version 2.2 [29-May-1987]"
#endif

#define PUT_VERSION \
   { \
    Message("This is %s, ", pgm_fn); \
    Message("%s (%s).\n", VERSION, multilanguage[Language].name); \
    need_version = False; \
   }


#define STYLE_PATH "INDEXSTYLE"	/* environment variable defining search */
				/* path for style files */
#define INDEX_IDX  ".idx"
#define INDEX_ILG  ".ilg"
#define INDEX_IND  ".ind"
#define INDEX_STY  ".mst"

#if    OS_VAXVMS
#define INDEX_LOG  ".lis"
#else
#define INDEX_LOG  ".log"
#endif

#define EMPTY     -9999
#define ROML      0
#define ROMU      1
#define ARAB      2
#define ALPL      3
#define ALPU      4
#define DUPLICATE 9999

#define SYMBOL -1
#define ALPHA  -2

#define GERMAN 0

typedef struct KFIELD
   {
    unsigned char    *sf[FIELD_MAX];		/* sort key */
    unsigned char    *af[FIELD_MAX];		/* actual key */
    	     int     group;			/* key group */
    	     char    lpg[NUMBER_MAX];		/* literal page */
    	     short   npg[PAGEFIELD_MAX];	/* page field array */
    	     short   count;			/* page field count */
    	     short   type;			/* page number type */
    unsigned char    *encap;			/* encapsulator */
    	     char    *fn;			/* input filename */
    	     int     lc;			/* line number */
   }FIELD, *FIELD_PTR;

typedef struct KNODE
   {
    	    FIELD data;
    struct  KNODE *next;
   }NODE, *NODE_PTR;

Global void	Fatal(const char *fmt, ...);
Global void 	Message(const char *f, ...);
Global void     usage(char *);

Global Logical 	blank_ignore;
Global Logical 	compress_blanks;
Global Logical 	special_flag;
Global Logical 	init_page;
Global Logical 	merge_page;
Global int 	even_odd;
Global Logical 	verbose;

Global unsigned char idx_keyword[ARRAY_MAX];
Global 		char idx_aopen;
Global 		char idx_aclose;
Global 		char idx_level;
Global 		char idx_ropen;
Global 		char idx_rclose;
Global 		char idx_quote;
Global 		char idx_actual;
Global 		char idx_encap;
Global 		char idx_escape;

Global char page_comp[ARRAY_MAX];
Global int  page_offset[PAGETYPE_MAX];

Global char preamble[ARRAY_MAX];
Global char postamble[ARRAY_MAX];
Global char setpage_open[ARRAY_MAX];
Global char setpage_close[ARRAY_MAX];
Global char group_skip[ARRAY_MAX];
Global int  headings_flag;
Global char heading_pre[ARRAY_MAX];
Global char heading_suf[ARRAY_MAX];
Global char symhead_pos[ARRAY_MAX];
Global char symhead_neg[ARRAY_MAX];
Global char numhead_pos[ARRAY_MAX];
Global char numhead_neg[ARRAY_MAX];
Global int prelen;
Global int postlen;
Global int skiplen;
Global int headprelen;
Global int headsuflen;
Global int setpagelen;

Global char item_r[FIELD_MAX][ARRAY_MAX];
Global char item_u[FIELD_MAX][ARRAY_MAX];
Global char item_x[FIELD_MAX][ARRAY_MAX];
Global int  ilen_r[FIELD_MAX];
Global int  ilen_u[FIELD_MAX];
Global int  ilen_x[FIELD_MAX];

Global char delim_p[FIELD_MAX][ARRAY_MAX];
Global char delim_n[ARRAY_MAX];
Global char delim_r[ARRAY_MAX];
Global char delim_t[ARRAY_MAX];

Global char suffix_2p[ARRAY_MAX];
Global char suffix_3p[ARRAY_MAX];
Global char suffix_mp[ARRAY_MAX];

Global char encap_p[ARRAY_MAX];
Global char encap_i[ARRAY_MAX];
Global char encap_s[ARRAY_MAX];

Global int  linemax;
Global char indent_space[ARRAY_MAX];
Global int  indent_length;

Global FILE *idx_fp;
Global FILE *sty_fp;
Global FILE *ind_fp;
Global FILE *ilg_fp;

Global char *idx_fn;
Global char *pgm_fn;
Global char *ind_fn;
Global char *ilg_fn;

#ifndef MKIND_C
Global char sty_fn[];
Global char ind[];
Global char ilg[];
Global char pageno[];

#ifdef DEBUG
Global long totmem;
#endif /* DEBUG */

#endif

Global FIELD_PTR       *idx_key;
Global NODE_PTR 	head;
Global NODE_PTR 	tail;

Global Logical 	idx_dot;
Global int 	idx_tt;
Global int 	idx_gt;
Global int 	idx_et;
Global int 	idx_dc;

#define DOT     "."
#define DOT_MAX 1000
#define CMP_MAX 1500

#define VOIDP		void*
#define VOID_ARG	void

Global void 	gen_ind (void);
Global int 	group_type (unsigned char *str);
Global int 	main(int argc, char **argv);
Global void 	qqsort (char *base, int n, int size,
					    int (*compar)(char*,char*));
Global void 	scan_idx (void);
Global void 	scan_sty (void);
Global void 	sort_idx (void);
Global int 	strtoint (char *str);

#if STDC
#include <stdlib.h>
#undef strchr
#undef strrchr
#if __NeXT__
int	access (const char *, int);
#else
#if OS_PCDOS
#else
#include <unistd.h>
#endif
#endif
#else
/* Miscellaneous standard library routines */
int	access (const char *, int);
VOIDP	calloc (size_t nitems,size_t size);

char   *getenv (const char *name);

VOIDP	malloc (size_t size);
#endif /* __STDC__ */

#if    PCC_20
#define R_OK 0                         /* PCC-20 access(file,mode) */
#endif                                 /* only understands mode=0  */

#ifndef    R_OK
#define R_OK 4                         /* only symbol from sys/file.h */
#endif

typedef unsigned char char_u;

typedef const char_u *p_char_u[];

typedef const    char_u a_char_u[];
typedef const    int      int_u[];
typedef unsigned int      word;


#include "language.h"
