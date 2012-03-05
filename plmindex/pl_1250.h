static p_char_u pl_cp1250_day_name_ptr =
   {
      (char_u *)NULL,
      (char_u *)"niedziela",
      (char_u *)"poniedzia�ek",
      (char_u *)"wtorek",
      (char_u *)"�roda",
      (char_u *)"czwartek",
      (char_u *)"pi�tek",
      (char_u *)"sobota",
   };

static p_char_u pl_cp1250_day_name_ptr_a =
   {
      (char_u *)NULL,
      (char_u *)"nd",
      (char_u *)"pn",
      (char_u *)"wt",
      (char_u *)"�r",
      (char_u *)"cz",
      (char_u *)"pt",
      (char_u *)"sb",
   };

static p_char_u pl_cp1250_mon_name_ptr =
   {
      (char_u *)NULL,
      (char_u *)"stycze�",
      (char_u *)"luty",
      (char_u *)"marzec",
      (char_u *)"kwiecie�",
      (char_u *)"maj",
      (char_u *)"czerwiec",
      (char_u *)"lipiec",
      (char_u *)"sierpie�",
      (char_u *)"wrzesie�",
      (char_u *)"pa�dziernik",
      (char_u *)"listopad",
      (char_u *)"grudzie�"
   };

static p_char_u pl_cp1250_mon_name_ptr_a =
   {
      (char_u *)NULL,
      (char_u *)"stycze�",
      (char_u *)"luty",
      (char_u *)"marzec",
      (char_u *)"kwiecie�",
      (char_u *)"maj",
      (char_u *)"czerwiec",
      (char_u *)"lipiec",
      (char_u *)"sierpie�",
      (char_u *)"wrzesie�",
      (char_u *)"pa�dziernik",
      (char_u *)"listopad",
      (char_u *)"grudzie�"
   };

