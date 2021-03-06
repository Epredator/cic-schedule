static p_char_u us_day_name_ptr =
   {
      (char_u *)NULL,
      (char_u *)"Sunday",
      (char_u *)"Monday",
      (char_u *)"Tuesday",
      (char_u *)"Wednesday",
      (char_u *)"Thursday",
      (char_u *)"Friday",
      (char_u *)"Saturday",
   };

static p_char_u us_day_name_ptr_a =
   {
      (char_u *)NULL,
      (char_u *)"Sun",
      (char_u *)"Mon",
      (char_u *)"Tue",
      (char_u *)"Wed",
      (char_u *)"Thu",
      (char_u *)"Fri",
      (char_u *)"Sat",
   };

static p_char_u us_mon_name_ptr =
   {
      (char_u *)NULL,
      (char_u *)"Januar",
      (char_u *)"Februar",
      (char_u *)"March",
      (char_u *)"April",
      (char_u *)"May",
      (char_u *)"June",
      (char_u *)"July",
      (char_u *)"August",
      (char_u *)"September",
      (char_u *)"October",
      (char_u *)"November",
      (char_u *)"December"
   };

static p_char_u us_mon_name_ptr_a =
   {
      (char_u *)NULL,
      (char_u *)"Jan",
      (char_u *)"Feb",
      (char_u *)"Mar",
      (char_u *)"Apr",
      (char_u *)"May",
      (char_u *)"Jun",
      (char_u *)"Jul",
      (char_u *)"Aug",
      (char_u *)"Sep",
      (char_u *)"Oct",
      (char_u *)"Nov",
      (char_u *)"Dec"
   };

static int_u us_toascii_table = 
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
    '!',			/*  161 0xa1 */
    'c',			/*  162 0xa2 */
    'L',			/*  163 0xa3 */
    'o',			/*  164 0xa4 */
    'Y',			/*  165 0xa5 */
    '|',			/*  166 0xa6 */
    'S',			/*  167 0xa7 */
    '"',			/*  168 0xa8 */
    'c',			/*  169 0xa9 */
    'a',			/*  170 0xaa */
    '<',			/*  171 0xab */
    ' ',			/*  172 0xac */
    '-',			/*  173 0xad */
    'R',			/*  174 0xae */
    '-',			/*  175 0xaf */
    'o',			/*  176 0xb0 */
    '+',			/*  177 0xb1 */
    '2',			/*  178 0xb2 */
    '3',			/*  179 0xb3 */
    '\'',			/*  180 0xb4 */
    'u',			/*  181 0xb5 */
    'P',			/*  182 0xb6 */
    '.',			/*  183 0xb7 */
    ',',			/*  184 0xb8 */
    '1',			/*  185 0xb9 */
    'o',			/*  186 0xba */
    '>',			/*  187 0xbb */
    ' ',			/*  188 0xbc */
    ' ',			/*  189 0xbd */
    ' ',			/*  190 0xbe */
    '?',			/*  191 0xbf */
    'A',			/*  192 0xc0 */
    'A',			/*  193 0xc1 */
    'A',			/*  194 0xc2 */
    'A',			/*  195 0xc3 */
    'A',			/*  196 0xc4 */
    'A',			/*  197 0xc5 */
    'A',			/*  198 0xc6 */
    'C',			/*  199 0xc7 */
    'E',			/*  200 0xc8 */
    'E',			/*  201 0xc9 */
    'E',			/*  202 0xca */
    'E',			/*  203 0xcb */
    'I',			/*  204 0xcc */
    'I',			/*  205 0xcd */
    'I',			/*  206 0xce */
    'I',			/*  207 0xcf */
    'D',			/*  208 0xd0 */
    'N',			/*  209 0xd1 */
    'O',			/*  210 0xd2 */
    'O',			/*  211 0xd3 */
    'O',			/*  212 0xd4 */
    'O',			/*  213 0xd5 */
    'O',			/*  214 0xd6 */
    'x',			/*  215 0xd7 */
    '0',			/*  216 0xd8 */
    'U',			/*  217 0xd9 */
    'U',			/*  218 0xda */
    'U',			/*  219 0xdb */
    'U',			/*  220 0xdc */
    'Y',			/*  221 0xdd */
    'P',			/*  222 0xde */
    'B',			/*  223 0xdf */
    'a',			/*  224 0xe0 */
    'a',			/*  225 0xe1 */
    'a',			/*  226 0xe2 */
    'a',			/*  227 0xe3 */
    'a',			/*  228 0xe4 */
    'a',			/*  229 0xe5 */
    'a',			/*  230 0xe6 */
    'c',			/*  231 0xe7 */
    'e',			/*  232 0xe8 */
    'e',			/*  233 0xe9 */
    'e',			/*  234 0xea */
    'e',			/*  235 0xeb */
    'i',			/*  236 0xec */
    'i',			/*  237 0xed */
    'i',			/*  238 0xee */
    'i',			/*  239 0xef */
    'd',			/*  240 0xf0 */
    'n',			/*  241 0xf1 */
    'o',			/*  242 0xf2 */
    'o',			/*  243 0xf3 */
    'o',			/*  244 0xf4 */
    'o',			/*  245 0xf5 */
    'o',			/*  246 0xf6 */
    ':',			/*  247 0xf7 */
    'o',			/*  248 0xf8 */
    'u',			/*  249 0xf9 */
    'u',			/*  250 0xfa */
    'u',			/*  251 0xfb */
    'u',			/*  252 0xfc */
    'y',			/*  253 0xfd */
    'p',			/*  254 0xfe */
    'Y',			/*  255 0xff */
   };

