static p_char_u pl_maz_day_name_ptr =
   {
      (char_u *)NULL,
      (char_u *)"niedziela",
      (char_u *)"poniedziaíek",
      (char_u *)"wtorek",
      (char_u *)"ûroda",
      (char_u *)"czwartek",
      (char_u *)"piÜtek",
      (char_u *)"sobota",
   };

static p_char_u pl_maz_day_name_ptr_a =
   {
      (char_u *)NULL,
      (char_u *)"nd",
      (char_u *)"pn",
      (char_u *)"wt",
      (char_u *)"ûr",
      (char_u *)"cz",
      (char_u *)"pt",
      (char_u *)"sb",
   };

static p_char_u pl_maz_mon_name_ptr =
   {
      (char_u *)NULL,
      (char_u *)"stycze§",
      (char_u *)"luty",
      (char_u *)"marzec",
      (char_u *)"kwiecie§",
      (char_u *)"maj",
      (char_u *)"czerwiec",
      (char_u *)"lipiec",
      (char_u *)"sierpie§",
      (char_u *)"wrzesie§",
      (char_u *)"pa¶dziernik",
      (char_u *)"listopad",
      (char_u *)"grudzie§"
   };

static p_char_u pl_maz_mon_name_ptr_a =
   {
      (char_u *)NULL,
      (char_u *)"stycze§",
      (char_u *)"luty",
      (char_u *)"marzec",
      (char_u *)"kwiecie§",
      (char_u *)"maj",
      (char_u *)"czerwiec",
      (char_u *)"lipiec",
      (char_u *)"sierpie§",
      (char_u *)"wrzesie§",
      (char_u *)"pa¶dziernik",
      (char_u *)"listopad",
      (char_u *)"grudzie§"
   };

