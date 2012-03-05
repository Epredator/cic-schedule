#include "mkind.h"

#ifdef DEBUG
language Language = DEFAULT_LANGUAGE;
#endif

#define CCCC	8

#define LF	10
#define CR	13

#define IS_UPPER        0x01
#define IS_LOWER        0x02
#define IS_BLANK        0x04
#define IS_DIG          0x08
#define IS_XDIG         0x10
#define IS_CTR          0x20
#define IS_ALPH         0x40
#define IS_ALPHA        (IS_LOWER | IS_UPPER)
#define IS_ALNUM        (IS_DIG | IS_ALPHA)

#include "pl_maz.h"
#include "pl_iso2.h"
#include "pl_1250.h"
#include "pl_852.h"
#include "us_eng.h"

Public struct _multilanguage multilanguage[] =
      {
       {
	&us_day_name_ptr,
	&us_day_name_ptr_a,
	&us_mon_name_ptr,
	&us_mon_name_ptr_a,
	&us_toascii_table,
	&us_lower_table,
	&us_upper_table,
	&us_char_type,
	&us_order_tbl,
        0,
	NULL,
	"english",
	"US english",
	NULL
       },
       {
	&pl_maz_day_name_ptr,
	&pl_maz_day_name_ptr_a,
	&pl_maz_mon_name_ptr,
	&pl_maz_mon_name_ptr_a,
	&pl_maz_toascii_table,
	&pl_maz_lower_table,
	&pl_maz_upper_table,
	&pl_maz_char_type,
	&pl_maz_order_tbl,
        0,
	Decode_Number,
	(char *)"PL-mazowia",
	(char *)"Polish mazowia",
	NULL
       },
       {
	&pl_iso2_day_name_ptr,
	&pl_iso2_day_name_ptr_a,
	&pl_iso2_mon_name_ptr,
	&pl_iso2_mon_name_ptr_a,
	&pl_iso2_toascii_table,
	&pl_iso2_lower_table,
	&pl_iso2_upper_table,
	&pl_iso2_char_type,
	&pl_iso2_order_tbl,
        0,
	Decode_Number,
	"PL-latin2",
	"Polish ISO-8859-2 (Latin2)",
	NULL
       },
       {
	&pl_cp1250_day_name_ptr,
	&pl_cp1250_day_name_ptr_a,
	&pl_cp1250_mon_name_ptr,
	&pl_cp1250_mon_name_ptr_a,
	&pl_cp1250_toascii_table,
	&pl_cp1250_lower_table,
	&pl_cp1250_upper_table,
	&pl_cp1250_char_type,
	&pl_cp1250_order_tbl,
        0,
	Decode_Number,
	"PL-cp1250",
	"Polish cp1250 (MS Windows)",
	NULL
       },
       {
	&pl_cp852_day_name_ptr,
	&pl_cp852_day_name_ptr_a,
	&pl_cp852_mon_name_ptr,
	&pl_cp852_mon_name_ptr_a,
	&pl_cp852_toascii_table,
	&pl_cp852_lower_table,
	&pl_cp852_upper_table,
	&pl_cp852_char_type,
	&pl_cp852_order_tbl,
        0,
	Decode_Number,
	"PL-cp852",
	"Polish cp852 (IBM Latin2)",
	NULL
       },
       {
	NULL,
	NULL,
	NULL,
	NULL,
	NULL,
	NULL,
	NULL,
	NULL,
	NULL,
        0,
	NULL,
	NULL,
	NULL,
	NULL
       }
      };

Public int
isalnum(unsigned char ch)

{
    return((*(multilanguage[Language].char_type))[ch] & IS_ALNUM);
}

Public int
isalpha(unsigned char ch)

{
    return((*(multilanguage[Language].char_type))[ch] & IS_ALPHA);
}

Public int
isascii(unsigned char ch)

{
    return((*(multilanguage[Language].char_type))[ch] & IS_ALNUM);
}

Public int
iscntrl(unsigned char ch)

{
    return((*(multilanguage[Language].char_type))[ch] & IS_CTR);
}

Public int
isdigit(unsigned char ch)

{
    return((*(multilanguage[Language].char_type))[ch] & IS_DIG);
}

Public int
isgraph(unsigned char ch)

