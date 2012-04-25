package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_nn extends com.google.gwt.i18n.client.CurrencyList_no {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("NOK", "kr", 2, "NOkr");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "NOK", "kr", 2, "NOkr"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // andorransk peseta
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128));
    // UAE dirham
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH"));
    // afghani (1927-2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130));
    // afghani
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0));
    // albansk lek
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0));
    // armensk dram
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 0));
    // nederlansk antillegylden
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2));
    // angolsk kwanza
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2));
    // angolsk kwanza (1977-1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130));
    // angolsk ny kwanza (1990-2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130));
    // angolsk kwanza reajustado (1995-1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130));
    // argentisk austral
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130));
    // ARL
    result.put("ARL", new CurrencyDataImpl("ARL", "ARLA", 130));
    // ARM
    result.put("ARM", new CurrencyDataImpl("ARM", "ARM", 130));
    // argentinsk peso (1983-1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130));
    // argentinsk peso
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$"));
    // austerriksk schilling
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130));
    // australsk dollar
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$"));
    // arubisk gylden
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2));
    // aserbaijansk manat
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130));
    // aserbajdsjansk manat
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2));
    // bosnisk-hercegovinsk dinar
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130));
    // bosnisk-hercegovinsk mark (konvertibel)
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2));
    // barbadisk dollar
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2));
    // bangladeshisk taka
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk"));
    // belgisk franc (konvertibel)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 2));
    // belgisk franc
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130));
    // belgisk franc (finansiell)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 2));
    // bulgarsk hard lev
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130));
    // bulgarsk ny lev
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2));
    // bahrainsk dinar
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3));
    // burundisk franc
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0));
    // bermudisk dollar
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2));
    // bruneisk dollar
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2));
    // boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2));
    // bolivisk peso
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130));
    // bolivisk mvdol
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 2));
    // brasiliansk cruzeiro novo (1967-1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130));
    // brasiliansk cruzado
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130));
    // brasiliansk cruzeiro (1990-1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130));
    // brasiliansk real
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$"));
    // brasiliansk cruzado novo
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130));
    // brasiliansk cruzeiro
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130));
    // BRZ
    result.put("BRZ", new CurrencyDataImpl("BRZ", "BRZ", 130));
    // bahamisk dollar
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2));
    // bhutansk ngultrum
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2));
    // burmesisk kyat
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130));
    // botswansk pula
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2));
    // kviterussisk ny rubel (1994-1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130));
    // kviterussisk rubel
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 0));
    // belizisk dollar
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2));
    // kanadisk dollar
    result.put("CAD", new CurrencyDataImpl("CAD", "C$", 2, "C$"));
    // kongolesisk franc
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2));
    // WIR euro
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 2));
    // sveitsisk franc
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF"));
    // WIR franc
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 2));
    // CLE
    result.put("CLE", new CurrencyDataImpl("CLE", "CLE", 130));
    // chilensk unidades de fomento
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 0));
    // chilensk peso
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$"));
    // kinesisk yuan renminbi
    result.put("CNY", new CurrencyDataImpl("CNY", "CN¥", 2, "RMB¥"));
    // colombiansk peso
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 0, "COL$"));
    // unidad de valor real
    result.put("COU", new CurrencyDataImpl("COU", "COU", 2));
    // costaricansk colon
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 0, "CR₡"));
    // gammal serbisk dinar
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130));
    // tsjekkoslovakisk koruna (hard)
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130));
    // CUC
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC$", 2));
    // kubansk peso
    result.put("CUP", new CurrencyDataImpl("CUP", "CU$", 2, "$MN"));
    // kappverdisk escudo
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2));
    // kypriotisk pund
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130));
    // tsjekkisk koruna
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč"));
    // austtysk mark
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130));
    // tysk mark
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130));
    // djiboutisk franc
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0));
    // dansk krone
    result.put("DKK", new CurrencyDataImpl("DKK", "Dkr", 2, "kr"));
    // dominikansk peso
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$"));
    // algerisk dinar
    result.put("DZD", new CurrencyDataImpl("DZD", "DA", 2));
    // ecuadoriansk sucre
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130));
    // ecuadoriansk unidad de valor constante (UVC)
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 2));
    // estisk kroon
    result.put("EEK", new CurrencyDataImpl("EEK", "Ekr", 2));
    // egyptisk pund
    result.put("EGP", new CurrencyDataImpl("EGP", "EG£", 2, "LE"));
    // EQE
    result.put("EQE", new CurrencyDataImpl("EQE", "EQE", 130));
    // eritreisk nakfa
    result.put("ERN", new CurrencyDataImpl("ERN", "Nfk", 2));
    // spansk peseta (A-konto)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 2));
    // spansk peseta (konvertibel konto)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 2));
    // spansk peseta
    result.put("ESP", new CurrencyDataImpl("ESP", "Pts", 128));
    // etiopisk birr
    result.put("ETB", new CurrencyDataImpl("ETB", "Br", 2));
    // euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€"));
    // finsk mark
    result.put("FIM", new CurrencyDataImpl("FIM", "mk", 130));
    // fijiansk dollar
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2));
    // Falkland-pund
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2));
    // fransk franc
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130));
    // britisk pund sterling
    result.put("GBP", new CurrencyDataImpl("GBP", "GB£", 2, "GB£"));
    // georgisk kupon larit
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130));
    // georgisk lari
    result.put("GEL", new CurrencyDataImpl("GEL", "GEL", 2));
    // ghanesisk cedi (1979-2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130));
    // ghanesisk cedi
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2));
    // gibraltarsk pund
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2));
    // gambisk dalasi
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2));
    // guineansk franc
    result.put("GNF", new CurrencyDataImpl("GNF", "FG", 0));
    // guineansk syli
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130));
    // ekvatorialguineansk ekwele guineana
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130));
    // gresk drakme
    result.put("GRD", new CurrencyDataImpl("GRD", "₯", 130));
    // guatemalansk quetzal
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2));
    // portugisisk guinea escudo
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130));
    // Guinea-Bissau-peso
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 2));
    // guyansk dollar
    result.put("GYD", new CurrencyDataImpl("GYD", "GY$", 0));
    // Hongkong-dollar
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$"));
    // honduransk lempira
    result.put("HNL", new CurrencyDataImpl("HNL", "HNL", 2));
    // kroatisk dinar
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130));
    // kroatisk kuna
    result.put("HRK", new CurrencyDataImpl("HRK", "kn", 2));
    // haitisk gourde
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2));
    // ungarsk forint
    result.put("HUF", new CurrencyDataImpl("HUF", "Ft", 0));
    // indonesisk rupi
    result.put("IDR", new CurrencyDataImpl("IDR", "Rp", 0));
    // irsk pund
    result.put("IEP", new CurrencyDataImpl("IEP", "IR£", 130));
    // israelsk pund
    result.put("ILP", new CurrencyDataImpl("ILP", "I£", 130));
    // israelsk ny shekel
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪"));
    // indisk rupi
    result.put("INR", new CurrencyDataImpl("INR", "Rs", 2, "Rs"));
    // iraksk dinar
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0));
    // iransk rial
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0));
    // islandsk krone
    result.put("ISK", new CurrencyDataImpl("ISK", "Ikr", 0, "kr"));
    // italiensk lire
    result.put("ITL", new CurrencyDataImpl("ITL", "IT₤", 128));
    // jamaikansk dollar
    result.put("JMD", new CurrencyDataImpl("JMD", "J$", 2, "JA$"));
    // jordansk dinar
    result.put("JOD", new CurrencyDataImpl("JOD", "JD", 3));
    // japansk yen
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥"));
    // kenyansk shilling
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2));
    // kirgisisk som
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2));
    // kambodsjansk riel
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2));
    // komorisk franc
    result.put("KMF", new CurrencyDataImpl("KMF", "CF", 0));
    // nordkoreansk won
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0));
    // sørkoreansk won
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩"));
    // kuwaitisk dinar
    result.put("KWD", new CurrencyDataImpl("KWD", "KD", 3));
    // caymansk dollar
    result.put("KYD", new CurrencyDataImpl("KYD", "KY$", 2));
    // kasakhstansk tenge
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2));
    // laotisk kip
    result.put("LAK", new CurrencyDataImpl("LAK", "₭", 0));
    // libanesisk pund
    result.put("LBP", new CurrencyDataImpl("LBP", "LB£", 0));
    // srilankisk rupi
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs"));
    // liberisk dollar
    result.put("LRD", new CurrencyDataImpl("LRD", "L$", 2));
    // lesothisk loti
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2));
    // LSM
    result.put("LSM", new CurrencyDataImpl("LSM", "LSM", 130));
    // litauisk lita
    result.put("LTL", new CurrencyDataImpl("LTL", "Lt", 2));
    // litauisk talona
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130));
    // luxemburgsk konvertibel franc
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 2));
    // luxemburgsk franc
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128));
    // luxemburgsk finansiell franc
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 2));
    // latvisk lat
    result.put("LVL", new CurrencyDataImpl("LVL", "Ls", 2));
    // latvisk rubel
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130));
    // libysk dinar
    result.put("LYD", new CurrencyDataImpl("LYD", "LD", 3));
    // marokkansk dirham
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2));
    // marokkansk franc
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130));
    // moldovsk leu
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2));
    // madagassisk ariary
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0));
    // madagassisk franc
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128));
    // makedonsk denar
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2));
    // malisk franc
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130));
    // myanmarsk kyat
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0));
    // mongolsk tugrik
    result.put("MNT", new CurrencyDataImpl("MNT", "₮", 0, "MN₮"));
    // makaosk pataca
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP$", 2));
    // mauritansk ouguiya
    result.put("MRO", new CurrencyDataImpl("MRO", "UM", 0));
    // maltesisk lira
    result.put("MTL", new CurrencyDataImpl("MTL", "Lm", 130));
    // maltesisk pund
    result.put("MTP", new CurrencyDataImpl("MTP", "MT£", 130));
    // mauritansk rupi
    result.put("MUR", new CurrencyDataImpl("MUR", "MURs", 0));
    // maldivisk rufiyaa
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2));
    // malawisk kwacha
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2));
    // meksikansk peso
    result.put("MXN", new CurrencyDataImpl("MXN", "Mex$", 2, "Mex$"));
    // meksikansk sølvpeso (1861-1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MX$", 130));
    // meksikansk unidad de inversion (UDI)
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 2));
    // malaysisk ringgit
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM"));
    // mosambikisk escudo
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130));
    // gammal mosambikisk metical
    result.put("MZM", new CurrencyDataImpl("MZM", "Mt", 130));
    // mosambikisk metical
    result.put("MZN", new CurrencyDataImpl("MZN", "MTn", 2));
    // namibisk dollar
    result.put("NAD", new CurrencyDataImpl("NAD", "N$", 2));
    // nigeriansk naira
    result.put("NGN", new CurrencyDataImpl("NGN", "₦", 2));
    // nicaraguansk cordoba
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130));
    // nicaraguansk cordoba oro
    result.put("NIO", new CurrencyDataImpl("NIO", "C$", 2));
    // nederlandsk gylden
    result.put("NLG", new CurrencyDataImpl("NLG", "fl", 130));
    // norsk krone
    result.put("NOK", new CurrencyDataImpl("NOK", "kr", 2, "NOkr"));
    // nepalsk rupi
    result.put("NPR", new CurrencyDataImpl("NPR", "NPRs", 2));
    // new zealandsk dollar
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2));
    // omansk rial
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3));
    // panamansk balboa
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/."));
    // peruansk inti
    result.put("PEI", new CurrencyDataImpl("PEI", "I/.", 130));
    // peruansk nuevo sol
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/."));
    // peruansk sol
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130));
    // papuansk kina
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2));
    // filippinsk peso
    result.put("PHP", new CurrencyDataImpl("PHP", "₱", 2, "PHP"));
    // pakistansk rupi
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs", 0, "PKRs."));
    // polsk zloty
    result.put("PLN", new CurrencyDataImpl("PLN", "zł", 2));
    // polsk zloty (1950-1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130));
    // portugisisk escudo
    result.put("PTE", new CurrencyDataImpl("PTE", "Esc", 130));
    // paraguayansk guarani
    result.put("PYG", new CurrencyDataImpl("PYG", "₲", 0));
    // qatarsk rial
    result.put("QAR", new CurrencyDataImpl("QAR", "QR", 2));
    // rhodesisk dollar
    result.put("RHD", new CurrencyDataImpl("RHD", "RH$", 130));
    // gammal rumensk leu
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130));
    // rumensk leu
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2));
    // serbisk dinar
    result.put("RSD", new CurrencyDataImpl("RSD", "din.", 0));
    // russisk rubel
    result.put("RUB", new CurrencyDataImpl("RUB", "руб", 2, "руб"));
    // russisk rubel (1991-1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130));
    // rwandisk franc
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0));
    // saudiarabisk rial
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR"));
    // salomonsk dollar
    result.put("SBD", new CurrencyDataImpl("SBD", "SI$", 2));
    // seychellisk rupi
    result.put("SCR", new CurrencyDataImpl("SCR", "SRe", 2));
    // gammal sudanesisk dinar
    result.put("SDD", new CurrencyDataImpl("SDD", "LSd", 130));
    // sudansk pund
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2));
    // gammalt sudanesisk pund
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130));
    // svensk krone
    result.put("SEK", new CurrencyDataImpl("SEK", "Skr", 2, "kr"));
    // singaporsk dollar
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$"));
    // sankthelensk pund
    result.put("SHP", new CurrencyDataImpl("SHP", "SH£", 2));
    // slovensk tolar
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130));
    // slovakisk koruna
    result.put("SKK", new CurrencyDataImpl("SKK", "Sk", 130));
    // sierraleonsk leone
    result.put("SLL", new CurrencyDataImpl("SLL", "Le", 0));
    // somalisk shilling
    result.put("SOS", new CurrencyDataImpl("SOS", "Ssh", 0));
    // surinamsk dollar
    result.put("SRD", new CurrencyDataImpl("SRD", "SR$", 2));
    // surinamsk gylden
    result.put("SRG", new CurrencyDataImpl("SRG", "Sf", 130));
    // Sao Tome og Principe-dobra
    result.put("STD", new CurrencyDataImpl("STD", "Db", 0));
    // sovjetisk rubel
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130));
    // salvadoransk colon
    result.put("SVC", new CurrencyDataImpl("SVC", "SV₡", 130));
    // syrisk pund
    result.put("SYP", new CurrencyDataImpl("SYP", "SY£", 0));
    // swazilandsk lilangeni
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2));
    // thailandsk baht
    result.put("THB", new CurrencyDataImpl("THB", "฿", 2, "THB"));
    // tadsjikisk rubel
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130));
    // tadsjikisk somoni
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2));
    // turkmensk manat
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128));
    // tunisisk dinar
    result.put("TND", new CurrencyDataImpl("TND", "DT", 3));
    // tongansk paʻanga
    result.put("TOP", new CurrencyDataImpl("TOP", "T$", 2));
    // timoresisk escudo
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130));
    // gammal tyrkiske lire
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128));
    // tyrkisk lire
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL"));
    // trinidadisk dollar
    result.put("TTD", new CurrencyDataImpl("TTD", "TT$", 2));
    // taiwansk ny dollar
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$"));
    // tanzaniansk shilling
    result.put("TZS", new CurrencyDataImpl("TZS", "TSh", 0));
    // ukrainsk hryvnia
    result.put("UAH", new CurrencyDataImpl("UAH", "₴", 2));
    // ukrainsk karbovanetz
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130));
    // ugandisk shilling (1966-1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130));
    // ugandisk shilling
    result.put("UGX", new CurrencyDataImpl("UGX", "USh", 0));
    // amerikansk dollar
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$"));
    // amerikansk dollar (neste dag)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 2));
    // amerikansk dollar (same dag)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 2));
    // uruguayansk peso en unidades indexadas
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 2));
    // uruguayansk peso (1975-1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130));
    // uruguayansk peso
    result.put("UYU", new CurrencyDataImpl("UYU", "$U", 2, "UY$"));
    // usbekisk sum
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 0));
    // venezuelansk bolivar
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130));
    // venezuelansk bolivar fuerte
    result.put("VEF", new CurrencyDataImpl("VEF", "Bs.F.", 2));
    // vietnamesisk dong
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫"));
    // vanuatuisk vatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VT", 0));
    // vestsamoisk tala
    result.put("WST", new CurrencyDataImpl("WST", "WS$", 2));
    // CFA franc BEAC
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0));
    // sølv
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 2));
    // gull
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 2));
    // europeisk samansett eining
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 2));
    // europeisk monetær eining
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 2));
    // europeisk kontoeining (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 2));
    // europeisk kontoeining (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 2));
    // austkaribisk dollar
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2));
    // spesielle trekkrettar
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 2));
    // europeisk valutaeining
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 2));
    // fransk gullfranc
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 2));
    // fransk UIC-franc
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 2));
    // CFA franc BCEAO
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0));
    // palladium
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 2));
    // CFP franc
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0));
    // platina
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 2));
    // RINET-fond
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 2));
    // testvalutakode
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 2));
    // ukjend valuta
    result.put("XXX", new CurrencyDataImpl("XXX", "XXX", 2));
    // jemenittisk dinar
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130));
    // jemenittisk rial
    result.put("YER", new CurrencyDataImpl("YER", "YR", 0, "YER"));
    // jugoslavisk dinar (hard)
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130));
    // jugoslavisk noviy-dinar
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130));
    // jugoslavisk konvertibel dinar
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130));
    // sørafrikansk rand (finansiell)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 2));
    // sørafrikansk rand
    result.put("ZAR", new CurrencyDataImpl("ZAR", "R", 2, "ZAR"));
    // zambisk kwacha
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZK", 0));
    // zairisk ny zaire
    result.put("ZRN", new CurrencyDataImpl("ZRN", "NZ", 130));
    // zairisk zaire
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130));
    // zimbabwisk dollar
    result.put("ZWD", new CurrencyDataImpl("ZWD", "Z$", 128));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // andorransk peseta
      "ADP": [ "ADP", "ADP", 128],
      // UAE dirham
      "AED": [ "AED", "DH", 2, "DH"],
      // afghani (1927-2002)
      "AFA": [ "AFA", "AFA", 130],
      // afghani
      "AFN": [ "AFN", "AFN", 0],
      // albansk lek
      "ALL": [ "ALL", "ALL", 0],
      // armensk dram
      "AMD": [ "AMD", "AMD", 0],
      // nederlansk antillegylden
      "ANG": [ "ANG", "ANG", 2],
      // angolsk kwanza
      "AOA": [ "AOA", "AOA", 2],
      // angolsk kwanza (1977-1990)
      "AOK": [ "AOK", "AOK", 130],
      // angolsk ny kwanza (1990-2000)
      "AON": [ "AON", "AON", 130],
      // angolsk kwanza reajustado (1995-1999)
      "AOR": [ "AOR", "AOR", 130],
      // argentisk austral
      "ARA": [ "ARA", "ARA", 130],
      // ARL
      "ARL": [ "ARL", "ARLA", 130],
      // ARM
      "ARM": [ "ARM", "ARM", 130],
      // argentinsk peso (1983-1985)
      "ARP": [ "ARP", "ARP", 130],
      // argentinsk peso
      "ARS": [ "ARS", "AR$", 2, "AR$"],
      // austerriksk schilling
      "ATS": [ "ATS", "ATS", 130],
      // australsk dollar
      "AUD": [ "AUD", "AU$", 2, "AU$"],
      // arubisk gylden
      "AWG": [ "AWG", "AWG", 2],
      // aserbaijansk manat
      "AZM": [ "AZM", "AZM", 130],
      // aserbajdsjansk manat
      "AZN": [ "AZN", "AZN", 2],
      // bosnisk-hercegovinsk dinar
      "BAD": [ "BAD", "BAD", 130],
      // bosnisk-hercegovinsk mark (konvertibel)
      "BAM": [ "BAM", "BAM", 2],
      // barbadisk dollar
      "BBD": [ "BBD", "BBD", 2],
      // bangladeshisk taka
      "BDT": [ "BDT", "Tk", 2, "Tk"],
      // belgisk franc (konvertibel)
      "BEC": [ "BEC", "BEC", 2],
      // belgisk franc
      "BEF": [ "BEF", "BEF", 130],
      // belgisk franc (finansiell)
      "BEL": [ "BEL", "BEL", 2],
      // bulgarsk hard lev
      "BGL": [ "BGL", "BGL", 130],
      // bulgarsk ny lev
      "BGN": [ "BGN", "BGN", 2],
      // bahrainsk dinar
      "BHD": [ "BHD", "BHD", 3],
      // burundisk franc
      "BIF": [ "BIF", "BIF", 0],
      // bermudisk dollar
      "BMD": [ "BMD", "BMD", 2],
      // bruneisk dollar
      "BND": [ "BND", "BND", 2],
      // boliviano
      "BOB": [ "BOB", "BOB", 2],
      // bolivisk peso
      "BOP": [ "BOP", "BOP", 130],
      // bolivisk mvdol
      "BOV": [ "BOV", "BOV", 2],
      // brasiliansk cruzeiro novo (1967-1986)
      "BRB": [ "BRB", "BRB", 130],
      // brasiliansk cruzado
      "BRC": [ "BRC", "BRC", 130],
      // brasiliansk cruzeiro (1990-1993)
      "BRE": [ "BRE", "BRE", 130],
      // brasiliansk real
      "BRL": [ "BRL", "R$", 2, "R$"],
      // brasiliansk cruzado novo
      "BRN": [ "BRN", "BRN", 130],
      // brasiliansk cruzeiro
      "BRR": [ "BRR", "BRR", 130],
      // BRZ
      "BRZ": [ "BRZ", "BRZ", 130],
      // bahamisk dollar
      "BSD": [ "BSD", "BSD", 2],
      // bhutansk ngultrum
      "BTN": [ "BTN", "BTN", 2],
      // burmesisk kyat
      "BUK": [ "BUK", "BUK", 130],
      // botswansk pula
      "BWP": [ "BWP", "BWP", 2],
      // kviterussisk ny rubel (1994-1999)
      "BYB": [ "BYB", "BYB", 130],
      // kviterussisk rubel
      "BYR": [ "BYR", "BYR", 0],
      // belizisk dollar
      "BZD": [ "BZD", "BZD", 2],
      // kanadisk dollar
      "CAD": [ "CAD", "C$", 2, "C$"],
      // kongolesisk franc
      "CDF": [ "CDF", "CDF", 2],
      // WIR euro
      "CHE": [ "CHE", "CHE", 2],
      // sveitsisk franc
      "CHF": [ "CHF", "CHF", 2, "CHF"],
      // WIR franc
      "CHW": [ "CHW", "CHW", 2],
      // CLE
      "CLE": [ "CLE", "CLE", 130],
      // chilensk unidades de fomento
      "CLF": [ "CLF", "CLF", 0],
      // chilensk peso
      "CLP": [ "CLP", "CL$", 0, "CL$"],
      // kinesisk yuan renminbi
      "CNY": [ "CNY", "CN¥", 2, "RMB¥"],
      // colombiansk peso
      "COP": [ "COP", "COL$", 0, "COL$"],
      // unidad de valor real
      "COU": [ "COU", "COU", 2],
      // costaricansk colon
      "CRC": [ "CRC", "CR₡", 0, "CR₡"],
      // gammal serbisk dinar
      "CSD": [ "CSD", "CSD", 130],
      // tsjekkoslovakisk koruna (hard)
      "CSK": [ "CSK", "CSK", 130],
      // CUC
      "CUC": [ "CUC", "CUC$", 2],
      // kubansk peso
      "CUP": [ "CUP", "CU$", 2, "$MN"],
      // kappverdisk escudo
      "CVE": [ "CVE", "CVE", 2],
      // kypriotisk pund
      "CYP": [ "CYP", "CYP", 130],
      // tsjekkisk koruna
      "CZK": [ "CZK", "Kč", 2, "Kč"],
      // austtysk mark
      "DDM": [ "DDM", "DDM", 130],
      // tysk mark
      "DEM": [ "DEM", "DEM", 130],
      // djiboutisk franc
      "DJF": [ "DJF", "Fdj", 0],
      // dansk krone
      "DKK": [ "DKK", "Dkr", 2, "kr"],
      // dominikansk peso
      "DOP": [ "DOP", "RD$", 2, "RD$"],
      // algerisk dinar
      "DZD": [ "DZD", "DA", 2],
      // ecuadoriansk sucre
      "ECS": [ "ECS", "ECS", 130],
      // ecuadoriansk unidad de valor constante (UVC)
      "ECV": [ "ECV", "ECV", 2],
      // estisk kroon
      "EEK": [ "EEK", "Ekr", 2],
      // egyptisk pund
      "EGP": [ "EGP", "EG£", 2, "LE"],
      // EQE
      "EQE": [ "EQE", "EQE", 130],
      // eritreisk nakfa
      "ERN": [ "ERN", "Nfk", 2],
      // spansk peseta (A-konto)
      "ESA": [ "ESA", "ESA", 2],
      // spansk peseta (konvertibel konto)
      "ESB": [ "ESB", "ESB", 2],
      // spansk peseta
      "ESP": [ "ESP", "Pts", 128],
      // etiopisk birr
      "ETB": [ "ETB", "Br", 2],
      // euro
      "EUR": [ "EUR", "€", 2, "€"],
      // finsk mark
      "FIM": [ "FIM", "mk", 130],
      // fijiansk dollar
      "FJD": [ "FJD", "FJD", 2],
      // Falkland-pund
      "FKP": [ "FKP", "FKP", 2],
      // fransk franc
      "FRF": [ "FRF", "FRF", 130],
      // britisk pund sterling
      "GBP": [ "GBP", "GB£", 2, "GB£"],
      // georgisk kupon larit
      "GEK": [ "GEK", "GEK", 130],
      // georgisk lari
      "GEL": [ "GEL", "GEL", 2],
      // ghanesisk cedi (1979-2007)
      "GHC": [ "GHC", "GHC", 130],
      // ghanesisk cedi
      "GHS": [ "GHS", "GHS", 2],
      // gibraltarsk pund
      "GIP": [ "GIP", "GIP", 2],
      // gambisk dalasi
      "GMD": [ "GMD", "GMD", 2],
      // guineansk franc
      "GNF": [ "GNF", "FG", 0],
      // guineansk syli
      "GNS": [ "GNS", "GNS", 130],
      // ekvatorialguineansk ekwele guineana
      "GQE": [ "GQE", "GQE", 130],
      // gresk drakme
      "GRD": [ "GRD", "₯", 130],
      // guatemalansk quetzal
      "GTQ": [ "GTQ", "GTQ", 2],
      // portugisisk guinea escudo
      "GWE": [ "GWE", "GWE", 130],
      // Guinea-Bissau-peso
      "GWP": [ "GWP", "GWP", 2],
      // guyansk dollar
      "GYD": [ "GYD", "GY$", 0],
      // Hongkong-dollar
      "HKD": [ "HKD", "HK$", 2, "HK$"],
      // honduransk lempira
      "HNL": [ "HNL", "HNL", 2],
      // kroatisk dinar
      "HRD": [ "HRD", "HRD", 130],
      // kroatisk kuna
      "HRK": [ "HRK", "kn", 2],
      // haitisk gourde
      "HTG": [ "HTG", "HTG", 2],
      // ungarsk forint
      "HUF": [ "HUF", "Ft", 0],
      // indonesisk rupi
      "IDR": [ "IDR", "Rp", 0],
      // irsk pund
      "IEP": [ "IEP", "IR£", 130],
      // israelsk pund
      "ILP": [ "ILP", "I£", 130],
      // israelsk ny shekel
      "ILS": [ "ILS", "₪", 2, "IL₪"],
      // indisk rupi
      "INR": [ "INR", "Rs", 2, "Rs"],
      // iraksk dinar
      "IQD": [ "IQD", "IQD", 0],
      // iransk rial
      "IRR": [ "IRR", "IRR", 0],
      // islandsk krone
      "ISK": [ "ISK", "Ikr", 0, "kr"],
      // italiensk lire
      "ITL": [ "ITL", "IT₤", 128],
      // jamaikansk dollar
      "JMD": [ "JMD", "J$", 2, "JA$"],
      // jordansk dinar
      "JOD": [ "JOD", "JD", 3],
      // japansk yen
      "JPY": [ "JPY", "JP¥", 0, "JP¥"],
      // kenyansk shilling
      "KES": [ "KES", "Ksh", 2],
      // kirgisisk som
      "KGS": [ "KGS", "KGS", 2],
      // kambodsjansk riel
      "KHR": [ "KHR", "KHR", 2],
      // komorisk franc
      "KMF": [ "KMF", "CF", 0],
      // nordkoreansk won
      "KPW": [ "KPW", "KPW", 0],
      // sørkoreansk won
      "KRW": [ "KRW", "₩", 0, "KR₩"],
      // kuwaitisk dinar
      "KWD": [ "KWD", "KD", 3],
      // caymansk dollar
      "KYD": [ "KYD", "KY$", 2],
      // kasakhstansk tenge
      "KZT": [ "KZT", "KZT", 2],
      // laotisk kip
      "LAK": [ "LAK", "₭", 0],
      // libanesisk pund
      "LBP": [ "LBP", "LB£", 0],
      // srilankisk rupi
      "LKR": [ "LKR", "SLRs", 2, "SLRs"],
      // liberisk dollar
      "LRD": [ "LRD", "L$", 2],
      // lesothisk loti
      "LSL": [ "LSL", "LSL", 2],
      // LSM
      "LSM": [ "LSM", "LSM", 130],
      // litauisk lita
      "LTL": [ "LTL", "Lt", 2],
      // litauisk talona
      "LTT": [ "LTT", "LTT", 130],
      // luxemburgsk konvertibel franc
      "LUC": [ "LUC", "LUC", 2],
      // luxemburgsk franc
      "LUF": [ "LUF", "LUF", 128],
      // luxemburgsk finansiell franc
      "LUL": [ "LUL", "LUL", 2],
      // latvisk lat
      "LVL": [ "LVL", "Ls", 2],
      // latvisk rubel
      "LVR": [ "LVR", "LVR", 130],
      // libysk dinar
      "LYD": [ "LYD", "LD", 3],
      // marokkansk dirham
      "MAD": [ "MAD", "MAD", 2],
      // marokkansk franc
      "MAF": [ "MAF", "MAF", 130],
      // moldovsk leu
      "MDL": [ "MDL", "MDL", 2],
      // madagassisk ariary
      "MGA": [ "MGA", "MGA", 0],
      // madagassisk franc
      "MGF": [ "MGF", "MGF", 128],
      // makedonsk denar
      "MKD": [ "MKD", "MKD", 2],
      // malisk franc
      "MLF": [ "MLF", "MLF", 130],
      // myanmarsk kyat
      "MMK": [ "MMK", "MMK", 0],
      // mongolsk tugrik
      "MNT": [ "MNT", "₮", 0, "MN₮"],
      // makaosk pataca
      "MOP": [ "MOP", "MOP$", 2],
      // mauritansk ouguiya
      "MRO": [ "MRO", "UM", 0],
      // maltesisk lira
      "MTL": [ "MTL", "Lm", 130],
      // maltesisk pund
      "MTP": [ "MTP", "MT£", 130],
      // mauritansk rupi
      "MUR": [ "MUR", "MURs", 0],
      // maldivisk rufiyaa
      "MVR": [ "MVR", "MVR", 2],
      // malawisk kwacha
      "MWK": [ "MWK", "MWK", 2],
      // meksikansk peso
      "MXN": [ "MXN", "Mex$", 2, "Mex$"],
      // meksikansk sølvpeso (1861-1992)
      "MXP": [ "MXP", "MX$", 130],
      // meksikansk unidad de inversion (UDI)
      "MXV": [ "MXV", "MXV", 2],
      // malaysisk ringgit
      "MYR": [ "MYR", "RM", 2, "RM"],
      // mosambikisk escudo
      "MZE": [ "MZE", "MZE", 130],
      // gammal mosambikisk metical
      "MZM": [ "MZM", "Mt", 130],
      // mosambikisk metical
      "MZN": [ "MZN", "MTn", 2],
      // namibisk dollar
      "NAD": [ "NAD", "N$", 2],
      // nigeriansk naira
      "NGN": [ "NGN", "₦", 2],
      // nicaraguansk cordoba
      "NIC": [ "NIC", "NIC", 130],
      // nicaraguansk cordoba oro
      "NIO": [ "NIO", "C$", 2],
      // nederlandsk gylden
      "NLG": [ "NLG", "fl", 130],
      // norsk krone
      "NOK": [ "NOK", "kr", 2, "NOkr"],
      // nepalsk rupi
      "NPR": [ "NPR", "NPRs", 2],
      // new zealandsk dollar
      "NZD": [ "NZD", "NZ$", 2],
      // omansk rial
      "OMR": [ "OMR", "OMR", 3],
      // panamansk balboa
      "PAB": [ "PAB", "B/.", 2, "B/."],
      // peruansk inti
      "PEI": [ "PEI", "I/.", 130],
      // peruansk nuevo sol
      "PEN": [ "PEN", "S/.", 2, "S/."],
      // peruansk sol
      "PES": [ "PES", "PES", 130],
      // papuansk kina
      "PGK": [ "PGK", "PGK", 2],
      // filippinsk peso
      "PHP": [ "PHP", "₱", 2, "PHP"],
      // pakistansk rupi
      "PKR": [ "PKR", "PKRs", 0, "PKRs."],
      // polsk zloty
      "PLN": [ "PLN", "zł", 2],
      // polsk zloty (1950-1995)
      "PLZ": [ "PLZ", "PLZ", 130],
      // portugisisk escudo
      "PTE": [ "PTE", "Esc", 130],
      // paraguayansk guarani
      "PYG": [ "PYG", "₲", 0],
      // qatarsk rial
      "QAR": [ "QAR", "QR", 2],
      // rhodesisk dollar
      "RHD": [ "RHD", "RH$", 130],
      // gammal rumensk leu
      "ROL": [ "ROL", "ROL", 130],
      // rumensk leu
      "RON": [ "RON", "RON", 2],
      // serbisk dinar
      "RSD": [ "RSD", "din.", 0],
      // russisk rubel
      "RUB": [ "RUB", "руб", 2, "руб"],
      // russisk rubel (1991-1998)
      "RUR": [ "RUR", "RUR", 130],
      // rwandisk franc
      "RWF": [ "RWF", "RWF", 0],
      // saudiarabisk rial
      "SAR": [ "SAR", "SR", 2, "SR"],
      // salomonsk dollar
      "SBD": [ "SBD", "SI$", 2],
      // seychellisk rupi
      "SCR": [ "SCR", "SRe", 2],
      // gammal sudanesisk dinar
      "SDD": [ "SDD", "LSd", 130],
      // sudansk pund
      "SDG": [ "SDG", "SDG", 2],
      // gammalt sudanesisk pund
      "SDP": [ "SDP", "SDP", 130],
      // svensk krone
      "SEK": [ "SEK", "Skr", 2, "kr"],
      // singaporsk dollar
      "SGD": [ "SGD", "S$", 2, "S$"],
      // sankthelensk pund
      "SHP": [ "SHP", "SH£", 2],
      // slovensk tolar
      "SIT": [ "SIT", "SIT", 130],
      // slovakisk koruna
      "SKK": [ "SKK", "Sk", 130],
      // sierraleonsk leone
      "SLL": [ "SLL", "Le", 0],
      // somalisk shilling
      "SOS": [ "SOS", "Ssh", 0],
      // surinamsk dollar
      "SRD": [ "SRD", "SR$", 2],
      // surinamsk gylden
      "SRG": [ "SRG", "Sf", 130],
      // Sao Tome og Principe-dobra
      "STD": [ "STD", "Db", 0],
      // sovjetisk rubel
      "SUR": [ "SUR", "SUR", 130],
      // salvadoransk colon
      "SVC": [ "SVC", "SV₡", 130],
      // syrisk pund
      "SYP": [ "SYP", "SY£", 0],
      // swazilandsk lilangeni
      "SZL": [ "SZL", "SZL", 2],
      // thailandsk baht
      "THB": [ "THB", "฿", 2, "THB"],
      // tadsjikisk rubel
      "TJR": [ "TJR", "TJR", 130],
      // tadsjikisk somoni
      "TJS": [ "TJS", "TJS", 2],
      // turkmensk manat
      "TMM": [ "TMM", "TMM", 128],
      // tunisisk dinar
      "TND": [ "TND", "DT", 3],
      // tongansk paʻanga
      "TOP": [ "TOP", "T$", 2],
      // timoresisk escudo
      "TPE": [ "TPE", "TPE", 130],
      // gammal tyrkiske lire
      "TRL": [ "TRL", "TRL", 128],
      // tyrkisk lire
      "TRY": [ "TRY", "TL", 2, "YTL"],
      // trinidadisk dollar
      "TTD": [ "TTD", "TT$", 2],
      // taiwansk ny dollar
      "TWD": [ "TWD", "NT$", 2, "NT$"],
      // tanzaniansk shilling
      "TZS": [ "TZS", "TSh", 0],
      // ukrainsk hryvnia
      "UAH": [ "UAH", "₴", 2],
      // ukrainsk karbovanetz
      "UAK": [ "UAK", "UAK", 130],
      // ugandisk shilling (1966-1987)
      "UGS": [ "UGS", "UGS", 130],
      // ugandisk shilling
      "UGX": [ "UGX", "USh", 0],
      // amerikansk dollar
      "USD": [ "USD", "US$", 2, "US$"],
      // amerikansk dollar (neste dag)
      "USN": [ "USN", "USN", 2],
      // amerikansk dollar (same dag)
      "USS": [ "USS", "USS", 2],
      // uruguayansk peso en unidades indexadas
      "UYI": [ "UYI", "UYI", 2],
      // uruguayansk peso (1975-1993)
      "UYP": [ "UYP", "UYP", 130],
      // uruguayansk peso
      "UYU": [ "UYU", "$U", 2, "UY$"],
      // usbekisk sum
      "UZS": [ "UZS", "UZS", 0],
      // venezuelansk bolivar
      "VEB": [ "VEB", "VEB", 130],
      // venezuelansk bolivar fuerte
      "VEF": [ "VEF", "Bs.F.", 2],
      // vietnamesisk dong
      "VND": [ "VND", "₫", 24, "₫"],
      // vanuatuisk vatu
      "VUV": [ "VUV", "VT", 0],
      // vestsamoisk tala
      "WST": [ "WST", "WS$", 2],
      // CFA franc BEAC
      "XAF": [ "XAF", "FCFA", 0],
      // sølv
      "XAG": [ "XAG", "XAG", 2],
      // gull
      "XAU": [ "XAU", "XAU", 2],
      // europeisk samansett eining
      "XBA": [ "XBA", "XBA", 2],
      // europeisk monetær eining
      "XBB": [ "XBB", "XBB", 2],
      // europeisk kontoeining (XBC)
      "XBC": [ "XBC", "XBC", 2],
      // europeisk kontoeining (XBD)
      "XBD": [ "XBD", "XBD", 2],
      // austkaribisk dollar
      "XCD": [ "XCD", "EC$", 2],
      // spesielle trekkrettar
      "XDR": [ "XDR", "XDR", 2],
      // europeisk valutaeining
      "XEU": [ "XEU", "XEU", 2],
      // fransk gullfranc
      "XFO": [ "XFO", "XFO", 2],
      // fransk UIC-franc
      "XFU": [ "XFU", "XFU", 2],
      // CFA franc BCEAO
      "XOF": [ "XOF", "CFA", 0],
      // palladium
      "XPD": [ "XPD", "XPD", 2],
      // CFP franc
      "XPF": [ "XPF", "CFPF", 0],
      // platina
      "XPT": [ "XPT", "XPT", 2],
      // RINET-fond
      "XRE": [ "XRE", "XRE", 2],
      // testvalutakode
      "XTS": [ "XTS", "XTS", 2],
      // ukjend valuta
      "XXX": [ "XXX", "XXX", 2],
      // jemenittisk dinar
      "YDD": [ "YDD", "YDD", 130],
      // jemenittisk rial
      "YER": [ "YER", "YR", 0, "YER"],
      // jugoslavisk dinar (hard)
      "YUD": [ "YUD", "YUD", 130],
      // jugoslavisk noviy-dinar
      "YUM": [ "YUM", "YUM", 130],
      // jugoslavisk konvertibel dinar
      "YUN": [ "YUN", "YUN", 130],
      // sørafrikansk rand (finansiell)
      "ZAL": [ "ZAL", "ZAL", 2],
      // sørafrikansk rand
      "ZAR": [ "ZAR", "R", 2, "ZAR"],
      // zambisk kwacha
      "ZMK": [ "ZMK", "ZK", 0],
      // zairisk ny zaire
      "ZRN": [ "ZRN", "NZ", 130],
      // zairisk zaire
      "ZRZ": [ "ZRZ", "ZRZ", 130],
      // zimbabwisk dollar
      "ZWD": [ "ZWD", "Z$", 128],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "andorransk peseta");
    result.put("AED", "UAE dirham");
    result.put("AFA", "afghani (1927-2002)");
    result.put("AFN", "afghani");
    result.put("ALL", "albansk lek");
    result.put("AMD", "armensk dram");
    result.put("ANG", "nederlansk antillegylden");
    result.put("AOA", "angolsk kwanza");
    result.put("AOK", "angolsk kwanza (1977-1990)");
    result.put("AON", "angolsk ny kwanza (1990-2000)");
    result.put("AOR", "angolsk kwanza reajustado (1995-1999)");
    result.put("ARA", "argentisk austral");
    result.put("ARP", "argentinsk peso (1983-1985)");
    result.put("ARS", "argentinsk peso");
    result.put("ATS", "austerriksk schilling");
    result.put("AUD", "australsk dollar");
    result.put("AWG", "arubisk gylden");
    result.put("AZM", "aserbaijansk manat");
    result.put("AZN", "aserbajdsjansk manat");
    result.put("BAD", "bosnisk-hercegovinsk dinar");
    result.put("BAM", "bosnisk-hercegovinsk mark (konvertibel)");
    result.put("BBD", "barbadisk dollar");
    result.put("BDT", "bangladeshisk taka");
    result.put("BEC", "belgisk franc (konvertibel)");
    result.put("BEF", "belgisk franc");
    result.put("BEL", "belgisk franc (finansiell)");
    result.put("BGL", "bulgarsk hard lev");
    result.put("BGN", "bulgarsk ny lev");
    result.put("BHD", "bahrainsk dinar");
    result.put("BIF", "burundisk franc");
    result.put("BMD", "bermudisk dollar");
    result.put("BND", "bruneisk dollar");
    result.put("BOB", "boliviano");
    result.put("BOP", "bolivisk peso");
    result.put("BOV", "bolivisk mvdol");
    result.put("BRB", "brasiliansk cruzeiro novo (1967-1986)");
    result.put("BRC", "brasiliansk cruzado");
    result.put("BRE", "brasiliansk cruzeiro (1990-1993)");
    result.put("BRL", "brasiliansk real");
    result.put("BRN", "brasiliansk cruzado novo");
    result.put("BRR", "brasiliansk cruzeiro");
    result.put("BSD", "bahamisk dollar");
    result.put("BTN", "bhutansk ngultrum");
    result.put("BUK", "burmesisk kyat");
    result.put("BWP", "botswansk pula");
    result.put("BYB", "kviterussisk ny rubel (1994-1999)");
    result.put("BYR", "kviterussisk rubel");
    result.put("BZD", "belizisk dollar");
    result.put("CAD", "kanadisk dollar");
    result.put("CDF", "kongolesisk franc");
    result.put("CHE", "WIR euro");
    result.put("CHF", "sveitsisk franc");
    result.put("CHW", "WIR franc");
    result.put("CLF", "chilensk unidades de fomento");
    result.put("CLP", "chilensk peso");
    result.put("CNY", "kinesisk yuan renminbi");
    result.put("COP", "colombiansk peso");
    result.put("COU", "unidad de valor real");
    result.put("CRC", "costaricansk colon");
    result.put("CSD", "gammal serbisk dinar");
    result.put("CSK", "tsjekkoslovakisk koruna (hard)");
    result.put("CUP", "kubansk peso");
    result.put("CVE", "kappverdisk escudo");
    result.put("CYP", "kypriotisk pund");
    result.put("CZK", "tsjekkisk koruna");
    result.put("DDM", "austtysk mark");
    result.put("DEM", "tysk mark");
    result.put("DJF", "djiboutisk franc");
    result.put("DKK", "dansk krone");
    result.put("DOP", "dominikansk peso");
    result.put("DZD", "algerisk dinar");
    result.put("ECS", "ecuadoriansk sucre");
    result.put("ECV", "ecuadoriansk unidad de valor constante (UVC)");
    result.put("EEK", "estisk kroon");
    result.put("EGP", "egyptisk pund");
    result.put("ERN", "eritreisk nakfa");
    result.put("ESA", "spansk peseta (A-konto)");
    result.put("ESB", "spansk peseta (konvertibel konto)");
    result.put("ESP", "spansk peseta");
    result.put("ETB", "etiopisk birr");
    result.put("EUR", "euro");
    result.put("FIM", "finsk mark");
    result.put("FJD", "fijiansk dollar");
    result.put("FKP", "Falkland-pund");
    result.put("FRF", "fransk franc");
    result.put("GBP", "britisk pund sterling");
    result.put("GEK", "georgisk kupon larit");
    result.put("GEL", "georgisk lari");
    result.put("GHC", "ghanesisk cedi (1979-2007)");
    result.put("GHS", "ghanesisk cedi");
    result.put("GIP", "gibraltarsk pund");
    result.put("GMD", "gambisk dalasi");
    result.put("GNF", "guineansk franc");
    result.put("GNS", "guineansk syli");
    result.put("GQE", "ekvatorialguineansk ekwele guineana");
    result.put("GRD", "gresk drakme");
    result.put("GTQ", "guatemalansk quetzal");
    result.put("GWE", "portugisisk guinea escudo");
    result.put("GWP", "Guinea-Bissau-peso");
    result.put("GYD", "guyansk dollar");
    result.put("HKD", "Hongkong-dollar");
    result.put("HNL", "honduransk lempira");
    result.put("HRD", "kroatisk dinar");
    result.put("HRK", "kroatisk kuna");
    result.put("HTG", "haitisk gourde");
    result.put("HUF", "ungarsk forint");
    result.put("IDR", "indonesisk rupi");
    result.put("IEP", "irsk pund");
    result.put("ILP", "israelsk pund");
    result.put("ILS", "israelsk ny shekel");
    result.put("INR", "indisk rupi");
    result.put("IQD", "iraksk dinar");
    result.put("IRR", "iransk rial");
    result.put("ISK", "islandsk krone");
    result.put("ITL", "italiensk lire");
    result.put("JMD", "jamaikansk dollar");
    result.put("JOD", "jordansk dinar");
    result.put("JPY", "japansk yen");
    result.put("KES", "kenyansk shilling");
    result.put("KGS", "kirgisisk som");
    result.put("KHR", "kambodsjansk riel");
    result.put("KMF", "komorisk franc");
    result.put("KPW", "nordkoreansk won");
    result.put("KRW", "sørkoreansk won");
    result.put("KWD", "kuwaitisk dinar");
    result.put("KYD", "caymansk dollar");
    result.put("KZT", "kasakhstansk tenge");
    result.put("LAK", "laotisk kip");
    result.put("LBP", "libanesisk pund");
    result.put("LKR", "srilankisk rupi");
    result.put("LRD", "liberisk dollar");
    result.put("LSL", "lesothisk loti");
    result.put("LTL", "litauisk lita");
    result.put("LTT", "litauisk talona");
    result.put("LUC", "luxemburgsk konvertibel franc");
    result.put("LUF", "luxemburgsk franc");
    result.put("LUL", "luxemburgsk finansiell franc");
    result.put("LVL", "latvisk lat");
    result.put("LVR", "latvisk rubel");
    result.put("LYD", "libysk dinar");
    result.put("MAD", "marokkansk dirham");
    result.put("MAF", "marokkansk franc");
    result.put("MDL", "moldovsk leu");
    result.put("MGA", "madagassisk ariary");
    result.put("MGF", "madagassisk franc");
    result.put("MKD", "makedonsk denar");
    result.put("MLF", "malisk franc");
    result.put("MMK", "myanmarsk kyat");
    result.put("MNT", "mongolsk tugrik");
    result.put("MOP", "makaosk pataca");
    result.put("MRO", "mauritansk ouguiya");
    result.put("MTL", "maltesisk lira");
    result.put("MTP", "maltesisk pund");
    result.put("MUR", "mauritansk rupi");
    result.put("MVR", "maldivisk rufiyaa");
    result.put("MWK", "malawisk kwacha");
    result.put("MXN", "meksikansk peso");
    result.put("MXP", "meksikansk sølvpeso (1861-1992)");
    result.put("MXV", "meksikansk unidad de inversion (UDI)");
    result.put("MYR", "malaysisk ringgit");
    result.put("MZE", "mosambikisk escudo");
    result.put("MZM", "gammal mosambikisk metical");
    result.put("MZN", "mosambikisk metical");
    result.put("NAD", "namibisk dollar");
    result.put("NGN", "nigeriansk naira");
    result.put("NIC", "nicaraguansk cordoba");
    result.put("NIO", "nicaraguansk cordoba oro");
    result.put("NLG", "nederlandsk gylden");
    result.put("NOK", "norsk krone");
    result.put("NPR", "nepalsk rupi");
    result.put("NZD", "new zealandsk dollar");
    result.put("OMR", "omansk rial");
    result.put("PAB", "panamansk balboa");
    result.put("PEI", "peruansk inti");
    result.put("PEN", "peruansk nuevo sol");
    result.put("PES", "peruansk sol");
    result.put("PGK", "papuansk kina");
    result.put("PHP", "filippinsk peso");
    result.put("PKR", "pakistansk rupi");
    result.put("PLN", "polsk zloty");
    result.put("PLZ", "polsk zloty (1950-1995)");
    result.put("PTE", "portugisisk escudo");
    result.put("PYG", "paraguayansk guarani");
    result.put("QAR", "qatarsk rial");
    result.put("RHD", "rhodesisk dollar");
    result.put("ROL", "gammal rumensk leu");
    result.put("RON", "rumensk leu");
    result.put("RSD", "serbisk dinar");
    result.put("RUB", "russisk rubel");
    result.put("RUR", "russisk rubel (1991-1998)");
    result.put("RWF", "rwandisk franc");
    result.put("SAR", "saudiarabisk rial");
    result.put("SBD", "salomonsk dollar");
    result.put("SCR", "seychellisk rupi");
    result.put("SDD", "gammal sudanesisk dinar");
    result.put("SDG", "sudansk pund");
    result.put("SDP", "gammalt sudanesisk pund");
    result.put("SEK", "svensk krone");
    result.put("SGD", "singaporsk dollar");
    result.put("SHP", "sankthelensk pund");
    result.put("SIT", "slovensk tolar");
    result.put("SKK", "slovakisk koruna");
    result.put("SLL", "sierraleonsk leone");
    result.put("SOS", "somalisk shilling");
    result.put("SRD", "surinamsk dollar");
    result.put("SRG", "surinamsk gylden");
    result.put("STD", "Sao Tome og Principe-dobra");
    result.put("SUR", "sovjetisk rubel");
    result.put("SVC", "salvadoransk colon");
    result.put("SYP", "syrisk pund");
    result.put("SZL", "swazilandsk lilangeni");
    result.put("THB", "thailandsk baht");
    result.put("TJR", "tadsjikisk rubel");
    result.put("TJS", "tadsjikisk somoni");
    result.put("TMM", "turkmensk manat");
    result.put("TND", "tunisisk dinar");
    result.put("TOP", "tongansk paʻanga");
    result.put("TPE", "timoresisk escudo");
    result.put("TRL", "gammal tyrkiske lire");
    result.put("TRY", "tyrkisk lire");
    result.put("TTD", "trinidadisk dollar");
    result.put("TWD", "taiwansk ny dollar");
    result.put("TZS", "tanzaniansk shilling");
    result.put("UAH", "ukrainsk hryvnia");
    result.put("UAK", "ukrainsk karbovanetz");
    result.put("UGS", "ugandisk shilling (1966-1987)");
    result.put("UGX", "ugandisk shilling");
    result.put("USD", "amerikansk dollar");
    result.put("USN", "amerikansk dollar (neste dag)");
    result.put("USS", "amerikansk dollar (same dag)");
    result.put("UYI", "uruguayansk peso en unidades indexadas");
    result.put("UYP", "uruguayansk peso (1975-1993)");
    result.put("UYU", "uruguayansk peso");
    result.put("UZS", "usbekisk sum");
    result.put("VEB", "venezuelansk bolivar");
    result.put("VEF", "venezuelansk bolivar fuerte");
    result.put("VND", "vietnamesisk dong");
    result.put("VUV", "vanuatuisk vatu");
    result.put("WST", "vestsamoisk tala");
    result.put("XAF", "CFA franc BEAC");
    result.put("XAG", "sølv");
    result.put("XAU", "gull");
    result.put("XBA", "europeisk samansett eining");
    result.put("XBB", "europeisk monetær eining");
    result.put("XBC", "europeisk kontoeining (XBC)");
    result.put("XBD", "europeisk kontoeining (XBD)");
    result.put("XCD", "austkaribisk dollar");
    result.put("XDR", "spesielle trekkrettar");
    result.put("XEU", "europeisk valutaeining");
    result.put("XFO", "fransk gullfranc");
    result.put("XFU", "fransk UIC-franc");
    result.put("XOF", "CFA franc BCEAO");
    result.put("XPD", "palladium");
    result.put("XPF", "CFP franc");
    result.put("XPT", "platina");
    result.put("XRE", "RINET-fond");
    result.put("XTS", "testvalutakode");
    result.put("XXX", "ukjend valuta");
    result.put("YDD", "jemenittisk dinar");
    result.put("YER", "jemenittisk rial");
    result.put("YUD", "jugoslavisk dinar (hard)");
    result.put("YUM", "jugoslavisk noviy-dinar");
    result.put("YUN", "jugoslavisk konvertibel dinar");
    result.put("ZAL", "sørafrikansk rand (finansiell)");
    result.put("ZAR", "sørafrikansk rand");
    result.put("ZMK", "zambisk kwacha");
    result.put("ZRN", "zairisk ny zaire");
    result.put("ZRZ", "zairisk zaire");
    result.put("ZWD", "zimbabwisk dollar");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "andorransk peseta",
      "AED": "UAE dirham",
      "AFA": "afghani (1927-2002)",
      "AFN": "afghani",
      "ALL": "albansk lek",
      "AMD": "armensk dram",
      "ANG": "nederlansk antillegylden",
      "AOA": "angolsk kwanza",
      "AOK": "angolsk kwanza (1977-1990)",
      "AON": "angolsk ny kwanza (1990-2000)",
      "AOR": "angolsk kwanza reajustado (1995-1999)",
      "ARA": "argentisk austral",
      "ARP": "argentinsk peso (1983-1985)",
      "ARS": "argentinsk peso",
      "ATS": "austerriksk schilling",
      "AUD": "australsk dollar",
      "AWG": "arubisk gylden",
      "AZM": "aserbaijansk manat",
      "AZN": "aserbajdsjansk manat",
      "BAD": "bosnisk-hercegovinsk dinar",
      "BAM": "bosnisk-hercegovinsk mark (konvertibel)",
      "BBD": "barbadisk dollar",
      "BDT": "bangladeshisk taka",
      "BEC": "belgisk franc (konvertibel)",
      "BEF": "belgisk franc",
      "BEL": "belgisk franc (finansiell)",
      "BGL": "bulgarsk hard lev",
      "BGN": "bulgarsk ny lev",
      "BHD": "bahrainsk dinar",
      "BIF": "burundisk franc",
      "BMD": "bermudisk dollar",
      "BND": "bruneisk dollar",
      "BOB": "boliviano",
      "BOP": "bolivisk peso",
      "BOV": "bolivisk mvdol",
      "BRB": "brasiliansk cruzeiro novo (1967-1986)",
      "BRC": "brasiliansk cruzado",
      "BRE": "brasiliansk cruzeiro (1990-1993)",
      "BRL": "brasiliansk real",
      "BRN": "brasiliansk cruzado novo",
      "BRR": "brasiliansk cruzeiro",
      "BSD": "bahamisk dollar",
      "BTN": "bhutansk ngultrum",
      "BUK": "burmesisk kyat",
      "BWP": "botswansk pula",
      "BYB": "kviterussisk ny rubel (1994-1999)",
      "BYR": "kviterussisk rubel",
      "BZD": "belizisk dollar",
      "CAD": "kanadisk dollar",
      "CDF": "kongolesisk franc",
      "CHE": "WIR euro",
      "CHF": "sveitsisk franc",
      "CHW": "WIR franc",
      "CLF": "chilensk unidades de fomento",
      "CLP": "chilensk peso",
      "CNY": "kinesisk yuan renminbi",
      "COP": "colombiansk peso",
      "COU": "unidad de valor real",
      "CRC": "costaricansk colon",
      "CSD": "gammal serbisk dinar",
      "CSK": "tsjekkoslovakisk koruna (hard)",
      "CUP": "kubansk peso",
      "CVE": "kappverdisk escudo",
      "CYP": "kypriotisk pund",
      "CZK": "tsjekkisk koruna",
      "DDM": "austtysk mark",
      "DEM": "tysk mark",
      "DJF": "djiboutisk franc",
      "DKK": "dansk krone",
      "DOP": "dominikansk peso",
      "DZD": "algerisk dinar",
      "ECS": "ecuadoriansk sucre",
      "ECV": "ecuadoriansk unidad de valor constante (UVC)",
      "EEK": "estisk kroon",
      "EGP": "egyptisk pund",
      "ERN": "eritreisk nakfa",
      "ESA": "spansk peseta (A-konto)",
      "ESB": "spansk peseta (konvertibel konto)",
      "ESP": "spansk peseta",
      "ETB": "etiopisk birr",
      "EUR": "euro",
      "FIM": "finsk mark",
      "FJD": "fijiansk dollar",
      "FKP": "Falkland-pund",
      "FRF": "fransk franc",
      "GBP": "britisk pund sterling",
      "GEK": "georgisk kupon larit",
      "GEL": "georgisk lari",
      "GHC": "ghanesisk cedi (1979-2007)",
      "GHS": "ghanesisk cedi",
      "GIP": "gibraltarsk pund",
      "GMD": "gambisk dalasi",
      "GNF": "guineansk franc",
      "GNS": "guineansk syli",
      "GQE": "ekvatorialguineansk ekwele guineana",
      "GRD": "gresk drakme",
      "GTQ": "guatemalansk quetzal",
      "GWE": "portugisisk guinea escudo",
      "GWP": "Guinea-Bissau-peso",
      "GYD": "guyansk dollar",
      "HKD": "Hongkong-dollar",
      "HNL": "honduransk lempira",
      "HRD": "kroatisk dinar",
      "HRK": "kroatisk kuna",
      "HTG": "haitisk gourde",
      "HUF": "ungarsk forint",
      "IDR": "indonesisk rupi",
      "IEP": "irsk pund",
      "ILP": "israelsk pund",
      "ILS": "israelsk ny shekel",
      "INR": "indisk rupi",
      "IQD": "iraksk dinar",
      "IRR": "iransk rial",
      "ISK": "islandsk krone",
      "ITL": "italiensk lire",
      "JMD": "jamaikansk dollar",
      "JOD": "jordansk dinar",
      "JPY": "japansk yen",
      "KES": "kenyansk shilling",
      "KGS": "kirgisisk som",
      "KHR": "kambodsjansk riel",
      "KMF": "komorisk franc",
      "KPW": "nordkoreansk won",
      "KRW": "sørkoreansk won",
      "KWD": "kuwaitisk dinar",
      "KYD": "caymansk dollar",
      "KZT": "kasakhstansk tenge",
      "LAK": "laotisk kip",
      "LBP": "libanesisk pund",
      "LKR": "srilankisk rupi",
      "LRD": "liberisk dollar",
      "LSL": "lesothisk loti",
      "LTL": "litauisk lita",
      "LTT": "litauisk talona",
      "LUC": "luxemburgsk konvertibel franc",
      "LUF": "luxemburgsk franc",
      "LUL": "luxemburgsk finansiell franc",
      "LVL": "latvisk lat",
      "LVR": "latvisk rubel",
      "LYD": "libysk dinar",
      "MAD": "marokkansk dirham",
      "MAF": "marokkansk franc",
      "MDL": "moldovsk leu",
      "MGA": "madagassisk ariary",
      "MGF": "madagassisk franc",
      "MKD": "makedonsk denar",
      "MLF": "malisk franc",
      "MMK": "myanmarsk kyat",
      "MNT": "mongolsk tugrik",
      "MOP": "makaosk pataca",
      "MRO": "mauritansk ouguiya",
      "MTL": "maltesisk lira",
      "MTP": "maltesisk pund",
      "MUR": "mauritansk rupi",
      "MVR": "maldivisk rufiyaa",
      "MWK": "malawisk kwacha",
      "MXN": "meksikansk peso",
      "MXP": "meksikansk sølvpeso (1861-1992)",
      "MXV": "meksikansk unidad de inversion (UDI)",
      "MYR": "malaysisk ringgit",
      "MZE": "mosambikisk escudo",
      "MZM": "gammal mosambikisk metical",
      "MZN": "mosambikisk metical",
      "NAD": "namibisk dollar",
      "NGN": "nigeriansk naira",
      "NIC": "nicaraguansk cordoba",
      "NIO": "nicaraguansk cordoba oro",
      "NLG": "nederlandsk gylden",
      "NOK": "norsk krone",
      "NPR": "nepalsk rupi",
      "NZD": "new zealandsk dollar",
      "OMR": "omansk rial",
      "PAB": "panamansk balboa",
      "PEI": "peruansk inti",
      "PEN": "peruansk nuevo sol",
      "PES": "peruansk sol",
      "PGK": "papuansk kina",
      "PHP": "filippinsk peso",
      "PKR": "pakistansk rupi",
      "PLN": "polsk zloty",
      "PLZ": "polsk zloty (1950-1995)",
      "PTE": "portugisisk escudo",
      "PYG": "paraguayansk guarani",
      "QAR": "qatarsk rial",
      "RHD": "rhodesisk dollar",
      "ROL": "gammal rumensk leu",
      "RON": "rumensk leu",
      "RSD": "serbisk dinar",
      "RUB": "russisk rubel",
      "RUR": "russisk rubel (1991-1998)",
      "RWF": "rwandisk franc",
      "SAR": "saudiarabisk rial",
      "SBD": "salomonsk dollar",
      "SCR": "seychellisk rupi",
      "SDD": "gammal sudanesisk dinar",
      "SDG": "sudansk pund",
      "SDP": "gammalt sudanesisk pund",
      "SEK": "svensk krone",
      "SGD": "singaporsk dollar",
      "SHP": "sankthelensk pund",
      "SIT": "slovensk tolar",
      "SKK": "slovakisk koruna",
      "SLL": "sierraleonsk leone",
      "SOS": "somalisk shilling",
      "SRD": "surinamsk dollar",
      "SRG": "surinamsk gylden",
      "STD": "Sao Tome og Principe-dobra",
      "SUR": "sovjetisk rubel",
      "SVC": "salvadoransk colon",
      "SYP": "syrisk pund",
      "SZL": "swazilandsk lilangeni",
      "THB": "thailandsk baht",
      "TJR": "tadsjikisk rubel",
      "TJS": "tadsjikisk somoni",
      "TMM": "turkmensk manat",
      "TND": "tunisisk dinar",
      "TOP": "tongansk paʻanga",
      "TPE": "timoresisk escudo",
      "TRL": "gammal tyrkiske lire",
      "TRY": "tyrkisk lire",
      "TTD": "trinidadisk dollar",
      "TWD": "taiwansk ny dollar",
      "TZS": "tanzaniansk shilling",
      "UAH": "ukrainsk hryvnia",
      "UAK": "ukrainsk karbovanetz",
      "UGS": "ugandisk shilling (1966-1987)",
      "UGX": "ugandisk shilling",
      "USD": "amerikansk dollar",
      "USN": "amerikansk dollar (neste dag)",
      "USS": "amerikansk dollar (same dag)",
      "UYI": "uruguayansk peso en unidades indexadas",
      "UYP": "uruguayansk peso (1975-1993)",
      "UYU": "uruguayansk peso",
      "UZS": "usbekisk sum",
      "VEB": "venezuelansk bolivar",
      "VEF": "venezuelansk bolivar fuerte",
      "VND": "vietnamesisk dong",
      "VUV": "vanuatuisk vatu",
      "WST": "vestsamoisk tala",
      "XAF": "CFA franc BEAC",
      "XAG": "sølv",
      "XAU": "gull",
      "XBA": "europeisk samansett eining",
      "XBB": "europeisk monetær eining",
      "XBC": "europeisk kontoeining (XBC)",
      "XBD": "europeisk kontoeining (XBD)",
      "XCD": "austkaribisk dollar",
      "XDR": "spesielle trekkrettar",
      "XEU": "europeisk valutaeining",
      "XFO": "fransk gullfranc",
      "XFU": "fransk UIC-franc",
      "XOF": "CFA franc BCEAO",
      "XPD": "palladium",
      "XPF": "CFP franc",
      "XPT": "platina",
      "XRE": "RINET-fond",
      "XTS": "testvalutakode",
      "XXX": "ukjend valuta",
      "YDD": "jemenittisk dinar",
      "YER": "jemenittisk rial",
      "YUD": "jugoslavisk dinar (hard)",
      "YUM": "jugoslavisk noviy-dinar",
      "YUN": "jugoslavisk konvertibel dinar",
      "ZAL": "sørafrikansk rand (finansiell)",
      "ZAR": "sørafrikansk rand",
      "ZMK": "zambisk kwacha",
      "ZRN": "zairisk ny zaire",
      "ZRZ": "zairisk zaire",
      "ZWD": "zimbabwisk dollar",
    };
  }-*/;
}