static int_u pl_maz_toascii_table = 
   {
    'C',			/*  128 0x80 */
    'u',			/*  129 0x81 */
    'e',			/*  130 0x82 */
    'a',			/*  131 0x83 */
    'a',			/*  132 0x84 */
    'a',			/*  133 0x85 */
    'a',			/*  134 0x86 */
    'c',			/*  135 0x87 */
    'e',			/*  136 0x88 */
    'e',			/*  137 0x89 */
    'e',			/*  138 0x8a */
    'i',			/*  139 0x8b */
    'i',			/*  140 0x8c */
    'c',			/*  141 0x8d */
    'A',			/*  142 0x8e */
    'A',			/*  143 0x8f */
    'E',			/*  144 0x90 */
    'e',			/*  145 0x91 */
    'l',			/*  146 0x92 */
    'o',			/*  147 0x93 */
    'o',			/*  148 0x94 */
    'C',			/*  149 0x95 */
    'u',			/*  150 0x96 */
    'u',			/*  151 0x97 */
    'S',			/*  152 0x98 */
    'O',			/*  153 0x99 */
    'U',			/*  154 0x9a */
    'c',			/*  155 0x9b */
    'L',			/*  156 0x9c */
    'Y',			/*  157 0x9d */
    's',			/*  158 0x9e */
    'f',			/*  159 0x9f */
    'Z',			/*  160 0xa0 */
    'Z',			/*  161 0xa1 */
    'o',			/*  162 0xa2 */
    'O',			/*  163 0xa3 */
    'n',			/*  164 0xa4 */
    'N',			/*  165 0xa5 */
    'z',			/*  166 0xa6 */
    'z',			/*  167 0xa7 */
    '?',			/*  168 0xa8 */
    '!',			/*  169 0xa9 */
    '!',			/*  170 0xaa */
    ' ',			/*  171 0xab */
    ' ',			/*  172 0xac */
    '!',			/*  173 0xad */
    '<',			/*  174 0xae */
    '>',			/*  175 0xaf */
    '|',			/*  176 0xb0 */
    '|',			/*  177 0xb1 */
    '|',			/*  178 0xb2 */
    '|',			/*  179 0xb3 */
    '|',			/*  180 0xb4 */
    '|',			/*  181 0xb5 */
    '|',			/*  182 0xb6 */
    '|',			/*  183 0xb7 */
    '|',			/*  184 0xb8 */
    '|',			/*  185 0xb9 */
    '|',			/*  186 0xba */
    '|',			/*  187 0xbb */
    '+',			/*  188 0xbc */
    '+',			/*  189 0xbd */
    '+',			/*  190 0xbe */
    '+',			/*  191 0xbf */
    '+',			/*  192 0xc0 */
    '+',			/*  193 0xc1 */
    '+',			/*  194 0xc2 */
    '|',			/*  195 0xc3 */
    '-',			/*  196 0xc4 */
    '|',			/*  197 0xc5 */
    '|',			/*  198 0xc6 */
    '|',			/*  199 0xc7 */
    '|',			/*  200 0xc8 */
    '|',			/*  201 0xc9 */
    '-',			/*  202 0xca */
    '-',			/*  203 0xcb */
    '|',			/*  204 0xcc */
    '-',			/*  205 0xcd */
    '|',			/*  206 0xce */
    '-',			/*  207 0xcf */
    '-',			/*  208 0xd0 */
    '-',			/*  209 0xd1 */
    '-',			/*  210 0xd2 */
    '|',			/*  211 0xd3 */
    '|',			/*  212 0xd4 */
    '|',			/*  213 0xd5 */
    '|',			/*  214 0xd6 */
    '|',			/*  215 0xd7 */
    '|',			/*  216 0xd8 */
    '-',			/*  217 0xd9 */
    '-',			/*  218 0xda */
    '|',			/*  219 0xdb */
    '-',			/*  220 0xdc */
    '|',			/*  221 0xdd */
    '|',			/*  222 0xde */
    '-',			/*  223 0xdf */
    'a',			/*  224 0xe0 */
    's',			/*  225 0xe1 */
    'G',			/*  226 0xe2 */
    'p',			/*  227 0xe3 */
    'S',			/*  228 0xe4 */
    's',			/*  229 0xe5 */
    'm',			/*  230 0xe6 */
    't',			/*  231 0xe7 */
    'p',			/*  232 0xe8 */
    'H',			/*  233 0xe9 */
    'O',			/*  234 0xea */
    'd',			/*  235 0xeb */
    'o',			/*  236 0xec */
    'o',			/*  237 0xed */
    'e',			/*  238 0xee */
    'n',			/*  239 0xef */
    '=',			/*  240 0xf0 */
    '+',			/*  241 0xf1 */
    '>',			/*  242 0xf2 */
    '<',			/*  243 0xf3 */
    'f',			/*  244 0xf4 */
    'f',			/*  245 0xf5 */
    '/',			/*  246 0xf6 */
    '=',			/*  247 0xf7 */
    'o',			/*  248 0xf8 */
    '.',			/*  249 0xf9 */
    '.',			/*  250 0xfa */
    ' ',			/*  251 0xfb */
    ' ',			/*  252 0xfc */
    '2',			/*  253 0xfd */
    '.',			/*  254 0xfe */
    ' ',			/*  255 0xff */
   };

static a_char_u pl_maz_lower_table =
   {
    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
    'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
    'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
    'y', 'z', '[', '\\', ']', '^', '_',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'Ü',
    'ë', ' ', ' ', ' ', ' ', 'ç', ' ', ' ',
    'û', ' ', ' ', ' ', 'í', ' ', ' ', ' ',
    '¶', 'ß', ' ', '¢', ' ', '§'
   };

static a_char_u pl_maz_upper_table =
   {
    'A','B','C','D','E','F','G','H',
    'I','J','K','L','M','N','O','P',
    'Q','R','S','T','U','V','W','X',
    'Y','Z','{','|','}','~',' ',
    ' ',' ',' ',' ',' ',' ','è',' ',
    ' ',' ',' ',' ',' ','ï',' ',' ',
    ' ','ê','ú',' ',' ',' ',' ',' ',
    ' ',' ',' ',' ',' ',' ','ò',' ',
    '†',' ','£',' ','•',' ','†','°'
   };


