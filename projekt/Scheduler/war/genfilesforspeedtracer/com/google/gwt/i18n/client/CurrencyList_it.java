package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_it extends com.google.gwt.i18n.client.CurrencyList_ {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("CHF", "Fr.", 2, "CHF");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "CHF", "Fr.", 2, "CHF"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // Peseta Andorrana
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128));
    // Dirham degli Emirati Arabi Uniti
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH"));
    // Afgani (1927-2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130));
    // Afgani
    result.put("AFN", new CurrencyDataImpl("AFN", "Af", 0));
    // Lek Albanese
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0));
    // Dram Armeno
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 0));
    // Fiorino delle Antille Olandesi
    result.put("ANG", new CurrencyDataImpl("ANG", "NAf.", 2));
    // Kwanza Angolano
    result.put("AOA", new CurrencyDataImpl("AOA", "Kz", 2));
    // Kwanza Angolano (1977-1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130));
    // Nuovo Kwanza Angolano (1990-2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130));
    // Kwanza Reajustado Angolano (1995-1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130));
    // Austral Argentino
    result.put("ARA", new CurrencyDataImpl("ARA", "₳", 130));
    // ARL
    result.put("ARL", new CurrencyDataImpl("ARL", "$L", 130));
    // ARM
    result.put("ARM", new CurrencyDataImpl("ARM", "m$n", 130));
    // Peso Argentino (vecchio Cod.)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130));
    // Peso Argentino
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$"));
    // Scellino Austriaco
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130));
    // Dollaro Australiano
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$"));
    // Fiorino di Aruba
    result.put("AWG", new CurrencyDataImpl("AWG", "Afl.", 2));
    // Manat Azero (1993-2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130));
    // manat azero
    result.put("AZN", new CurrencyDataImpl("AZN", "man.", 2));
    // Dinar Bosnia-Herzegovina
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130));
    // Marco Conv. Bosnia-Erzegovina
    result.put("BAM", new CurrencyDataImpl("BAM", "KM", 2));
    // Dollaro di Barbados
    result.put("BBD", new CurrencyDataImpl("BBD", "Bds$", 2));
    // Taka Bangladese
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk"));
    // Franco Belga (convertibile)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 2));
    // Franco Belga
    result.put("BEF", new CurrencyDataImpl("BEF", "BF", 130));
    // Franco Belga (finanziario)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 2));
    // Lev Bulgaro
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130));
    // Nuovo Lev Bulgaro
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2));
    // Dinaro del Bahraini
    result.put("BHD", new CurrencyDataImpl("BHD", "BD", 3));
    // Franco del Burundi
    result.put("BIF", new CurrencyDataImpl("BIF", "FBu", 0));
    // Dollaro delle Bermuda
    result.put("BMD", new CurrencyDataImpl("BMD", "BD$", 2));
    // Dollaro del Brunei
    result.put("BND", new CurrencyDataImpl("BND", "BN$", 2));
    // Boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "Bs", 2));
    // Peso Boliviano
    result.put("BOP", new CurrencyDataImpl("BOP", "$b.", 130));
    // Mvdol Boliviano
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 2));
    // Cruzeiro Novo Brasiliano (1967-1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130));
    // Cruzado Brasiliano
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130));
    // Cruzeiro Brasiliano (1990-1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130));
    // Real Brasiliano
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$"));
    // Cruzado Novo Brasiliano
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130));
    // Cruzeiro Brasiliano
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130));
    // Dollaro delle Bahamas
    result.put("BSD", new CurrencyDataImpl("BSD", "BS$", 2));
    // Ngultrum Butanese
    result.put("BTN", new CurrencyDataImpl("BTN", "Nu.", 2));
    // Kyat Birmano
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130));
    // Pula del Botswana
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2));
    // Nuovo Rublo Bielorussia (1994-1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130));
    // Rublo Bielorussia
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 0));
    // Dollaro Belize
    result.put("BZD", new CurrencyDataImpl("BZD", "BZ$", 2));
    // Dollaro Canadese
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$"));
    // Franco Congolese
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2));
    // CHE
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 2));
    // Franco Svizzero
    result.put("CHF", new CurrencyDataImpl("CHF", "Fr.", 2, "CHF"));
    // CHW
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 2));
    // CLE
    result.put("CLE", new CurrencyDataImpl("CLE", "Eº", 130));
    // Unidades de Fomento Chilene
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 0));
    // Peso Cileno
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$"));
    // Renmimbi Cinese
    result.put("CNY", new CurrencyDataImpl("CNY", "CN¥", 2, "RMB¥"));
    // Peso Colombiano
    result.put("COP", new CurrencyDataImpl("COP", "CO$", 0, "COL$"));
    // COU
    result.put("COU", new CurrencyDataImpl("COU", "COU", 2));
    // Colón Costaricano
    result.put("CRC", new CurrencyDataImpl("CRC", "₡", 0, "CR₡"));
    // antico dinaro serbo
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130));
    // Corona forte cecoslovacca
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130));
    // CUC
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC$", 2));
    // Peso Cubano
    result.put("CUP", new CurrencyDataImpl("CUP", "CU$", 2, "$MN"));
    // Escudo del Capo Verde
    result.put("CVE", new CurrencyDataImpl("CVE", "CV$", 2));
    // Sterlina Cipriota
    result.put("CYP", new CurrencyDataImpl("CYP", "CY£", 130));
    // Corona Ceca
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč"));
    // Ostmark della Germania Orientale
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130));
    // Marco Tedesco
    result.put("DEM", new CurrencyDataImpl("DEM", "DM", 130));
    // Franco Gibutiano
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0));
    // Corona Danese
    result.put("DKK", new CurrencyDataImpl("DKK", "Dkr", 2, "kr"));
    // Peso Dominicano
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$"));
    // Dinaro Algerino
    result.put("DZD", new CurrencyDataImpl("DZD", "DA", 2));
    // Sucre dell’Ecuador
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130));
    // Unidad de Valor Constante (UVC) dell’Ecuador
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 2));
    // Corona dell’Estonia
    result.put("EEK", new CurrencyDataImpl("EEK", "Ekr", 2));
    // Sterlina Egiziana
    result.put("EGP", new CurrencyDataImpl("EGP", "EG£", 2, "LE"));
    // EQE
    result.put("EQE", new CurrencyDataImpl("EQE", "EQE", 130));
    // Nakfa Eritreo
    result.put("ERN", new CurrencyDataImpl("ERN", "Nfk", 2));
    // peseta spagnola account
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 2));
    // peseta spagnola account convertibile
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 2));
    // Peseta Spagnola
    result.put("ESP", new CurrencyDataImpl("ESP", "Pts", 128));
    // Birr Etiopico
    result.put("ETB", new CurrencyDataImpl("ETB", "Br", 2));
    // Euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€"));
    // Markka Finlandese
    result.put("FIM", new CurrencyDataImpl("FIM", "mk", 130));
    // Dollaro delle Figi
    result.put("FJD", new CurrencyDataImpl("FJD", "FJ$", 2));
    // Sterlina delle Falkland
    result.put("FKP", new CurrencyDataImpl("FKP", "FK£", 2));
    // Franco Francese
    result.put("FRF", new CurrencyDataImpl("FRF", "₣", 130));
    // Sterlina Inglese
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£"));
    // Kupon Larit Georgiano
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130));
    // Lari Georgiano
    result.put("GEL", new CurrencyDataImpl("GEL", "GEL", 2));
    // Cedi del Ghana
    result.put("GHC", new CurrencyDataImpl("GHC", "₵", 130));
    // Cedi ghanese
    result.put("GHS", new CurrencyDataImpl("GHS", "GH₵", 2));
    // Sterlina di Gibilterra
    result.put("GIP", new CurrencyDataImpl("GIP", "GI£", 2));
    // Dalasi del Gambia
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2));
    // Franco della Guinea
    result.put("GNF", new CurrencyDataImpl("GNF", "FG", 0));
    // Syli della Guinea
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130));
    // Ekwele della Guinea Equatoriale
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130));
    // Dracma Greca
    result.put("GRD", new CurrencyDataImpl("GRD", "₯", 130));
    // Quetzal Guatemalteco
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2));
    // Escudo della Guinea portoghese
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130));
    // Peso della Guinea-Bissau
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 2));
    // Dollaro della Guyana
    result.put("GYD", new CurrencyDataImpl("GYD", "GY$", 0));
    // Dollaro di Hong Kong
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$"));
    // Lempira Hoduregno
    result.put("HNL", new CurrencyDataImpl("HNL", "HNL", 2));
    // Dinaro Croato
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130));
    // Kuna Croata
    result.put("HRK", new CurrencyDataImpl("HRK", "kn", 2));
    // Gourde Haitiano
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2));
    // Fiorino Ungherese
    result.put("HUF", new CurrencyDataImpl("HUF", "Ft", 0));
    // Rupia Indonesiana
    result.put("IDR", new CurrencyDataImpl("IDR", "Rp", 0));
    // Sterlina irlandese
    result.put("IEP", new CurrencyDataImpl("IEP", "IR£", 130));
    // Sterlina Israeliana
    result.put("ILP", new CurrencyDataImpl("ILP", "I£", 130));
    // Nuovo sheqel israeliano
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪"));
    // Rupia Indiana
    result.put("INR", new CurrencyDataImpl("INR", "Rs", 2, "Rs"));
    // Dinaro Iracheno
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0));
    // Rial Iraniano
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0));
    // Corona Islandese
    result.put("ISK", new CurrencyDataImpl("ISK", "Ikr", 0, "kr"));
    // Lira Italiana
    result.put("ITL", new CurrencyDataImpl("ITL", "IT₤", 128));
    // Dollaro Giamaicano
    result.put("JMD", new CurrencyDataImpl("JMD", "J$", 2, "JA$"));
    // Dinaro Giordano
    result.put("JOD", new CurrencyDataImpl("JOD", "JD", 3));
    // Yen Giapponese
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥"));
    // Scellino Keniota
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2));
    // Som Kirghiso
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2));
    // Riel Cambogiano
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2));
    // Franco Comoriano
    result.put("KMF", new CurrencyDataImpl("KMF", "CF", 0));
    // Won Nordcoreano
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0));
    // Won Sudcoreano
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩"));
    // Dinaro Kuwaitiano
    result.put("KWD", new CurrencyDataImpl("KWD", "KD", 3));
    // Dollaro delle Isole Cayman
    result.put("KYD", new CurrencyDataImpl("KYD", "KY$", 2));
    // Tenge Kazaco
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2));
    // Kip Laotiano
    result.put("LAK", new CurrencyDataImpl("LAK", "₭", 0));
    // Sterlina Libanese
    result.put("LBP", new CurrencyDataImpl("LBP", "LB£", 0));
    // Rupia di Sri Lanka
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs"));
    // Dollaro Liberiano
    result.put("LRD", new CurrencyDataImpl("LRD", "L$", 2));
    // Loti del Lesotho
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2));
    // LSM
    result.put("LSM", new CurrencyDataImpl("LSM", "LSM", 130));
    // Lita Lituana
    result.put("LTL", new CurrencyDataImpl("LTL", "Lt", 2));
    // Talonas Lituani
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130));
    // franco convertibile del Lussemburgo
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 2));
    // Franco del Lussemburgo
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128));
    // franco finanziario del Lussemburgo
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 2));
    // Lat Lettone
    result.put("LVL", new CurrencyDataImpl("LVL", "Ls", 2));
    // Rublo Lettone
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130));
    // Dinaro Libico
    result.put("LYD", new CurrencyDataImpl("LYD", "LD", 3));
    // Dirham Marocchino
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2));
    // Franco Marocchino
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130));
    // Leu Moldavo
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2));
    // Ariary Malgascio
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0));
    // Franco Malgascio
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128));
    // Dinaro Macedone
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2));
    // Franco di Mali
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130));
    // Kyat di Myanmar
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0));
    // Tugrik Mongolo
    result.put("MNT", new CurrencyDataImpl("MNT", "₮", 0, "MN₮"));
    // Pataca di Macao
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP$", 2));
    // Ouguiya della Mauritania
    result.put("MRO", new CurrencyDataImpl("MRO", "UM", 0));
    // Lira Maltese
    result.put("MTL", new CurrencyDataImpl("MTL", "Lm", 130));
    // Sterlina Maltese
    result.put("MTP", new CurrencyDataImpl("MTP", "MT£", 130));
    // Rupia Mauriziana
    result.put("MUR", new CurrencyDataImpl("MUR", "MURs", 0));
    // Rufiyaa delle Maldive
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2));
    // Kwacha Malawiano
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2));
    // Peso Messicano
    result.put("MXN", new CurrencyDataImpl("MXN", "Mex$", 2, "Mex$"));
    // Peso messicano d’argento (1861-1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MX$", 130));
    // Unidad de Inversion (UDI) Messicana
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 2));
    // Ringgit della Malesia
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM"));
    // Escudo del Mozambico
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130));
    // MZM
    result.put("MZM", new CurrencyDataImpl("MZM", "Mt", 130));
    // Metical del Mozambico
    result.put("MZN", new CurrencyDataImpl("MZN", "MTn", 2));
    // Dollaro Namibiano
    result.put("NAD", new CurrencyDataImpl("NAD", "N$", 2));
    // Naira Nigeriana
    result.put("NGN", new CurrencyDataImpl("NGN", "₦", 2));
    // Cordoba Nicaraguense
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130));
    // Córdoba oro nicaraguense
    result.put("NIO", new CurrencyDataImpl("NIO", "C$", 2));
    // Fiorino Olandese
    result.put("NLG", new CurrencyDataImpl("NLG", "fl", 130));
    // Corona Norvegese
    result.put("NOK", new CurrencyDataImpl("NOK", "Nkr", 2, "NOkr"));
    // Rupia Nepalese
    result.put("NPR", new CurrencyDataImpl("NPR", "NPRs", 2));
    // Dollaro Neozelandese
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2));
    // Rial Omanita
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3));
    // Balboa di Panama
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/."));
    // Inti Peruviano
    result.put("PEI", new CurrencyDataImpl("PEI", "I/.", 130));
    // Sol Nuevo Peruviano
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/."));
    // Sol Peruviano
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130));
    // Kina della Papua Nuova Guinea
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2));
    // Peso delle Filippine
    result.put("PHP", new CurrencyDataImpl("PHP", "₱", 2, "PHP"));
    // Rupia del Pakistan
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs", 0, "PKRs."));
    // Zloty Polacco
    result.put("PLN", new CurrencyDataImpl("PLN", "zł", 2));
    // Zloty Polacco (1950-1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130));
    // Escudo Portoghese
    result.put("PTE", new CurrencyDataImpl("PTE", "Esc", 130));
    // Guarani del Paraguay
    result.put("PYG", new CurrencyDataImpl("PYG", "₲", 0));
    // Rial del Qatar
    result.put("QAR", new CurrencyDataImpl("QAR", "QR", 2));
    // dollaro della Rhodesia
    result.put("RHD", new CurrencyDataImpl("RHD", "RH$", 130));
    // Leu della Romania
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130));
    // leu rumeno
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2));
    // Dinaro serbo
    result.put("RSD", new CurrencyDataImpl("RSD", "din.", 0));
    // Rublo Russo
    result.put("RUB", new CurrencyDataImpl("RUB", "руб", 2, "руб"));
    // Rublo della CSI
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130));
    // Franco Ruandese
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0));
    // Ryal Saudita
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR"));
    // Dollaro delle Isole Solomon
    result.put("SBD", new CurrencyDataImpl("SBD", "SI$", 2));
    // Rupia delle Seychelles
    result.put("SCR", new CurrencyDataImpl("SCR", "SRe", 2));
    // Dinaro Sudanese
    result.put("SDD", new CurrencyDataImpl("SDD", "LSd", 130));
    // Sterlina sudanese
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2));
    // SDP
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130));
    // Corona Svedese
    result.put("SEK", new CurrencyDataImpl("SEK", "Skr", 2, "kr"));
    // Dollaro di Singapore
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$"));
    // Sterlina di Sant’Elena
    result.put("SHP", new CurrencyDataImpl("SHP", "SH£", 2));
    // Tallero Sloveno
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130));
    // Corona Slovacca
    result.put("SKK", new CurrencyDataImpl("SKK", "Sk", 130));
    // Leone della Sierra Leone
    result.put("SLL", new CurrencyDataImpl("SLL", "Le", 0));
    // Scellino Somalo
    result.put("SOS", new CurrencyDataImpl("SOS", "Ssh", 0));
    // Dollaro surinamese
    result.put("SRD", new CurrencyDataImpl("SRD", "SR$", 2));
    // Fiorino del Suriname
    result.put("SRG", new CurrencyDataImpl("SRG", "Sf", 130));
    // Dobra di Sao Tomé e Principe
    result.put("STD", new CurrencyDataImpl("STD", "Db", 0));
    // Rublo Sovietico
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130));
    // Colón Salvadoregno
    result.put("SVC", new CurrencyDataImpl("SVC", "SV₡", 130));
    // Sterlina Siriana
    result.put("SYP", new CurrencyDataImpl("SYP", "SY£", 0));
    // Lilangeni dello Swaziland
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2));
    // Baht Tailandese
    result.put("THB", new CurrencyDataImpl("THB", "฿", 2, "THB"));
    // Rublo del Tajikistan
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130));
    // Somoni del Tajikistan
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2));
    // Manat Turkmeno
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128));
    // Dinaro Tunisino
    result.put("TND", new CurrencyDataImpl("TND", "DT", 3));
    // Paʻanga di Tonga
    result.put("TOP", new CurrencyDataImpl("TOP", "T$", 2));
    // Escudo di Timor
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130));
    // Lira Turca
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128));
    // nuova Lira turca
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL"));
    // Dollaro di Trinidad e Tobago
    result.put("TTD", new CurrencyDataImpl("TTD", "TT$", 2));
    // Nuovo dollaro taiwanese
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$"));
    // Scellino della Tanzania
    result.put("TZS", new CurrencyDataImpl("TZS", "TSh", 0));
    // Hrivna Ucraina
    result.put("UAH", new CurrencyDataImpl("UAH", "₴", 2));
    // Karbovanetz Ucraino
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130));
    // Scellino Ugandese (1966-1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130));
    // Scellino Ugandese
    result.put("UGX", new CurrencyDataImpl("UGX", "USh", 0));
    // Dollaro Statunitense
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$"));
    // Dollaro Statunitense (Next day)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 2));
    // Dollaro Statunitense (Same day)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 2));
    // Peso uruguaiano in unità indicizzate
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 2));
    // Peso Uruguaiano (1975-1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130));
    // Peso Uruguayo uruguaiano
    result.put("UYU", new CurrencyDataImpl("UYU", "$U", 2, "UY$"));
    // Sum dell’Uzbekistan
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 0));
    // Bolivar Venezuelano
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130));
    // Bolívar venezuelano forte
    result.put("VEF", new CurrencyDataImpl("VEF", "Bs.F.", 2));
    // Dong Vietnamita
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫"));
    // Vatu di Vanuatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VT", 0));
    // Tala della Samoa Occidentale
    result.put("WST", new CurrencyDataImpl("WST", "WS$", 2));
    // Franco CFA BEAC
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0));
    // Argento
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 2));
    // Oro
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 2));
    // Unità composita europea
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 2));
    // Unità monetaria europea
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 2));
    // Unità di acconto europea (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 2));
    // Unità di acconto europea (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 2));
    // Dollaro dei Caraibi Orientali
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2));
    // Diritti Speciali di Incasso
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 2));
    // XEU
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 2));
    // Franco Oro Francese
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 2));
    // Franco UIC Francese
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 2));
    // Franco CFA BCEAO
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0));
    // Palladio
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 2));
    // Franco CFP
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0));
    // platino
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 2));
    // fondi RINET
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 2));
    // codice di verifica della valuta
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 2));
    // Nessuna valuta
    result.put("XXX", new CurrencyDataImpl("XXX", "XXX", 2));
    // Dinaro dello Yemen
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130));
    // Rial dello Yemen
    result.put("YER", new CurrencyDataImpl("YER", "YR", 0, "YER"));
    // Dinaro Forte Yugoslavo
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130));
    // Dinaro Noviy Yugoslavo
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130));
    // Dinaro Convertibile Yugoslavo
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130));
    // Rand Sudafricano (finanziario)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 2));
    // Rand Sudafricano
    result.put("ZAR", new CurrencyDataImpl("ZAR", "R", 2, "ZAR"));
    // Kwacha dello Zambia
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZK", 0));
    // Nuovo Zaire dello Zaire
    result.put("ZRN", new CurrencyDataImpl("ZRN", "NZ", 130));
    // Zaire dello Zaire
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130));
    // Dollaro dello Zimbabwe
    result.put("ZWD", new CurrencyDataImpl("ZWD", "Z$", 128));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // Peseta Andorrana
      "ADP": [ "ADP", "ADP", 128],
      // Dirham degli Emirati Arabi Uniti
      "AED": [ "AED", "DH", 2, "DH"],
      // Afgani (1927-2002)
      "AFA": [ "AFA", "AFA", 130],
      // Afgani
      "AFN": [ "AFN", "Af", 0],
      // Lek Albanese
      "ALL": [ "ALL", "ALL", 0],
      // Dram Armeno
      "AMD": [ "AMD", "AMD", 0],
      // Fiorino delle Antille Olandesi
      "ANG": [ "ANG", "NAf.", 2],
      // Kwanza Angolano
      "AOA": [ "AOA", "Kz", 2],
      // Kwanza Angolano (1977-1990)
      "AOK": [ "AOK", "AOK", 130],
      // Nuovo Kwanza Angolano (1990-2000)
      "AON": [ "AON", "AON", 130],
      // Kwanza Reajustado Angolano (1995-1999)
      "AOR": [ "AOR", "AOR", 130],
      // Austral Argentino
      "ARA": [ "ARA", "₳", 130],
      // ARL
      "ARL": [ "ARL", "$L", 130],
      // ARM
      "ARM": [ "ARM", "m$n", 130],
      // Peso Argentino (vecchio Cod.)
      "ARP": [ "ARP", "ARP", 130],
      // Peso Argentino
      "ARS": [ "ARS", "AR$", 2, "AR$"],
      // Scellino Austriaco
      "ATS": [ "ATS", "ATS", 130],
      // Dollaro Australiano
      "AUD": [ "AUD", "AU$", 2, "AU$"],
      // Fiorino di Aruba
      "AWG": [ "AWG", "Afl.", 2],
      // Manat Azero (1993-2006)
      "AZM": [ "AZM", "AZM", 130],
      // manat azero
      "AZN": [ "AZN", "man.", 2],
      // Dinar Bosnia-Herzegovina
      "BAD": [ "BAD", "BAD", 130],
      // Marco Conv. Bosnia-Erzegovina
      "BAM": [ "BAM", "KM", 2],
      // Dollaro di Barbados
      "BBD": [ "BBD", "Bds$", 2],
      // Taka Bangladese
      "BDT": [ "BDT", "Tk", 2, "Tk"],
      // Franco Belga (convertibile)
      "BEC": [ "BEC", "BEC", 2],
      // Franco Belga
      "BEF": [ "BEF", "BF", 130],
      // Franco Belga (finanziario)
      "BEL": [ "BEL", "BEL", 2],
      // Lev Bulgaro
      "BGL": [ "BGL", "BGL", 130],
      // Nuovo Lev Bulgaro
      "BGN": [ "BGN", "BGN", 2],
      // Dinaro del Bahraini
      "BHD": [ "BHD", "BD", 3],
      // Franco del Burundi
      "BIF": [ "BIF", "FBu", 0],
      // Dollaro delle Bermuda
      "BMD": [ "BMD", "BD$", 2],
      // Dollaro del Brunei
      "BND": [ "BND", "BN$", 2],
      // Boliviano
      "BOB": [ "BOB", "Bs", 2],
      // Peso Boliviano
      "BOP": [ "BOP", "$b.", 130],
      // Mvdol Boliviano
      "BOV": [ "BOV", "BOV", 2],
      // Cruzeiro Novo Brasiliano (1967-1986)
      "BRB": [ "BRB", "BRB", 130],
      // Cruzado Brasiliano
      "BRC": [ "BRC", "BRC", 130],
      // Cruzeiro Brasiliano (1990-1993)
      "BRE": [ "BRE", "BRE", 130],
      // Real Brasiliano
      "BRL": [ "BRL", "R$", 2, "R$"],
      // Cruzado Novo Brasiliano
      "BRN": [ "BRN", "BRN", 130],
      // Cruzeiro Brasiliano
      "BRR": [ "BRR", "BRR", 130],
      // Dollaro delle Bahamas
      "BSD": [ "BSD", "BS$", 2],
      // Ngultrum Butanese
      "BTN": [ "BTN", "Nu.", 2],
      // Kyat Birmano
      "BUK": [ "BUK", "BUK", 130],
      // Pula del Botswana
      "BWP": [ "BWP", "BWP", 2],
      // Nuovo Rublo Bielorussia (1994-1999)
      "BYB": [ "BYB", "BYB", 130],
      // Rublo Bielorussia
      "BYR": [ "BYR", "BYR", 0],
      // Dollaro Belize
      "BZD": [ "BZD", "BZ$", 2],
      // Dollaro Canadese
      "CAD": [ "CAD", "CA$", 2, "C$"],
      // Franco Congolese
      "CDF": [ "CDF", "CDF", 2],
      // CHE
      "CHE": [ "CHE", "CHE", 2],
      // Franco Svizzero
      "CHF": [ "CHF", "Fr.", 2, "CHF"],
      // CHW
      "CHW": [ "CHW", "CHW", 2],
      // CLE
      "CLE": [ "CLE", "Eº", 130],
      // Unidades de Fomento Chilene
      "CLF": [ "CLF", "CLF", 0],
      // Peso Cileno
      "CLP": [ "CLP", "CL$", 0, "CL$"],
      // Renmimbi Cinese
      "CNY": [ "CNY", "CN¥", 2, "RMB¥"],
      // Peso Colombiano
      "COP": [ "COP", "CO$", 0, "COL$"],
      // COU
      "COU": [ "COU", "COU", 2],
      // Colón Costaricano
      "CRC": [ "CRC", "₡", 0, "CR₡"],
      // antico dinaro serbo
      "CSD": [ "CSD", "CSD", 130],
      // Corona forte cecoslovacca
      "CSK": [ "CSK", "CSK", 130],
      // CUC
      "CUC": [ "CUC", "CUC$", 2],
      // Peso Cubano
      "CUP": [ "CUP", "CU$", 2, "$MN"],
      // Escudo del Capo Verde
      "CVE": [ "CVE", "CV$", 2],
      // Sterlina Cipriota
      "CYP": [ "CYP", "CY£", 130],
      // Corona Ceca
      "CZK": [ "CZK", "Kč", 2, "Kč"],
      // Ostmark della Germania Orientale
      "DDM": [ "DDM", "DDM", 130],
      // Marco Tedesco
      "DEM": [ "DEM", "DM", 130],
      // Franco Gibutiano
      "DJF": [ "DJF", "Fdj", 0],
      // Corona Danese
      "DKK": [ "DKK", "Dkr", 2, "kr"],
      // Peso Dominicano
      "DOP": [ "DOP", "RD$", 2, "RD$"],
      // Dinaro Algerino
      "DZD": [ "DZD", "DA", 2],
      // Sucre dell’Ecuador
      "ECS": [ "ECS", "ECS", 130],
      // Unidad de Valor Constante (UVC) dell’Ecuador
      "ECV": [ "ECV", "ECV", 2],
      // Corona dell’Estonia
      "EEK": [ "EEK", "Ekr", 2],
      // Sterlina Egiziana
      "EGP": [ "EGP", "EG£", 2, "LE"],
      // EQE
      "EQE": [ "EQE", "EQE", 130],
      // Nakfa Eritreo
      "ERN": [ "ERN", "Nfk", 2],
      // peseta spagnola account
      "ESA": [ "ESA", "ESA", 2],
      // peseta spagnola account convertibile
      "ESB": [ "ESB", "ESB", 2],
      // Peseta Spagnola
      "ESP": [ "ESP", "Pts", 128],
      // Birr Etiopico
      "ETB": [ "ETB", "Br", 2],
      // Euro
      "EUR": [ "EUR", "€", 2, "€"],
      // Markka Finlandese
      "FIM": [ "FIM", "mk", 130],
      // Dollaro delle Figi
      "FJD": [ "FJD", "FJ$", 2],
      // Sterlina delle Falkland
      "FKP": [ "FKP", "FK£", 2],
      // Franco Francese
      "FRF": [ "FRF", "₣", 130],
      // Sterlina Inglese
      "GBP": [ "GBP", "£", 2, "GB£"],
      // Kupon Larit Georgiano
      "GEK": [ "GEK", "GEK", 130],
      // Lari Georgiano
      "GEL": [ "GEL", "GEL", 2],
      // Cedi del Ghana
      "GHC": [ "GHC", "₵", 130],
      // Cedi ghanese
      "GHS": [ "GHS", "GH₵", 2],
      // Sterlina di Gibilterra
      "GIP": [ "GIP", "GI£", 2],
      // Dalasi del Gambia
      "GMD": [ "GMD", "GMD", 2],
      // Franco della Guinea
      "GNF": [ "GNF", "FG", 0],
      // Syli della Guinea
      "GNS": [ "GNS", "GNS", 130],
      // Ekwele della Guinea Equatoriale
      "GQE": [ "GQE", "GQE", 130],
      // Dracma Greca
      "GRD": [ "GRD", "₯", 130],
      // Quetzal Guatemalteco
      "GTQ": [ "GTQ", "GTQ", 2],
      // Escudo della Guinea portoghese
      "GWE": [ "GWE", "GWE", 130],
      // Peso della Guinea-Bissau
      "GWP": [ "GWP", "GWP", 2],
      // Dollaro della Guyana
      "GYD": [ "GYD", "GY$", 0],
      // Dollaro di Hong Kong
      "HKD": [ "HKD", "HK$", 2, "HK$"],
      // Lempira Hoduregno
      "HNL": [ "HNL", "HNL", 2],
      // Dinaro Croato
      "HRD": [ "HRD", "HRD", 130],
      // Kuna Croata
      "HRK": [ "HRK", "kn", 2],
      // Gourde Haitiano
      "HTG": [ "HTG", "HTG", 2],
      // Fiorino Ungherese
      "HUF": [ "HUF", "Ft", 0],
      // Rupia Indonesiana
      "IDR": [ "IDR", "Rp", 0],
      // Sterlina irlandese
      "IEP": [ "IEP", "IR£", 130],
      // Sterlina Israeliana
      "ILP": [ "ILP", "I£", 130],
      // Nuovo sheqel israeliano
      "ILS": [ "ILS", "₪", 2, "IL₪"],
      // Rupia Indiana
      "INR": [ "INR", "Rs", 2, "Rs"],
      // Dinaro Iracheno
      "IQD": [ "IQD", "IQD", 0],
      // Rial Iraniano
      "IRR": [ "IRR", "IRR", 0],
      // Corona Islandese
      "ISK": [ "ISK", "Ikr", 0, "kr"],
      // Lira Italiana
      "ITL": [ "ITL", "IT₤", 128],
      // Dollaro Giamaicano
      "JMD": [ "JMD", "J$", 2, "JA$"],
      // Dinaro Giordano
      "JOD": [ "JOD", "JD", 3],
      // Yen Giapponese
      "JPY": [ "JPY", "JP¥", 0, "JP¥"],
      // Scellino Keniota
      "KES": [ "KES", "Ksh", 2],
      // Som Kirghiso
      "KGS": [ "KGS", "KGS", 2],
      // Riel Cambogiano
      "KHR": [ "KHR", "KHR", 2],
      // Franco Comoriano
      "KMF": [ "KMF", "CF", 0],
      // Won Nordcoreano
      "KPW": [ "KPW", "KPW", 0],
      // Won Sudcoreano
      "KRW": [ "KRW", "₩", 0, "KR₩"],
      // Dinaro Kuwaitiano
      "KWD": [ "KWD", "KD", 3],
      // Dollaro delle Isole Cayman
      "KYD": [ "KYD", "KY$", 2],
      // Tenge Kazaco
      "KZT": [ "KZT", "KZT", 2],
      // Kip Laotiano
      "LAK": [ "LAK", "₭", 0],
      // Sterlina Libanese
      "LBP": [ "LBP", "LB£", 0],
      // Rupia di Sri Lanka
      "LKR": [ "LKR", "SLRs", 2, "SLRs"],
      // Dollaro Liberiano
      "LRD": [ "LRD", "L$", 2],
      // Loti del Lesotho
      "LSL": [ "LSL", "LSL", 2],
      // LSM
      "LSM": [ "LSM", "LSM", 130],
      // Lita Lituana
      "LTL": [ "LTL", "Lt", 2],
      // Talonas Lituani
      "LTT": [ "LTT", "LTT", 130],
      // franco convertibile del Lussemburgo
      "LUC": [ "LUC", "LUC", 2],
      // Franco del Lussemburgo
      "LUF": [ "LUF", "LUF", 128],
      // franco finanziario del Lussemburgo
      "LUL": [ "LUL", "LUL", 2],
      // Lat Lettone
      "LVL": [ "LVL", "Ls", 2],
      // Rublo Lettone
      "LVR": [ "LVR", "LVR", 130],
      // Dinaro Libico
      "LYD": [ "LYD", "LD", 3],
      // Dirham Marocchino
      "MAD": [ "MAD", "MAD", 2],
      // Franco Marocchino
      "MAF": [ "MAF", "MAF", 130],
      // Leu Moldavo
      "MDL": [ "MDL", "MDL", 2],
      // Ariary Malgascio
      "MGA": [ "MGA", "MGA", 0],
      // Franco Malgascio
      "MGF": [ "MGF", "MGF", 128],
      // Dinaro Macedone
      "MKD": [ "MKD", "MKD", 2],
      // Franco di Mali
      "MLF": [ "MLF", "MLF", 130],
      // Kyat di Myanmar
      "MMK": [ "MMK", "MMK", 0],
      // Tugrik Mongolo
      "MNT": [ "MNT", "₮", 0, "MN₮"],
      // Pataca di Macao
      "MOP": [ "MOP", "MOP$", 2],
      // Ouguiya della Mauritania
      "MRO": [ "MRO", "UM", 0],
      // Lira Maltese
      "MTL": [ "MTL", "Lm", 130],
      // Sterlina Maltese
      "MTP": [ "MTP", "MT£", 130],
      // Rupia Mauriziana
      "MUR": [ "MUR", "MURs", 0],
      // Rufiyaa delle Maldive
      "MVR": [ "MVR", "MVR", 2],
      // Kwacha Malawiano
      "MWK": [ "MWK", "MWK", 2],
      // Peso Messicano
      "MXN": [ "MXN", "Mex$", 2, "Mex$"],
      // Peso messicano d’argento (1861-1992)
      "MXP": [ "MXP", "MX$", 130],
      // Unidad de Inversion (UDI) Messicana
      "MXV": [ "MXV", "MXV", 2],
      // Ringgit della Malesia
      "MYR": [ "MYR", "RM", 2, "RM"],
      // Escudo del Mozambico
      "MZE": [ "MZE", "MZE", 130],
      // MZM
      "MZM": [ "MZM", "Mt", 130],
      // Metical del Mozambico
      "MZN": [ "MZN", "MTn", 2],
      // Dollaro Namibiano
      "NAD": [ "NAD", "N$", 2],
      // Naira Nigeriana
      "NGN": [ "NGN", "₦", 2],
      // Cordoba Nicaraguense
      "NIC": [ "NIC", "NIC", 130],
      // Córdoba oro nicaraguense
      "NIO": [ "NIO", "C$", 2],
      // Fiorino Olandese
      "NLG": [ "NLG", "fl", 130],
      // Corona Norvegese
      "NOK": [ "NOK", "Nkr", 2, "NOkr"],
      // Rupia Nepalese
      "NPR": [ "NPR", "NPRs", 2],
      // Dollaro Neozelandese
      "NZD": [ "NZD", "NZ$", 2],
      // Rial Omanita
      "OMR": [ "OMR", "OMR", 3],
      // Balboa di Panama
      "PAB": [ "PAB", "B/.", 2, "B/."],
      // Inti Peruviano
      "PEI": [ "PEI", "I/.", 130],
      // Sol Nuevo Peruviano
      "PEN": [ "PEN", "S/.", 2, "S/."],
      // Sol Peruviano
      "PES": [ "PES", "PES", 130],
      // Kina della Papua Nuova Guinea
      "PGK": [ "PGK", "PGK", 2],
      // Peso delle Filippine
      "PHP": [ "PHP", "₱", 2, "PHP"],
      // Rupia del Pakistan
      "PKR": [ "PKR", "PKRs", 0, "PKRs."],
      // Zloty Polacco
      "PLN": [ "PLN", "zł", 2],
      // Zloty Polacco (1950-1995)
      "PLZ": [ "PLZ", "PLZ", 130],
      // Escudo Portoghese
      "PTE": [ "PTE", "Esc", 130],
      // Guarani del Paraguay
      "PYG": [ "PYG", "₲", 0],
      // Rial del Qatar
      "QAR": [ "QAR", "QR", 2],
      // dollaro della Rhodesia
      "RHD": [ "RHD", "RH$", 130],
      // Leu della Romania
      "ROL": [ "ROL", "ROL", 130],
      // leu rumeno
      "RON": [ "RON", "RON", 2],
      // Dinaro serbo
      "RSD": [ "RSD", "din.", 0],
      // Rublo Russo
      "RUB": [ "RUB", "руб", 2, "руб"],
      // Rublo della CSI
      "RUR": [ "RUR", "RUR", 130],
      // Franco Ruandese
      "RWF": [ "RWF", "RWF", 0],
      // Ryal Saudita
      "SAR": [ "SAR", "SR", 2, "SR"],
      // Dollaro delle Isole Solomon
      "SBD": [ "SBD", "SI$", 2],
      // Rupia delle Seychelles
      "SCR": [ "SCR", "SRe", 2],
      // Dinaro Sudanese
      "SDD": [ "SDD", "LSd", 130],
      // Sterlina sudanese
      "SDG": [ "SDG", "SDG", 2],
      // SDP
      "SDP": [ "SDP", "SDP", 130],
      // Corona Svedese
      "SEK": [ "SEK", "Skr", 2, "kr"],
      // Dollaro di Singapore
      "SGD": [ "SGD", "S$", 2, "S$"],
      // Sterlina di Sant’Elena
      "SHP": [ "SHP", "SH£", 2],
      // Tallero Sloveno
      "SIT": [ "SIT", "SIT", 130],
      // Corona Slovacca
      "SKK": [ "SKK", "Sk", 130],
      // Leone della Sierra Leone
      "SLL": [ "SLL", "Le", 0],
      // Scellino Somalo
      "SOS": [ "SOS", "Ssh", 0],
      // Dollaro surinamese
      "SRD": [ "SRD", "SR$", 2],
      // Fiorino del Suriname
      "SRG": [ "SRG", "Sf", 130],
      // Dobra di Sao Tomé e Principe
      "STD": [ "STD", "Db", 0],
      // Rublo Sovietico
      "SUR": [ "SUR", "SUR", 130],
      // Colón Salvadoregno
      "SVC": [ "SVC", "SV₡", 130],
      // Sterlina Siriana
      "SYP": [ "SYP", "SY£", 0],
      // Lilangeni dello Swaziland
      "SZL": [ "SZL", "SZL", 2],
      // Baht Tailandese
      "THB": [ "THB", "฿", 2, "THB"],
      // Rublo del Tajikistan
      "TJR": [ "TJR", "TJR", 130],
      // Somoni del Tajikistan
      "TJS": [ "TJS", "TJS", 2],
      // Manat Turkmeno
      "TMM": [ "TMM", "TMM", 128],
      // Dinaro Tunisino
      "TND": [ "TND", "DT", 3],
      // Paʻanga di Tonga
      "TOP": [ "TOP", "T$", 2],
      // Escudo di Timor
      "TPE": [ "TPE", "TPE", 130],
      // Lira Turca
      "TRL": [ "TRL", "TRL", 128],
      // nuova Lira turca
      "TRY": [ "TRY", "TL", 2, "YTL"],
      // Dollaro di Trinidad e Tobago
      "TTD": [ "TTD", "TT$", 2],
      // Nuovo dollaro taiwanese
      "TWD": [ "TWD", "NT$", 2, "NT$"],
      // Scellino della Tanzania
      "TZS": [ "TZS", "TSh", 0],
      // Hrivna Ucraina
      "UAH": [ "UAH", "₴", 2],
      // Karbovanetz Ucraino
      "UAK": [ "UAK", "UAK", 130],
      // Scellino Ugandese (1966-1987)
      "UGS": [ "UGS", "UGS", 130],
      // Scellino Ugandese
      "UGX": [ "UGX", "USh", 0],
      // Dollaro Statunitense
      "USD": [ "USD", "US$", 2, "US$"],
      // Dollaro Statunitense (Next day)
      "USN": [ "USN", "USN", 2],
      // Dollaro Statunitense (Same day)
      "USS": [ "USS", "USS", 2],
      // Peso uruguaiano in unità indicizzate
      "UYI": [ "UYI", "UYI", 2],
      // Peso Uruguaiano (1975-1993)
      "UYP": [ "UYP", "UYP", 130],
      // Peso Uruguayo uruguaiano
      "UYU": [ "UYU", "$U", 2, "UY$"],
      // Sum dell’Uzbekistan
      "UZS": [ "UZS", "UZS", 0],
      // Bolivar Venezuelano
      "VEB": [ "VEB", "VEB", 130],
      // Bolívar venezuelano forte
      "VEF": [ "VEF", "Bs.F.", 2],
      // Dong Vietnamita
      "VND": [ "VND", "₫", 24, "₫"],
      // Vatu di Vanuatu
      "VUV": [ "VUV", "VT", 0],
      // Tala della Samoa Occidentale
      "WST": [ "WST", "WS$", 2],
      // Franco CFA BEAC
      "XAF": [ "XAF", "FCFA", 0],
      // Argento
      "XAG": [ "XAG", "XAG", 2],
      // Oro
      "XAU": [ "XAU", "XAU", 2],
      // Unità composita europea
      "XBA": [ "XBA", "XBA", 2],
      // Unità monetaria europea
      "XBB": [ "XBB", "XBB", 2],
      // Unità di acconto europea (XBC)
      "XBC": [ "XBC", "XBC", 2],
      // Unità di acconto europea (XBD)
      "XBD": [ "XBD", "XBD", 2],
      // Dollaro dei Caraibi Orientali
      "XCD": [ "XCD", "EC$", 2],
      // Diritti Speciali di Incasso
      "XDR": [ "XDR", "XDR", 2],
      // XEU
      "XEU": [ "XEU", "XEU", 2],
      // Franco Oro Francese
      "XFO": [ "XFO", "XFO", 2],
      // Franco UIC Francese
      "XFU": [ "XFU", "XFU", 2],
      // Franco CFA BCEAO
      "XOF": [ "XOF", "CFA", 0],
      // Palladio
      "XPD": [ "XPD", "XPD", 2],
      // Franco CFP
      "XPF": [ "XPF", "CFPF", 0],
      // platino
      "XPT": [ "XPT", "XPT", 2],
      // fondi RINET
      "XRE": [ "XRE", "XRE", 2],
      // codice di verifica della valuta
      "XTS": [ "XTS", "XTS", 2],
      // Nessuna valuta
      "XXX": [ "XXX", "XXX", 2],
      // Dinaro dello Yemen
      "YDD": [ "YDD", "YDD", 130],
      // Rial dello Yemen
      "YER": [ "YER", "YR", 0, "YER"],
      // Dinaro Forte Yugoslavo
      "YUD": [ "YUD", "YUD", 130],
      // Dinaro Noviy Yugoslavo
      "YUM": [ "YUM", "YUM", 130],
      // Dinaro Convertibile Yugoslavo
      "YUN": [ "YUN", "YUN", 130],
      // Rand Sudafricano (finanziario)
      "ZAL": [ "ZAL", "ZAL", 2],
      // Rand Sudafricano
      "ZAR": [ "ZAR", "R", 2, "ZAR"],
      // Kwacha dello Zambia
      "ZMK": [ "ZMK", "ZK", 0],
      // Nuovo Zaire dello Zaire
      "ZRN": [ "ZRN", "NZ", 130],
      // Zaire dello Zaire
      "ZRZ": [ "ZRZ", "ZRZ", 130],
      // Dollaro dello Zimbabwe
      "ZWD": [ "ZWD", "Z$", 128],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "Peseta Andorrana");
    result.put("AED", "Dirham degli Emirati Arabi Uniti");
    result.put("AFA", "Afgani (1927-2002)");
    result.put("AFN", "Afgani");
    result.put("ALL", "Lek Albanese");
    result.put("AMD", "Dram Armeno");
    result.put("ANG", "Fiorino delle Antille Olandesi");
    result.put("AOA", "Kwanza Angolano");
    result.put("AOK", "Kwanza Angolano (1977-1990)");
    result.put("AON", "Nuovo Kwanza Angolano (1990-2000)");
    result.put("AOR", "Kwanza Reajustado Angolano (1995-1999)");
    result.put("ARA", "Austral Argentino");
    result.put("ARP", "Peso Argentino (vecchio Cod.)");
    result.put("ARS", "Peso Argentino");
    result.put("ATS", "Scellino Austriaco");
    result.put("AUD", "Dollaro Australiano");
    result.put("AWG", "Fiorino di Aruba");
    result.put("AZM", "Manat Azero (1993-2006)");
    result.put("AZN", "manat azero");
    result.put("BAD", "Dinar Bosnia-Herzegovina");
    result.put("BAM", "Marco Conv. Bosnia-Erzegovina");
    result.put("BBD", "Dollaro di Barbados");
    result.put("BDT", "Taka Bangladese");
    result.put("BEC", "Franco Belga (convertibile)");
    result.put("BEF", "Franco Belga");
    result.put("BEL", "Franco Belga (finanziario)");
    result.put("BGL", "Lev Bulgaro");
    result.put("BGN", "Nuovo Lev Bulgaro");
    result.put("BHD", "Dinaro del Bahraini");
    result.put("BIF", "Franco del Burundi");
    result.put("BMD", "Dollaro delle Bermuda");
    result.put("BND", "Dollaro del Brunei");
    result.put("BOB", "Boliviano");
    result.put("BOP", "Peso Boliviano");
    result.put("BOV", "Mvdol Boliviano");
    result.put("BRB", "Cruzeiro Novo Brasiliano (1967-1986)");
    result.put("BRC", "Cruzado Brasiliano");
    result.put("BRE", "Cruzeiro Brasiliano (1990-1993)");
    result.put("BRL", "Real Brasiliano");
    result.put("BRN", "Cruzado Novo Brasiliano");
    result.put("BRR", "Cruzeiro Brasiliano");
    result.put("BSD", "Dollaro delle Bahamas");
    result.put("BTN", "Ngultrum Butanese");
    result.put("BUK", "Kyat Birmano");
    result.put("BWP", "Pula del Botswana");
    result.put("BYB", "Nuovo Rublo Bielorussia (1994-1999)");
    result.put("BYR", "Rublo Bielorussia");
    result.put("BZD", "Dollaro Belize");
    result.put("CAD", "Dollaro Canadese");
    result.put("CDF", "Franco Congolese");
    result.put("CHF", "Franco Svizzero");
    result.put("CLF", "Unidades de Fomento Chilene");
    result.put("CLP", "Peso Cileno");
    result.put("CNY", "Renmimbi Cinese");
    result.put("COP", "Peso Colombiano");
    result.put("CRC", "Colón Costaricano");
    result.put("CSD", "antico dinaro serbo");
    result.put("CSK", "Corona forte cecoslovacca");
    result.put("CUP", "Peso Cubano");
    result.put("CVE", "Escudo del Capo Verde");
    result.put("CYP", "Sterlina Cipriota");
    result.put("CZK", "Corona Ceca");
    result.put("DDM", "Ostmark della Germania Orientale");
    result.put("DEM", "Marco Tedesco");
    result.put("DJF", "Franco Gibutiano");
    result.put("DKK", "Corona Danese");
    result.put("DOP", "Peso Dominicano");
    result.put("DZD", "Dinaro Algerino");
    result.put("ECS", "Sucre dell’Ecuador");
    result.put("ECV", "Unidad de Valor Constante (UVC) dell’Ecuador");
    result.put("EEK", "Corona dell’Estonia");
    result.put("EGP", "Sterlina Egiziana");
    result.put("ERN", "Nakfa Eritreo");
    result.put("ESA", "peseta spagnola account");
    result.put("ESB", "peseta spagnola account convertibile");
    result.put("ESP", "Peseta Spagnola");
    result.put("ETB", "Birr Etiopico");
    result.put("EUR", "Euro");
    result.put("FIM", "Markka Finlandese");
    result.put("FJD", "Dollaro delle Figi");
    result.put("FKP", "Sterlina delle Falkland");
    result.put("FRF", "Franco Francese");
    result.put("GBP", "Sterlina Inglese");
    result.put("GEK", "Kupon Larit Georgiano");
    result.put("GEL", "Lari Georgiano");
    result.put("GHC", "Cedi del Ghana");
    result.put("GHS", "Cedi ghanese");
    result.put("GIP", "Sterlina di Gibilterra");
    result.put("GMD", "Dalasi del Gambia");
    result.put("GNF", "Franco della Guinea");
    result.put("GNS", "Syli della Guinea");
    result.put("GQE", "Ekwele della Guinea Equatoriale");
    result.put("GRD", "Dracma Greca");
    result.put("GTQ", "Quetzal Guatemalteco");
    result.put("GWE", "Escudo della Guinea portoghese");
    result.put("GWP", "Peso della Guinea-Bissau");
    result.put("GYD", "Dollaro della Guyana");
    result.put("HKD", "Dollaro di Hong Kong");
    result.put("HNL", "Lempira Hoduregno");
    result.put("HRD", "Dinaro Croato");
    result.put("HRK", "Kuna Croata");
    result.put("HTG", "Gourde Haitiano");
    result.put("HUF", "Fiorino Ungherese");
    result.put("IDR", "Rupia Indonesiana");
    result.put("IEP", "Sterlina irlandese");
    result.put("ILP", "Sterlina Israeliana");
    result.put("ILS", "Nuovo sheqel israeliano");
    result.put("INR", "Rupia Indiana");
    result.put("IQD", "Dinaro Iracheno");
    result.put("IRR", "Rial Iraniano");
    result.put("ISK", "Corona Islandese");
    result.put("ITL", "Lira Italiana");
    result.put("JMD", "Dollaro Giamaicano");
    result.put("JOD", "Dinaro Giordano");
    result.put("JPY", "Yen Giapponese");
    result.put("KES", "Scellino Keniota");
    result.put("KGS", "Som Kirghiso");
    result.put("KHR", "Riel Cambogiano");
    result.put("KMF", "Franco Comoriano");
    result.put("KPW", "Won Nordcoreano");
    result.put("KRW", "Won Sudcoreano");
    result.put("KWD", "Dinaro Kuwaitiano");
    result.put("KYD", "Dollaro delle Isole Cayman");
    result.put("KZT", "Tenge Kazaco");
    result.put("LAK", "Kip Laotiano");
    result.put("LBP", "Sterlina Libanese");
    result.put("LKR", "Rupia di Sri Lanka");
    result.put("LRD", "Dollaro Liberiano");
    result.put("LSL", "Loti del Lesotho");
    result.put("LTL", "Lita Lituana");
    result.put("LTT", "Talonas Lituani");
    result.put("LUC", "franco convertibile del Lussemburgo");
    result.put("LUF", "Franco del Lussemburgo");
    result.put("LUL", "franco finanziario del Lussemburgo");
    result.put("LVL", "Lat Lettone");
    result.put("LVR", "Rublo Lettone");
    result.put("LYD", "Dinaro Libico");
    result.put("MAD", "Dirham Marocchino");
    result.put("MAF", "Franco Marocchino");
    result.put("MDL", "Leu Moldavo");
    result.put("MGA", "Ariary Malgascio");
    result.put("MGF", "Franco Malgascio");
    result.put("MKD", "Dinaro Macedone");
    result.put("MLF", "Franco di Mali");
    result.put("MMK", "Kyat di Myanmar");
    result.put("MNT", "Tugrik Mongolo");
    result.put("MOP", "Pataca di Macao");
    result.put("MRO", "Ouguiya della Mauritania");
    result.put("MTL", "Lira Maltese");
    result.put("MTP", "Sterlina Maltese");
    result.put("MUR", "Rupia Mauriziana");
    result.put("MVR", "Rufiyaa delle Maldive");
    result.put("MWK", "Kwacha Malawiano");
    result.put("MXN", "Peso Messicano");
    result.put("MXP", "Peso messicano d’argento (1861-1992)");
    result.put("MXV", "Unidad de Inversion (UDI) Messicana");
    result.put("MYR", "Ringgit della Malesia");
    result.put("MZE", "Escudo del Mozambico");
    result.put("MZN", "Metical del Mozambico");
    result.put("NAD", "Dollaro Namibiano");
    result.put("NGN", "Naira Nigeriana");
    result.put("NIC", "Cordoba Nicaraguense");
    result.put("NIO", "Córdoba oro nicaraguense");
    result.put("NLG", "Fiorino Olandese");
    result.put("NOK", "Corona Norvegese");
    result.put("NPR", "Rupia Nepalese");
    result.put("NZD", "Dollaro Neozelandese");
    result.put("OMR", "Rial Omanita");
    result.put("PAB", "Balboa di Panama");
    result.put("PEI", "Inti Peruviano");
    result.put("PEN", "Sol Nuevo Peruviano");
    result.put("PES", "Sol Peruviano");
    result.put("PGK", "Kina della Papua Nuova Guinea");
    result.put("PHP", "Peso delle Filippine");
    result.put("PKR", "Rupia del Pakistan");
    result.put("PLN", "Zloty Polacco");
    result.put("PLZ", "Zloty Polacco (1950-1995)");
    result.put("PTE", "Escudo Portoghese");
    result.put("PYG", "Guarani del Paraguay");
    result.put("QAR", "Rial del Qatar");
    result.put("RHD", "dollaro della Rhodesia");
    result.put("ROL", "Leu della Romania");
    result.put("RON", "leu rumeno");
    result.put("RSD", "Dinaro serbo");
    result.put("RUB", "Rublo Russo");
    result.put("RUR", "Rublo della CSI");
    result.put("RWF", "Franco Ruandese");
    result.put("SAR", "Ryal Saudita");
    result.put("SBD", "Dollaro delle Isole Solomon");
    result.put("SCR", "Rupia delle Seychelles");
    result.put("SDD", "Dinaro Sudanese");
    result.put("SDG", "Sterlina sudanese");
    result.put("SEK", "Corona Svedese");
    result.put("SGD", "Dollaro di Singapore");
    result.put("SHP", "Sterlina di Sant’Elena");
    result.put("SIT", "Tallero Sloveno");
    result.put("SKK", "Corona Slovacca");
    result.put("SLL", "Leone della Sierra Leone");
    result.put("SOS", "Scellino Somalo");
    result.put("SRD", "Dollaro surinamese");
    result.put("SRG", "Fiorino del Suriname");
    result.put("STD", "Dobra di Sao Tomé e Principe");
    result.put("SUR", "Rublo Sovietico");
    result.put("SVC", "Colón Salvadoregno");
    result.put("SYP", "Sterlina Siriana");
    result.put("SZL", "Lilangeni dello Swaziland");
    result.put("THB", "Baht Tailandese");
    result.put("TJR", "Rublo del Tajikistan");
    result.put("TJS", "Somoni del Tajikistan");
    result.put("TMM", "Manat Turkmeno");
    result.put("TND", "Dinaro Tunisino");
    result.put("TOP", "Paʻanga di Tonga");
    result.put("TPE", "Escudo di Timor");
    result.put("TRL", "Lira Turca");
    result.put("TRY", "nuova Lira turca");
    result.put("TTD", "Dollaro di Trinidad e Tobago");
    result.put("TWD", "Nuovo dollaro taiwanese");
    result.put("TZS", "Scellino della Tanzania");
    result.put("UAH", "Hrivna Ucraina");
    result.put("UAK", "Karbovanetz Ucraino");
    result.put("UGS", "Scellino Ugandese (1966-1987)");
    result.put("UGX", "Scellino Ugandese");
    result.put("USD", "Dollaro Statunitense");
    result.put("USN", "Dollaro Statunitense (Next day)");
    result.put("USS", "Dollaro Statunitense (Same day)");
    result.put("UYI", "Peso uruguaiano in unità indicizzate");
    result.put("UYP", "Peso Uruguaiano (1975-1993)");
    result.put("UYU", "Peso Uruguayo uruguaiano");
    result.put("UZS", "Sum dell’Uzbekistan");
    result.put("VEB", "Bolivar Venezuelano");
    result.put("VEF", "Bolívar venezuelano forte");
    result.put("VND", "Dong Vietnamita");
    result.put("VUV", "Vatu di Vanuatu");
    result.put("WST", "Tala della Samoa Occidentale");
    result.put("XAF", "Franco CFA BEAC");
    result.put("XAG", "Argento");
    result.put("XAU", "Oro");
    result.put("XBA", "Unità composita europea");
    result.put("XBB", "Unità monetaria europea");
    result.put("XBC", "Unità di acconto europea (XBC)");
    result.put("XBD", "Unità di acconto europea (XBD)");
    result.put("XCD", "Dollaro dei Caraibi Orientali");
    result.put("XDR", "Diritti Speciali di Incasso");
    result.put("XFO", "Franco Oro Francese");
    result.put("XFU", "Franco UIC Francese");
    result.put("XOF", "Franco CFA BCEAO");
    result.put("XPD", "Palladio");
    result.put("XPF", "Franco CFP");
    result.put("XPT", "platino");
    result.put("XRE", "fondi RINET");
    result.put("XTS", "codice di verifica della valuta");
    result.put("XXX", "Nessuna valuta");
    result.put("YDD", "Dinaro dello Yemen");
    result.put("YER", "Rial dello Yemen");
    result.put("YUD", "Dinaro Forte Yugoslavo");
    result.put("YUM", "Dinaro Noviy Yugoslavo");
    result.put("YUN", "Dinaro Convertibile Yugoslavo");
    result.put("ZAL", "Rand Sudafricano (finanziario)");
    result.put("ZAR", "Rand Sudafricano");
    result.put("ZMK", "Kwacha dello Zambia");
    result.put("ZRN", "Nuovo Zaire dello Zaire");
    result.put("ZRZ", "Zaire dello Zaire");
    result.put("ZWD", "Dollaro dello Zimbabwe");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "Peseta Andorrana",
      "AED": "Dirham degli Emirati Arabi Uniti",
      "AFA": "Afgani (1927-2002)",
      "AFN": "Afgani",
      "ALL": "Lek Albanese",
      "AMD": "Dram Armeno",
      "ANG": "Fiorino delle Antille Olandesi",
      "AOA": "Kwanza Angolano",
      "AOK": "Kwanza Angolano (1977-1990)",
      "AON": "Nuovo Kwanza Angolano (1990-2000)",
      "AOR": "Kwanza Reajustado Angolano (1995-1999)",
      "ARA": "Austral Argentino",
      "ARP": "Peso Argentino (vecchio Cod.)",
      "ARS": "Peso Argentino",
      "ATS": "Scellino Austriaco",
      "AUD": "Dollaro Australiano",
      "AWG": "Fiorino di Aruba",
      "AZM": "Manat Azero (1993-2006)",
      "AZN": "manat azero",
      "BAD": "Dinar Bosnia-Herzegovina",
      "BAM": "Marco Conv. Bosnia-Erzegovina",
      "BBD": "Dollaro di Barbados",
      "BDT": "Taka Bangladese",
      "BEC": "Franco Belga (convertibile)",
      "BEF": "Franco Belga",
      "BEL": "Franco Belga (finanziario)",
      "BGL": "Lev Bulgaro",
      "BGN": "Nuovo Lev Bulgaro",
      "BHD": "Dinaro del Bahraini",
      "BIF": "Franco del Burundi",
      "BMD": "Dollaro delle Bermuda",
      "BND": "Dollaro del Brunei",
      "BOB": "Boliviano",
      "BOP": "Peso Boliviano",
      "BOV": "Mvdol Boliviano",
      "BRB": "Cruzeiro Novo Brasiliano (1967-1986)",
      "BRC": "Cruzado Brasiliano",
      "BRE": "Cruzeiro Brasiliano (1990-1993)",
      "BRL": "Real Brasiliano",
      "BRN": "Cruzado Novo Brasiliano",
      "BRR": "Cruzeiro Brasiliano",
      "BSD": "Dollaro delle Bahamas",
      "BTN": "Ngultrum Butanese",
      "BUK": "Kyat Birmano",
      "BWP": "Pula del Botswana",
      "BYB": "Nuovo Rublo Bielorussia (1994-1999)",
      "BYR": "Rublo Bielorussia",
      "BZD": "Dollaro Belize",
      "CAD": "Dollaro Canadese",
      "CDF": "Franco Congolese",
      "CHF": "Franco Svizzero",
      "CLF": "Unidades de Fomento Chilene",
      "CLP": "Peso Cileno",
      "CNY": "Renmimbi Cinese",
      "COP": "Peso Colombiano",
      "CRC": "Colón Costaricano",
      "CSD": "antico dinaro serbo",
      "CSK": "Corona forte cecoslovacca",
      "CUP": "Peso Cubano",
      "CVE": "Escudo del Capo Verde",
      "CYP": "Sterlina Cipriota",
      "CZK": "Corona Ceca",
      "DDM": "Ostmark della Germania Orientale",
      "DEM": "Marco Tedesco",
      "DJF": "Franco Gibutiano",
      "DKK": "Corona Danese",
      "DOP": "Peso Dominicano",
      "DZD": "Dinaro Algerino",
      "ECS": "Sucre dell’Ecuador",
      "ECV": "Unidad de Valor Constante (UVC) dell’Ecuador",
      "EEK": "Corona dell’Estonia",
      "EGP": "Sterlina Egiziana",
      "ERN": "Nakfa Eritreo",
      "ESA": "peseta spagnola account",
      "ESB": "peseta spagnola account convertibile",
      "ESP": "Peseta Spagnola",
      "ETB": "Birr Etiopico",
      "EUR": "Euro",
      "FIM": "Markka Finlandese",
      "FJD": "Dollaro delle Figi",
      "FKP": "Sterlina delle Falkland",
      "FRF": "Franco Francese",
      "GBP": "Sterlina Inglese",
      "GEK": "Kupon Larit Georgiano",
      "GEL": "Lari Georgiano",
      "GHC": "Cedi del Ghana",
      "GHS": "Cedi ghanese",
      "GIP": "Sterlina di Gibilterra",
      "GMD": "Dalasi del Gambia",
      "GNF": "Franco della Guinea",
      "GNS": "Syli della Guinea",
      "GQE": "Ekwele della Guinea Equatoriale",
      "GRD": "Dracma Greca",
      "GTQ": "Quetzal Guatemalteco",
      "GWE": "Escudo della Guinea portoghese",
      "GWP": "Peso della Guinea-Bissau",
      "GYD": "Dollaro della Guyana",
      "HKD": "Dollaro di Hong Kong",
      "HNL": "Lempira Hoduregno",
      "HRD": "Dinaro Croato",
      "HRK": "Kuna Croata",
      "HTG": "Gourde Haitiano",
      "HUF": "Fiorino Ungherese",
      "IDR": "Rupia Indonesiana",
      "IEP": "Sterlina irlandese",
      "ILP": "Sterlina Israeliana",
      "ILS": "Nuovo sheqel israeliano",
      "INR": "Rupia Indiana",
      "IQD": "Dinaro Iracheno",
      "IRR": "Rial Iraniano",
      "ISK": "Corona Islandese",
      "ITL": "Lira Italiana",
      "JMD": "Dollaro Giamaicano",
      "JOD": "Dinaro Giordano",
      "JPY": "Yen Giapponese",
      "KES": "Scellino Keniota",
      "KGS": "Som Kirghiso",
      "KHR": "Riel Cambogiano",
      "KMF": "Franco Comoriano",
      "KPW": "Won Nordcoreano",
      "KRW": "Won Sudcoreano",
      "KWD": "Dinaro Kuwaitiano",
      "KYD": "Dollaro delle Isole Cayman",
      "KZT": "Tenge Kazaco",
      "LAK": "Kip Laotiano",
      "LBP": "Sterlina Libanese",
      "LKR": "Rupia di Sri Lanka",
      "LRD": "Dollaro Liberiano",
      "LSL": "Loti del Lesotho",
      "LTL": "Lita Lituana",
      "LTT": "Talonas Lituani",
      "LUC": "franco convertibile del Lussemburgo",
      "LUF": "Franco del Lussemburgo",
      "LUL": "franco finanziario del Lussemburgo",
      "LVL": "Lat Lettone",
      "LVR": "Rublo Lettone",
      "LYD": "Dinaro Libico",
      "MAD": "Dirham Marocchino",
      "MAF": "Franco Marocchino",
      "MDL": "Leu Moldavo",
      "MGA": "Ariary Malgascio",
      "MGF": "Franco Malgascio",
      "MKD": "Dinaro Macedone",
      "MLF": "Franco di Mali",
      "MMK": "Kyat di Myanmar",
      "MNT": "Tugrik Mongolo",
      "MOP": "Pataca di Macao",
      "MRO": "Ouguiya della Mauritania",
      "MTL": "Lira Maltese",
      "MTP": "Sterlina Maltese",
      "MUR": "Rupia Mauriziana",
      "MVR": "Rufiyaa delle Maldive",
      "MWK": "Kwacha Malawiano",
      "MXN": "Peso Messicano",
      "MXP": "Peso messicano d’argento (1861-1992)",
      "MXV": "Unidad de Inversion (UDI) Messicana",
      "MYR": "Ringgit della Malesia",
      "MZE": "Escudo del Mozambico",
      "MZN": "Metical del Mozambico",
      "NAD": "Dollaro Namibiano",
      "NGN": "Naira Nigeriana",
      "NIC": "Cordoba Nicaraguense",
      "NIO": "Córdoba oro nicaraguense",
      "NLG": "Fiorino Olandese",
      "NOK": "Corona Norvegese",
      "NPR": "Rupia Nepalese",
      "NZD": "Dollaro Neozelandese",
      "OMR": "Rial Omanita",
      "PAB": "Balboa di Panama",
      "PEI": "Inti Peruviano",
      "PEN": "Sol Nuevo Peruviano",
      "PES": "Sol Peruviano",
      "PGK": "Kina della Papua Nuova Guinea",
      "PHP": "Peso delle Filippine",
      "PKR": "Rupia del Pakistan",
      "PLN": "Zloty Polacco",
      "PLZ": "Zloty Polacco (1950-1995)",
      "PTE": "Escudo Portoghese",
      "PYG": "Guarani del Paraguay",
      "QAR": "Rial del Qatar",
      "RHD": "dollaro della Rhodesia",
      "ROL": "Leu della Romania",
      "RON": "leu rumeno",
      "RSD": "Dinaro serbo",
      "RUB": "Rublo Russo",
      "RUR": "Rublo della CSI",
      "RWF": "Franco Ruandese",
      "SAR": "Ryal Saudita",
      "SBD": "Dollaro delle Isole Solomon",
      "SCR": "Rupia delle Seychelles",
      "SDD": "Dinaro Sudanese",
      "SDG": "Sterlina sudanese",
      "SEK": "Corona Svedese",
      "SGD": "Dollaro di Singapore",
      "SHP": "Sterlina di Sant’Elena",
      "SIT": "Tallero Sloveno",
      "SKK": "Corona Slovacca",
      "SLL": "Leone della Sierra Leone",
      "SOS": "Scellino Somalo",
      "SRD": "Dollaro surinamese",
      "SRG": "Fiorino del Suriname",
      "STD": "Dobra di Sao Tomé e Principe",
      "SUR": "Rublo Sovietico",
      "SVC": "Colón Salvadoregno",
      "SYP": "Sterlina Siriana",
      "SZL": "Lilangeni dello Swaziland",
      "THB": "Baht Tailandese",
      "TJR": "Rublo del Tajikistan",
      "TJS": "Somoni del Tajikistan",
      "TMM": "Manat Turkmeno",
      "TND": "Dinaro Tunisino",
      "TOP": "Paʻanga di Tonga",
      "TPE": "Escudo di Timor",
      "TRL": "Lira Turca",
      "TRY": "nuova Lira turca",
      "TTD": "Dollaro di Trinidad e Tobago",
      "TWD": "Nuovo dollaro taiwanese",
      "TZS": "Scellino della Tanzania",
      "UAH": "Hrivna Ucraina",
      "UAK": "Karbovanetz Ucraino",
      "UGS": "Scellino Ugandese (1966-1987)",
      "UGX": "Scellino Ugandese",
      "USD": "Dollaro Statunitense",
      "USN": "Dollaro Statunitense (Next day)",
      "USS": "Dollaro Statunitense (Same day)",
      "UYI": "Peso uruguaiano in unità indicizzate",
      "UYP": "Peso Uruguaiano (1975-1993)",
      "UYU": "Peso Uruguayo uruguaiano",
      "UZS": "Sum dell’Uzbekistan",
      "VEB": "Bolivar Venezuelano",
      "VEF": "Bolívar venezuelano forte",
      "VND": "Dong Vietnamita",
      "VUV": "Vatu di Vanuatu",
      "WST": "Tala della Samoa Occidentale",
      "XAF": "Franco CFA BEAC",
      "XAG": "Argento",
      "XAU": "Oro",
      "XBA": "Unità composita europea",
      "XBB": "Unità monetaria europea",
      "XBC": "Unità di acconto europea (XBC)",
      "XBD": "Unità di acconto europea (XBD)",
      "XCD": "Dollaro dei Caraibi Orientali",
      "XDR": "Diritti Speciali di Incasso",
      "XFO": "Franco Oro Francese",
      "XFU": "Franco UIC Francese",
      "XOF": "Franco CFA BCEAO",
      "XPD": "Palladio",
      "XPF": "Franco CFP",
      "XPT": "platino",
      "XRE": "fondi RINET",
      "XTS": "codice di verifica della valuta",
      "XXX": "Nessuna valuta",
      "YDD": "Dinaro dello Yemen",
      "YER": "Rial dello Yemen",
      "YUD": "Dinaro Forte Yugoslavo",
      "YUM": "Dinaro Noviy Yugoslavo",
      "YUN": "Dinaro Convertibile Yugoslavo",
      "ZAL": "Rand Sudafricano (finanziario)",
      "ZAR": "Rand Sudafricano",
      "ZMK": "Kwacha dello Zambia",
      "ZRN": "Nuovo Zaire dello Zaire",
      "ZRZ": "Zaire dello Zaire",
      "ZWD": "Dollaro dello Zimbabwe",
    };
  }-*/;
}
