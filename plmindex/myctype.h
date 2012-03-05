#undef strupr
#undef strlwr
#undef strnicmp
#undef strncasecmp
#undef stricmp
#undef strcasecmp
#undef isalnum
#undef isalpha
#undef isascii
#undef iscntrl
#undef isdigit
#undef isgraph
#undef islower
#undef isprint
#undef ispunct
#undef isspace
#undef isupper
#undef isxdigit
#undef tolower
#undef toupper
#undef toascii
#undef charcmp
#undef strchr
#undef strrchr


#ifdef __cplusplus
extern "C" {
#endif
unsigned char *mystrchr(unsigned char *s, unsigned char c);
unsigned char *mystrrchr(unsigned char *s, unsigned char c);
unsigned char * strupr(unsigned char *s);
unsigned char * strlwr(unsigned char *s);
int mystrncmp(const unsigned char *s, const unsigned char *d, size_t n);
int mystrcmp(const unsigned char *s, const unsigned char *d);
int strnicmp(const unsigned char *s, const unsigned char *d, size_t n);
int strncasecmp(const unsigned char *s, const unsigned char *d, size_t n);
int stricmp(const unsigned char *s, const unsigned char *d);
int strcasecmp(const unsigned char *s, const unsigned char *d);
int isalnum (unsigned char __c);
int isalpha (unsigned char __c);
int isascii (unsigned char __c);
int iscntrl (unsigned char __c);
int isdigit (unsigned char __c);
int isgraph (unsigned char __c);
int islower (unsigned char __c);
int isprint (unsigned char __c);
int ispunct (unsigned char __c);
int isspace (unsigned char __c);
int isupper (unsigned char __c);
int isxdigit(unsigned char __c);
unsigned char mytolower(unsigned char __ch);
unsigned char mytoupper(unsigned char __ch);
int toascii(unsigned char __ch);
int charcmp(unsigned char s, unsigned char d);
#ifdef __cplusplus
}
#endif