static a_char_u pl_maz_char_type =
   {
IS_CTR,	           IS_CTR,	      IS_CTR,	         IS_CTR,
IS_CTR,	           IS_CTR,	      IS_CTR,	         IS_CTR,
IS_CTR,	           IS_CTR | IS_BLANK, IS_CTR | IS_BLANK, IS_CTR | IS_BLANK,
IS_CTR | IS_BLANK, IS_CTR | IS_BLANK, IS_CTR,            IS_CTR, 	
IS_CTR,	           IS_CTR,	      IS_CTR,            IS_CTR,
IS_CTR,            IS_CTR,            IS_CTR,            IS_CTR,
IS_CTR,	           IS_CTR,	      IS_CTR,            IS_CTR,
IS_CTR,            IS_CTR,            IS_CTR,            IS_CTR,
IS_BLANK,          0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
IS_XDIG | IS_DIG,  IS_XDIG | IS_DIG,  IS_XDIG | IS_DIG,  IS_XDIG | IS_DIG,
IS_XDIG | IS_DIG,  IS_XDIG | IS_DIG,  IS_XDIG | IS_DIG,  IS_XDIG | IS_DIG,
IS_XDIG | IS_DIG,  IS_XDIG | IS_DIG,  0x000,             0x000,
0x000,             0x000,             0x000,             0x000,

0x000,             IS_XDIG | IS_UPPER,IS_XDIG | IS_UPPER,IS_XDIG | IS_UPPER,
IS_XDIG | IS_UPPER,IS_XDIG | IS_UPPER,IS_XDIG | IS_UPPER,IS_UPPER,
IS_UPPER,          IS_UPPER,          IS_UPPER,          IS_UPPER,
IS_UPPER,          IS_UPPER,          IS_UPPER,          IS_UPPER,
IS_UPPER,          IS_UPPER,          IS_UPPER,          IS_UPPER,
IS_UPPER,          IS_UPPER,          IS_UPPER,          IS_UPPER,
IS_UPPER,          IS_UPPER,          IS_UPPER,          0x000,
0x000,             0x000,             0x000,             IS_ALPH,

0x000,             IS_XDIG | IS_LOWER,IS_XDIG | IS_LOWER,IS_XDIG | IS_LOWER,
IS_XDIG | IS_LOWER,IS_XDIG | IS_LOWER,IS_XDIG | IS_LOWER,IS_LOWER,
IS_LOWER,          IS_LOWER,          IS_LOWER,          IS_LOWER,
IS_LOWER,          IS_LOWER,          IS_LOWER,          IS_LOWER,
IS_LOWER,          IS_LOWER,          IS_LOWER,          IS_LOWER,
IS_LOWER,          IS_LOWER,          IS_LOWER,          IS_LOWER,
IS_LOWER,          IS_LOWER,          IS_LOWER,          0x000,
0x000,             0x000,             0x000,             IS_CTR,

0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             IS_LOWER,          0x000,         /* 84 */
                                    /* a ogonek */
0x000,             0x000,             0x000,             0x000,         /* 88 */
0x000,             IS_LOWER,          0x000,             IS_UPPER,      /* 8c */
                  /* c acute*/                          /* A ogonek*/
IS_UPPER,          IS_LOWER,          IS_LOWER,          0x000,         /* 90 */
/*E ogonek */     /*e ogonek */       /* polish l */
0x000,             IS_UPPER,          0x000,             0x000,         /* 94 */
                  /* C acute */
IS_UPPER,          0x000,             0x000,             0x000,         /* 98 */
/* S acute */
IS_UPPER,          0x000,             IS_LOWER,          0x000,         /* 9c */
/* Polish L */                       /* s acute */
IS_UPPER,          IS_UPPER,          IS_LOWER,          IS_UPPER,      /* a0 */
/* Z acute */      /* Z dot */       /* o acute */       /* O acute*/
IS_LOWER,          IS_UPPER,          IS_LOWER,          IS_LOWER,      /* a4 */
/*n acute */      /* N acute */      /* z acute */      /* z dot */
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,

0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000
   };