static int_u pl_cp1250_toascii_table = 
   {
    ' ',			/*  128 0x80 */
    ' ',			/*  129 0x81 */
    ' ',			/*  130 0x82 */
    ' ',			/*  131 0x83 */
    ' ',			/*  132 0x84 */
    ' ',			/*  133 0x85 */
    ' ',			/*  134 0x86 */
    ' ',			/*  135 0x87 */
    ' ',			/*  136 0x88 */
    ' ',			/*  137 0x89 */
    ' ',			/*  138 0x8a */
    ' ',			/*  139 0x8b */
    ' ',			/*  140 0x8c */
    ' ',			/*  141 0x8d */
    ' ',			/*  142 0x8e */
    ' ',			/*  143 0x8f */
    ' ',			/*  144 0x90 */
    ' ',			/*  145 0x91 */
    ' ',			/*  146 0x92 */
    ' ',			/*  147 0x93 */
    ' ',			/*  148 0x94 */
    ' ',			/*  149 0x95 */
    ' ',			/*  150 0x96 */
    ' ',			/*  151 0x97 */
    ' ',			/*  152 0x98 */
    ' ',			/*  153 0x99 */
    ' ',			/*  154 0x9a */
    ' ',			/*  155 0x9b */
    ' ',			/*  156 0x9c */
    ' ',			/*  157 0x9d */
    ' ',			/*  158 0x9e */
    ' ',			/*  159 0x9f */
    ' ',			/*  160 0xa0 */
    ' ',			/*  161 0xa1 */
    ' ',			/*  162 0xa2 */
    ' ',			/*  163 0xa3 */
    ' ',			/*  164 0xa4 */
    ' ',			/*  165 0xa5 */
    ' ',			/*  166 0xa6 */
    ' ',			/*  167 0xa7 */
    ' ',			/*  168 0xa8 */
    ' ',			/*  169 0xa9 */
    ' ',			/*  170 0xaa */
    ' ',			/*  171 0xab */
    ' ',			/*  172 0xac */
    ' ',			/*  173 0xad */
    ' ',			/*  174 0xae */
    ' ',			/*  175 0xaf */
    ' ',			/*  176 0xb0 */
    ' ',			/*  177 0xb1 */
    ' ',			/*  178 0xb2 */
    ' ',			/*  179 0xb3 */
    ' ',			/*  180 0xb4 */
    ' ',			/*  181 0xb5 */
    ' ',			/*  182 0xb6 */
    ' ',			/*  183 0xb7 */
    ',',			/*  184 0xb8 */
    ' ',			/*  185 0xb9 */
    ' ',			/*  186 0xba */
    ' ',			/*  187 0xbb */
    ' ',			/*  188 0xbc */
    ' ',			/*  189 0xbd */
    ' ',			/*  190 0xbe */
    ' ',			/*  191 0xbf */
    'R',			/*  192 0xc0 */
    'A',			/*  193 0xc1 */
    'A',			/*  194 0xc2 */
    'A',			/*  195 0xc3 */
    'A',			/*  196 0xc4 */
    'L',			/*  197 0xc5 */
    'C',			/*  198 0xc6 */
    'C',			/*  199 0xc7 */
    'C',			/*  200 0xc8 */
    'E',			/*  201 0xc9 */
    'E',			/*  202 0xca */
    'E',			/*  203 0xcb */
    'E',			/*  204 0xcc */
    'I',			/*  205 0xcd */
    'I',			/*  206 0xce */
    'D',			/*  207 0xcf */
    'D',			/*  208 0xd0 */
    'N',			/*  209 0xd1 */
    'N',			/*  210 0xd2 */
    'O',			/*  211 0xd3 */
    'O',			/*  212 0xd4 */
    'O',			/*  213 0xd5 */
    'O',			/*  214 0xd6 */
    'x',			/*  215 0xd7 */
    'R',			/*  216 0xd8 */
    'U',			/*  217 0xd9 */
    'U',			/*  218 0xda */
    'U',			/*  219 0xdb */
    'U',			/*  220 0xdc */
    'Y',			/*  221 0xdd */
    'T',			/*  222 0xde */
    ' ',			/*  223 0xdf */
    'r',			/*  224 0xe0 */
    'a',			/*  225 0xe1 */
    'a',			/*  226 0xe2 */
    'a',			/*  227 0xe3 */
    'a',			/*  228 0xe4 */
    'l',			/*  229 0xe5 */
    'c',			/*  230 0xe6 */
    'c',			/*  231 0xe7 */
    'c',			/*  232 0xe8 */
    'e',			/*  233 0xe9 */
    'e',			/*  234 0xea */
    'e',			/*  235 0xeb */
    'e',			/*  236 0xec */
    'i',			/*  237 0xed */
    'i',			/*  238 0xee */
    'd',			/*  239 0xef */
    'd',			/*  240 0xf0 */
    'n',			/*  241 0xf1 */
    'n',			/*  242 0xf2 */
    'o',			/*  243 0xf3 */
    'o',			/*  244 0xf4 */
    'o',			/*  245 0xf5 */
    'o',			/*  246 0xf6 */
    ' ',			/*  247 0xf7 */
    'r',			/*  248 0xf8 */
    'u',			/*  249 0xf9 */
    'u',			/*  250 0xfa */
    'u',			/*  251 0xfb */
    'u',			/*  252 0xfc */
    'y',			/*  253 0xfd */
    't',			/*  254 0xfe */
    ' '				/*  255 0xff */
   };

static a_char_u pl_cp1250_lower_table =
   {
         'a', 'b', 'c', 'd', 'e', 'f', 'g',
    'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
    'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
    'x', 'y', 'z', '[', '\\', ']', '^', '_',

    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',

    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
    ' ', ' ', ' ', ' ', '�', ' ', ' ', '�',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',

    ' ', ' ', ' ', '�', ' ', '�', ' ', ' ',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', '�',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',

    ' ', ' ', ' ', ' ', ' ', ' ', '�', ' ',
    ' ', ' ', '�', ' ', ' ', ' ', ' ', ' ',
    ' ', '�', ' ', '�', ' ', ' ', ' ', ' ',
    ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '
   };