{
    return(((*(multilanguage[Language].char_type))[ch] & IS_ALNUM) || 
						    (ch >= '!' && ch <= 0x7e));
}

Public int
islower(unsigned char ch)

{
    return((*(multilanguage[Language].char_type))[ch] & IS_LOWER);
}

Public int
isupper(unsigned char ch)

{
    return((*(multilanguage[Language].char_type))[ch] & IS_UPPER);
}

Public int
isxdigit(unsigned char ch)

{
    return((*(multilanguage[Language].char_type))[ch] & IS_XDIG);
}

Public int
isprint(unsigned char ch)

{
    return(((*(multilanguage[Language].char_type))[ch] & IS_ALNUM) || 
    						((ch >= ' ') && (ch <= 0x7e)));
}

Public int
ispunct(unsigned char ch)

{
    return(!((*(multilanguage[Language].char_type))[ch] & 
					    (IS_BLANK | IS_ALNUM | IS_CTR)));
}

Public int
isspace(unsigned char ch)

{
    return((*(multilanguage[Language].char_type))[ch] & IS_BLANK);
}

Public int
isblank(unsigned char ch)

{
    return((*(multilanguage[Language].char_type))[ch] & IS_BLANK);
}

Public unsigned char
mytoupper(unsigned char ch)

{
    if((*(multilanguage[Language].char_type))[ch] & IS_LOWER)
        return((*(multilanguage[Language].upper_table))[ch - 'a']);
     else
        return(ch);
}

Public unsigned char
mytolower(unsigned char ch)

{
    if((*(multilanguage[Language].char_type))[ch] & IS_UPPER)
        return((*(multilanguage[Language].lower_table))[ch - 'A']);
     else
        return(ch);
}

Public unsigned char *
strupr(unsigned char *s)

{
    register unsigned char *ss;

    ss = s;

    while(*ss)
       {
        if((*(multilanguage[Language].char_type))[*ss] & IS_LOWER)
	    *ss = (*(multilanguage[Language].upper_table))[*ss - 'a'];
        ss++;
       }
    return(s);
}

Public unsigned char *
strlwr(unsigned char *s)

{
    register unsigned char *ss;

    ss = s;
    while(*ss)
       {
        if((*(multilanguage[Language].char_type))[*ss] & IS_UPPER)
	    *ss = (*(multilanguage[Language].lower_table))[*ss - 'A'];
        ss++;
       }
    return(s);
}

Public int
mystrncmp(const unsigned char *s, const unsigned char *d, size_t n)

{

    while(*s && *d && *s == *d && (n > 0))
        s++, d++, n--;
    if(n == 0)
       return(0);
     else
       return((*(multilanguage[Language].order_tbl))[(unsigned char)*s] - 
		    (*(multilanguage[Language].order_tbl))[(unsigned char)*d]);
}


Public int
mystrcmp(const unsigned char *s, const unsigned char *d)

{

    while(*s && *d && *s == *d)
        s++, d++;
    return((*(multilanguage[Language].order_tbl))[(unsigned char)*s] - 
		    (*(multilanguage[Language].order_tbl))[(unsigned char)*d]);
}

Public int
charcmp(unsigned char s, unsigned char d)

{
    return((*(multilanguage[Language].order_tbl))[s] - 
				(*(multilanguage[Language].order_tbl))[d]);
}

Public const char_u *
day_name(int day)

{
    return((*multilanguage[Language].day_name_ptr)[day]);
}

Public const char_u *
day_name_a(int day)

{
    return((*multilanguage[Language].day_name_ptr_a)[day]);
}

Public const char_u *
month_name(int month)

{
    return((*multilanguage[Language].mon_name_ptr)[month]);
}

Public const char_u *
month_name_a(int month)

{
    return((*multilanguage[Language].mon_name_ptr_a)[month]);
}

Public int 
strnicmp(const unsigned char *s, const unsigned char *d, size_t n)

{
    while(*s && *d && mytolower(*s) == mytolower(*d) && (n > 0))
        s++, d++, n--;
    if(n == 0)
        return(0);
     else
	return((*(multilanguage[Language].order_tbl))[*s] - 
				    (*(multilanguage[Language].order_tbl))[*d]);
}

Public int 
strncasecmp(const unsigned char *s, const unsigned char *d, size_t n)