static a_char_u us_lower_table =
   {
         'a', 'b', 'c', 'd', 'e', 'f', 'g',
    'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
    'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
    'x', 'y', 'z'
   };

static a_char_u us_upper_table =
   {
        'A','B','C','D','E','F','G',
    'H','I','J','K','L','M','N','O',

    'P','Q','R','S','T','U','V','W',
    'X','Y','Z'
   };

static a_char_u us_char_type =
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

static int_u us_order_tbl =
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
'A',            		/*  'A', 			    65 41 */
'B',            		/*  'B', 			    66 42 */
'C',            		/*  'C', 			    67 43 */
'D',            		/*  'D', 			    68 44 */
'E',            		/*  'E', 			    69 45 */
'F',            		/*  'F', 			    70 46 */
'G',            		/*  'G', 			    71 47 */
'H',            		/*  'H', 			    72 48 */
'I',            		/*  'I', 			    73 49 */
'J',            		/*  'J', 			    74 4a */
'K',            		/*  'K', 			    75 4b */
'L',            		/*  'L', 			    76 4c */
'M',            		/*  'M', 			    77 4d */
'N',            		/*  'N', 			    78 4e */
'O',            		/*  'O', 			    79 4f */
'P',            		/*  'P', 			    80 50 */
'Q',            		/*  'Q', 			    81 51 */
'R',            		/*  'R', 			    82 52 */
'S',            		/*  'S', 			    83 53 */
'T',            		/*  'T', 			    84 54 */
'U',            		/*  'U', 			    85 55 */
'V',            		/*  'V', 			    86 56 */
'W',            		/*  'W', 			    87 57 */
'x',            		/*  'X', 			    88 58 */
'y',            		/*  'Y', 			    89 59 */
'z',            		/*  'Z', 			    90 5a */
0x5b,						/*   91 5b */
0x5c,						/*   92 5c	 */
0x5d,						/*   93 5d	] */
0x5e,						/*   94 5e */
'_',						/*   95 5f */
0x60,						/*   96 60	` */
'a',       						/*   97 61 */
'b',       						/*   98 62 */
'c',       						/*   99 63 */
'd',       						/*  100 64 */
'e',       						/*  101 65 */
'f',       						/*  102 66 */
'g',       						/*  103 67 */
'h',       						/*  104 68 */
'i',       						/*  105 69 */
'j',       						/*  106 6a */
'k',       						/*  107 6b */
'l',       						/*  108 6c */
'm',       						/*  109 6d */
'n',       						/*  110 6e */
'o',       						/*  111 6f */
'p',       						/*  112 70 */
'q',       						/*  113 71 */
'r',       						/*  114 72 */
's',       						/*  115 73 */
't',       						/*  116 74 */
'u',       						/*  117 75 */
'v',       						/*  118 76 */
'w',       						/*  119 77 */
'x',       						/*  120 78 */
'y',       						/*  121 79 */
'z',       						/*  122 7a */
'{',						/*  123 7b */
'|',						/*  124 7c */
'}',						/*  125 7d */
'~',						/*  126 7e */
'',						/*  127 7f */
'�',						/*  128 80 */
'�',						/*  129 81 */
'�',						/*  130 82 */
'�',						/*  131 83 */
'�',						/*  132 84 */
'�',						/*  133 85 */
'�',						/*  134 86 */ 
'�',						/*  135 87 */
'�',						/*  136 88 */
'�',						/*  137 89 */
'�',						/*  138 8a */
'�',						/*  139 8b */
'�',						/*  140 8c */
'�',						/*  141 8d */
'�',						/*  142 8e */
'�',           		        		/*   143 8f */
'�',           		        		/*   144 90 */
'�',           		        		/*   145 91 */
'�',           		        		/*   146 92 */
'�',						/*  147 93 */
'�',						/*  148 94 */
'�',           		        		/*   149 95 */
'�',						/*  150 96 */
'�',						/*  151 97 */
'�',           		        		/*   152 98 */
'�',						/*  153 99 */
'�',						/*  154 9a */
'�',						/*  155 9b */
'�',           		        		/*   156 9c */
'�',						/*  157 9d */
'�',           		        		/*   158 9e */
'�',						/*  159 9f */
'�',           		        		/*   160 a0 */
'�' ,                   			/*   161 a1 */
'�',           		        		/*   162 a2 */
'�' ,                   			/*   163 a3 */
'�',           		        		/*   164 a4 */
'�',           		        		/*   165 a5 */
'�' ,                   			/*   166 a6 */
'�',           		        		/*   167 a7 */
'�',						/*  168 a8 */
'�',						/*  169 a9 */
'�',						/*  170 aa */
'�',						/*  171 ab */
'�' ,        					/*  172 ac */
'�',						/*  173 ad */
'�',						/*  174 ae */
'�' ,        					/*  175 af */
'�',						/*  176 b0 */
'�' ,        					/*  177 b1 */
'�',						/*  178 b2 */
'�' ,        					/*  179 b3 */
'�',						/*  180 b4 */
'�',						/*  181 b5 */
'�' ,        					/*  182 b6 */
'�',						/*  183 b7 */
'�',						/*  184 b8 */
'�',						/*  185 b9 */
'�',						/*  186 ba */
'�',						/*  187 bb */
'�' ,        					/*  188 bc */
'�',						/*  189 bd */
'�',						/*  190 be */
'�' ,        					/*  191 bf */
'�',						/*  192 c0 */
'�',						/*  193 c1 */
'�',						/*  194 c2 */
'�',						/*  195 c3 */
'�',						/*  196 c4 */
'�',						/*  197 c5 */
'�' ,        					/*  198 c6 */
'�',						/*  199 c7 */
'�',						/*  200 c8 */
'�',						/*  201 c9 */
'�' ,        					/*  202 ca */
'�',						/*  203 cb */
'�',						/*  204 cc */
'�',						/*  205 cd */
'�',						/*  206 ce */
'�',						/*  207 cf */
'�',						/*  208 d0 */
'�' ,        					/*  209 d1 */
'�',						/*  210 d2 */
'�' ,        					/*  211 d3 */
'�',						/*  212 d4 */
'�',						/*  213 d5 */
'�',						/*  214 d6 */
'�',						/*  215 d7 */
'�',						/*  216 d8 */
'�',						/*  217 d9 */
'�',						/*  218 da */
'�',						/*  219 db */
'�',						/*  220 dc */
'�',						/*  221 dd */
'�',						/*  222 de */
'�',						/*  223 df */
'�',						/*  224 e0 */
'�',						/*  225 e1 */
'�',						/*  226 e2 */
'�',						/*  227 e3 */
'�',						/*  228 e4 */
'�',						/*  229 e5 */
'�' ,        					/*  230 e6 */
'�',						/*  231 e7 */
'�',						/*  232 e8 */
'�',						/*  233 e9 */
'�' ,        					/*  234 ea */
'�',						/*  235 eb */
'�',						/*  236 ec */
'�',						/*  237 ed */
'�',						/*  238 ee */
'�',						/*  239 ef */
'�',						/*  240 f0 */
'�' ,        					/*  241 f1 */
'�',						/*  242 f2 */
'�' ,       					/*  243 f3 */
'�',						/*  244 f4 */
'�',						/*  245 f5 */
'�',						/*  246 f6 */
'�',						/*  247 f7 */
'�',						/*  248 f8 */
'�',						/*  249 f9 */
'�',						/*  250 fa */
'�',						/*  251 fb */
'�',						/*  252 fc */
'�',						/*  253 fd */
'�',						/*  254 fe */
255						/*  255 ff */
   };

/* ******************************************************************* */ 