static int_u pl_maz_order_tbl =
   { 
0, 1, 2, 3, 4, 5, 6, 7,
8,
TAB,							/*  9 */
LF,							/*  10 0a */
11,
12,
CR,							/*  13 0d */
14,
15,
16, 17, 18, 19, 20, 21, 22, 23,
24, 25, 26, 27, 28, 29, 30, 31,
' ',							/*  32 20 */
'!',						/*   33 21 */
0x22,						/*   34 22	quote */
'#',						/*   35 23 */
'$',						/*   36 24 */
'%',						/*   37 25 */
'&',						/*   38 26 */
0x27,						/*   39 27 	single quote */
'(',						/*   40 28 */
')',						/*   41 29 */
'*',						/*   42 2a */
'+',						/*   43 2b */
',',						/*   44 2c */
'-',						/*   45 2d */
'.',						/*   46 2e */
'/',						/*   47 2f */
'0',						/*   48 30 */
'1',						/*   49 31 */
'2',						/*   50 32 */
'3',						/*   51 33 */
'4',						/*   52 34 */
'5',						/*   53 35 */
'6',						/*   54 36 */
'7',						/*   55 37 */
'8',						/*   56 38 */
'9',						/*   57 39 */
':',						/*   58 3a */
';',						/*   59 3b */
'<',						/*   60 3c */
'=',						/*   61 3d */
'>',						/*   62 3e */
'?',						/*   63 3f */
'@',						/*   64 40 */
'a' * CCCC + 4, 		/*  'A', 			    65 41 */
'b' * CCCC + 4, 		/*  'B', 			    66 42 */
'c' * CCCC + 4, 		/*  'C', 			    67 43 */
'd' * CCCC + 4, 		/*  'D', 			    68 44 */
'e' * CCCC + 4, 		/*  'E', 			    69 45 */
'f' * CCCC + 4, 		/*  'F', 			    70 46 */
'g' * CCCC + 4, 		/*  'G', 			    71 47 */
'h' * CCCC + 4, 		/*  'H', 			    72 48 */
'i' * CCCC + 4, 		/*  'I', 			    73 49 */
'j' * CCCC + 4, 		/*  'J', 			    74 4a */
'k' * CCCC + 4, 		/*  'K', 			    75 4b */
'l' * CCCC + 4, 		/*  'L', 			    76 4c */
'm' * CCCC + 4, 		/*  'M', 			    77 4d */
'n' * CCCC + 4, 		/*  'N', 			    78 4e */
'o' * CCCC + 4, 		/*  'O', 			    79 4f */
'p' * CCCC + 4, 		/*  'P', 			    80 50 */
'q' * CCCC + 4, 		/*  'Q', 			    81 51 */
'r' * CCCC + 4, 		/*  'R', 			    82 52 */
's' * CCCC + 4, 		/*  'S', 			    83 53 */
't' * CCCC + 4, 		/*  'T', 			    84 54 */
'u' * CCCC + 4, 		/*  'U', 			    85 55 */
'v' * CCCC + 4, 		/*  'V', 			    86 56 */
'w' * CCCC + 4, 		/*  'W', 			    87 57 */
'x' * CCCC + 4, 		/*  'X', 			    88 58 */
'y' * CCCC + 4, 		/*  'Y', 			    89 59 */
'z' * CCCC + 4, 		/*  'Z', 			    90 5a */
0x5b,						/*   91 5b */
0x5c,						/*   92 5c	 */
0x5d,						/*   93 5d	] */
0x5e,						/*   94 5e */
'_',						/*   95 5f */
0x60,						/*   96 60	` */
'a' * CCCC,						/*   97 61 */
'b' * CCCC,						/*   98 62 */
'c' * CCCC,						/*   99 63 */
'd' * CCCC,						/*  100 64 */
'e' * CCCC,						/*  101 65 */
'f' * CCCC,						/*  102 66 */
'g' * CCCC,						/*  103 67 */
'h' * CCCC,						/*  104 68 */
'i' * CCCC,						/*  105 69 */
'j' * CCCC,						/*  106 6a */
'k' * CCCC,						/*  107 6b */
'l' * CCCC,						/*  108 6c */
'm' * CCCC,						/*  109 6d */
'n' * CCCC,						/*  110 6e */
'o' * CCCC,						/*  111 6f */
'p' * CCCC,						/*  112 70 */
'q' * CCCC,						/*  113 71 */
'r' * CCCC,						/*  114 72 */
's' * CCCC,						/*  115 73 */
't' * CCCC,						/*  116 74 */
'u' * CCCC,						/*  117 75 */
'v' * CCCC,						/*  118 76 */
'w' * CCCC,						/*  119 77 */
'x' * CCCC,						/*  120 78 */
'y' * CCCC,						/*  121 79 */
'z' * CCCC,						/*  122 7a */
'{',						/*  123 7b */
'|',						/*  124 7c */
'}',						/*  125 7d */
'~',						/*  126 7e */
  127,
  128,
  129,
  130,
  131,
  132,
  133,
'a' * CCCC + 1,		/*  aogonek		   134 86 */
  135,
  136,
  137,
  138,
  139,
  140,
'c' * CCCC + 1,		/*  c acute		   141 8d */
  142,
'a' * CCCC + 5,		/*  Aogonek		   143 8f */
'e' * CCCC + 5,		/*  Eogonek		   144 90 */
'e' * CCCC + 1,		/*  eogonek		   145 91 */
'l' * CCCC + 1,		/*  polish l		   146 92 */
  147,
  148,
'c' * CCCC + 5,		/*  O acute		   149 95 */
  150,
  151,
's' * CCCC + 5,		/*  S acute		   152 98 */
  153,
  154,
  155,
'l' * CCCC + 5,		/*  polish L		   156 9c */
  157,
's' * CCCC + 1,		/*  s acute		   158 9e */
  159,
'z' * CCCC + 5,		/*  Z dot		   160 a0 */
'z' * CCCC + 6,		/*  Z acute		   161 a1 */
'o' * CCCC + 1,		/*  o acute		   162 a2 */
'o' * CCCC + 5,		/*  O acute		   163 a3 */
'n' * CCCC + 1,		/*  n acute		   164 a4 */
'n' * CCCC + 5,		/*  N acute		   165 a5 */
'z' * CCCC + 1,		/*  z dot		   166 a6 */
'z' * CCCC + 2,		/*  z acute		   167 a7 */
  168, 169, 170, 171, 172, 173, 174, 175,
  176, 177, 178, 179, 180, 181, 182, 183, 
  184, 185, 186, 187, 188, 189, 190, 191,
  192, 193, 194, 195, 196, 197, 198, 199,
  200, 201, 202, 203, 204, 205, 206, 207,
  208, 209, 210, 211, 212, 213, 214, 215,
  216, 217, 218, 219, 220, 221, 222, 223,
  224, 225, 226, 227, 228, 229, 230, 231,
  232, 233, 234, 235, 236, 237, 238, 239,
  240, 241, 242, 243, 244, 245, 246, 247,
  248, 249, 250, 251, 252, 253, 254, 255
   };

