
enum _language {English, PL_mazowia, PL_latin2, PL_cp1250, PL_cp852};
typedef enum _language language;
Global language Language;

#define	EOS		'\0'
#define EMPTY_STRING 	(unsigned char *)""

#define TAB 		'\t'
#define LFD 		'\n'
#define SPC 		' '
#define LSQ 		'['
#define RSQ 		']'
#define BSH 		'\\'


struct decode
   {
    p_char_u *jedn;
    p_char_u *dies;
    p_char_u *setki;
    p_char_u *tys;
    p_char_u *mil;
   };

struct _multilanguage
   { 
            p_char_u  *day_name_ptr;
            p_char_u  *day_name_ptr_a;
            p_char_u  *mon_name_ptr;
            p_char_u  *mon_name_ptr_a;
            int_u     *toascii_table;
            a_char_u  *lower_table;
            a_char_u  *upper_table;
            a_char_u  *char_type;
            int_u     *order_tbl;
            word      flags;
            char_u    *(*_special)(const long);
            char      *id;
            char      *name;
     struct decode    *decode;
};
Global struct _multilanguage multilanguage[];

Global char_u *Decode_Number(const long liczba);

#define SPECIAL_FLAG	0001

Global const char_u *month_name(int month);
Global const char_u *month_name_a(int month);
Global const char_u *day_name_a(int day);
Global const char_u *day_name(int day);
