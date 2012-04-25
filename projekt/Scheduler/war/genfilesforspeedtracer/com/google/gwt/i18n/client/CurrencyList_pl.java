package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_pl extends com.google.gwt.i18n.client.CurrencyList_ {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("PLN", "zł", 2);
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "PLN", "zł", 2];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // peseta andorska
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128));
    // dirham arabski
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH"));
    // afgani (1927-2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130));
    // afgani
    result.put("AFN", new CurrencyDataImpl("AFN", "Af", 0));
    // lek albański
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0));
    // dram armeński
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 0));
    // gulden Antyle Holenderskie
    result.put("ANG", new CurrencyDataImpl("ANG", "NAf.", 2));
    // kwanza angolańska
    result.put("AOA", new CurrencyDataImpl("AOA", "Kz", 2));
    // kwanza angolańska (1977-1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130));
    // nowa kwanza angolańska (1990-2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130));
    // kwanza angolańska Reajustado (1995-1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130));
    // austral argentyński
    result.put("ARA", new CurrencyDataImpl("ARA", "₳", 130));
    // ARL
    result.put("ARL", new CurrencyDataImpl("ARL", "$L", 130));
    // ARM
    result.put("ARM", new CurrencyDataImpl("ARM", "m$n", 130));
    // peso argentyńskie (1983-1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130));
    // peso argentyńskie
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$"));
    // szyling austriacki 
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130));
    // dolar australijski
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$"));
    // gulden arubski
    result.put("AWG", new CurrencyDataImpl("AWG", "Afl.", 2));
    // manat azerbejdżański
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130));
    // manat azerski
    result.put("AZN", new CurrencyDataImpl("AZN", "man.", 2));
    // dinar Bośni i Hercegowiny
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130));
    // marka konwertybilna Bośni i Hercegowiny
    result.put("BAM", new CurrencyDataImpl("BAM", "KM", 2));
    // dolar Barbadosu
    result.put("BBD", new CurrencyDataImpl("BBD", "Bds$", 2));
    // taka bengalska
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk"));
    // frank belgijski (zamienny)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 2));
    // frank belgijski
    result.put("BEF", new CurrencyDataImpl("BEF", "BF", 130));
    // frank belgijski (finansowy)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 2));
    // lew bułgarski
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130));
    // nowy lew bułgarski
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2));
    // dinar bahrański
    result.put("BHD", new CurrencyDataImpl("BHD", "BD", 3));
    // frank burundyjski
    result.put("BIF", new CurrencyDataImpl("BIF", "FBu", 0));
    // dolar bermudzki
    result.put("BMD", new CurrencyDataImpl("BMD", "BD$", 2));
    // dolar brunejski
    result.put("BND", new CurrencyDataImpl("BND", "BN$", 2));
    // boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "Bs", 2));
    // peso boliwijskie
    result.put("BOP", new CurrencyDataImpl("BOP", "$b.", 130));
    // mvdol boliwijski
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 2));
    // cruzeiro novo brazylijskie (1967-1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130));
    // cruzado brazylijskie
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130));
    // cruzeiro brazylijskie (1990-1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130));
    // real brazylijski
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$"));
    // nowe cruzado brazylijskie
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130));
    // cruzeiro brazylijskie
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130));
    // dolar bahamski
    result.put("BSD", new CurrencyDataImpl("BSD", "BS$", 2));
    // ngultrum Bhutanu
    result.put("BTN", new CurrencyDataImpl("BTN", "Nu.", 2));
    // kyat birmański
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130));
    // pula
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2));
    // rubel białoruski (1994-1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130));
    // rubel białoruski
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 0));
    // dolar belizeński
    result.put("BZD", new CurrencyDataImpl("BZD", "BZ$", 2));
    // dolar kanadyjski
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$"));
    // frank kongijski
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2));
    // CHE
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 2));
    // frank szwajcarski
    result.put("CHF", new CurrencyDataImpl("CHF", "Fr.", 2, "CHF"));
    // CHW
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 2));
    // CLE
    result.put("CLE", new CurrencyDataImpl("CLE", "Eº", 130));
    // CLF
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 0));
    // peso chilijskie
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$"));
    // juan renminbi
    result.put("CNY", new CurrencyDataImpl("CNY", "CN¥", 2, "RMB¥"));
    // peso kolumbijskie
    result.put("COP", new CurrencyDataImpl("COP", "CO$", 0, "COL$"));
    // COU
    result.put("COU", new CurrencyDataImpl("COU", "COU", 2));
    // colon kostarykański
    result.put("CRC", new CurrencyDataImpl("CRC", "₡", 0, "CR₡"));
    // stary dinar serbski
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130));
    // korona czechosłowacka
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130));
    // CUC
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC$", 2));
    // peso kubańskie
    result.put("CUP", new CurrencyDataImpl("CUP", "CU$", 2, "$MN"));
    // escudo Zielonego Przylądka
    result.put("CVE", new CurrencyDataImpl("CVE", "CV$", 2));
    // funt cypryjski
    result.put("CYP", new CurrencyDataImpl("CYP", "CY£", 130));
    // korona czeska
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč"));
    // wschodnia marka wschodnioniemiecka
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130));
    // marka niemiecka
    result.put("DEM", new CurrencyDataImpl("DEM", "DM", 130));
    // frank Dżibuti
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0));
    // korona duńska
    result.put("DKK", new CurrencyDataImpl("DKK", "Dkr", 2, "kr"));
    // peso dominikańskie
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$"));
    // dinar algierski
    result.put("DZD", new CurrencyDataImpl("DZD", "DA", 2));
    // sucre ekwadorski
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130));
    // ECV
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 2));
    // korona estońska
    result.put("EEK", new CurrencyDataImpl("EEK", "Ekr", 2));
    // funt egipski
    result.put("EGP", new CurrencyDataImpl("EGP", "EG£", 2, "LE"));
    // EQE
    result.put("EQE", new CurrencyDataImpl("EQE", "EQE", 130));
    // nakfa erytrejska
    result.put("ERN", new CurrencyDataImpl("ERN", "Nfk", 2));
    // peseta hiszpańska (Konto A)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 2));
    // peseta hiszpańska (konto wymienne)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 2));
    // peseta hiszpańska
    result.put("ESP", new CurrencyDataImpl("ESP", "Pts", 128));
    // birr etiopski
    result.put("ETB", new CurrencyDataImpl("ETB", "Br", 2));
    // euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€"));
    // marka fińska
    result.put("FIM", new CurrencyDataImpl("FIM", "mk", 130));
    // dolar fidżi
    result.put("FJD", new CurrencyDataImpl("FJD", "FJ$", 2));
    // funt Wysp Falklandzkich
    result.put("FKP", new CurrencyDataImpl("FKP", "FK£", 2));
    // frank francuski 
    result.put("FRF", new CurrencyDataImpl("FRF", "₣", 130));
    // funt szterling
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£"));
    // kupon gruziński larit
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130));
    // lari gruzińskie
    result.put("GEL", new CurrencyDataImpl("GEL", "GEL", 2));
    // cedi ghańskie
    result.put("GHC", new CurrencyDataImpl("GHC", "₵", 130));
    // cedi Ghany
    result.put("GHS", new CurrencyDataImpl("GHS", "GH₵", 2));
    // funt gibraltarski
    result.put("GIP", new CurrencyDataImpl("GIP", "GI£", 2));
    // dalasi gambijskie
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2));
    // frank gwinejski
    result.put("GNF", new CurrencyDataImpl("GNF", "FG", 0));
    // syli gwinejskie
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130));
    // ekwele gwinejskie Gwinei Równikowej
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130));
    // drachma grecka
    result.put("GRD", new CurrencyDataImpl("GRD", "₯", 130));
    // quetzal gwatemalski
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2));
    // escudo Gwinea Portugalska
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130));
    // peso Guinea-Bissau
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 2));
    // dolar gujański
    result.put("GYD", new CurrencyDataImpl("GYD", "GY$", 0));
    // dolar hongkoński
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$"));
    // lempira Hondurasu
    result.put("HNL", new CurrencyDataImpl("HNL", "HNL", 2));
    // dinar chorwacki
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130));
    // kuna chorwacka
    result.put("HRK", new CurrencyDataImpl("HRK", "kn", 2));
    // gourde haitańskie
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2));
    // forint węgierski 
    result.put("HUF", new CurrencyDataImpl("HUF", "Ft", 0));
    // rupia indonezyjska
    result.put("IDR", new CurrencyDataImpl("IDR", "Rp", 0));
    // funt irlandzki
    result.put("IEP", new CurrencyDataImpl("IEP", "IR£", 130));
    // funt izraelski
    result.put("ILP", new CurrencyDataImpl("ILP", "I£", 130));
    // nowy szekel izraelski
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪"));
    // rupia indyjska
    result.put("INR", new CurrencyDataImpl("INR", "Rs", 2, "Rs"));
    // dinar iracki
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0));
    // rial irański
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0));
    // korona islandzka
    result.put("ISK", new CurrencyDataImpl("ISK", "Ikr", 0, "kr"));
    // lir włoski
    result.put("ITL", new CurrencyDataImpl("ITL", "IT₤", 128));
    // dolar jamajski
    result.put("JMD", new CurrencyDataImpl("JMD", "J$", 2, "JA$"));
    // dinar jordański
    result.put("JOD", new CurrencyDataImpl("JOD", "JD", 3));
    // jen japoński
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥"));
    // szyling kenijski
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2));
    // som kirgiski
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2));
    // riel kambodżański
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2));
    // frank komoryjski
    result.put("KMF", new CurrencyDataImpl("KMF", "CF", 0));
    // won północnokoreański
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0));
    // won południowokoreański
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩"));
    // dinar kuwejcki
    result.put("KWD", new CurrencyDataImpl("KWD", "KD", 3));
    // dolar kajmański
    result.put("KYD", new CurrencyDataImpl("KYD", "KY$", 2));
    // tenge kazachskie
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2));
    // kip laotański
    result.put("LAK", new CurrencyDataImpl("LAK", "₭", 0));
    // funt libański
    result.put("LBP", new CurrencyDataImpl("LBP", "LB£", 0));
    // rupia lankijska
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs"));
    // dolar liberyjski
    result.put("LRD", new CurrencyDataImpl("LRD", "L$", 2));
    // loti Lesoto
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2));
    // LSM
    result.put("LSM", new CurrencyDataImpl("LSM", "LSM", 130));
    // lit litewski
    result.put("LTL", new CurrencyDataImpl("LTL", "Lt", 2));
    // talon litewski
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130));
    // LUC
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 2));
    // frank luksemburski
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128));
    // LUL
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 2));
    // łat łotewski
    result.put("LVL", new CurrencyDataImpl("LVL", "Ls", 2));
    // rubel łotewski
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130));
    // dinar libijski
    result.put("LYD", new CurrencyDataImpl("LYD", "LD", 3));
    // dirham marokański
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2));
    // frank marokański
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130));
    // lej mołdawski
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2));
    // ariar malgaski
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0));
    // frank malgaski
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128));
    // denar macedoński
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2));
    // frank malijski
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130));
    // kyat Myanmar
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0));
    // tugrik mongolski
    result.put("MNT", new CurrencyDataImpl("MNT", "₮", 0, "MN₮"));
    // pataka Macao
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP$", 2));
    // ouguiya mauterańska
    result.put("MRO", new CurrencyDataImpl("MRO", "UM", 0));
    // lira maltańska
    result.put("MTL", new CurrencyDataImpl("MTL", "Lm", 130));
    // funt maltański
    result.put("MTP", new CurrencyDataImpl("MTP", "MT£", 130));
    // rupia Mauritius
    result.put("MUR", new CurrencyDataImpl("MUR", "MURs", 0));
    // rufiyaa malediwska
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2));
    // kwacha malawska
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2));
    // peso meksykańskie
    result.put("MXN", new CurrencyDataImpl("MXN", "Mex$", 2, "Mex$"));
    // peso srebrne meksykańskie (1861-1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MX$", 130));
    // MXV
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 2));
    // ringgit malezyjski
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM"));
    // escudo mozambickie
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130));
    // metical Mozambik
    result.put("MZM", new CurrencyDataImpl("MZM", "Mt", 130));
    // metical Mozambiku
    result.put("MZN", new CurrencyDataImpl("MZN", "MTn", 2));
    // dolar namibijski
    result.put("NAD", new CurrencyDataImpl("NAD", "N$", 2));
    // naira nigeryjska
    result.put("NGN", new CurrencyDataImpl("NGN", "₦", 2));
    // cordoba nikaraguańska
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130));
    // cordoba oro nikaraguańska
    result.put("NIO", new CurrencyDataImpl("NIO", "C$", 2));
    // gulden holenderski 
    result.put("NLG", new CurrencyDataImpl("NLG", "fl", 130));
    // korona norweska
    result.put("NOK", new CurrencyDataImpl("NOK", "Nkr", 2, "NOkr"));
    // rupia nepalska
    result.put("NPR", new CurrencyDataImpl("NPR", "NPRs", 2));
    // dolar nowozelandzki
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2));
    // rial Omanu
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3));
    // balboa panamski
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/."));
    // inti peruwiański
    result.put("PEI", new CurrencyDataImpl("PEI", "I/.", 130));
    // nowy sol peruwiański
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/."));
    // sol peruwiański
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130));
    // kina Papua Nowa Gwinea
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2));
    // peso filipińskie
    result.put("PHP", new CurrencyDataImpl("PHP", "₱", 2, "PHP"));
    // rupia pakistańska
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs", 0, "PKRs."));
    // złoty polski
    result.put("PLN", new CurrencyDataImpl("PLN", "zł", 2));
    // złoty polski (1950-1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130));
    // escudo portugalskie
    result.put("PTE", new CurrencyDataImpl("PTE", "Esc", 130));
    // guarani paragwajskie
    result.put("PYG", new CurrencyDataImpl("PYG", "₲", 0));
    // rial katarski
    result.put("QAR", new CurrencyDataImpl("QAR", "QR", 2));
    // dolar rodezyjski
    result.put("RHD", new CurrencyDataImpl("RHD", "RH$", 130));
    // lej rumuński
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130));
    // nowa leja rumuńska
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2));
    // dinar serbski
    result.put("RSD", new CurrencyDataImpl("RSD", "din.", 0));
    // rubel rosyjski
    result.put("RUB", new CurrencyDataImpl("RUB", "руб", 2, "руб"));
    // rubel rosyjski (1991-1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130));
    // frank ruandyjski
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0));
    // rial saudyjski
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR"));
    // dolar Wysp Salomona
    result.put("SBD", new CurrencyDataImpl("SBD", "SI$", 2));
    // rupia seszelska
    result.put("SCR", new CurrencyDataImpl("SCR", "SRe", 2));
    // dinar sudański
    result.put("SDD", new CurrencyDataImpl("SDD", "LSd", 130));
    // funt sudański
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2));
    // stary funt sudański
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130));
    // korona szwedzka
    result.put("SEK", new CurrencyDataImpl("SEK", "Skr", 2, "kr"));
    // dolar singapurski
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$"));
    // funt Wyspy Świętej Heleny
    result.put("SHP", new CurrencyDataImpl("SHP", "SH£", 2));
    // tolar słoweński
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130));
    // korona słowacka
    result.put("SKK", new CurrencyDataImpl("SKK", "Sk", 130));
    // leone Sierra Leone
    result.put("SLL", new CurrencyDataImpl("SLL", "Le", 0));
    // szyling somalijski
    result.put("SOS", new CurrencyDataImpl("SOS", "Ssh", 0));
    // dolar surinamski
    result.put("SRD", new CurrencyDataImpl("SRD", "SR$", 2));
    // gulden surinamski
    result.put("SRG", new CurrencyDataImpl("SRG", "Sf", 130));
    // dobra Wysp Świętego Tomasza i Książęcej
    result.put("STD", new CurrencyDataImpl("STD", "Db", 0));
    // rubel radziecki
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130));
    // colon salwadorski
    result.put("SVC", new CurrencyDataImpl("SVC", "SV₡", 130));
    // funt syryjski
    result.put("SYP", new CurrencyDataImpl("SYP", "SY£", 0));
    // lilangeni Suazi
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2));
    // baht tajski
    result.put("THB", new CurrencyDataImpl("THB", "฿", 2, "THB"));
    // rubel tadżycki
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130));
    // somoni tadżyckie
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2));
    // manat turkmeński
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128));
    // dinar tunezyjski
    result.put("TND", new CurrencyDataImpl("TND", "DT", 3));
    // paʻanga Tonga
    result.put("TOP", new CurrencyDataImpl("TOP", "T$", 2));
    // escudo timorskie
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130));
    // lir turecki
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128));
    // nowa lira turecka
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL"));
    // dolar Trynidadu i Tobago
    result.put("TTD", new CurrencyDataImpl("TTD", "TT$", 2));
    // nowy dolar tajwański
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$"));
    // szyling tanzański
    result.put("TZS", new CurrencyDataImpl("TZS", "TSh", 0));
    // hrywna ukraińska
    result.put("UAH", new CurrencyDataImpl("UAH", "₴", 2));
    // karbowaniec ukraiński
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130));
    // szyling ugandyjski (1966-1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130));
    // szyling ugandyjski
    result.put("UGX", new CurrencyDataImpl("UGX", "USh", 0));
    // dolar amerykański 
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$"));
    // USN
    result.put("USN", new CurrencyDataImpl("USN", "USN", 2));
    // USS
    result.put("USS", new CurrencyDataImpl("USS", "USS", 2));
    // UYI
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 2));
    // peso urugwajskie (1975-1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130));
    // peso urugwajskie
    result.put("UYU", new CurrencyDataImpl("UYU", "$U", 2, "UY$"));
    // som uzbecki
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 0));
    // boliwar wenezuelski
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130));
    // boliwar fuerte
    result.put("VEF", new CurrencyDataImpl("VEF", "Bs.F.", 2));
    // dong wietnamski
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫"));
    // vatu Vanuatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VT", 0));
    // tala samoańska
    result.put("WST", new CurrencyDataImpl("WST", "WS$", 2));
    // frank CFA BEAC
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0));
    // srebro
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 2));
    // złoto
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 2));
    // XBA
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 2));
    // XBB
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 2));
    // XBC
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 2));
    // XBD
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 2));
    // dolar wschodniokaraibski
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2));
    // specjalne prawa ciągnienia
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 2));
    // ECU
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 2));
    // frank złoty francuski
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 2));
    // UIC-frank francuski
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 2));
    // frank CFA
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0));
    // pallad
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 2));
    // frank CFP
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0));
    // platyna
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 2));
    // XRE
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 2));
    // XTS
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 2));
    // nieznana/nieprawidłowa waluta
    result.put("XXX", new CurrencyDataImpl("XXX", "XXX", 2));
    // dinar jemeński
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130));
    // rial jemeński
    result.put("YER", new CurrencyDataImpl("YER", "YR", 0, "YER"));
    // YUD
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130));
    // nowy dinar jugosławiański
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130));
    // dinar jugosławiański wymienny
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130));
    // rand południowoafrykański (finansowy)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 2));
    // rand południowoafrykański
    result.put("ZAR", new CurrencyDataImpl("ZAR", "R", 2, "ZAR"));
    // kwacha zambijska
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZK", 0));
    // nowy zair zairski
    result.put("ZRN", new CurrencyDataImpl("ZRN", "NZ", 130));
    // zair zairski
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130));
    // dolar Zimbabwe
    result.put("ZWD", new CurrencyDataImpl("ZWD", "Z$", 128));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // peseta andorska
      "ADP": [ "ADP", "ADP", 128],
      // dirham arabski
      "AED": [ "AED", "DH", 2, "DH"],
      // afgani (1927-2002)
      "AFA": [ "AFA", "AFA", 130],
      // afgani
      "AFN": [ "AFN", "Af", 0],
      // lek albański
      "ALL": [ "ALL", "ALL", 0],
      // dram armeński
      "AMD": [ "AMD", "AMD", 0],
      // gulden Antyle Holenderskie
      "ANG": [ "ANG", "NAf.", 2],
      // kwanza angolańska
      "AOA": [ "AOA", "Kz", 2],
      // kwanza angolańska (1977-1990)
      "AOK": [ "AOK", "AOK", 130],
      // nowa kwanza angolańska (1990-2000)
      "AON": [ "AON", "AON", 130],
      // kwanza angolańska Reajustado (1995-1999)
      "AOR": [ "AOR", "AOR", 130],
      // austral argentyński
      "ARA": [ "ARA", "₳", 130],
      // ARL
      "ARL": [ "ARL", "$L", 130],
      // ARM
      "ARM": [ "ARM", "m$n", 130],
      // peso argentyńskie (1983-1985)
      "ARP": [ "ARP", "ARP", 130],
      // peso argentyńskie
      "ARS": [ "ARS", "AR$", 2, "AR$"],
      // szyling austriacki 
      "ATS": [ "ATS", "ATS", 130],
      // dolar australijski
      "AUD": [ "AUD", "AU$", 2, "AU$"],
      // gulden arubski
      "AWG": [ "AWG", "Afl.", 2],
      // manat azerbejdżański
      "AZM": [ "AZM", "AZM", 130],
      // manat azerski
      "AZN": [ "AZN", "man.", 2],
      // dinar Bośni i Hercegowiny
      "BAD": [ "BAD", "BAD", 130],
      // marka konwertybilna Bośni i Hercegowiny
      "BAM": [ "BAM", "KM", 2],
      // dolar Barbadosu
      "BBD": [ "BBD", "Bds$", 2],
      // taka bengalska
      "BDT": [ "BDT", "Tk", 2, "Tk"],
      // frank belgijski (zamienny)
      "BEC": [ "BEC", "BEC", 2],
      // frank belgijski
      "BEF": [ "BEF", "BF", 130],
      // frank belgijski (finansowy)
      "BEL": [ "BEL", "BEL", 2],
      // lew bułgarski
      "BGL": [ "BGL", "BGL", 130],
      // nowy lew bułgarski
      "BGN": [ "BGN", "BGN", 2],
      // dinar bahrański
      "BHD": [ "BHD", "BD", 3],
      // frank burundyjski
      "BIF": [ "BIF", "FBu", 0],
      // dolar bermudzki
      "BMD": [ "BMD", "BD$", 2],
      // dolar brunejski
      "BND": [ "BND", "BN$", 2],
      // boliviano
      "BOB": [ "BOB", "Bs", 2],
      // peso boliwijskie
      "BOP": [ "BOP", "$b.", 130],
      // mvdol boliwijski
      "BOV": [ "BOV", "BOV", 2],
      // cruzeiro novo brazylijskie (1967-1986)
      "BRB": [ "BRB", "BRB", 130],
      // cruzado brazylijskie
      "BRC": [ "BRC", "BRC", 130],
      // cruzeiro brazylijskie (1990-1993)
      "BRE": [ "BRE", "BRE", 130],
      // real brazylijski
      "BRL": [ "BRL", "R$", 2, "R$"],
      // nowe cruzado brazylijskie
      "BRN": [ "BRN", "BRN", 130],
      // cruzeiro brazylijskie
      "BRR": [ "BRR", "BRR", 130],
      // dolar bahamski
      "BSD": [ "BSD", "BS$", 2],
      // ngultrum Bhutanu
      "BTN": [ "BTN", "Nu.", 2],
      // kyat birmański
      "BUK": [ "BUK", "BUK", 130],
      // pula
      "BWP": [ "BWP", "BWP", 2],
      // rubel białoruski (1994-1999)
      "BYB": [ "BYB", "BYB", 130],
      // rubel białoruski
      "BYR": [ "BYR", "BYR", 0],
      // dolar belizeński
      "BZD": [ "BZD", "BZ$", 2],
      // dolar kanadyjski
      "CAD": [ "CAD", "CA$", 2, "C$"],
      // frank kongijski
      "CDF": [ "CDF", "CDF", 2],
      // CHE
      "CHE": [ "CHE", "CHE", 2],
      // frank szwajcarski
      "CHF": [ "CHF", "Fr.", 2, "CHF"],
      // CHW
      "CHW": [ "CHW", "CHW", 2],
      // CLE
      "CLE": [ "CLE", "Eº", 130],
      // CLF
      "CLF": [ "CLF", "CLF", 0],
      // peso chilijskie
      "CLP": [ "CLP", "CL$", 0, "CL$"],
      // juan renminbi
      "CNY": [ "CNY", "CN¥", 2, "RMB¥"],
      // peso kolumbijskie
      "COP": [ "COP", "CO$", 0, "COL$"],
      // COU
      "COU": [ "COU", "COU", 2],
      // colon kostarykański
      "CRC": [ "CRC", "₡", 0, "CR₡"],
      // stary dinar serbski
      "CSD": [ "CSD", "CSD", 130],
      // korona czechosłowacka
      "CSK": [ "CSK", "CSK", 130],
      // CUC
      "CUC": [ "CUC", "CUC$", 2],
      // peso kubańskie
      "CUP": [ "CUP", "CU$", 2, "$MN"],
      // escudo Zielonego Przylądka
      "CVE": [ "CVE", "CV$", 2],
      // funt cypryjski
      "CYP": [ "CYP", "CY£", 130],
      // korona czeska
      "CZK": [ "CZK", "Kč", 2, "Kč"],
      // wschodnia marka wschodnioniemiecka
      "DDM": [ "DDM", "DDM", 130],
      // marka niemiecka
      "DEM": [ "DEM", "DM", 130],
      // frank Dżibuti
      "DJF": [ "DJF", "Fdj", 0],
      // korona duńska
      "DKK": [ "DKK", "Dkr", 2, "kr"],
      // peso dominikańskie
      "DOP": [ "DOP", "RD$", 2, "RD$"],
      // dinar algierski
      "DZD": [ "DZD", "DA", 2],
      // sucre ekwadorski
      "ECS": [ "ECS", "ECS", 130],
      // ECV
      "ECV": [ "ECV", "ECV", 2],
      // korona estońska
      "EEK": [ "EEK", "Ekr", 2],
      // funt egipski
      "EGP": [ "EGP", "EG£", 2, "LE"],
      // EQE
      "EQE": [ "EQE", "EQE", 130],
      // nakfa erytrejska
      "ERN": [ "ERN", "Nfk", 2],
      // peseta hiszpańska (Konto A)
      "ESA": [ "ESA", "ESA", 2],
      // peseta hiszpańska (konto wymienne)
      "ESB": [ "ESB", "ESB", 2],
      // peseta hiszpańska
      "ESP": [ "ESP", "Pts", 128],
      // birr etiopski
      "ETB": [ "ETB", "Br", 2],
      // euro
      "EUR": [ "EUR", "€", 2, "€"],
      // marka fińska
      "FIM": [ "FIM", "mk", 130],
      // dolar fidżi
      "FJD": [ "FJD", "FJ$", 2],
      // funt Wysp Falklandzkich
      "FKP": [ "FKP", "FK£", 2],
      // frank francuski 
      "FRF": [ "FRF", "₣", 130],
      // funt szterling
      "GBP": [ "GBP", "£", 2, "GB£"],
      // kupon gruziński larit
      "GEK": [ "GEK", "GEK", 130],
      // lari gruzińskie
      "GEL": [ "GEL", "GEL", 2],
      // cedi ghańskie
      "GHC": [ "GHC", "₵", 130],
      // cedi Ghany
      "GHS": [ "GHS", "GH₵", 2],
      // funt gibraltarski
      "GIP": [ "GIP", "GI£", 2],
      // dalasi gambijskie
      "GMD": [ "GMD", "GMD", 2],
      // frank gwinejski
      "GNF": [ "GNF", "FG", 0],
      // syli gwinejskie
      "GNS": [ "GNS", "GNS", 130],
      // ekwele gwinejskie Gwinei Równikowej
      "GQE": [ "GQE", "GQE", 130],
      // drachma grecka
      "GRD": [ "GRD", "₯", 130],
      // quetzal gwatemalski
      "GTQ": [ "GTQ", "GTQ", 2],
      // escudo Gwinea Portugalska
      "GWE": [ "GWE", "GWE", 130],
      // peso Guinea-Bissau
      "GWP": [ "GWP", "GWP", 2],
      // dolar gujański
      "GYD": [ "GYD", "GY$", 0],
      // dolar hongkoński
      "HKD": [ "HKD", "HK$", 2, "HK$"],
      // lempira Hondurasu
      "HNL": [ "HNL", "HNL", 2],
      // dinar chorwacki
      "HRD": [ "HRD", "HRD", 130],
      // kuna chorwacka
      "HRK": [ "HRK", "kn", 2],
      // gourde haitańskie
      "HTG": [ "HTG", "HTG", 2],
      // forint węgierski 
      "HUF": [ "HUF", "Ft", 0],
      // rupia indonezyjska
      "IDR": [ "IDR", "Rp", 0],
      // funt irlandzki
      "IEP": [ "IEP", "IR£", 130],
      // funt izraelski
      "ILP": [ "ILP", "I£", 130],
      // nowy szekel izraelski
      "ILS": [ "ILS", "₪", 2, "IL₪"],
      // rupia indyjska
      "INR": [ "INR", "Rs", 2, "Rs"],
      // dinar iracki
      "IQD": [ "IQD", "IQD", 0],
      // rial irański
      "IRR": [ "IRR", "IRR", 0],
      // korona islandzka
      "ISK": [ "ISK", "Ikr", 0, "kr"],
      // lir włoski
      "ITL": [ "ITL", "IT₤", 128],
      // dolar jamajski
      "JMD": [ "JMD", "J$", 2, "JA$"],
      // dinar jordański
      "JOD": [ "JOD", "JD", 3],
      // jen japoński
      "JPY": [ "JPY", "JP¥", 0, "JP¥"],
      // szyling kenijski
      "KES": [ "KES", "Ksh", 2],
      // som kirgiski
      "KGS": [ "KGS", "KGS", 2],
      // riel kambodżański
      "KHR": [ "KHR", "KHR", 2],
      // frank komoryjski
      "KMF": [ "KMF", "CF", 0],
      // won północnokoreański
      "KPW": [ "KPW", "KPW", 0],
      // won południowokoreański
      "KRW": [ "KRW", "₩", 0, "KR₩"],
      // dinar kuwejcki
      "KWD": [ "KWD", "KD", 3],
      // dolar kajmański
      "KYD": [ "KYD", "KY$", 2],
      // tenge kazachskie
      "KZT": [ "KZT", "KZT", 2],
      // kip laotański
      "LAK": [ "LAK", "₭", 0],
      // funt libański
      "LBP": [ "LBP", "LB£", 0],
      // rupia lankijska
      "LKR": [ "LKR", "SLRs", 2, "SLRs"],
      // dolar liberyjski
      "LRD": [ "LRD", "L$", 2],
      // loti Lesoto
      "LSL": [ "LSL", "LSL", 2],
      // LSM
      "LSM": [ "LSM", "LSM", 130],
      // lit litewski
      "LTL": [ "LTL", "Lt", 2],
      // talon litewski
      "LTT": [ "LTT", "LTT", 130],
      // LUC
      "LUC": [ "LUC", "LUC", 2],
      // frank luksemburski
      "LUF": [ "LUF", "LUF", 128],
      // LUL
      "LUL": [ "LUL", "LUL", 2],
      // łat łotewski
      "LVL": [ "LVL", "Ls", 2],
      // rubel łotewski
      "LVR": [ "LVR", "LVR", 130],
      // dinar libijski
      "LYD": [ "LYD", "LD", 3],
      // dirham marokański
      "MAD": [ "MAD", "MAD", 2],
      // frank marokański
      "MAF": [ "MAF", "MAF", 130],
      // lej mołdawski
      "MDL": [ "MDL", "MDL", 2],
      // ariar malgaski
      "MGA": [ "MGA", "MGA", 0],
      // frank malgaski
      "MGF": [ "MGF", "MGF", 128],
      // denar macedoński
      "MKD": [ "MKD", "MKD", 2],
      // frank malijski
      "MLF": [ "MLF", "MLF", 130],
      // kyat Myanmar
      "MMK": [ "MMK", "MMK", 0],
      // tugrik mongolski
      "MNT": [ "MNT", "₮", 0, "MN₮"],
      // pataka Macao
      "MOP": [ "MOP", "MOP$", 2],
      // ouguiya mauterańska
      "MRO": [ "MRO", "UM", 0],
      // lira maltańska
      "MTL": [ "MTL", "Lm", 130],
      // funt maltański
      "MTP": [ "MTP", "MT£", 130],
      // rupia Mauritius
      "MUR": [ "MUR", "MURs", 0],
      // rufiyaa malediwska
      "MVR": [ "MVR", "MVR", 2],
      // kwacha malawska
      "MWK": [ "MWK", "MWK", 2],
      // peso meksykańskie
      "MXN": [ "MXN", "Mex$", 2, "Mex$"],
      // peso srebrne meksykańskie (1861-1992)
      "MXP": [ "MXP", "MX$", 130],
      // MXV
      "MXV": [ "MXV", "MXV", 2],
      // ringgit malezyjski
      "MYR": [ "MYR", "RM", 2, "RM"],
      // escudo mozambickie
      "MZE": [ "MZE", "MZE", 130],
      // metical Mozambik
      "MZM": [ "MZM", "Mt", 130],
      // metical Mozambiku
      "MZN": [ "MZN", "MTn", 2],
      // dolar namibijski
      "NAD": [ "NAD", "N$", 2],
      // naira nigeryjska
      "NGN": [ "NGN", "₦", 2],
      // cordoba nikaraguańska
      "NIC": [ "NIC", "NIC", 130],
      // cordoba oro nikaraguańska
      "NIO": [ "NIO", "C$", 2],
      // gulden holenderski 
      "NLG": [ "NLG", "fl", 130],
      // korona norweska
      "NOK": [ "NOK", "Nkr", 2, "NOkr"],
      // rupia nepalska
      "NPR": [ "NPR", "NPRs", 2],
      // dolar nowozelandzki
      "NZD": [ "NZD", "NZ$", 2],
      // rial Omanu
      "OMR": [ "OMR", "OMR", 3],
      // balboa panamski
      "PAB": [ "PAB", "B/.", 2, "B/."],
      // inti peruwiański
      "PEI": [ "PEI", "I/.", 130],
      // nowy sol peruwiański
      "PEN": [ "PEN", "S/.", 2, "S/."],
      // sol peruwiański
      "PES": [ "PES", "PES", 130],
      // kina Papua Nowa Gwinea
      "PGK": [ "PGK", "PGK", 2],
      // peso filipińskie
      "PHP": [ "PHP", "₱", 2, "PHP"],
      // rupia pakistańska
      "PKR": [ "PKR", "PKRs", 0, "PKRs."],
      // złoty polski
      "PLN": [ "PLN", "zł", 2],
      // złoty polski (1950-1995)
      "PLZ": [ "PLZ", "PLZ", 130],
      // escudo portugalskie
      "PTE": [ "PTE", "Esc", 130],
      // guarani paragwajskie
      "PYG": [ "PYG", "₲", 0],
      // rial katarski
      "QAR": [ "QAR", "QR", 2],
      // dolar rodezyjski
      "RHD": [ "RHD", "RH$", 130],
      // lej rumuński
      "ROL": [ "ROL", "ROL", 130],
      // nowa leja rumuńska
      "RON": [ "RON", "RON", 2],
      // dinar serbski
      "RSD": [ "RSD", "din.", 0],
      // rubel rosyjski
      "RUB": [ "RUB", "руб", 2, "руб"],
      // rubel rosyjski (1991-1998)
      "RUR": [ "RUR", "RUR", 130],
      // frank ruandyjski
      "RWF": [ "RWF", "RWF", 0],
      // rial saudyjski
      "SAR": [ "SAR", "SR", 2, "SR"],
      // dolar Wysp Salomona
      "SBD": [ "SBD", "SI$", 2],
      // rupia seszelska
      "SCR": [ "SCR", "SRe", 2],
      // dinar sudański
      "SDD": [ "SDD", "LSd", 130],
      // funt sudański
      "SDG": [ "SDG", "SDG", 2],
      // stary funt sudański
      "SDP": [ "SDP", "SDP", 130],
      // korona szwedzka
      "SEK": [ "SEK", "Skr", 2, "kr"],
      // dolar singapurski
      "SGD": [ "SGD", "S$", 2, "S$"],
      // funt Wyspy Świętej Heleny
      "SHP": [ "SHP", "SH£", 2],
      // tolar słoweński
      "SIT": [ "SIT", "SIT", 130],
      // korona słowacka
      "SKK": [ "SKK", "Sk", 130],
      // leone Sierra Leone
      "SLL": [ "SLL", "Le", 0],
      // szyling somalijski
      "SOS": [ "SOS", "Ssh", 0],
      // dolar surinamski
      "SRD": [ "SRD", "SR$", 2],
      // gulden surinamski
      "SRG": [ "SRG", "Sf", 130],
      // dobra Wysp Świętego Tomasza i Książęcej
      "STD": [ "STD", "Db", 0],
      // rubel radziecki
      "SUR": [ "SUR", "SUR", 130],
      // colon salwadorski
      "SVC": [ "SVC", "SV₡", 130],
      // funt syryjski
      "SYP": [ "SYP", "SY£", 0],
      // lilangeni Suazi
      "SZL": [ "SZL", "SZL", 2],
      // baht tajski
      "THB": [ "THB", "฿", 2, "THB"],
      // rubel tadżycki
      "TJR": [ "TJR", "TJR", 130],
      // somoni tadżyckie
      "TJS": [ "TJS", "TJS", 2],
      // manat turkmeński
      "TMM": [ "TMM", "TMM", 128],
      // dinar tunezyjski
      "TND": [ "TND", "DT", 3],
      // paʻanga Tonga
      "TOP": [ "TOP", "T$", 2],
      // escudo timorskie
      "TPE": [ "TPE", "TPE", 130],
      // lir turecki
      "TRL": [ "TRL", "TRL", 128],
      // nowa lira turecka
      "TRY": [ "TRY", "TL", 2, "YTL"],
      // dolar Trynidadu i Tobago
      "TTD": [ "TTD", "TT$", 2],
      // nowy dolar tajwański
      "TWD": [ "TWD", "NT$", 2, "NT$"],
      // szyling tanzański
      "TZS": [ "TZS", "TSh", 0],
      // hrywna ukraińska
      "UAH": [ "UAH", "₴", 2],
      // karbowaniec ukraiński
      "UAK": [ "UAK", "UAK", 130],
      // szyling ugandyjski (1966-1987)
      "UGS": [ "UGS", "UGS", 130],
      // szyling ugandyjski
      "UGX": [ "UGX", "USh", 0],
      // dolar amerykański 
      "USD": [ "USD", "US$", 2, "US$"],
      // USN
      "USN": [ "USN", "USN", 2],
      // USS
      "USS": [ "USS", "USS", 2],
      // UYI
      "UYI": [ "UYI", "UYI", 2],
      // peso urugwajskie (1975-1993)
      "UYP": [ "UYP", "UYP", 130],
      // peso urugwajskie
      "UYU": [ "UYU", "$U", 2, "UY$"],
      // som uzbecki
      "UZS": [ "UZS", "UZS", 0],
      // boliwar wenezuelski
      "VEB": [ "VEB", "VEB", 130],
      // boliwar fuerte
      "VEF": [ "VEF", "Bs.F.", 2],
      // dong wietnamski
      "VND": [ "VND", "₫", 24, "₫"],
      // vatu Vanuatu
      "VUV": [ "VUV", "VT", 0],
      // tala samoańska
      "WST": [ "WST", "WS$", 2],
      // frank CFA BEAC
      "XAF": [ "XAF", "FCFA", 0],
      // srebro
      "XAG": [ "XAG", "XAG", 2],
      // złoto
      "XAU": [ "XAU", "XAU", 2],
      // XBA
      "XBA": [ "XBA", "XBA", 2],
      // XBB
      "XBB": [ "XBB", "XBB", 2],
      // XBC
      "XBC": [ "XBC", "XBC", 2],
      // XBD
      "XBD": [ "XBD", "XBD", 2],
      // dolar wschodniokaraibski
      "XCD": [ "XCD", "EC$", 2],
      // specjalne prawa ciągnienia
      "XDR": [ "XDR", "XDR", 2],
      // ECU
      "XEU": [ "XEU", "XEU", 2],
      // frank złoty francuski
      "XFO": [ "XFO", "XFO", 2],
      // UIC-frank francuski
      "XFU": [ "XFU", "XFU", 2],
      // frank CFA
      "XOF": [ "XOF", "CFA", 0],
      // pallad
      "XPD": [ "XPD", "XPD", 2],
      // frank CFP
      "XPF": [ "XPF", "CFPF", 0],
      // platyna
      "XPT": [ "XPT", "XPT", 2],
      // XRE
      "XRE": [ "XRE", "XRE", 2],
      // XTS
      "XTS": [ "XTS", "XTS", 2],
      // nieznana/nieprawidłowa waluta
      "XXX": [ "XXX", "XXX", 2],
      // dinar jemeński
      "YDD": [ "YDD", "YDD", 130],
      // rial jemeński
      "YER": [ "YER", "YR", 0, "YER"],
      // YUD
      "YUD": [ "YUD", "YUD", 130],
      // nowy dinar jugosławiański
      "YUM": [ "YUM", "YUM", 130],
      // dinar jugosławiański wymienny
      "YUN": [ "YUN", "YUN", 130],
      // rand południowoafrykański (finansowy)
      "ZAL": [ "ZAL", "ZAL", 2],
      // rand południowoafrykański
      "ZAR": [ "ZAR", "R", 2, "ZAR"],
      // kwacha zambijska
      "ZMK": [ "ZMK", "ZK", 0],
      // nowy zair zairski
      "ZRN": [ "ZRN", "NZ", 130],
      // zair zairski
      "ZRZ": [ "ZRZ", "ZRZ", 130],
      // dolar Zimbabwe
      "ZWD": [ "ZWD", "Z$", 128],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "peseta andorska");
    result.put("AED", "dirham arabski");
    result.put("AFA", "afgani (1927-2002)");
    result.put("AFN", "afgani");
    result.put("ALL", "lek albański");
    result.put("AMD", "dram armeński");
    result.put("ANG", "gulden Antyle Holenderskie");
    result.put("AOA", "kwanza angolańska");
    result.put("AOK", "kwanza angolańska (1977-1990)");
    result.put("AON", "nowa kwanza angolańska (1990-2000)");
    result.put("AOR", "kwanza angolańska Reajustado (1995-1999)");
    result.put("ARA", "austral argentyński");
    result.put("ARP", "peso argentyńskie (1983-1985)");
    result.put("ARS", "peso argentyńskie");
    result.put("ATS", "szyling austriacki ");
    result.put("AUD", "dolar australijski");
    result.put("AWG", "gulden arubski");
    result.put("AZM", "manat azerbejdżański");
    result.put("AZN", "manat azerski");
    result.put("BAD", "dinar Bośni i Hercegowiny");
    result.put("BAM", "marka konwertybilna Bośni i Hercegowiny");
    result.put("BBD", "dolar Barbadosu");
    result.put("BDT", "taka bengalska");
    result.put("BEC", "frank belgijski (zamienny)");
    result.put("BEF", "frank belgijski");
    result.put("BEL", "frank belgijski (finansowy)");
    result.put("BGL", "lew bułgarski");
    result.put("BGN", "nowy lew bułgarski");
    result.put("BHD", "dinar bahrański");
    result.put("BIF", "frank burundyjski");
    result.put("BMD", "dolar bermudzki");
    result.put("BND", "dolar brunejski");
    result.put("BOB", "boliviano");
    result.put("BOP", "peso boliwijskie");
    result.put("BOV", "mvdol boliwijski");
    result.put("BRB", "cruzeiro novo brazylijskie (1967-1986)");
    result.put("BRC", "cruzado brazylijskie");
    result.put("BRE", "cruzeiro brazylijskie (1990-1993)");
    result.put("BRL", "real brazylijski");
    result.put("BRN", "nowe cruzado brazylijskie");
    result.put("BRR", "cruzeiro brazylijskie");
    result.put("BSD", "dolar bahamski");
    result.put("BTN", "ngultrum Bhutanu");
    result.put("BUK", "kyat birmański");
    result.put("BWP", "pula");
    result.put("BYB", "rubel białoruski (1994-1999)");
    result.put("BYR", "rubel białoruski");
    result.put("BZD", "dolar belizeński");
    result.put("CAD", "dolar kanadyjski");
    result.put("CDF", "frank kongijski");
    result.put("CHF", "frank szwajcarski");
    result.put("CLP", "peso chilijskie");
    result.put("CNY", "juan renminbi");
    result.put("COP", "peso kolumbijskie");
    result.put("CRC", "colon kostarykański");
    result.put("CSD", "stary dinar serbski");
    result.put("CSK", "korona czechosłowacka");
    result.put("CUP", "peso kubańskie");
    result.put("CVE", "escudo Zielonego Przylądka");
    result.put("CYP", "funt cypryjski");
    result.put("CZK", "korona czeska");
    result.put("DDM", "wschodnia marka wschodnioniemiecka");
    result.put("DEM", "marka niemiecka");
    result.put("DJF", "frank Dżibuti");
    result.put("DKK", "korona duńska");
    result.put("DOP", "peso dominikańskie");
    result.put("DZD", "dinar algierski");
    result.put("ECS", "sucre ekwadorski");
    result.put("EEK", "korona estońska");
    result.put("EGP", "funt egipski");
    result.put("ERN", "nakfa erytrejska");
    result.put("ESA", "peseta hiszpańska (Konto A)");
    result.put("ESB", "peseta hiszpańska (konto wymienne)");
    result.put("ESP", "peseta hiszpańska");
    result.put("ETB", "birr etiopski");
    result.put("EUR", "euro");
    result.put("FIM", "marka fińska");
    result.put("FJD", "dolar fidżi");
    result.put("FKP", "funt Wysp Falklandzkich");
    result.put("FRF", "frank francuski ");
    result.put("GBP", "funt szterling");
    result.put("GEK", "kupon gruziński larit");
    result.put("GEL", "lari gruzińskie");
    result.put("GHC", "cedi ghańskie");
    result.put("GHS", "cedi Ghany");
    result.put("GIP", "funt gibraltarski");
    result.put("GMD", "dalasi gambijskie");
    result.put("GNF", "frank gwinejski");
    result.put("GNS", "syli gwinejskie");
    result.put("GQE", "ekwele gwinejskie Gwinei Równikowej");
    result.put("GRD", "drachma grecka");
    result.put("GTQ", "quetzal gwatemalski");
    result.put("GWE", "escudo Gwinea Portugalska");
    result.put("GWP", "peso Guinea-Bissau");
    result.put("GYD", "dolar gujański");
    result.put("HKD", "dolar hongkoński");
    result.put("HNL", "lempira Hondurasu");
    result.put("HRD", "dinar chorwacki");
    result.put("HRK", "kuna chorwacka");
    result.put("HTG", "gourde haitańskie");
    result.put("HUF", "forint węgierski ");
    result.put("IDR", "rupia indonezyjska");
    result.put("IEP", "funt irlandzki");
    result.put("ILP", "funt izraelski");
    result.put("ILS", "nowy szekel izraelski");
    result.put("INR", "rupia indyjska");
    result.put("IQD", "dinar iracki");
    result.put("IRR", "rial irański");
    result.put("ISK", "korona islandzka");
    result.put("ITL", "lir włoski");
    result.put("JMD", "dolar jamajski");
    result.put("JOD", "dinar jordański");
    result.put("JPY", "jen japoński");
    result.put("KES", "szyling kenijski");
    result.put("KGS", "som kirgiski");
    result.put("KHR", "riel kambodżański");
    result.put("KMF", "frank komoryjski");
    result.put("KPW", "won północnokoreański");
    result.put("KRW", "won południowokoreański");
    result.put("KWD", "dinar kuwejcki");
    result.put("KYD", "dolar kajmański");
    result.put("KZT", "tenge kazachskie");
    result.put("LAK", "kip laotański");
    result.put("LBP", "funt libański");
    result.put("LKR", "rupia lankijska");
    result.put("LRD", "dolar liberyjski");
    result.put("LSL", "loti Lesoto");
    result.put("LTL", "lit litewski");
    result.put("LTT", "talon litewski");
    result.put("LUF", "frank luksemburski");
    result.put("LVL", "łat łotewski");
    result.put("LVR", "rubel łotewski");
    result.put("LYD", "dinar libijski");
    result.put("MAD", "dirham marokański");
    result.put("MAF", "frank marokański");
    result.put("MDL", "lej mołdawski");
    result.put("MGA", "ariar malgaski");
    result.put("MGF", "frank malgaski");
    result.put("MKD", "denar macedoński");
    result.put("MLF", "frank malijski");
    result.put("MMK", "kyat Myanmar");
    result.put("MNT", "tugrik mongolski");
    result.put("MOP", "pataka Macao");
    result.put("MRO", "ouguiya mauterańska");
    result.put("MTL", "lira maltańska");
    result.put("MTP", "funt maltański");
    result.put("MUR", "rupia Mauritius");
    result.put("MVR", "rufiyaa malediwska");
    result.put("MWK", "kwacha malawska");
    result.put("MXN", "peso meksykańskie");
    result.put("MXP", "peso srebrne meksykańskie (1861-1992)");
    result.put("MYR", "ringgit malezyjski");
    result.put("MZE", "escudo mozambickie");
    result.put("MZM", "metical Mozambik");
    result.put("MZN", "metical Mozambiku");
    result.put("NAD", "dolar namibijski");
    result.put("NGN", "naira nigeryjska");
    result.put("NIC", "cordoba nikaraguańska");
    result.put("NIO", "cordoba oro nikaraguańska");
    result.put("NLG", "gulden holenderski ");
    result.put("NOK", "korona norweska");
    result.put("NPR", "rupia nepalska");
    result.put("NZD", "dolar nowozelandzki");
    result.put("OMR", "rial Omanu");
    result.put("PAB", "balboa panamski");
    result.put("PEI", "inti peruwiański");
    result.put("PEN", "nowy sol peruwiański");
    result.put("PES", "sol peruwiański");
    result.put("PGK", "kina Papua Nowa Gwinea");
    result.put("PHP", "peso filipińskie");
    result.put("PKR", "rupia pakistańska");
    result.put("PLN", "złoty polski");
    result.put("PLZ", "złoty polski (1950-1995)");
    result.put("PTE", "escudo portugalskie");
    result.put("PYG", "guarani paragwajskie");
    result.put("QAR", "rial katarski");
    result.put("RHD", "dolar rodezyjski");
    result.put("ROL", "lej rumuński");
    result.put("RON", "nowa leja rumuńska");
    result.put("RSD", "dinar serbski");
    result.put("RUB", "rubel rosyjski");
    result.put("RUR", "rubel rosyjski (1991-1998)");
    result.put("RWF", "frank ruandyjski");
    result.put("SAR", "rial saudyjski");
    result.put("SBD", "dolar Wysp Salomona");
    result.put("SCR", "rupia seszelska");
    result.put("SDD", "dinar sudański");
    result.put("SDG", "funt sudański");
    result.put("SDP", "stary funt sudański");
    result.put("SEK", "korona szwedzka");
    result.put("SGD", "dolar singapurski");
    result.put("SHP", "funt Wyspy Świętej Heleny");
    result.put("SIT", "tolar słoweński");
    result.put("SKK", "korona słowacka");
    result.put("SLL", "leone Sierra Leone");
    result.put("SOS", "szyling somalijski");
    result.put("SRD", "dolar surinamski");
    result.put("SRG", "gulden surinamski");
    result.put("STD", "dobra Wysp Świętego Tomasza i Książęcej");
    result.put("SUR", "rubel radziecki");
    result.put("SVC", "colon salwadorski");
    result.put("SYP", "funt syryjski");
    result.put("SZL", "lilangeni Suazi");
    result.put("THB", "baht tajski");
    result.put("TJR", "rubel tadżycki");
    result.put("TJS", "somoni tadżyckie");
    result.put("TMM", "manat turkmeński");
    result.put("TND", "dinar tunezyjski");
    result.put("TOP", "paʻanga Tonga");
    result.put("TPE", "escudo timorskie");
    result.put("TRL", "lir turecki");
    result.put("TRY", "nowa lira turecka");
    result.put("TTD", "dolar Trynidadu i Tobago");
    result.put("TWD", "nowy dolar tajwański");
    result.put("TZS", "szyling tanzański");
    result.put("UAH", "hrywna ukraińska");
    result.put("UAK", "karbowaniec ukraiński");
    result.put("UGS", "szyling ugandyjski (1966-1987)");
    result.put("UGX", "szyling ugandyjski");
    result.put("USD", "dolar amerykański ");
    result.put("UYP", "peso urugwajskie (1975-1993)");
    result.put("UYU", "peso urugwajskie");
    result.put("UZS", "som uzbecki");
    result.put("VEB", "boliwar wenezuelski");
    result.put("VEF", "boliwar fuerte");
    result.put("VND", "dong wietnamski");
    result.put("VUV", "vatu Vanuatu");
    result.put("WST", "tala samoańska");
    result.put("XAF", "frank CFA BEAC");
    result.put("XAG", "srebro");
    result.put("XAU", "złoto");
    result.put("XCD", "dolar wschodniokaraibski");
    result.put("XDR", "specjalne prawa ciągnienia");
    result.put("XEU", "ECU");
    result.put("XFO", "frank złoty francuski");
    result.put("XFU", "UIC-frank francuski");
    result.put("XOF", "frank CFA");
    result.put("XPD", "pallad");
    result.put("XPF", "frank CFP");
    result.put("XPT", "platyna");
    result.put("XXX", "nieznana/nieprawidłowa waluta");
    result.put("YDD", "dinar jemeński");
    result.put("YER", "rial jemeński");
    result.put("YUM", "nowy dinar jugosławiański");
    result.put("YUN", "dinar jugosławiański wymienny");
    result.put("ZAL", "rand południowoafrykański (finansowy)");
    result.put("ZAR", "rand południowoafrykański");
    result.put("ZMK", "kwacha zambijska");
    result.put("ZRN", "nowy zair zairski");
    result.put("ZRZ", "zair zairski");
    result.put("ZWD", "dolar Zimbabwe");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "peseta andorska",
      "AED": "dirham arabski",
      "AFA": "afgani (1927-2002)",
      "AFN": "afgani",
      "ALL": "lek albański",
      "AMD": "dram armeński",
      "ANG": "gulden Antyle Holenderskie",
      "AOA": "kwanza angolańska",
      "AOK": "kwanza angolańska (1977-1990)",
      "AON": "nowa kwanza angolańska (1990-2000)",
      "AOR": "kwanza angolańska Reajustado (1995-1999)",
      "ARA": "austral argentyński",
      "ARP": "peso argentyńskie (1983-1985)",
      "ARS": "peso argentyńskie",
      "ATS": "szyling austriacki ",
      "AUD": "dolar australijski",
      "AWG": "gulden arubski",
      "AZM": "manat azerbejdżański",
      "AZN": "manat azerski",
      "BAD": "dinar Bośni i Hercegowiny",
      "BAM": "marka konwertybilna Bośni i Hercegowiny",
      "BBD": "dolar Barbadosu",
      "BDT": "taka bengalska",
      "BEC": "frank belgijski (zamienny)",
      "BEF": "frank belgijski",
      "BEL": "frank belgijski (finansowy)",
      "BGL": "lew bułgarski",
      "BGN": "nowy lew bułgarski",
      "BHD": "dinar bahrański",
      "BIF": "frank burundyjski",
      "BMD": "dolar bermudzki",
      "BND": "dolar brunejski",
      "BOB": "boliviano",
      "BOP": "peso boliwijskie",
      "BOV": "mvdol boliwijski",
      "BRB": "cruzeiro novo brazylijskie (1967-1986)",
      "BRC": "cruzado brazylijskie",
      "BRE": "cruzeiro brazylijskie (1990-1993)",
      "BRL": "real brazylijski",
      "BRN": "nowe cruzado brazylijskie",
      "BRR": "cruzeiro brazylijskie",
      "BSD": "dolar bahamski",
      "BTN": "ngultrum Bhutanu",
      "BUK": "kyat birmański",
      "BWP": "pula",
      "BYB": "rubel białoruski (1994-1999)",
      "BYR": "rubel białoruski",
      "BZD": "dolar belizeński",
      "CAD": "dolar kanadyjski",
      "CDF": "frank kongijski",
      "CHF": "frank szwajcarski",
      "CLP": "peso chilijskie",
      "CNY": "juan renminbi",
      "COP": "peso kolumbijskie",
      "CRC": "colon kostarykański",
      "CSD": "stary dinar serbski",
      "CSK": "korona czechosłowacka",
      "CUP": "peso kubańskie",
      "CVE": "escudo Zielonego Przylądka",
      "CYP": "funt cypryjski",
      "CZK": "korona czeska",
      "DDM": "wschodnia marka wschodnioniemiecka",
      "DEM": "marka niemiecka",
      "DJF": "frank Dżibuti",
      "DKK": "korona duńska",
      "DOP": "peso dominikańskie",
      "DZD": "dinar algierski",
      "ECS": "sucre ekwadorski",
      "EEK": "korona estońska",
      "EGP": "funt egipski",
      "ERN": "nakfa erytrejska",
      "ESA": "peseta hiszpańska (Konto A)",
      "ESB": "peseta hiszpańska (konto wymienne)",
      "ESP": "peseta hiszpańska",
      "ETB": "birr etiopski",
      "EUR": "euro",
      "FIM": "marka fińska",
      "FJD": "dolar fidżi",
      "FKP": "funt Wysp Falklandzkich",
      "FRF": "frank francuski ",
      "GBP": "funt szterling",
      "GEK": "kupon gruziński larit",
      "GEL": "lari gruzińskie",
      "GHC": "cedi ghańskie",
      "GHS": "cedi Ghany",
      "GIP": "funt gibraltarski",
      "GMD": "dalasi gambijskie",
      "GNF": "frank gwinejski",
      "GNS": "syli gwinejskie",
      "GQE": "ekwele gwinejskie Gwinei Równikowej",
      "GRD": "drachma grecka",
      "GTQ": "quetzal gwatemalski",
      "GWE": "escudo Gwinea Portugalska",
      "GWP": "peso Guinea-Bissau",
      "GYD": "dolar gujański",
      "HKD": "dolar hongkoński",
      "HNL": "lempira Hondurasu",
      "HRD": "dinar chorwacki",
      "HRK": "kuna chorwacka",
      "HTG": "gourde haitańskie",
      "HUF": "forint węgierski ",
      "IDR": "rupia indonezyjska",
      "IEP": "funt irlandzki",
      "ILP": "funt izraelski",
      "ILS": "nowy szekel izraelski",
      "INR": "rupia indyjska",
      "IQD": "dinar iracki",
      "IRR": "rial irański",
      "ISK": "korona islandzka",
      "ITL": "lir włoski",
      "JMD": "dolar jamajski",
      "JOD": "dinar jordański",
      "JPY": "jen japoński",
      "KES": "szyling kenijski",
      "KGS": "som kirgiski",
      "KHR": "riel kambodżański",
      "KMF": "frank komoryjski",
      "KPW": "won północnokoreański",
      "KRW": "won południowokoreański",
      "KWD": "dinar kuwejcki",
      "KYD": "dolar kajmański",
      "KZT": "tenge kazachskie",
      "LAK": "kip laotański",
      "LBP": "funt libański",
      "LKR": "rupia lankijska",
      "LRD": "dolar liberyjski",
      "LSL": "loti Lesoto",
      "LTL": "lit litewski",
      "LTT": "talon litewski",
      "LUF": "frank luksemburski",
      "LVL": "łat łotewski",
      "LVR": "rubel łotewski",
      "LYD": "dinar libijski",
      "MAD": "dirham marokański",
      "MAF": "frank marokański",
      "MDL": "lej mołdawski",
      "MGA": "ariar malgaski",
      "MGF": "frank malgaski",
      "MKD": "denar macedoński",
      "MLF": "frank malijski",
      "MMK": "kyat Myanmar",
      "MNT": "tugrik mongolski",
      "MOP": "pataka Macao",
      "MRO": "ouguiya mauterańska",
      "MTL": "lira maltańska",
      "MTP": "funt maltański",
      "MUR": "rupia Mauritius",
      "MVR": "rufiyaa malediwska",
      "MWK": "kwacha malawska",
      "MXN": "peso meksykańskie",
      "MXP": "peso srebrne meksykańskie (1861-1992)",
      "MYR": "ringgit malezyjski",
      "MZE": "escudo mozambickie",
      "MZM": "metical Mozambik",
      "MZN": "metical Mozambiku",
      "NAD": "dolar namibijski",
      "NGN": "naira nigeryjska",
      "NIC": "cordoba nikaraguańska",
      "NIO": "cordoba oro nikaraguańska",
      "NLG": "gulden holenderski ",
      "NOK": "korona norweska",
      "NPR": "rupia nepalska",
      "NZD": "dolar nowozelandzki",
      "OMR": "rial Omanu",
      "PAB": "balboa panamski",
      "PEI": "inti peruwiański",
      "PEN": "nowy sol peruwiański",
      "PES": "sol peruwiański",
      "PGK": "kina Papua Nowa Gwinea",
      "PHP": "peso filipińskie",
      "PKR": "rupia pakistańska",
      "PLN": "złoty polski",
      "PLZ": "złoty polski (1950-1995)",
      "PTE": "escudo portugalskie",
      "PYG": "guarani paragwajskie",
      "QAR": "rial katarski",
      "RHD": "dolar rodezyjski",
      "ROL": "lej rumuński",
      "RON": "nowa leja rumuńska",
      "RSD": "dinar serbski",
      "RUB": "rubel rosyjski",
      "RUR": "rubel rosyjski (1991-1998)",
      "RWF": "frank ruandyjski",
      "SAR": "rial saudyjski",
      "SBD": "dolar Wysp Salomona",
      "SCR": "rupia seszelska",
      "SDD": "dinar sudański",
      "SDG": "funt sudański",
      "SDP": "stary funt sudański",
      "SEK": "korona szwedzka",
      "SGD": "dolar singapurski",
      "SHP": "funt Wyspy Świętej Heleny",
      "SIT": "tolar słoweński",
      "SKK": "korona słowacka",
      "SLL": "leone Sierra Leone",
      "SOS": "szyling somalijski",
      "SRD": "dolar surinamski",
      "SRG": "gulden surinamski",
      "STD": "dobra Wysp Świętego Tomasza i Książęcej",
      "SUR": "rubel radziecki",
      "SVC": "colon salwadorski",
      "SYP": "funt syryjski",
      "SZL": "lilangeni Suazi",
      "THB": "baht tajski",
      "TJR": "rubel tadżycki",
      "TJS": "somoni tadżyckie",
      "TMM": "manat turkmeński",
      "TND": "dinar tunezyjski",
      "TOP": "paʻanga Tonga",
      "TPE": "escudo timorskie",
      "TRL": "lir turecki",
      "TRY": "nowa lira turecka",
      "TTD": "dolar Trynidadu i Tobago",
      "TWD": "nowy dolar tajwański",
      "TZS": "szyling tanzański",
      "UAH": "hrywna ukraińska",
      "UAK": "karbowaniec ukraiński",
      "UGS": "szyling ugandyjski (1966-1987)",
      "UGX": "szyling ugandyjski",
      "USD": "dolar amerykański ",
      "UYP": "peso urugwajskie (1975-1993)",
      "UYU": "peso urugwajskie",
      "UZS": "som uzbecki",
      "VEB": "boliwar wenezuelski",
      "VEF": "boliwar fuerte",
      "VND": "dong wietnamski",
      "VUV": "vatu Vanuatu",
      "WST": "tala samoańska",
      "XAF": "frank CFA BEAC",
      "XAG": "srebro",
      "XAU": "złoto",
      "XCD": "dolar wschodniokaraibski",
      "XDR": "specjalne prawa ciągnienia",
      "XEU": "ECU",
      "XFO": "frank złoty francuski",
      "XFU": "UIC-frank francuski",
      "XOF": "frank CFA",
      "XPD": "pallad",
      "XPF": "frank CFP",
      "XPT": "platyna",
      "XXX": "nieznana/nieprawidłowa waluta",
      "YDD": "dinar jemeński",
      "YER": "rial jemeński",
      "YUM": "nowy dinar jugosławiański",
      "YUN": "dinar jugosławiański wymienny",
      "ZAL": "rand południowoafrykański (finansowy)",
      "ZAR": "rand południowoafrykański",
      "ZMK": "kwacha zambijska",
      "ZRN": "nowy zair zairski",
      "ZRZ": "zair zairski",
      "ZWD": "dolar Zimbabwe",
    };
  }-*/;
}
