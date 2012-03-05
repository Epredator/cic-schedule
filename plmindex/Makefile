CC = gcc 
O = .o
X = 

XCFLAGS= -unsigned-char -O2 -g -pedantic -DDEFAULT_LANGUAGE=PL_latin2
LIBS = 

CFLAGS=  $(XCFLAGS)
LDFLAGS = -g

HDRS	      = mkind.h scanid.h scanst.h

MAKEFILE      = makefile.gcc

OBJS	      = genind$(O) qsort$(O) mkind$(O) scanid$(O) scanst$(O) \
		sortid$(O) decode_n$(O) language$(O)

SRCS	      = genind.c mkind.c scanid.c scanst.c qsort.c sortid.c decode_n.c\
		language.c

PROGRAM	      = plmindex

.c.o:
		$(CC) -c $(CFLAGS) $*.c

$(PROGRAM):	$(OBJS) $(MAKEFILE) 
	$(CC) $(LDFLAGS) -o $@ $(OBJS) $(LIBS)
	rm *.o

genind$(O): genind.c mkind.h
mkind$(O): mkind.c mkind.h 
qsort$(O): qsort.c mkind.h 
scanid$(O): scanid.c mkind.h scanid.h
scanst$(O): scanst.c mkind.h scanst.h
sortid$(O): sortid.c mkind.h 
language$(O): pl_maz.h pl_iso2.h us_eng.h pl_1250.h pl_852.h mkind.h
mkind.h: myctype.h
clean:
	rm plmindex