/*
static p_char_u maz_jedn =
   {
    (char_u *)"???",
    (char_u *)"jeden",
    (char_u *)"dwa",
    (char_u *)"trzy",
    (char_u *)"cztery",
    (char_u *)"pieç",
    (char_u *)"szeûç",
    (char_u *)"siedem",
    (char_u *)"osiem",
    (char_u *)"dziewiëç",
    (char_u *)"dziesiëç",
    (char_u *)"jedenaûcie",
    (char_u *)"dwanaûcie",
    (char_u *)"trzynaûcie",
    (char_u *)"czternaûcie",
    (char_u *)"piëtnaûcie",
    (char_u *)"szesnaûcie",
    (char_u *)"siedemnaûcie",
    (char_u *)"osiemnaûcie",
    (char_u *)"dziewiëtnaûcie"
   };

static p_char_u maz_dies =
   {
    (char_u *)"???",
    (char_u *)"dwadzieûcia",
    (char_u *)"trzydzieûci",
    (char_u *)"czterdzieûci",
    (char_u *)"pieçdziesiÜt",
    (char_u *)"szeûcdziesiÜt",
    (char_u *)"siedemdziesiÜt",
    (char_u *)"osiemdziesiÜt",
    (char_u *)"dziewiëçdziesiÜt"
   };

static p_char_u maz_setki =
   {
    (char_u *)"???",
    (char_u *)"sto",
    (char_u *)"dwieûcie",
    (char_u *)"trzysta",
    (char_u *)"czterysta",
    (char_u *)"pieçset",
    (char_u *)"szeûçset",
    (char_u *)"siedemset",
    (char_u *)"osiemset",
    (char_u *)"dziewiëçset"
   };

static p_char_u maz_tys =
   {
    (char_u *)"???",
    (char_u *)"tysiÜc",
    (char_u *)"tysiÜce",
    (char_u *)"tysiÜce",
    (char_u *)"tysiÜce",
    (char_u *)"tysiëcy"
   };

static p_char_u maz_mil =
   {
    (char_u *)"???",
    (char_u *)"milion",
    (char_u *)"miliony",
    (char_u *)"miliony",
    (char_u *)"miliony",
    (char_u *)"milion¢w"
   };

static struct decode maz_decode =
       {
	&maz_jedn, 
	&maz_dies,
	&maz_setki,
	&maz_tys,
	&maz_mil
       }; */
/* ******************************************************************* */ 