{
    while(*s && *d && mytolower(*s) == mytolower(*d) && (n > 0))
        s++, d++, n--;
    if(n == 0)
        return(0);
     else
	return((*(multilanguage[Language].order_tbl))[*s] - 
				    (*(multilanguage[Language].order_tbl))[*d]);
}


Public int 
stricmp(const unsigned char *s, const unsigned char *d)

{
    while(*s && *d && mytolower(*s) == mytolower(*d))
        s++, d++;
    return((*(multilanguage[Language].order_tbl))[*s] - 
				    (*(multilanguage[Language].order_tbl))[*d]);
}

Public int 
strcasecmp(const unsigned char *s, const unsigned char *d)

{
    while(*s && *d && mytolower(*s) == mytolower(*d))
        s++, d++;
    return((*(multilanguage[Language].order_tbl))[*s] - 
				    (*(multilanguage[Language].order_tbl))[*d]);
}

Public unsigned char *
mystrchr(unsigned char *s, unsigned char c)
{

  if(c == 0)
      return(s + strlen((char *)s));
  while(*s)
  {
    if (*s == c)
      return(s);
    s++;
  }
  return(NULL);
}

Public unsigned char *
mystrrchr(unsigned char *s, unsigned char c)

{
  unsigned char *ss = s + strlen((char *)s);

  while (ss >= s)
  {
    if (*ss == c)
      return(ss);
    ss--;
  }
  return(NULL);
}

Public int 
toascii(unsigned char c)

{

    if(c > 127)
	return((*(multilanguage[Language].toascii_table))[c - 128]);
     else
        return(c);
}

Public int  
set_lang(char *lang_name)

{
    int i;

    for(i = 0; multilanguage[i].id != NULL;)
       {
	if(mystrcmp((unsigned char *)multilanguage[i].id, 
		    			(unsigned char *)lang_name) == 0)
	    break;
	i++;
       }
    if(multilanguage[i].id == NULL)
	return(1);
    Language = (language)i;
    return(0);
}

Public char * 
get_lang_id()

{
    return(multilanguage[Language].name);
}

#ifdef DEBUG

void 
test(unsigned char c1,  unsigned char c2)

{
    if(charcmp(c1, c2) < 0)
	printf("%c < %c (%d)\n", c1, c2, charcmp(c1, c2));
     else if(charcmp(c1, c2) == 0)
	printf("%c == %c (%d)\n", c1, c2, charcmp(c1, c2));
     else
	printf("%c > %c (%d)\n", c1, c2, charcmp(c1, c2));

}

#include <stdio.h>


void
main(int argc, char *argv[])

{

    int i;

    Language = PL_latin2;

    printf("%d\n", Language);
    for(i = 1; i < 256; i++)
	printf("%d %c - %d %d\n", i, i, islower(i), isupper(i));
    printf("%c %c\n", '±', mytoupper('±'));
    printf("%c %c\n", 'æ', mytoupper('æ'));
    printf("%c %c\n", 'ê', mytoupper('ê'));
    printf("%c %c\n", '³', mytoupper('³'));
    printf("%c %c\n", 'ñ', mytoupper('ñ'));
    printf("%c %c\n", 'ó', mytoupper('ó'));
    printf("%c %c\n", '¶', mytoupper('¶'));
    printf("%c %c\n", '¼', mytoupper('¼'));
    printf("%c %c\n", '¿', mytoupper('¿'));

    printf("%c %c\n", '¡', mytolower('¡'));
    printf("%c %c\n", 'Æ', mytolower('Æ'));
    printf("%c %c\n", 'Ê', mytolower('Ê'));
    printf("%c %c\n", '£', mytolower('£'));
    printf("%c %c\n", 'Ñ', mytolower('Ñ'));
    printf("%c %c\n", 'Ó', mytolower('Ó'));
    printf("%c %c\n", '¦', mytolower('¦'));
    printf("%c %c\n", '¬', mytolower('¬'));
    printf("%c %c\n", '¯', mytolower('¯'));
printf("%x %x\n", (*(multilanguage[Language].order_tbl))[(unsigned char)'ó'],
		(*(multilanguage[Language].order_tbl))[(unsigned char)'Ó']);
printf("%x %x\n", (*(multilanguage[Language].order_tbl))[(unsigned char)'¶'],
		(*(multilanguage[Language].order_tbl))[(unsigned char)'¦']);
}
#endif


