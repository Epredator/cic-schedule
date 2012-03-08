PLMINDEX=plmindex/plmindex
GLOWNY=praca

$(GLOWNY).pdf: $(GLOWNY).tex $(wildcard *tex) $(PLMINDEX)
	pdflatex -draftmode -halt-on-error $<
	sed -f fixidx.sed $(GLOWNY).idx | iconv -f utf-8 -t iso-8859-2 | $(PLMINDEX) | iconv -f iso-8859-2 -t utf-8 > $(GLOWNY).ind
	pdflatex -draftmode -halt-on-error $<
	bibtex $(GLOWNY)
	pdflatex -halt-on-error $<

SHOW: $(GLOWNY).pdf
	evince $< &

FORCE:

clean:
	rm -f $(addprefix $(GLOWNY)., aux bbl blg log toc idx ind lof out)

$(PLMINDEX):
	cd plmindex && make 