static a_char_u pl_cp1250_upper_table =
   {
        'A','B','C','D','E','F','G',
    'H','I','J','K','L','M','N','O',

    'P','Q','R','S','T','U','V','W',
    'X','Y','Z','{','|','}','~',' ',

    ' ',' ',' ',' ',' ',' ',' ',' ',
    ' ',' ',' ',' ',' ',' ',' ',' ',
    ' ',' ',' ',' ',' ',' ',' ',' ',
    ' ',' ',' ',' ','�',' ',' ','�',

    ' ',' ',' ',' ',' ',' ',' ',' ',
    ' ',' ',' ',' ',' ',' ',' ',' ',
    ' ',' ',' ','�',' ',' ',' ',' ',
    ' ','�',' ',' ',' ',' ',' ','�',

    ' ',' ',' ',' ',' ',' ',' ',' ',
    ' ',' ',' ',' ',' ',' ',' ',' ',
    ' ',' ',' ',' ',' ',' ',' ',' ',
    ' ',' ',' ',' ',' ',' ',' ',' ',

    ' ',' ',' ',' ',' ',' ','�',' ',
    ' ',' ','�',' ',' ',' ',' ',' ',
    ' ','�',' ','�',' ',' ',' ',' ',
   };

static a_char_u pl_cp1250_char_type =
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
/*----------------------------*/
/*����󜟿 ��ʣ�ӌ�� */
0x000,             0x000,             0x000,             0x000, /*128*/
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
IS_UPPER,          0x000,             0x000,             IS_UPPER, /* �..� */

0x000,             0x000,             0x000,             0x000,  /*144 */
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
IS_LOWER,          0x000,             0x000,             IS_LOWER, /* �..� */

0x000,             0x000,             0x000,             IS_UPPER, /*...�*/
0x000,             IS_UPPER,          0x000, 		 0x000,   /*.�.. */
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             IS_UPPER, /*...�*/

0x000,             0x000,             0x000,             IS_LOWER, /*...�*/
0x000,             0x000,             0x000,             0x000,
0x000,             IS_LOWER,          0x000,             0x000, /*.�..*/
0x000,             0x000,             0x000,             IS_LOWER, /*...�*/

0x000,             0x000,             0x000,             0x000, /*.......�.*/
0x000,             0x000,             IS_UPPER,          0x000,
0x000,             0x000,             IS_UPPER,          0x000, /*..�....*/
0x000,             0x000,             0x000,             0x000,
0x000,             IS_UPPER,          0x000,             IS_UPPER, /*.�.�....*/
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000, 
0x000,             0x000,             0x000,             0x000,

0x000,             0x000,             0x000,             0x000, /*......�.*/
0x000,             0x000,             IS_LOWER,          0x000,
0x000,             0x000,             IS_LOWER,          0x000, /*..�.....*/
0x000,             0x000,             0x000,             0x000,

0x000,             IS_LOWER,          0x000,             IS_LOWER, /*.�.�....*/
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000,
0x000,             0x000,             0x000,             0x000
   };

