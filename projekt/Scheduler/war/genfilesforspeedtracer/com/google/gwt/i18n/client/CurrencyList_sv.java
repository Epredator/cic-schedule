package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_sv extends com.google.gwt.i18n.client.CurrencyList_ {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("EUR", "€", 2, "€");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "EUR", "€", 2, "€"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // andorransk peseta
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128));
    // Förenade Arabemiratens dirham
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH"));
    // afghani (1927-2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130));
    // afghani
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0));
    // albansk lek (-1992)
    result.put("ALK", new CurrencyDataImpl("ALK", "ALK", 130));
    // albansk lek
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0));
    // armenisk dram
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 0));
    // Nederländska Antillernas gulden
    result.put("ANG", new CurrencyDataImpl("ANG", "NAf.", 2));
    // angolansk kwanza
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2));
    // angolansk kwanza (1977-1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130));
    // angolansk ny kwanza (1990-2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130));
    // angolansk kwanza reajustado (1995-1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130));
    // argentinsk austral
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130));
    // ARL
    result.put("ARL", new CurrencyDataImpl("ARL", "ARL", 130));
    // ARM
    result.put("ARM", new CurrencyDataImpl("ARM", "ARM", 130));
    // argentinsk peso (1983-1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130));
    // argentinsk peso
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$"));
    // österrikisk schilling
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130));
    // australisk dollar
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$"));
    // Aruba-gulden
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2));
    // azerbajdzjansk manat (1993-2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130));
    // azerbajdzjansk manat
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2));
    // bosnisk-hercegovinsk dinar
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130));
    // bosnisk-hercegovinsk mark (konvertibel)
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2));
    // Barbados-dollar
    result.put("BBD", new CurrencyDataImpl("BBD", "Bds$", 2));
    // bangladeshisk taka
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk"));
    // belgisk franc (konvertibel)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 2));
    // belgisk franc
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130));
    // belgisk franc (finansiell)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 2));
    // bulgarisk lev (1962–1999)
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130));
    // bulgarisk lev (1952–1962)
    result.put("BGM", new CurrencyDataImpl("BGM", "BGM", 130));
    // bulgarisk ny lev
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2));
    // Bahrain-dinar
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3));
    // burundisk franc
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0));
    // Bermuda-dollar
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2));
    // Brunei-dollar
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2));
    // boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2));
    // boliviansk peso
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130));
    // boliviansk mvdol
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 2));
    // brasiliansk cruzeiro (1967-1986)
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
    // Bahamas-dollar
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2));
    // bhutanesisk ngultrum
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2));
    // burmesisk kyat
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130));
    // botswansk pula
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2));
    // vitrysk ny rubel (1994-1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130));
    // vitrysk rubel
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 0));
    // belizisk dollar
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2));
    // kanadensisk dollar
    result.put("CAD", new CurrencyDataImpl("CAD", "C$", 2, "C$"));
    // kongolesisk franc
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2));
    // euro (konvertibelt konto, WIR Bank, Schweiz)
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 2));
    // schweizisk franc
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF"));
    // schweizisk franc (konvertibelt konto, WIR Bank)
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 2));
    // CLE
    result.put("CLE", new CurrencyDataImpl("CLE", "CLE", 130));
    // chilensk unidad de fomento
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 0));
    // chilensk peso
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$"));
    // kinesisk dollar
    result.put("CNX", new CurrencyDataImpl("CNX", "CNX", 2));
    // kinesisk yuan renminbi
    result.put("CNY", new CurrencyDataImpl("CNY", "RMB¥", 2, "RMB¥"));
    // colombiansk peso
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 0, "COL$"));
    // colombiansk unidad de valor real
    result.put("COU", new CurrencyDataImpl("COU", "COU", 2));
    // costarikansk colón
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 0, "CR₡"));
    // jugoslavisk dinar
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130));
    // tjeckoslovakisk koruna
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130));
    // CUC
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2));
    // kubansk peso
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN"));
    // kapverdisk escudo
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2));
    // cypriotiskt pund
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130));
    // tjeckisk koruna
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč"));
    // östtysk mark
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130));
    // tysk mark
    result.put("DEM", new CurrencyDataImpl("DEM", "DM", 130));
    // djiboutisk franc
    result.put("DJF", new CurrencyDataImpl("DJF", "DJF", 0));
    // dansk krona
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr"));
    // dominikansk peso
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$"));
    // algerisk dinar
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2));
    // ecuadoriansk sucre
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130));
    // ecuadoriansk unidad de valor constante
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 2));
    // estnisk krona
    result.put("EEK", new CurrencyDataImpl("EEK", "Ekr", 2));
    // egyptiskt pund
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE"));
    // EQE
    result.put("EQE", new CurrencyDataImpl("EQE", "EQE", 130));
    // eritreansk nakfa
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2));
    // spansk peseta (konto)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 2));
    // spansk peseta (konvertibelt konto)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 2));
    // spansk peseta
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128));
    // etiopisk birr
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2));
    // euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€"));
    // finsk mark
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130));
    // Fiji-dollar
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2));
    // Falklandsöarnas pund
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2));
    // fransk franc
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130));
    // brittiskt pund sterling
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£"));
    // georgisk kupon larit
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130));
    // georgisk lari
    result.put("GEL", new CurrencyDataImpl("GEL", "GEL", 2));
    // ghanansk cedi (1979-2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130));
    // ghanansk cedi
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2));
    // gibraltiskt pund
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2));
    // gambisk dalasi
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2));
    // guineansk franc
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0));
    // guineansk syli
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130));
    // ekvatorialguineansk ekwele
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130));
    // grekisk drachma
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130));
    // guatemalansk quetzal
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2));
    // Portugisiska Guinea-escudo
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130));
    // Guinea-Bissau-peso
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 2));
    // Guyana-dollar
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 0));
    // Hongkong-dollar
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$"));
    // honduransk lempira
    result.put("HNL", new CurrencyDataImpl("HNL", "HNL", 2));
    // kroatisk dinar
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130));
    // kroatisk kuna
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2));
    // haitisk gourde
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2));
    // ungersk forint
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 0));
    // indonesisk rupiah
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 0));
    // irländskt pund
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130));
    // israeliskt pund
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130));
    // israelisk gammal shekel
    result.put("ILR", new CurrencyDataImpl("ILR", "ILR", 130));
    // israelisk ny shekel
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪"));
    // indisk rupie
    result.put("INR", new CurrencyDataImpl("INR", "Rs", 2, "Rs"));
    // irakisk dinar
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0));
    // iransk rial
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0));
    // isländsk gammal krona
    result.put("ISJ", new CurrencyDataImpl("ISJ", "ISJ", 130));
    // isländsk krona
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr"));
    // italiensk lira
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128));
    // Jamaica-dollar
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$"));
    // jordansk dinar
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3));
    // japansk yen
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥"));
    // kenyansk shilling
    result.put("KES", new CurrencyDataImpl("KES", "KES", 2));
    // kirgizisk som
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2));
    // kambodjansk riel
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2));
    // komorisk franc
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0));
    // nordkoreansk won
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0));
    // sydkoreansk won
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩"));
    // kuwaitisk dinar
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3));
    // Cayman-dollar
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2));
    // kazakisk tenge
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2));
    // laotisk kip
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0));
    // libanesiskt pund
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0));
    // srilankesisk rupie
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs"));
    // Liberia-dollar
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2));
    // lesothisk loti
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2));
    // LSM
    result.put("LSM", new CurrencyDataImpl("LSM", "LSM", 130));
    // litauisk litas
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 2));
    // litauisk talonas
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130));
    // luxemburgsk franc (konvertibel)
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 2));
    // luxemburgsk franc
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128));
    // luxemburgsk franc (finansiell)
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 2));
    // lettisk lats
    result.put("LVL", new CurrencyDataImpl("LVL", "Ls", 2));
    // lettisk rubel
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130));
    // libysk dinar
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3));
    // marockansk dirham
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2));
    // marockansk franc
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130));
    // moldavisk leu
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2));
    // madagaskisk ariary
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0));
    // madagaskisk franc
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128));
    // makedonisk denar
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2));
    // malisk franc
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130));
    // myanmarisk kyat
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0));
    // mongolisk tugrik
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 0, "MN₮"));
    // Macao-pataca
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2));
    // mauretansk ouguiya
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 0));
    // maltesisk lire
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130));
    // maltesiskt pund
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130));
    // mauritisk rupie
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 0));
    // maldivisk rufiyaa
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2));
    // malawisk kwacha
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2));
    // mexikansk peso
    result.put("MXN", new CurrencyDataImpl("MXN", "Mex$", 2, "Mex$"));
    // mexikansk silverpeso (1861-1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130));
    // mexikansk unidad de inversion
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 2));
    // malaysisk ringgit
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM"));
    // moçambikisk escudo
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130));
    // gammal moçambikisk metical
    result.put("MZM", new CurrencyDataImpl("MZM", "MZM", 130));
    // moçambikisk metical
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2));
    // Namibia-dollar
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2));
    // nigeriansk naira
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2));
    // nicaraguansk córdoba
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130));
    // nicaraguansk córdoba oro
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2));
    // nederländsk gulden
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130));
    // norsk krona
    result.put("NOK", new CurrencyDataImpl("NOK", "NKr", 2, "NOkr"));
    // nepalesisk rupie
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2));
    // nyzeeländsk dollar
    result.put("NZD", new CurrencyDataImpl("NZD", "NZD", 2));
    // omansk rial
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3));
    // panamansk balboa
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/."));
    // peruansk inti
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130));
    // peruansk sol nuevo
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/."));
    // PES
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130));
    // papuansk kina
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2));
    // filippinsk peso
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP"));
    // pakistansk rupie
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 0, "PKRs."));
    // polsk zloty
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2));
    // polsk zloty (1950-1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130));
    // portugisisk escudo
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130));
    // paraguaysk guarani
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0));
    // qatarisk rial
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2));
    // rhodesisk dollar
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130));
    // gammal rumänsk leu
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130));
    // rumänsk leu
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2));
    // serbisk dinar
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0));
    // rysk rubel
    result.put("RUB", new CurrencyDataImpl("RUB", "руб", 2, "руб"));
    // rysk rubel (1991-1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130));
    // rwandisk franc
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0));
    // saudisk riyal
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR"));
    // Salomon-dollar
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2));
    // seychellisk rupie
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2));
    // sudanesisk dinar
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130));
    // sudanesiskt pund
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2));
    // sudanskt pund (1916-1992)
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130));
    // svensk krona
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr"));
    // Singapore-dollar
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$"));
    // S:t Helena-pund
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2));
    // slovensk tolar
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130));
    // slovakisk koruna
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130));
    // sierraleonsk leone
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0));
    // somalisk shilling
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0));
    // Surinam-dollar
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2));
    // surinamesisk gulden
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130));
    // São Tomé och Príncipe-dobra
    result.put("STD", new CurrencyDataImpl("STD", "STD", 0));
    // sovjetisk rubel
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130));
    // salvadoransk colón
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130));
    // syriskt pund
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0));
    // swaziländsk lilangeni
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2));
    // thailändsk baht
    result.put("THB", new CurrencyDataImpl("THB", "฿", 2, "THB"));
    // tadzjikisk rubel
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130));
    // tadzjikisk somoni
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2));
    // turkmensk manat
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128));
    // tunisisk dinar
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3));
    // tongansk paʻanga
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2));
    // timoriansk escudo
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130));
    // turkisk lire (-2004)
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128));
    // ny turkisk lira
    result.put("TRY", new CurrencyDataImpl("TRY", "YTL", 2, "YTL"));
    // Trinidad ochTobago-dollar
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2));
    // taiwanesisk ny dollar
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$"));
    // tanzanisk shilling
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 0));
    // ukrainsk hryvnia
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2));
    // ukrainsk karbovanetz
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130));
    // ugandisk shilling (1966-1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130));
    // ugandisk shilling
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0));
    // US-dollar
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$"));
    // US-dollar (nästa dag)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 2));
    // US-dollar (samma dag)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 2));
    // uruguayansk peso en unidades indexadas
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 2));
    // uruguayansk peso (1975-1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130));
    // uruguayansk peso
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$"));
    // uzbekisk sum
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 0));
    // venezuelansk bolivar
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130));
    // venezuelansk bolivar fuerte
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 2));
    // vietnamesisk dong
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫"));
    // vanuatisk vatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0));
    // västsamoansk tala
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2));
    // CFA Franc BEAC
    result.put("XAF", new CurrencyDataImpl("XAF", "XAF", 0));
    // uns silver
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 2));
    // guld
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 2));
    // europeisk kompositenhet
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 2));
    // europeisk monetär enhet
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 2));
    // europeisk kontoenhet (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 2));
    // europeisk kontoenhet (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 2));
    // östkaribisk dollar
    result.put("XCD", new CurrencyDataImpl("XCD", "XCD", 2));
    // IMF särskild dragningsrätt
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 2));
    // europeisk valutaenhet
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 2));
    // fransk guldfranc
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 2));
    // internationella järnvägsunionens franc
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 2));
    // CFA Franc BCEAO
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0));
    // uns palladium
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 2));
    // CFP-franc
    result.put("XPF", new CurrencyDataImpl("XPF", "XPF", 0));
    // platina
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 2));
    // RINET-fond
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 2));
    // test-valutakod
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 2));
    // (okänd valuta)
    result.put("XXX", new CurrencyDataImpl("XXX", "XXX", 2));
    // jemenitisk dinar
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130));
    // jemenitisk rial
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER"));
    // jugoslavisk hård dinar
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130));
    // jugoslavisk ny dinar
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130));
    // jugoslavisk dinar (konvertibel)
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130));
    // sydafrikansk rand (finansiell)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 2));
    // sydafrikansk rand
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR"));
    // zambisk kwacha
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 0));
    // zaïrisk ny zaïre
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130));
    // zairisk zaire
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130));
    // Zimbabwe-dollar
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
      // Förenade Arabemiratens dirham
      "AED": [ "AED", "DH", 2, "DH"],
      // afghani (1927-2002)
      "AFA": [ "AFA", "AFA", 130],
      // afghani
      "AFN": [ "AFN", "AFN", 0],
      // albansk lek (-1992)
      "ALK": [ "ALK", "ALK", 130],
      // albansk lek
      "ALL": [ "ALL", "ALL", 0],
      // armenisk dram
      "AMD": [ "AMD", "AMD", 0],
      // Nederländska Antillernas gulden
      "ANG": [ "ANG", "NAf.", 2],
      // angolansk kwanza
      "AOA": [ "AOA", "AOA", 2],
      // angolansk kwanza (1977-1990)
      "AOK": [ "AOK", "AOK", 130],
      // angolansk ny kwanza (1990-2000)
      "AON": [ "AON", "AON", 130],
      // angolansk kwanza reajustado (1995-1999)
      "AOR": [ "AOR", "AOR", 130],
      // argentinsk austral
      "ARA": [ "ARA", "ARA", 130],
      // ARL
      "ARL": [ "ARL", "ARL", 130],
      // ARM
      "ARM": [ "ARM", "ARM", 130],
      // argentinsk peso (1983-1985)
      "ARP": [ "ARP", "ARP", 130],
      // argentinsk peso
      "ARS": [ "ARS", "AR$", 2, "AR$"],
      // österrikisk schilling
      "ATS": [ "ATS", "ATS", 130],
      // australisk dollar
      "AUD": [ "AUD", "AU$", 2, "AU$"],
      // Aruba-gulden
      "AWG": [ "AWG", "AWG", 2],
      // azerbajdzjansk manat (1993-2006)
      "AZM": [ "AZM", "AZM", 130],
      // azerbajdzjansk manat
      "AZN": [ "AZN", "AZN", 2],
      // bosnisk-hercegovinsk dinar
      "BAD": [ "BAD", "BAD", 130],
      // bosnisk-hercegovinsk mark (konvertibel)
      "BAM": [ "BAM", "BAM", 2],
      // Barbados-dollar
      "BBD": [ "BBD", "Bds$", 2],
      // bangladeshisk taka
      "BDT": [ "BDT", "Tk", 2, "Tk"],
      // belgisk franc (konvertibel)
      "BEC": [ "BEC", "BEC", 2],
      // belgisk franc
      "BEF": [ "BEF", "BEF", 130],
      // belgisk franc (finansiell)
      "BEL": [ "BEL", "BEL", 2],
      // bulgarisk lev (1962–1999)
      "BGL": [ "BGL", "BGL", 130],
      // bulgarisk lev (1952–1962)
      "BGM": [ "BGM", "BGM", 130],
      // bulgarisk ny lev
      "BGN": [ "BGN", "BGN", 2],
      // Bahrain-dinar
      "BHD": [ "BHD", "BHD", 3],
      // burundisk franc
      "BIF": [ "BIF", "BIF", 0],
      // Bermuda-dollar
      "BMD": [ "BMD", "BMD", 2],
      // Brunei-dollar
      "BND": [ "BND", "BND", 2],
      // boliviano
      "BOB": [ "BOB", "BOB", 2],
      // boliviansk peso
      "BOP": [ "BOP", "BOP", 130],
      // boliviansk mvdol
      "BOV": [ "BOV", "BOV", 2],
      // brasiliansk cruzeiro (1967-1986)
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
      // Bahamas-dollar
      "BSD": [ "BSD", "BSD", 2],
      // bhutanesisk ngultrum
      "BTN": [ "BTN", "BTN", 2],
      // burmesisk kyat
      "BUK": [ "BUK", "BUK", 130],
      // botswansk pula
      "BWP": [ "BWP", "BWP", 2],
      // vitrysk ny rubel (1994-1999)
      "BYB": [ "BYB", "BYB", 130],
      // vitrysk rubel
      "BYR": [ "BYR", "BYR", 0],
      // belizisk dollar
      "BZD": [ "BZD", "BZD", 2],
      // kanadensisk dollar
      "CAD": [ "CAD", "C$", 2, "C$"],
      // kongolesisk franc
      "CDF": [ "CDF", "CDF", 2],
      // euro (konvertibelt konto, WIR Bank, Schweiz)
      "CHE": [ "CHE", "CHE", 2],
      // schweizisk franc
      "CHF": [ "CHF", "CHF", 2, "CHF"],
      // schweizisk franc (konvertibelt konto, WIR Bank)
      "CHW": [ "CHW", "CHW", 2],
      // CLE
      "CLE": [ "CLE", "CLE", 130],
      // chilensk unidad de fomento
      "CLF": [ "CLF", "CLF", 0],
      // chilensk peso
      "CLP": [ "CLP", "CL$", 0, "CL$"],
      // kinesisk dollar
      "CNX": [ "CNX", "CNX", 2],
      // kinesisk yuan renminbi
      "CNY": [ "CNY", "RMB¥", 2, "RMB¥"],
      // colombiansk peso
      "COP": [ "COP", "COL$", 0, "COL$"],
      // colombiansk unidad de valor real
      "COU": [ "COU", "COU", 2],
      // costarikansk colón
      "CRC": [ "CRC", "CR₡", 0, "CR₡"],
      // jugoslavisk dinar
      "CSD": [ "CSD", "CSD", 130],
      // tjeckoslovakisk koruna
      "CSK": [ "CSK", "CSK", 130],
      // CUC
      "CUC": [ "CUC", "CUC", 2],
      // kubansk peso
      "CUP": [ "CUP", "$MN", 2, "$MN"],
      // kapverdisk escudo
      "CVE": [ "CVE", "CVE", 2],
      // cypriotiskt pund
      "CYP": [ "CYP", "CYP", 130],
      // tjeckisk koruna
      "CZK": [ "CZK", "Kč", 2, "Kč"],
      // östtysk mark
      "DDM": [ "DDM", "DDM", 130],
      // tysk mark
      "DEM": [ "DEM", "DM", 130],
      // djiboutisk franc
      "DJF": [ "DJF", "DJF", 0],
      // dansk krona
      "DKK": [ "DKK", "kr", 2, "kr"],
      // dominikansk peso
      "DOP": [ "DOP", "RD$", 2, "RD$"],
      // algerisk dinar
      "DZD": [ "DZD", "DZD", 2],
      // ecuadoriansk sucre
      "ECS": [ "ECS", "ECS", 130],
      // ecuadoriansk unidad de valor constante
      "ECV": [ "ECV", "ECV", 2],
      // estnisk krona
      "EEK": [ "EEK", "Ekr", 2],
      // egyptiskt pund
      "EGP": [ "EGP", "LE", 2, "LE"],
      // EQE
      "EQE": [ "EQE", "EQE", 130],
      // eritreansk nakfa
      "ERN": [ "ERN", "ERN", 2],
      // spansk peseta (konto)
      "ESA": [ "ESA", "ESA", 2],
      // spansk peseta (konvertibelt konto)
      "ESB": [ "ESB", "ESB", 2],
      // spansk peseta
      "ESP": [ "ESP", "ESP", 128],
      // etiopisk birr
      "ETB": [ "ETB", "ETB", 2],
      // euro
      "EUR": [ "EUR", "€", 2, "€"],
      // finsk mark
      "FIM": [ "FIM", "FIM", 130],
      // Fiji-dollar
      "FJD": [ "FJD", "FJD", 2],
      // Falklandsöarnas pund
      "FKP": [ "FKP", "FKP", 2],
      // fransk franc
      "FRF": [ "FRF", "FRF", 130],
      // brittiskt pund sterling
      "GBP": [ "GBP", "£", 2, "GB£"],
      // georgisk kupon larit
      "GEK": [ "GEK", "GEK", 130],
      // georgisk lari
      "GEL": [ "GEL", "GEL", 2],
      // ghanansk cedi (1979-2007)
      "GHC": [ "GHC", "GHC", 130],
      // ghanansk cedi
      "GHS": [ "GHS", "GHS", 2],
      // gibraltiskt pund
      "GIP": [ "GIP", "GIP", 2],
      // gambisk dalasi
      "GMD": [ "GMD", "GMD", 2],
      // guineansk franc
      "GNF": [ "GNF", "GNF", 0],
      // guineansk syli
      "GNS": [ "GNS", "GNS", 130],
      // ekvatorialguineansk ekwele
      "GQE": [ "GQE", "GQE", 130],
      // grekisk drachma
      "GRD": [ "GRD", "GRD", 130],
      // guatemalansk quetzal
      "GTQ": [ "GTQ", "GTQ", 2],
      // Portugisiska Guinea-escudo
      "GWE": [ "GWE", "GWE", 130],
      // Guinea-Bissau-peso
      "GWP": [ "GWP", "GWP", 2],
      // Guyana-dollar
      "GYD": [ "GYD", "GYD", 0],
      // Hongkong-dollar
      "HKD": [ "HKD", "HK$", 2, "HK$"],
      // honduransk lempira
      "HNL": [ "HNL", "HNL", 2],
      // kroatisk dinar
      "HRD": [ "HRD", "HRD", 130],
      // kroatisk kuna
      "HRK": [ "HRK", "HRK", 2],
      // haitisk gourde
      "HTG": [ "HTG", "HTG", 2],
      // ungersk forint
      "HUF": [ "HUF", "HUF", 0],
      // indonesisk rupiah
      "IDR": [ "IDR", "IDR", 0],
      // irländskt pund
      "IEP": [ "IEP", "IEP", 130],
      // israeliskt pund
      "ILP": [ "ILP", "ILP", 130],
      // israelisk gammal shekel
      "ILR": [ "ILR", "ILR", 130],
      // israelisk ny shekel
      "ILS": [ "ILS", "₪", 2, "IL₪"],
      // indisk rupie
      "INR": [ "INR", "Rs", 2, "Rs"],
      // irakisk dinar
      "IQD": [ "IQD", "IQD", 0],
      // iransk rial
      "IRR": [ "IRR", "IRR", 0],
      // isländsk gammal krona
      "ISJ": [ "ISJ", "ISJ", 130],
      // isländsk krona
      "ISK": [ "ISK", "kr", 0, "kr"],
      // italiensk lira
      "ITL": [ "ITL", "ITL", 128],
      // Jamaica-dollar
      "JMD": [ "JMD", "JA$", 2, "JA$"],
      // jordansk dinar
      "JOD": [ "JOD", "JOD", 3],
      // japansk yen
      "JPY": [ "JPY", "JP¥", 0, "JP¥"],
      // kenyansk shilling
      "KES": [ "KES", "KES", 2],
      // kirgizisk som
      "KGS": [ "KGS", "KGS", 2],
      // kambodjansk riel
      "KHR": [ "KHR", "KHR", 2],
      // komorisk franc
      "KMF": [ "KMF", "KMF", 0],
      // nordkoreansk won
      "KPW": [ "KPW", "KPW", 0],
      // sydkoreansk won
      "KRW": [ "KRW", "₩", 0, "KR₩"],
      // kuwaitisk dinar
      "KWD": [ "KWD", "KWD", 3],
      // Cayman-dollar
      "KYD": [ "KYD", "KYD", 2],
      // kazakisk tenge
      "KZT": [ "KZT", "KZT", 2],
      // laotisk kip
      "LAK": [ "LAK", "LAK", 0],
      // libanesiskt pund
      "LBP": [ "LBP", "LBP", 0],
      // srilankesisk rupie
      "LKR": [ "LKR", "SLRs", 2, "SLRs"],
      // Liberia-dollar
      "LRD": [ "LRD", "LRD", 2],
      // lesothisk loti
      "LSL": [ "LSL", "LSL", 2],
      // LSM
      "LSM": [ "LSM", "LSM", 130],
      // litauisk litas
      "LTL": [ "LTL", "LTL", 2],
      // litauisk talonas
      "LTT": [ "LTT", "LTT", 130],
      // luxemburgsk franc (konvertibel)
      "LUC": [ "LUC", "LUC", 2],
      // luxemburgsk franc
      "LUF": [ "LUF", "LUF", 128],
      // luxemburgsk franc (finansiell)
      "LUL": [ "LUL", "LUL", 2],
      // lettisk lats
      "LVL": [ "LVL", "Ls", 2],
      // lettisk rubel
      "LVR": [ "LVR", "LVR", 130],
      // libysk dinar
      "LYD": [ "LYD", "LYD", 3],
      // marockansk dirham
      "MAD": [ "MAD", "MAD", 2],
      // marockansk franc
      "MAF": [ "MAF", "MAF", 130],
      // moldavisk leu
      "MDL": [ "MDL", "MDL", 2],
      // madagaskisk ariary
      "MGA": [ "MGA", "MGA", 0],
      // madagaskisk franc
      "MGF": [ "MGF", "MGF", 128],
      // makedonisk denar
      "MKD": [ "MKD", "MKD", 2],
      // malisk franc
      "MLF": [ "MLF", "MLF", 130],
      // myanmarisk kyat
      "MMK": [ "MMK", "MMK", 0],
      // mongolisk tugrik
      "MNT": [ "MNT", "MN₮", 0, "MN₮"],
      // Macao-pataca
      "MOP": [ "MOP", "MOP", 2],
      // mauretansk ouguiya
      "MRO": [ "MRO", "MRO", 0],
      // maltesisk lire
      "MTL": [ "MTL", "MTL", 130],
      // maltesiskt pund
      "MTP": [ "MTP", "MTP", 130],
      // mauritisk rupie
      "MUR": [ "MUR", "MUR", 0],
      // maldivisk rufiyaa
      "MVR": [ "MVR", "MVR", 2],
      // malawisk kwacha
      "MWK": [ "MWK", "MWK", 2],
      // mexikansk peso
      "MXN": [ "MXN", "Mex$", 2, "Mex$"],
      // mexikansk silverpeso (1861-1992)
      "MXP": [ "MXP", "MXP", 130],
      // mexikansk unidad de inversion
      "MXV": [ "MXV", "MXV", 2],
      // malaysisk ringgit
      "MYR": [ "MYR", "RM", 2, "RM"],
      // moçambikisk escudo
      "MZE": [ "MZE", "MZE", 130],
      // gammal moçambikisk metical
      "MZM": [ "MZM", "MZM", 130],
      // moçambikisk metical
      "MZN": [ "MZN", "MZN", 2],
      // Namibia-dollar
      "NAD": [ "NAD", "NAD", 2],
      // nigeriansk naira
      "NGN": [ "NGN", "NGN", 2],
      // nicaraguansk córdoba
      "NIC": [ "NIC", "NIC", 130],
      // nicaraguansk córdoba oro
      "NIO": [ "NIO", "NIO", 2],
      // nederländsk gulden
      "NLG": [ "NLG", "NLG", 130],
      // norsk krona
      "NOK": [ "NOK", "NKr", 2, "NOkr"],
      // nepalesisk rupie
      "NPR": [ "NPR", "NPR", 2],
      // nyzeeländsk dollar
      "NZD": [ "NZD", "NZD", 2],
      // omansk rial
      "OMR": [ "OMR", "OMR", 3],
      // panamansk balboa
      "PAB": [ "PAB", "B/.", 2, "B/."],
      // peruansk inti
      "PEI": [ "PEI", "PEI", 130],
      // peruansk sol nuevo
      "PEN": [ "PEN", "S/.", 2, "S/."],
      // PES
      "PES": [ "PES", "PES", 130],
      // papuansk kina
      "PGK": [ "PGK", "PGK", 2],
      // filippinsk peso
      "PHP": [ "PHP", "PHP", 2, "PHP"],
      // pakistansk rupie
      "PKR": [ "PKR", "PKRs.", 0, "PKRs."],
      // polsk zloty
      "PLN": [ "PLN", "PLN", 2],
      // polsk zloty (1950-1995)
      "PLZ": [ "PLZ", "PLZ", 130],
      // portugisisk escudo
      "PTE": [ "PTE", "PTE", 130],
      // paraguaysk guarani
      "PYG": [ "PYG", "PYG", 0],
      // qatarisk rial
      "QAR": [ "QAR", "QAR", 2],
      // rhodesisk dollar
      "RHD": [ "RHD", "RHD", 130],
      // gammal rumänsk leu
      "ROL": [ "ROL", "ROL", 130],
      // rumänsk leu
      "RON": [ "RON", "RON", 2],
      // serbisk dinar
      "RSD": [ "RSD", "RSD", 0],
      // rysk rubel
      "RUB": [ "RUB", "руб", 2, "руб"],
      // rysk rubel (1991-1998)
      "RUR": [ "RUR", "RUR", 130],
      // rwandisk franc
      "RWF": [ "RWF", "RWF", 0],
      // saudisk riyal
      "SAR": [ "SAR", "SR", 2, "SR"],
      // Salomon-dollar
      "SBD": [ "SBD", "SBD", 2],
      // seychellisk rupie
      "SCR": [ "SCR", "SCR", 2],
      // sudanesisk dinar
      "SDD": [ "SDD", "SDD", 130],
      // sudanesiskt pund
      "SDG": [ "SDG", "SDG", 2],
      // sudanskt pund (1916-1992)
      "SDP": [ "SDP", "SDP", 130],
      // svensk krona
      "SEK": [ "SEK", "kr", 2, "kr"],
      // Singapore-dollar
      "SGD": [ "SGD", "S$", 2, "S$"],
      // S:t Helena-pund
      "SHP": [ "SHP", "SHP", 2],
      // slovensk tolar
      "SIT": [ "SIT", "SIT", 130],
      // slovakisk koruna
      "SKK": [ "SKK", "SKK", 130],
      // sierraleonsk leone
      "SLL": [ "SLL", "SLL", 0],
      // somalisk shilling
      "SOS": [ "SOS", "SOS", 0],
      // Surinam-dollar
      "SRD": [ "SRD", "SRD", 2],
      // surinamesisk gulden
      "SRG": [ "SRG", "SRG", 130],
      // São Tomé och Príncipe-dobra
      "STD": [ "STD", "STD", 0],
      // sovjetisk rubel
      "SUR": [ "SUR", "SUR", 130],
      // salvadoransk colón
      "SVC": [ "SVC", "SVC", 130],
      // syriskt pund
      "SYP": [ "SYP", "SYP", 0],
      // swaziländsk lilangeni
      "SZL": [ "SZL", "SZL", 2],
      // thailändsk baht
      "THB": [ "THB", "฿", 2, "THB"],
      // tadzjikisk rubel
      "TJR": [ "TJR", "TJR", 130],
      // tadzjikisk somoni
      "TJS": [ "TJS", "TJS", 2],
      // turkmensk manat
      "TMM": [ "TMM", "TMM", 128],
      // tunisisk dinar
      "TND": [ "TND", "TND", 3],
      // tongansk paʻanga
      "TOP": [ "TOP", "TOP", 2],
      // timoriansk escudo
      "TPE": [ "TPE", "TPE", 130],
      // turkisk lire (-2004)
      "TRL": [ "TRL", "TRL", 128],
      // ny turkisk lira
      "TRY": [ "TRY", "YTL", 2, "YTL"],
      // Trinidad ochTobago-dollar
      "TTD": [ "TTD", "TTD", 2],
      // taiwanesisk ny dollar
      "TWD": [ "TWD", "NT$", 2, "NT$"],
      // tanzanisk shilling
      "TZS": [ "TZS", "TZS", 0],
      // ukrainsk hryvnia
      "UAH": [ "UAH", "UAH", 2],
      // ukrainsk karbovanetz
      "UAK": [ "UAK", "UAK", 130],
      // ugandisk shilling (1966-1987)
      "UGS": [ "UGS", "UGS", 130],
      // ugandisk shilling
      "UGX": [ "UGX", "UGX", 0],
      // US-dollar
      "USD": [ "USD", "US$", 2, "US$"],
      // US-dollar (nästa dag)
      "USN": [ "USN", "USN", 2],
      // US-dollar (samma dag)
      "USS": [ "USS", "USS", 2],
      // uruguayansk peso en unidades indexadas
      "UYI": [ "UYI", "UYI", 2],
      // uruguayansk peso (1975-1993)
      "UYP": [ "UYP", "UYP", 130],
      // uruguayansk peso
      "UYU": [ "UYU", "UY$", 2, "UY$"],
      // uzbekisk sum
      "UZS": [ "UZS", "UZS", 0],
      // venezuelansk bolivar
      "VEB": [ "VEB", "VEB", 130],
      // venezuelansk bolivar fuerte
      "VEF": [ "VEF", "VEF", 2],
      // vietnamesisk dong
      "VND": [ "VND", "₫", 24, "₫"],
      // vanuatisk vatu
      "VUV": [ "VUV", "VUV", 0],
      // västsamoansk tala
      "WST": [ "WST", "WST", 2],
      // CFA Franc BEAC
      "XAF": [ "XAF", "XAF", 0],
      // uns silver
      "XAG": [ "XAG", "XAG", 2],
      // guld
      "XAU": [ "XAU", "XAU", 2],
      // europeisk kompositenhet
      "XBA": [ "XBA", "XBA", 2],
      // europeisk monetär enhet
      "XBB": [ "XBB", "XBB", 2],
      // europeisk kontoenhet (XBC)
      "XBC": [ "XBC", "XBC", 2],
      // europeisk kontoenhet (XBD)
      "XBD": [ "XBD", "XBD", 2],
      // östkaribisk dollar
      "XCD": [ "XCD", "XCD", 2],
      // IMF särskild dragningsrätt
      "XDR": [ "XDR", "XDR", 2],
      // europeisk valutaenhet
      "XEU": [ "XEU", "XEU", 2],
      // fransk guldfranc
      "XFO": [ "XFO", "XFO", 2],
      // internationella järnvägsunionens franc
      "XFU": [ "XFU", "XFU", 2],
      // CFA Franc BCEAO
      "XOF": [ "XOF", "CFA", 0],
      // uns palladium
      "XPD": [ "XPD", "XPD", 2],
      // CFP-franc
      "XPF": [ "XPF", "XPF", 0],
      // platina
      "XPT": [ "XPT", "XPT", 2],
      // RINET-fond
      "XRE": [ "XRE", "XRE", 2],
      // test-valutakod
      "XTS": [ "XTS", "XTS", 2],
      // (okänd valuta)
      "XXX": [ "XXX", "XXX", 2],
      // jemenitisk dinar
      "YDD": [ "YDD", "YDD", 130],
      // jemenitisk rial
      "YER": [ "YER", "YER", 0, "YER"],
      // jugoslavisk hård dinar
      "YUD": [ "YUD", "YUD", 130],
      // jugoslavisk ny dinar
      "YUM": [ "YUM", "YUM", 130],
      // jugoslavisk dinar (konvertibel)
      "YUN": [ "YUN", "YUN", 130],
      // sydafrikansk rand (finansiell)
      "ZAL": [ "ZAL", "ZAL", 2],
      // sydafrikansk rand
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR"],
      // zambisk kwacha
      "ZMK": [ "ZMK", "ZMK", 0],
      // zaïrisk ny zaïre
      "ZRN": [ "ZRN", "ZRN", 130],
      // zairisk zaire
      "ZRZ": [ "ZRZ", "ZRZ", 130],
      // Zimbabwe-dollar
      "ZWD": [ "ZWD", "Z$", 128],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "andorransk peseta");
    result.put("AED", "Förenade Arabemiratens dirham");
    result.put("AFA", "afghani (1927-2002)");
    result.put("AFN", "afghani");
    result.put("ALK", "albansk lek (-1992)");
    result.put("ALL", "albansk lek");
    result.put("AMD", "armenisk dram");
    result.put("ANG", "Nederländska Antillernas gulden");
    result.put("AOA", "angolansk kwanza");
    result.put("AOK", "angolansk kwanza (1977-1990)");
    result.put("AON", "angolansk ny kwanza (1990-2000)");
    result.put("AOR", "angolansk kwanza reajustado (1995-1999)");
    result.put("ARA", "argentinsk austral");
    result.put("ARP", "argentinsk peso (1983-1985)");
    result.put("ARS", "argentinsk peso");
    result.put("ATS", "österrikisk schilling");
    result.put("AUD", "australisk dollar");
    result.put("AWG", "Aruba-gulden");
    result.put("AZM", "azerbajdzjansk manat (1993-2006)");
    result.put("AZN", "azerbajdzjansk manat");
    result.put("BAD", "bosnisk-hercegovinsk dinar");
    result.put("BAM", "bosnisk-hercegovinsk mark (konvertibel)");
    result.put("BBD", "Barbados-dollar");
    result.put("BDT", "bangladeshisk taka");
    result.put("BEC", "belgisk franc (konvertibel)");
    result.put("BEF", "belgisk franc");
    result.put("BEL", "belgisk franc (finansiell)");
    result.put("BGL", "bulgarisk lev (1962–1999)");
    result.put("BGM", "bulgarisk lev (1952–1962)");
    result.put("BGN", "bulgarisk ny lev");
    result.put("BHD", "Bahrain-dinar");
    result.put("BIF", "burundisk franc");
    result.put("BMD", "Bermuda-dollar");
    result.put("BND", "Brunei-dollar");
    result.put("BOB", "boliviano");
    result.put("BOP", "boliviansk peso");
    result.put("BOV", "boliviansk mvdol");
    result.put("BRB", "brasiliansk cruzeiro (1967-1986)");
    result.put("BRC", "brasiliansk cruzado");
    result.put("BRE", "brasiliansk cruzeiro (1990-1993)");
    result.put("BRL", "brasiliansk real");
    result.put("BRN", "brasiliansk cruzado novo");
    result.put("BRR", "brasiliansk cruzeiro");
    result.put("BSD", "Bahamas-dollar");
    result.put("BTN", "bhutanesisk ngultrum");
    result.put("BUK", "burmesisk kyat");
    result.put("BWP", "botswansk pula");
    result.put("BYB", "vitrysk ny rubel (1994-1999)");
    result.put("BYR", "vitrysk rubel");
    result.put("BZD", "belizisk dollar");
    result.put("CAD", "kanadensisk dollar");
    result.put("CDF", "kongolesisk franc");
    result.put("CHE", "euro (konvertibelt konto, WIR Bank, Schweiz)");
    result.put("CHF", "schweizisk franc");
    result.put("CHW", "schweizisk franc (konvertibelt konto, WIR Bank)");
    result.put("CLF", "chilensk unidad de fomento");
    result.put("CLP", "chilensk peso");
    result.put("CNX", "kinesisk dollar");
    result.put("CNY", "kinesisk yuan renminbi");
    result.put("COP", "colombiansk peso");
    result.put("COU", "colombiansk unidad de valor real");
    result.put("CRC", "costarikansk colón");
    result.put("CSD", "jugoslavisk dinar");
    result.put("CSK", "tjeckoslovakisk koruna");
    result.put("CUP", "kubansk peso");
    result.put("CVE", "kapverdisk escudo");
    result.put("CYP", "cypriotiskt pund");
    result.put("CZK", "tjeckisk koruna");
    result.put("DDM", "östtysk mark");
    result.put("DEM", "tysk mark");
    result.put("DJF", "djiboutisk franc");
    result.put("DKK", "dansk krona");
    result.put("DOP", "dominikansk peso");
    result.put("DZD", "algerisk dinar");
    result.put("ECS", "ecuadoriansk sucre");
    result.put("ECV", "ecuadoriansk unidad de valor constante");
    result.put("EEK", "estnisk krona");
    result.put("EGP", "egyptiskt pund");
    result.put("ERN", "eritreansk nakfa");
    result.put("ESA", "spansk peseta (konto)");
    result.put("ESB", "spansk peseta (konvertibelt konto)");
    result.put("ESP", "spansk peseta");
    result.put("ETB", "etiopisk birr");
    result.put("EUR", "euro");
    result.put("FIM", "finsk mark");
    result.put("FJD", "Fiji-dollar");
    result.put("FKP", "Falklandsöarnas pund");
    result.put("FRF", "fransk franc");
    result.put("GBP", "brittiskt pund sterling");
    result.put("GEK", "georgisk kupon larit");
    result.put("GEL", "georgisk lari");
    result.put("GHC", "ghanansk cedi (1979-2007)");
    result.put("GHS", "ghanansk cedi");
    result.put("GIP", "gibraltiskt pund");
    result.put("GMD", "gambisk dalasi");
    result.put("GNF", "guineansk franc");
    result.put("GNS", "guineansk syli");
    result.put("GQE", "ekvatorialguineansk ekwele");
    result.put("GRD", "grekisk drachma");
    result.put("GTQ", "guatemalansk quetzal");
    result.put("GWE", "Portugisiska Guinea-escudo");
    result.put("GWP", "Guinea-Bissau-peso");
    result.put("GYD", "Guyana-dollar");
    result.put("HKD", "Hongkong-dollar");
    result.put("HNL", "honduransk lempira");
    result.put("HRD", "kroatisk dinar");
    result.put("HRK", "kroatisk kuna");
    result.put("HTG", "haitisk gourde");
    result.put("HUF", "ungersk forint");
    result.put("IDR", "indonesisk rupiah");
    result.put("IEP", "irländskt pund");
    result.put("ILP", "israeliskt pund");
    result.put("ILR", "israelisk gammal shekel");
    result.put("ILS", "israelisk ny shekel");
    result.put("INR", "indisk rupie");
    result.put("IQD", "irakisk dinar");
    result.put("IRR", "iransk rial");
    result.put("ISJ", "isländsk gammal krona");
    result.put("ISK", "isländsk krona");
    result.put("ITL", "italiensk lira");
    result.put("JMD", "Jamaica-dollar");
    result.put("JOD", "jordansk dinar");
    result.put("JPY", "japansk yen");
    result.put("KES", "kenyansk shilling");
    result.put("KGS", "kirgizisk som");
    result.put("KHR", "kambodjansk riel");
    result.put("KMF", "komorisk franc");
    result.put("KPW", "nordkoreansk won");
    result.put("KRW", "sydkoreansk won");
    result.put("KWD", "kuwaitisk dinar");
    result.put("KYD", "Cayman-dollar");
    result.put("KZT", "kazakisk tenge");
    result.put("LAK", "laotisk kip");
    result.put("LBP", "libanesiskt pund");
    result.put("LKR", "srilankesisk rupie");
    result.put("LRD", "Liberia-dollar");
    result.put("LSL", "lesothisk loti");
    result.put("LTL", "litauisk litas");
    result.put("LTT", "litauisk talonas");
    result.put("LUC", "luxemburgsk franc (konvertibel)");
    result.put("LUF", "luxemburgsk franc");
    result.put("LUL", "luxemburgsk franc (finansiell)");
    result.put("LVL", "lettisk lats");
    result.put("LVR", "lettisk rubel");
    result.put("LYD", "libysk dinar");
    result.put("MAD", "marockansk dirham");
    result.put("MAF", "marockansk franc");
    result.put("MDL", "moldavisk leu");
    result.put("MGA", "madagaskisk ariary");
    result.put("MGF", "madagaskisk franc");
    result.put("MKD", "makedonisk denar");
    result.put("MLF", "malisk franc");
    result.put("MMK", "myanmarisk kyat");
    result.put("MNT", "mongolisk tugrik");
    result.put("MOP", "Macao-pataca");
    result.put("MRO", "mauretansk ouguiya");
    result.put("MTL", "maltesisk lire");
    result.put("MTP", "maltesiskt pund");
    result.put("MUR", "mauritisk rupie");
    result.put("MVR", "maldivisk rufiyaa");
    result.put("MWK", "malawisk kwacha");
    result.put("MXN", "mexikansk peso");
    result.put("MXP", "mexikansk silverpeso (1861-1992)");
    result.put("MXV", "mexikansk unidad de inversion");
    result.put("MYR", "malaysisk ringgit");
    result.put("MZE", "moçambikisk escudo");
    result.put("MZM", "gammal moçambikisk metical");
    result.put("MZN", "moçambikisk metical");
    result.put("NAD", "Namibia-dollar");
    result.put("NGN", "nigeriansk naira");
    result.put("NIC", "nicaraguansk córdoba");
    result.put("NIO", "nicaraguansk córdoba oro");
    result.put("NLG", "nederländsk gulden");
    result.put("NOK", "norsk krona");
    result.put("NPR", "nepalesisk rupie");
    result.put("NZD", "nyzeeländsk dollar");
    result.put("OMR", "omansk rial");
    result.put("PAB", "panamansk balboa");
    result.put("PEI", "peruansk inti");
    result.put("PEN", "peruansk sol nuevo");
    result.put("PGK", "papuansk kina");
    result.put("PHP", "filippinsk peso");
    result.put("PKR", "pakistansk rupie");
    result.put("PLN", "polsk zloty");
    result.put("PLZ", "polsk zloty (1950-1995)");
    result.put("PTE", "portugisisk escudo");
    result.put("PYG", "paraguaysk guarani");
    result.put("QAR", "qatarisk rial");
    result.put("RHD", "rhodesisk dollar");
    result.put("ROL", "gammal rumänsk leu");
    result.put("RON", "rumänsk leu");
    result.put("RSD", "serbisk dinar");
    result.put("RUB", "rysk rubel");
    result.put("RUR", "rysk rubel (1991-1998)");
    result.put("RWF", "rwandisk franc");
    result.put("SAR", "saudisk riyal");
    result.put("SBD", "Salomon-dollar");
    result.put("SCR", "seychellisk rupie");
    result.put("SDD", "sudanesisk dinar");
    result.put("SDG", "sudanesiskt pund");
    result.put("SDP", "sudanskt pund (1916-1992)");
    result.put("SEK", "svensk krona");
    result.put("SGD", "Singapore-dollar");
    result.put("SHP", "S:t Helena-pund");
    result.put("SIT", "slovensk tolar");
    result.put("SKK", "slovakisk koruna");
    result.put("SLL", "sierraleonsk leone");
    result.put("SOS", "somalisk shilling");
    result.put("SRD", "Surinam-dollar");
    result.put("SRG", "surinamesisk gulden");
    result.put("STD", "São Tomé och Príncipe-dobra");
    result.put("SUR", "sovjetisk rubel");
    result.put("SVC", "salvadoransk colón");
    result.put("SYP", "syriskt pund");
    result.put("SZL", "swaziländsk lilangeni");
    result.put("THB", "thailändsk baht");
    result.put("TJR", "tadzjikisk rubel");
    result.put("TJS", "tadzjikisk somoni");
    result.put("TMM", "turkmensk manat");
    result.put("TND", "tunisisk dinar");
    result.put("TOP", "tongansk paʻanga");
    result.put("TPE", "timoriansk escudo");
    result.put("TRL", "turkisk lire (-2004)");
    result.put("TRY", "ny turkisk lira");
    result.put("TTD", "Trinidad ochTobago-dollar");
    result.put("TWD", "taiwanesisk ny dollar");
    result.put("TZS", "tanzanisk shilling");
    result.put("UAH", "ukrainsk hryvnia");
    result.put("UAK", "ukrainsk karbovanetz");
    result.put("UGS", "ugandisk shilling (1966-1987)");
    result.put("UGX", "ugandisk shilling");
    result.put("USD", "US-dollar");
    result.put("USN", "US-dollar (nästa dag)");
    result.put("USS", "US-dollar (samma dag)");
    result.put("UYI", "uruguayansk peso en unidades indexadas");
    result.put("UYP", "uruguayansk peso (1975-1993)");
    result.put("UYU", "uruguayansk peso");
    result.put("UZS", "uzbekisk sum");
    result.put("VEB", "venezuelansk bolivar");
    result.put("VEF", "venezuelansk bolivar fuerte");
    result.put("VND", "vietnamesisk dong");
    result.put("VUV", "vanuatisk vatu");
    result.put("WST", "västsamoansk tala");
    result.put("XAF", "CFA Franc BEAC");
    result.put("XAG", "uns silver");
    result.put("XAU", "guld");
    result.put("XBA", "europeisk kompositenhet");
    result.put("XBB", "europeisk monetär enhet");
    result.put("XBC", "europeisk kontoenhet (XBC)");
    result.put("XBD", "europeisk kontoenhet (XBD)");
    result.put("XCD", "östkaribisk dollar");
    result.put("XDR", "IMF särskild dragningsrätt");
    result.put("XEU", "europeisk valutaenhet");
    result.put("XFO", "fransk guldfranc");
    result.put("XFU", "internationella järnvägsunionens franc");
    result.put("XOF", "CFA Franc BCEAO");
    result.put("XPD", "uns palladium");
    result.put("XPF", "CFP-franc");
    result.put("XPT", "platina");
    result.put("XRE", "RINET-fond");
    result.put("XTS", "test-valutakod");
    result.put("XXX", "(okänd valuta)");
    result.put("YDD", "jemenitisk dinar");
    result.put("YER", "jemenitisk rial");
    result.put("YUD", "jugoslavisk hård dinar");
    result.put("YUM", "jugoslavisk ny dinar");
    result.put("YUN", "jugoslavisk dinar (konvertibel)");
    result.put("ZAL", "sydafrikansk rand (finansiell)");
    result.put("ZAR", "sydafrikansk rand");
    result.put("ZMK", "zambisk kwacha");
    result.put("ZRN", "zaïrisk ny zaïre");
    result.put("ZRZ", "zairisk zaire");
    result.put("ZWD", "Zimbabwe-dollar");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "andorransk peseta",
      "AED": "Förenade Arabemiratens dirham",
      "AFA": "afghani (1927-2002)",
      "AFN": "afghani",
      "ALK": "albansk lek (-1992)",
      "ALL": "albansk lek",
      "AMD": "armenisk dram",
      "ANG": "Nederländska Antillernas gulden",
      "AOA": "angolansk kwanza",
      "AOK": "angolansk kwanza (1977-1990)",
      "AON": "angolansk ny kwanza (1990-2000)",
      "AOR": "angolansk kwanza reajustado (1995-1999)",
      "ARA": "argentinsk austral",
      "ARP": "argentinsk peso (1983-1985)",
      "ARS": "argentinsk peso",
      "ATS": "österrikisk schilling",
      "AUD": "australisk dollar",
      "AWG": "Aruba-gulden",
      "AZM": "azerbajdzjansk manat (1993-2006)",
      "AZN": "azerbajdzjansk manat",
      "BAD": "bosnisk-hercegovinsk dinar",
      "BAM": "bosnisk-hercegovinsk mark (konvertibel)",
      "BBD": "Barbados-dollar",
      "BDT": "bangladeshisk taka",
      "BEC": "belgisk franc (konvertibel)",
      "BEF": "belgisk franc",
      "BEL": "belgisk franc (finansiell)",
      "BGL": "bulgarisk lev (1962–1999)",
      "BGM": "bulgarisk lev (1952–1962)",
      "BGN": "bulgarisk ny lev",
      "BHD": "Bahrain-dinar",
      "BIF": "burundisk franc",
      "BMD": "Bermuda-dollar",
      "BND": "Brunei-dollar",
      "BOB": "boliviano",
      "BOP": "boliviansk peso",
      "BOV": "boliviansk mvdol",
      "BRB": "brasiliansk cruzeiro (1967-1986)",
      "BRC": "brasiliansk cruzado",
      "BRE": "brasiliansk cruzeiro (1990-1993)",
      "BRL": "brasiliansk real",
      "BRN": "brasiliansk cruzado novo",
      "BRR": "brasiliansk cruzeiro",
      "BSD": "Bahamas-dollar",
      "BTN": "bhutanesisk ngultrum",
      "BUK": "burmesisk kyat",
      "BWP": "botswansk pula",
      "BYB": "vitrysk ny rubel (1994-1999)",
      "BYR": "vitrysk rubel",
      "BZD": "belizisk dollar",
      "CAD": "kanadensisk dollar",
      "CDF": "kongolesisk franc",
      "CHE": "euro (konvertibelt konto, WIR Bank, Schweiz)",
      "CHF": "schweizisk franc",
      "CHW": "schweizisk franc (konvertibelt konto, WIR Bank)",
      "CLF": "chilensk unidad de fomento",
      "CLP": "chilensk peso",
      "CNX": "kinesisk dollar",
      "CNY": "kinesisk yuan renminbi",
      "COP": "colombiansk peso",
      "COU": "colombiansk unidad de valor real",
      "CRC": "costarikansk colón",
      "CSD": "jugoslavisk dinar",
      "CSK": "tjeckoslovakisk koruna",
      "CUP": "kubansk peso",
      "CVE": "kapverdisk escudo",
      "CYP": "cypriotiskt pund",
      "CZK": "tjeckisk koruna",
      "DDM": "östtysk mark",
      "DEM": "tysk mark",
      "DJF": "djiboutisk franc",
      "DKK": "dansk krona",
      "DOP": "dominikansk peso",
      "DZD": "algerisk dinar",
      "ECS": "ecuadoriansk sucre",
      "ECV": "ecuadoriansk unidad de valor constante",
      "EEK": "estnisk krona",
      "EGP": "egyptiskt pund",
      "ERN": "eritreansk nakfa",
      "ESA": "spansk peseta (konto)",
      "ESB": "spansk peseta (konvertibelt konto)",
      "ESP": "spansk peseta",
      "ETB": "etiopisk birr",
      "EUR": "euro",
      "FIM": "finsk mark",
      "FJD": "Fiji-dollar",
      "FKP": "Falklandsöarnas pund",
      "FRF": "fransk franc",
      "GBP": "brittiskt pund sterling",
      "GEK": "georgisk kupon larit",
      "GEL": "georgisk lari",
      "GHC": "ghanansk cedi (1979-2007)",
      "GHS": "ghanansk cedi",
      "GIP": "gibraltiskt pund",
      "GMD": "gambisk dalasi",
      "GNF": "guineansk franc",
      "GNS": "guineansk syli",
      "GQE": "ekvatorialguineansk ekwele",
      "GRD": "grekisk drachma",
      "GTQ": "guatemalansk quetzal",
      "GWE": "Portugisiska Guinea-escudo",
      "GWP": "Guinea-Bissau-peso",
      "GYD": "Guyana-dollar",
      "HKD": "Hongkong-dollar",
      "HNL": "honduransk lempira",
      "HRD": "kroatisk dinar",
      "HRK": "kroatisk kuna",
      "HTG": "haitisk gourde",
      "HUF": "ungersk forint",
      "IDR": "indonesisk rupiah",
      "IEP": "irländskt pund",
      "ILP": "israeliskt pund",
      "ILR": "israelisk gammal shekel",
      "ILS": "israelisk ny shekel",
      "INR": "indisk rupie",
      "IQD": "irakisk dinar",
      "IRR": "iransk rial",
      "ISJ": "isländsk gammal krona",
      "ISK": "isländsk krona",
      "ITL": "italiensk lira",
      "JMD": "Jamaica-dollar",
      "JOD": "jordansk dinar",
      "JPY": "japansk yen",
      "KES": "kenyansk shilling",
      "KGS": "kirgizisk som",
      "KHR": "kambodjansk riel",
      "KMF": "komorisk franc",
      "KPW": "nordkoreansk won",
      "KRW": "sydkoreansk won",
      "KWD": "kuwaitisk dinar",
      "KYD": "Cayman-dollar",
      "KZT": "kazakisk tenge",
      "LAK": "laotisk kip",
      "LBP": "libanesiskt pund",
      "LKR": "srilankesisk rupie",
      "LRD": "Liberia-dollar",
      "LSL": "lesothisk loti",
      "LTL": "litauisk litas",
      "LTT": "litauisk talonas",
      "LUC": "luxemburgsk franc (konvertibel)",
      "LUF": "luxemburgsk franc",
      "LUL": "luxemburgsk franc (finansiell)",
      "LVL": "lettisk lats",
      "LVR": "lettisk rubel",
      "LYD": "libysk dinar",
      "MAD": "marockansk dirham",
      "MAF": "marockansk franc",
      "MDL": "moldavisk leu",
      "MGA": "madagaskisk ariary",
      "MGF": "madagaskisk franc",
      "MKD": "makedonisk denar",
      "MLF": "malisk franc",
      "MMK": "myanmarisk kyat",
      "MNT": "mongolisk tugrik",
      "MOP": "Macao-pataca",
      "MRO": "mauretansk ouguiya",
      "MTL": "maltesisk lire",
      "MTP": "maltesiskt pund",
      "MUR": "mauritisk rupie",
      "MVR": "maldivisk rufiyaa",
      "MWK": "malawisk kwacha",
      "MXN": "mexikansk peso",
      "MXP": "mexikansk silverpeso (1861-1992)",
      "MXV": "mexikansk unidad de inversion",
      "MYR": "malaysisk ringgit",
      "MZE": "moçambikisk escudo",
      "MZM": "gammal moçambikisk metical",
      "MZN": "moçambikisk metical",
      "NAD": "Namibia-dollar",
      "NGN": "nigeriansk naira",
      "NIC": "nicaraguansk córdoba",
      "NIO": "nicaraguansk córdoba oro",
      "NLG": "nederländsk gulden",
      "NOK": "norsk krona",
      "NPR": "nepalesisk rupie",
      "NZD": "nyzeeländsk dollar",
      "OMR": "omansk rial",
      "PAB": "panamansk balboa",
      "PEI": "peruansk inti",
      "PEN": "peruansk sol nuevo",
      "PGK": "papuansk kina",
      "PHP": "filippinsk peso",
      "PKR": "pakistansk rupie",
      "PLN": "polsk zloty",
      "PLZ": "polsk zloty (1950-1995)",
      "PTE": "portugisisk escudo",
      "PYG": "paraguaysk guarani",
      "QAR": "qatarisk rial",
      "RHD": "rhodesisk dollar",
      "ROL": "gammal rumänsk leu",
      "RON": "rumänsk leu",
      "RSD": "serbisk dinar",
      "RUB": "rysk rubel",
      "RUR": "rysk rubel (1991-1998)",
      "RWF": "rwandisk franc",
      "SAR": "saudisk riyal",
      "SBD": "Salomon-dollar",
      "SCR": "seychellisk rupie",
      "SDD": "sudanesisk dinar",
      "SDG": "sudanesiskt pund",
      "SDP": "sudanskt pund (1916-1992)",
      "SEK": "svensk krona",
      "SGD": "Singapore-dollar",
      "SHP": "S:t Helena-pund",
      "SIT": "slovensk tolar",
      "SKK": "slovakisk koruna",
      "SLL": "sierraleonsk leone",
      "SOS": "somalisk shilling",
      "SRD": "Surinam-dollar",
      "SRG": "surinamesisk gulden",
      "STD": "São Tomé och Príncipe-dobra",
      "SUR": "sovjetisk rubel",
      "SVC": "salvadoransk colón",
      "SYP": "syriskt pund",
      "SZL": "swaziländsk lilangeni",
      "THB": "thailändsk baht",
      "TJR": "tadzjikisk rubel",
      "TJS": "tadzjikisk somoni",
      "TMM": "turkmensk manat",
      "TND": "tunisisk dinar",
      "TOP": "tongansk paʻanga",
      "TPE": "timoriansk escudo",
      "TRL": "turkisk lire (-2004)",
      "TRY": "ny turkisk lira",
      "TTD": "Trinidad ochTobago-dollar",
      "TWD": "taiwanesisk ny dollar",
      "TZS": "tanzanisk shilling",
      "UAH": "ukrainsk hryvnia",
      "UAK": "ukrainsk karbovanetz",
      "UGS": "ugandisk shilling (1966-1987)",
      "UGX": "ugandisk shilling",
      "USD": "US-dollar",
      "USN": "US-dollar (nästa dag)",
      "USS": "US-dollar (samma dag)",
      "UYI": "uruguayansk peso en unidades indexadas",
      "UYP": "uruguayansk peso (1975-1993)",
      "UYU": "uruguayansk peso",
      "UZS": "uzbekisk sum",
      "VEB": "venezuelansk bolivar",
      "VEF": "venezuelansk bolivar fuerte",
      "VND": "vietnamesisk dong",
      "VUV": "vanuatisk vatu",
      "WST": "västsamoansk tala",
      "XAF": "CFA Franc BEAC",
      "XAG": "uns silver",
      "XAU": "guld",
      "XBA": "europeisk kompositenhet",
      "XBB": "europeisk monetär enhet",
      "XBC": "europeisk kontoenhet (XBC)",
      "XBD": "europeisk kontoenhet (XBD)",
      "XCD": "östkaribisk dollar",
      "XDR": "IMF särskild dragningsrätt",
      "XEU": "europeisk valutaenhet",
      "XFO": "fransk guldfranc",
      "XFU": "internationella järnvägsunionens franc",
      "XOF": "CFA Franc BCEAO",
      "XPD": "uns palladium",
      "XPF": "CFP-franc",
      "XPT": "platina",
      "XRE": "RINET-fond",
      "XTS": "test-valutakod",
      "XXX": "(okänd valuta)",
      "YDD": "jemenitisk dinar",
      "YER": "jemenitisk rial",
      "YUD": "jugoslavisk hård dinar",
      "YUM": "jugoslavisk ny dinar",
      "YUN": "jugoslavisk dinar (konvertibel)",
      "ZAL": "sydafrikansk rand (finansiell)",
      "ZAR": "sydafrikansk rand",
      "ZMK": "zambisk kwacha",
      "ZRN": "zaïrisk ny zaïre",
      "ZRZ": "zairisk zaire",
      "ZWD": "Zimbabwe-dollar",
    };
  }-*/;
}
