#
#  Autor: Rafał Nowak (www.rafalnowak.pl)
#  Data : 22.03.2009
#
#  Poniższy plik zawiera skrypt dla programu sed.
#  Służy on do zamiany pewnych instrukcji wygenerowanych
#  przez program LaTeX'a na polskie znaki krytyczne
#  kodowane zgodnie ze standarderm ISO-8859-2, tzw. Latin2.
#
#  Skrypt ten ma zastosowanie przy tworzeniu polskiego
#  skorowidza dla dokumentów składanych przez LaTeX'a,
#  gdzie pliki źródłowe (*.tex) są kodowane w standardzie
#  unicode UTF-8.
#  
#  Przykładowe użycie:
#    >  latex dokument.tex
#    >  sed -f skrypt.sed dokument.idx | ./plmindex -L PL-latin2 | iconv --from-code=ISO-8859-2 --to-code=UTF-8 > dokument.ind
#    >  latex dokument.tex
#
#  W powyższym przykładzie:
#    skrypt.sed - jest nazwą tego pliku (skryptu dla sed'a)
#    plmindex   - to program przygotowany przez Włodzimierza
#                 Macewicza to prawidłowego sortowania
#                 słów w celu utworzenia skorowidza
#    iconv      - to program który konwertuje otrzymany
#                 indeks z powrotem do kodowania UTF-8
#  W wyniku otrzymujemy plik dokument.ind zgodny z UTF-8
#  i prawidłowo posortowanymi słowami.
#
s/\\IeC\ {\\k\ a}/ą/g
s/\\IeC\ {\\k\ A}/Ą/g
s/\\IeC\ {\\k\ e}/ę/g
s/\\IeC\ {\\k\ E}/Ę/g
s/\\IeC\ {\\'c}/ć/g
s/\\IeC\ {\\'C}/Ć/g
s/\\IeC\ {\\l\ }/ł/g
s/\\IeC\ {\\L\ }/Ł/g
s/\\IeC\ {\\'n}/ń/g
s/\\IeC\ {\\'N}/Ń/g
s/\\IeC\ {\\'o}/ó/g
s/\\IeC\ {\\'O}/Ó/g
s/\\IeC\ {\\'s}/ś/g
s/\\IeC\ {\\'S}/Ś/g
s/\\IeC\ {\\'z}/ź/g
s/\\IeC\ {\\'Z}/Ź/g
s/\\IeC\ {\\\.z}/ż/g
s/\\IeC\ {\\\.Z}/Ż/g
s/\\nobreakspace\ \ {}/~/g