static int_u pl_cp1250_order_tbl =
   { 
0,  							/*  0 */
'',							/*  1 */
'',							/*  2 */
'',							/*  3 */
'',							/*  4 */
'',							/*  5 */
'',							/*  6 */
'',							/*  7 */
'',							/*  8 */
TAB,							/*  9 */
 LF,							/*  10 0a */
'',							/*  11 0b */
'',							/*  12 0c */
 CR,							/*  13 0d */
'',							/*  14 0e */
'', 							/*  15 0f */
'', 							/*  16 10 */
'', 							/*  17 11 */
'', 							/*  18 12 */
'', 							/*  19 13 */
'', 							/*  20 14 */
'', 							/*  21 15 */
'', 							/*  22 16 */
'', 							/*  23 17 */
'', 							/*  24 18 */
'', 							/*  25 19 */
0x1a, 							/*  26 1a */
'', 							/*  27 1b */
'', 							/*  28 1c */
'', 							/*  29 1d */
'', 							/*  30 1e */
'', 							/*  31 1f */
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
   127,						/*  127 7f */
   128,						/*  128 80 */
   129,						/*  129 81 */
   130,						/*  130 82 */
   131,						/*  131 83 */
   132,						/*  132 84 */
   133,						/*  133 85 */
   134,						/*  134 86 */ 
   135,						/*  135 87 */
   136,						/*  136 88 */
   137,						/*  137 89 */
   138,						/*  138 8a */
   139,						/*  139 8b */
   's' * CCCC + 1,				/*  140 8c */
   141,						/*  141 8d */
   142,						/*  142 8e */
   'z' * CCCC + 1, 	        		/*  143 8f */
   144,        		        		/*  144 90 */
   145,        		        		/*  145 91 */
   146,        		        		/*  146 92 */
   147,						/*  147 93 */
   148,						/*  148 94 */
   149,        		        		/*  149 95 */
   150,						/*  150 96 */
   151,						/*  151 97 */
   152,        		        		/*  152 98 */
   153,						/*  153 99 */
   154,						/*  154 9a */
   155,						/*  155 9b */
   's' * CCCC + 5,   	        		/*  156 9c */
   157,						/*  157 9d */
   158,        		        		/*  158 9e */
   'z' * CCCC + 5,				/*  159 9f */
   160,						/*  160 a0 */
   161,           		       		/*  161 a1 */
   162,						/*  162 a2 */
   'l' * CCCC + 1,     		       		/*  163 a3 */
   164,						/*  164 a4 */
   'a' * CCCC + 1,				/*  165 a5 */
   166,           		       		/*  166 a6 */
   167,						/*  167 a7 */
   168,						/*  168 a8 */
   169,						/*  169 a9 */
   170,						/*  170 aa */
   171,						/*  171 ab */
   172,						/*  172 ac */
   173,						/*  173 ad */
   174,						/*  174 ae */
   'z' * CCCC + 2,				/*  175 af */
   176,						/*  176 b0 */
   177,						/*  177 b1 */
   178,						/*  178 b2 */
   'l' * CCCC + 5,				/*  179 b3 */
   180,						/*  180 b4 */
   181,						/*  181 b5 */
   182,						/*  182 b6 */
   183,						/*  183 b7 */
   184,						/*  184 b8 */
   'a' * CCCC + 5,				/*  185 b9 */
   186,						/*  186 ba */
   187,						/*  187 bb */
   188,						/*  188 bc */
  189,						/*  189 bd */
  190,						/*  190 be */
  'z' * CCCC + 6,				/*  191 bf */
  192,						/*  192 c0 */
  193,						/*  193 c1 */
  194,						/*  194 c2 */
  195,						/*  195 c3 */
  196,						/*  196 c4 */
  197,						/*  197 c5 */
  'c' * CCCC + 1,				/*  198 c6 */
  199,						/*  199 c7 */
  200,						/*  200 c8 */
  201,						/*  201 c9 */
  'e' * CCCC + 1,				/*  202 ca */
  203,						/*  203 cb */
  204,						/*  204 cc */
  205,						/*  205 cd */
  206,						/*  206 ce */
  207,						/*  207 cf */
  208,						/*  208 d0 */
  'n' * CCCC + 1,				/*  209 d1 */
  210,						/*  210 d2 */
  'o' * CCCC + 1,				/*  211 d3 */
  212,						/*  212 d4 */
  213,						/*  213 d5 */
  214,						/*  214 d6 */
  215,						/*  215 d7 */
  216,						/*  216 d8 */
  217,						/*  217 d9 */
  218,						/*  218 da */
  219,						/*  219 db */
  220,						/*  220 dc */
  221,						/*  221 dd */
  222,						/*  222 de */
  223,						/*  223 df */
  224,						/*  224 e0 */
  225,						/*  225 e1 */
  226,						/*  226 e2 */
  227,						/*  227 e3 */
  228,						/*  228 e4 */
  229,						/*  229 e5 */
  'c' * CCCC + 5,				/*  230 e6 */
  231,						/*  231 e7 */
  232,						/*  232 e8 */
  233,						/*  233 e9 */
  'e' * CCCC + 5,				/*  234 ea */
  235,						/*  235 eb */
  236,						/*  236 ec */
  237,						/*  237 ed */
  238,						/*  238 ee */
  239,						/*  239 ef */
  240,						/*  240 f0 */
  'n' * CCCC + 5,				/*  241 f1 */
  242,						/*  242 f2 */
  'o' * CCCC + 5,				/*  243 f3 */
  244,						/*  244 f4 */
  245,						/*  245 f5 */
  246,						/*  246 f6 */
  247,						/*  247 f7 */
  248,						/*  248 f8 */
  249,						/*  249 f9 */
  250,						/*  250 fa */
  251,						/*  251 fb */
  252,						/*  252 fc */
  253,						/*  253 fd */
  254,						/*  254 fe */
  255						/*  255 ff */
   };
