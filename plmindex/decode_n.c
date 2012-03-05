#include "mkind.h"
#include <stdlib.h>
#include <malloc.h>

Local char_u *myconcat(char_u *, const char_u *);
Local void  get_jed(int *lll, long licz);
Local char_u *dec_text(Logical flag, int *zzz, char_u *text);

#define EOS '\0'

Local int tab_jed[5],
          tab_tys[5],
          tab_mil[5];


Public char_u *
Decode_Number(const long liczba)

{

             long licz;
    char_u *text;

    if(liczba >= 1000000000L)
       {
        fprintf(stderr, "Number to big");
	exit(1);
       }
    if((text = (char_u *)malloc(strlen("") + 1)) == NULL)
       {
        fprintf(stderr, "Can`t allocate memory");
	exit(1);
       }
    *text = EOS;
    get_jed(tab_jed, liczba);
    if(tab_jed[3] > 0)
	get_jed(tab_tys, tab_jed[3]);
    if(tab_jed[4] > 0)
	get_jed(tab_mil, tab_jed[4]);

    if(tab_jed[4] > 0)
       {
	text = dec_text(False, tab_mil, text);
	if(tab_mil[0] < 5 &&
		    (tab_mil[0] > 1 || (tab_mil[1] == 0 && tab_mil[2] == 0)))
	   {
	    text = myconcat(text, 
			    (*multilanguage[Language].decode->mil)[tab_mil[0]]);
	    text = myconcat(text, (char_u *)" ");
	   }
	 else
	   {
	    text = myconcat(text, (*multilanguage[Language].decode->mil)[5]);
	    text = myconcat(text, (char_u *)" ");
	   }
       }
    if(tab_jed[3] > 0)
       {
	text = dec_text(False, tab_tys, text);
	if(tab_tys[0] < 5 &&
		    (tab_tys[0] > 1 || (tab_tys[1] == 0 && tab_tys[2] == 0)))
	   {
	    text = myconcat(text, 
			    (*multilanguage[Language].decode->tys)[tab_tys[0]]);
	    text = myconcat(text, (char_u *)" ");
	   }
	 else
	   {
	    text = myconcat(text, (*multilanguage[Language].decode->tys)[5]);
	    text = myconcat(text, (char_u *)" ");
	   }
       }
    text = dec_text(True, tab_jed, text);
    return(text);
}

Local void
get_jed(int *lll, long licz)

{
    char *buffer;
    int  ii,
         kk;

    if((buffer = (char *)malloc(10)) == NULL)
       {
        fprintf(stderr, "Can`t allocate memory");
	exit(1);
       }
    sprintf(buffer, "%ld", licz);

    ii = strlen(buffer);
    free(buffer);

    for(kk = 0; kk < ii;)
       {
        if(licz < 10L)
	   {
	    lll[0] = licz;
	    kk++;
	   }
        else if(licz < 100L)
	   {
	    if(licz < 20L)
	       {
		lll[0] = licz;
		kk++;
	       }
	     else
	       {
		lll[1] = licz / 10;
		licz = licz - lll[1] * 10;
		kk++;
	       }
	   }
        else if(licz < 1000L)
	   {
	    lll[2] = licz / 100L;
	    licz = licz - lll[2] * 100L;
	    kk++;
	    }
        else if(licz < 1000000L)
	   {
	    lll[3] = licz / 1000L;
	    licz = licz - lll[3] * 1000L;
	    kk++;
	   }
        else if(licz < 1000000000L)
	   {
	    lll[4] = licz / 1000000L;
	    licz = licz - lll[4] * 1000000L;
	    kk += 3;
	   }
       }
}

Local char_u *
dec_text(Logical flag, int *zzz, char_u *text)

{
    if(zzz[2] > 0)
	   {
	    text = myconcat(text, 
			    (*multilanguage[Language].decode->setki)[zzz[2]]);
	    text = myconcat(text, (char_u *)" ");
	   }
    if(zzz[1] > 0)
	   {
	    text = myconcat(text, 
	    		(*multilanguage[Language].decode->dies)[zzz[1] - 1]);
	    text = myconcat(text, (char_u *)" ");
	   }
    if(zzz[0] > 0 && (flag || (zzz[0] != 1 || (zzz[1] > 0 || zzz[2] > 0))))
	   {
	    text = myconcat(text, 
	    		(*multilanguage[Language].decode->jedn)[zzz[0]]);
	    text = myconcat(text, (char_u *)" ");
	   }
    return(text);
}

Local char_u *
myconcat(char_u *str, const char_u *addstr)

{
    char *tmp_str;

    if((tmp_str = (char *)malloc(strlen((char *)str) + 
    					strlen((char *)addstr) + 1)) == NULL)
       {
        fprintf(stderr, "Can`t allocate memory");
	exit(1);
       }
   strcpy(tmp_str, (char *)str);
   strcat(tmp_str, (char *)addstr);
   free(str);
   return((char_u *)tmp_str);
}

#ifdef D_DEBUG

void
main(int argc, char *argv[])

{
    long num;

    if(argc < 2)
       {
        fprintf(stderr, "liczba <liczba>\n");
	exit(1);
       }
    num = atol(argv[1]);
    printf("%s\n", Decode_Number(num));
}

#endif
