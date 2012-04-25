package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_nb extends com.google.gwt.i18n.client.CurrencyList_ {
  
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
    // andorranske pesetas
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128));
    // UAE dirham
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH"));
    // afghani (1927-2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130));
    // afghani
    result.put("AFN", new CurrencyDataImpl("AFN", "Af", 2));
    // albanske lek
    result.put("ALL", new CurrencyDataImpl("ALL", "lek", 2));
    // armenske dram
    result.put("AMD", new CurrencyDataImpl("AMD", "dram", 2));
    // nederlandske antillegylden
    result.put("ANG", new CurrencyDataImpl("ANG", "NA f.", 2));
    // angolanske kwanza
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2));
    // angolanske kwanza (1977-1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130));
    // angolanske nye kwanza (1990-2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130));
    // angolanske kwanza reajustado (1995-1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130));
    // argentinske australer
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130));
    // argentinske pesos (1983-1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130));
    // argentinske pesos
    result.put("ARS", new CurrencyDataImpl("ARS", "Arg$", 2, "AR$"));
    // østerrikske shilling
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130));
    // australske dollar
    result.put("AUD", new CurrencyDataImpl("AUD", "$A", 2, "AU$"));
    // arubiske gylden
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2));
    // aserbajdsjanske manat (1993-2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130));
    // bosnisk-hercegovinske dinarer
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130));
    // bosnisk-hercegovinske mark (konvertible)
    result.put("BAM", new CurrencyDataImpl("BAM", "KM", 2));
    // barbadiske dollar
    result.put("BBD", new CurrencyDataImpl("BBD", "BDS$", 2));
    // bangladeshiske taka
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk"));
    // belgiske franc (konvertible)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130));
    // belgiske franc
    result.put("BEF", new CurrencyDataImpl("BEF", "BF", 130));
    // belgiske franc (finansielle)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130));
    // bulgarske lev (hard)
    result.put("BGL", new CurrencyDataImpl("BGL", "lev", 130));
    // bulgarske lev
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2));
    // bahrainske dinarer
    result.put("BHD", new CurrencyDataImpl("BHD", "BD", 3));
    // burundiske franc
    result.put("BIF", new CurrencyDataImpl("BIF", "Fbu", 0));
    // bermudiske dollar
    result.put("BMD", new CurrencyDataImpl("BMD", "Ber$", 2));
    // bruneiske dollar
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2));
    // boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "Bs", 2));
    // bolivianske pesos
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130));
    // bolivianske mvdol
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130));
    // brasilianske cruzeiro novo (1967-1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130));
    // brasilianske cruzado
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130));
    // brasilianske cruzeiro (1990-1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130));
    // brasilianske realer
    result.put("BRL", new CurrencyDataImpl("BRL", "BRL", 2, "R$"));
    // brasilianske cruzado novo
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130));
    // brasilianske cruzeiro
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130));
    // bahamske dollar
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2));
    // bhutanske ngultrum
    result.put("BTN", new CurrencyDataImpl("BTN", "Nu", 130));
    // burmesiske kyat
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130));
    // botswanske pula
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2));
    // hviterussiske nye rubler (1994-1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130));
    // hviterussiske rubler
    result.put("BYR", new CurrencyDataImpl("BYR", "Rbl", 0));
    // beliziske dollar
    result.put("BZD", new CurrencyDataImpl("BZD", "BZ$", 2));
    // kanadiske dollar
    result.put("CAD", new CurrencyDataImpl("CAD", "Can$", 2, "C$"));
    // kongolesiske franc (congolais)
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2));
    // WIR euro
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 130));
    // sveitsiske franc
    result.put("CHF", new CurrencyDataImpl("CHF", "SwF", 2, "CHF"));
    // WIR franc
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 130));
    // chilenske unidades de fomento
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 128));
    // chilenske pesos
    result.put("CLP", new CurrencyDataImpl("CLP", "Ch$", 0, "CL$"));
    // kinesiske yuan renminbi
    result.put("CNY", new CurrencyDataImpl("CNY", "Y", 2, "RMB¥"));
    // colombianske pesos
    result.put("COP", new CurrencyDataImpl("COP", "Col$", 2, "COL$"));
    // unidad de valor real
    result.put("COU", new CurrencyDataImpl("COU", "COU", 130));
    // costaricanske colon
    result.put("CRC", new CurrencyDataImpl("CRC", "C", 2, "CR₡"));
    // gamle serbiske dinarer
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130));
    // tsjekkoslovakiske koruna (hard)
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130));
    // kubanske pesos
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN"));
    // kappverdiske escudo
    result.put("CVE", new CurrencyDataImpl("CVE", "CVEsc", 2));
    // kypriotiske pund
    result.put("CYP", new CurrencyDataImpl("CYP", "£C", 130));
    // tsjekkiske koruna
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč"));
    // østtyske ostmark
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130));
    // tyske mark
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130));
    // djiboutiske franc
    result.put("DJF", new CurrencyDataImpl("DJF", "DF", 0));
    // danske kroner
    result.put("DKK", new CurrencyDataImpl("DKK", "Dkr", 2, "kr"));
    // dominikanske pesos
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$"));
    // algeriske dinarer
    result.put("DZD", new CurrencyDataImpl("DZD", "DA", 2));
    // ecuadorianske sucre
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130));
    // ecuadorianske unidad de valor constante (UVC)
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130));
    // estiske kroon
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 2));
    // egyptiske pund
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE"));
    // ekwele
    result.put("EQE", new CurrencyDataImpl("EQE", "EQE", 130));
    // eritreiske nakfa
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2));
    // spanske peseta (A-konto)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130));
    // spanske peseta (konvertibel konto)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130));
    // spanske peseta
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128));
    // etiopiske birr
    result.put("ETB", new CurrencyDataImpl("ETB", "Br", 2));
    // euro
    result.put("EUR", new CurrencyDataImpl("EUR", "EUR", 2, "€"));
    // finske mark
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130));
    // fijianske dollar
    result.put("FJD", new CurrencyDataImpl("FJD", "F$", 2));
    // Falkland-pund
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2));
    // franske franc
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130));
    // britiske pund sterling
    result.put("GBP", new CurrencyDataImpl("GBP", "GBP", 2, "GB£"));
    // georgiske kupon larit
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130));
    // georgiske lari
    result.put("GEL", new CurrencyDataImpl("GEL", "lari", 2));
    // ghanesiske cedi
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130));
    // gibraltarske pund
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2));
    // gambiske dalasi
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2));
    // guineanske franc
    result.put("GNF", new CurrencyDataImpl("GNF", "GF", 0));
    // guineanske syli
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130));
    // ekvatorialguineanske ekwele guineana
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130));
    // greske drakmer
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130));
    // guatemalanske quetzal
    result.put("GTQ", new CurrencyDataImpl("GTQ", "Q", 2));
    // portugisiske guinea escudo
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130));
    // Guinea-Bissau-pesos
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 2));
    // guyanske dollar
    result.put("GYD", new CurrencyDataImpl("GYD", "G$", 2));
    // Hongkong-dollar
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$"));
    // Hoduras Lempira
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2));
    // kroatiske dinarer
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130));
    // kroatiske kuna
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2));
    // haitiske gourde
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2));
    // ungarske forinter
    result.put("HUF", new CurrencyDataImpl("HUF", "Ft", 2));
    // indonesiske rupier
    result.put("IDR", new CurrencyDataImpl("IDR", "Rp", 2));
    // irske pund
    result.put("IEP", new CurrencyDataImpl("IEP", "IR£", 130));
    // israelske pund
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130));
    // israelske nye shekler
    result.put("ILS", new CurrencyDataImpl("ILS", "IL₪", 2, "IL₪"));
    // indiske rupier
    result.put("INR", new CurrencyDataImpl("INR", "INR", 2, "Rs"));
    // irakske dinarer
    result.put("IQD", new CurrencyDataImpl("IQD", "ID", 3));
    // iranske rialer
    result.put("IRR", new CurrencyDataImpl("IRR", "RI", 2));
    // islandske kroner
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 2, "kr"));
    // italienske lire
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128));
    // jamaikanske dollar
    result.put("JMD", new CurrencyDataImpl("JMD", "J$", 2, "JA$"));
    // jordanske dinarer
    result.put("JOD", new CurrencyDataImpl("JOD", "JD", 3));
    // japanske yen
    result.put("JPY", new CurrencyDataImpl("JPY", "JPY", 0, "JP¥"));
    // kenyanske shilling
    result.put("KES", new CurrencyDataImpl("KES", "K Sh", 2));
    // kirgisiske som
    result.put("KGS", new CurrencyDataImpl("KGS", "som", 2));
    // kambodsjanske riel
    result.put("KHR", new CurrencyDataImpl("KHR", "CR", 2));
    // komoriske franc
    result.put("KMF", new CurrencyDataImpl("KMF", "CF", 0));
    // nordkoreanske won
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 2));
    // sørkoreanske won
    result.put("KRW", new CurrencyDataImpl("KRW", "KR₩", 0, "KR₩"));
    // kuwaitiske dinarer
    result.put("KWD", new CurrencyDataImpl("KWD", "KD", 3));
    // caymanske dollar
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2));
    // kasakhstanske tenge
    result.put("KZT", new CurrencyDataImpl("KZT", "T", 2));
    // laotiske kip
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 2));
    // libanesiske pund
    result.put("LBP", new CurrencyDataImpl("LBP", "LL", 2));
    // srilankiske rupier
    result.put("LKR", new CurrencyDataImpl("LKR", "SL Re", 2, "SLRs"));
    // liberiske dollar
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2));
    // lesothiske loti
    result.put("LSL", new CurrencyDataImpl("LSL", "M", 130));
    // maloti
    result.put("LSM", new CurrencyDataImpl("LSM", "LSM", 130));
    // litauiske lita
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 2));
    // litauiske talonas
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130));
    // luxemburgske konvertible franc
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130));
    // luxemburgske franc
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128));
    // luxemburgske finansielle franc
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130));
    // latviske lats
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 2));
    // latviske rubler
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130));
    // libyske dinarer
    result.put("LYD", new CurrencyDataImpl("LYD", "LD", 3));
    // marokkanske dirham
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2));
    // marokkanske franc
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130));
    // moldovske leu
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2));
    // madagassiske ariary
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0));
    // madagassiske franc
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128));
    // makedonske denarer
    result.put("MKD", new CurrencyDataImpl("MKD", "MDen", 2));
    // maliske franc
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130));
    // myanmarske kyat
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 2));
    // mongolske tugrik
    result.put("MNT", new CurrencyDataImpl("MNT", "Tug", 2, "MN₮"));
    // makaoske pataca
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2));
    // mauritanske ouguiya
    result.put("MRO", new CurrencyDataImpl("MRO", "UM", 2));
    // maltesiske lira
    result.put("MTL", new CurrencyDataImpl("MTL", "Lm", 130));
    // maltesiske pund
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130));
    // mauritiske rupier
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2));
    // maldiviske rufiyaa
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2));
    // malawiske kwacha
    result.put("MWK", new CurrencyDataImpl("MWK", "MK", 2));
    // meksikanske pesos
    result.put("MXN", new CurrencyDataImpl("MXN", "MEX$", 2, "Mex$"));
    // meksikanske sølvpesos (1861-1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130));
    // meksikanske unidad de inversion (UDI)
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130));
    // malaysiske ringgit
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM"));
    // mosambikiske escudo
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130));
    // gamle mosambikiske metical
    result.put("MZM", new CurrencyDataImpl("MZM", "Mt", 130));
    // mosambikiske metical
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2));
    // namibiske dollar
    result.put("NAD", new CurrencyDataImpl("NAD", "N$", 130));
    // nigerianske naira
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2));
    // nicaraguanske cordoba
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130));
    // nicaraguanske cordoba oro
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2));
    // nederlandske gylden
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130));
    // norske kroner
    result.put("NOK", new CurrencyDataImpl("NOK", "kr", 2, "NOkr"));
    // nepalske rupier
    result.put("NPR", new CurrencyDataImpl("NPR", "Nrs", 2));
    // new zealandske dollar
    result.put("NZD", new CurrencyDataImpl("NZD", "$NZ", 2));
    // omanske rialer
    result.put("OMR", new CurrencyDataImpl("OMR", "RO", 3));
    // panamanske balboa
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/."));
    // peruvianske inti
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130));
    // peruvianske nye sol
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/."));
    // peruvianske sol
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130));
    // papuanske kina
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2));
    // filippinske pesos
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP"));
    // pakistanske rupier
    result.put("PKR", new CurrencyDataImpl("PKR", "Pra", 2, "PKRs."));
    // polske zloty
    result.put("PLN", new CurrencyDataImpl("PLN", "Zl", 2));
    // polske zloty (1950-1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130));
    // portugisiske escudo
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130));
    // paraguayanske guarani
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0));
    // qatarske rialer
    result.put("QAR", new CurrencyDataImpl("QAR", "QR", 2));
    // rhodesiske dollar
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130));
    // gamle rumenske leu
    result.put("ROL", new CurrencyDataImpl("ROL", "leu", 130));
    // rumenske leu
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2));
    // serbiske dinarer
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 2));
    // russiske rubler
    result.put("RUB", new CurrencyDataImpl("RUB", "руб", 2, "руб"));
    // russiske rubler (1991-1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130));
    // rwandiske franc
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0));
    // saudiarabiske riyaler
    result.put("SAR", new CurrencyDataImpl("SAR", "SRl", 2, "SR"));
    // salomonske dollar
    result.put("SBD", new CurrencyDataImpl("SBD", "SI$", 2));
    // seychelliske rupier
    result.put("SCR", new CurrencyDataImpl("SCR", "SR", 2));
    // sudanesiske dinarer
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130));
    // sudanesiske pund
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130));
    // svenske kroner
    result.put("SEK", new CurrencyDataImpl("SEK", "Skr", 2, "kr"));
    // singaporske dollar
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$"));
    // sankthelenske pund
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2));
    // slovenske tolar
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130));
    // slovakiske koruna
    result.put("SKK", new CurrencyDataImpl("SKK", "Sk", 2));
    // sierraleonske leone
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 2));
    // somaliske shilling
    result.put("SOS", new CurrencyDataImpl("SOS", "So. Sh.", 2));
    // surinamske dollar
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2));
    // surinamske gylden
    result.put("SRG", new CurrencyDataImpl("SRG", "Sf", 130));
    // Sao Tome og Principe-dobra
    result.put("STD", new CurrencyDataImpl("STD", "Db", 2));
    // sovjetiske rubler
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130));
    // salvadoranske colon
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 2));
    // syriske pund
    result.put("SYP", new CurrencyDataImpl("SYP", "LS", 2));
    // swazilandske lilangeni
    result.put("SZL", new CurrencyDataImpl("SZL", "E", 2));
    // thailandske baht
    result.put("THB", new CurrencyDataImpl("THB", "THB", 2, "THB"));
    // tadsjikiske rubler
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130));
    // tadsjikiske somoni
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2));
    // turkmenske manat
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 2));
    // tunisiske dinarer
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3));
    // tonganske paʻanga
    result.put("TOP", new CurrencyDataImpl("TOP", "T$", 2));
    // timoresiske escudo
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130));
    // tyrkiske lire
    result.put("TRL", new CurrencyDataImpl("TRL", "TL", 128));
    // ny tyrkisk lire
    result.put("TRY", new CurrencyDataImpl("TRY", "YTL", 2, "YTL"));
    // trinidadiske dollar
    result.put("TTD", new CurrencyDataImpl("TTD", "TT$", 2));
    // taiwanske nye dollar
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$"));
    // tanzanianske shilling
    result.put("TZS", new CurrencyDataImpl("TZS", "T Sh", 2));
    // ukrainske hryvnia
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2));
    // ukrainske karbovanetz
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130));
    // ugandiske shilling (1966-1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130));
    // ugandiske shilling
    result.put("UGX", new CurrencyDataImpl("UGX", "U Sh", 2));
    // amerikanske dollar
    result.put("USD", new CurrencyDataImpl("USD", "USD", 2, "US$"));
    // amerikanske dollar (neste dag)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130));
    // amerikanske dollar (samme dag)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130));
    // uruguayanske pesos (1975-1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130));
    // uruguayanske peso uruguayo
    result.put("UYU", new CurrencyDataImpl("UYU", "Ur$", 2, "UY$"));
    // usbekiske sum
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2));
    // venezuelanske bolivar
    result.put("VEB", new CurrencyDataImpl("VEB", "Be", 130));
    // vietnamesiske dong
    result.put("VND", new CurrencyDataImpl("VND", "₫", 26, "₫"));
    // vanuatiske vatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VT", 0));
    // vestsamoiske tala
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2));
    // CFA franc BEAC
    result.put("XAF", new CurrencyDataImpl("XAF", "XAF", 0));
    // sølv
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130));
    // gull
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130));
    // europeisk sammensatt enhet
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130));
    // europeisk monetær enhet
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130));
    // europeisk kontoenhet (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130));
    // europeisk kontoenhet (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130));
    // østkaribiske dollar
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2));
    // spesielle trekkrettigheter
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130));
    // europeisk valutaenhet
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130));
    // franske gullfranc
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130));
    // franske UIC-franc
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130));
    // CFA franc BCEAO
    result.put("XOF", new CurrencyDataImpl("XOF", "XOF", 0));
    // palladium
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130));
    // CFP franc
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0));
    // platina
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130));
    // RINET-fond
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 130));
    // ukjent eller ugyldig valuta
    result.put("XXX", new CurrencyDataImpl("XXX", "XXX", 130));
    // jemenittiske dinarer
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130));
    // jemenittiske rialer
    result.put("YER", new CurrencyDataImpl("YER", "YRl", 2, "YER"));
    // jugoslaviske dinarer (hard)
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130));
    // jugoslaviske noviy-dinarer
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130));
    // jugoslaviske konvertible dinarer
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130));
    // sørafrikanske rand (finansielle)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130));
    // sørafrikanske rand
    result.put("ZAR", new CurrencyDataImpl("ZAR", "R", 2, "ZAR"));
    // zambiske kwacha
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 2));
    // zairiske nye zaire
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130));
    // zairiske zaire
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130));
    // zimbabwiske dollar
    result.put("ZWD", new CurrencyDataImpl("ZWD", "Z$", 2));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // andorranske pesetas
      "ADP": [ "ADP", "ADP", 128],
      // UAE dirham
      "AED": [ "AED", "DH", 2, "DH"],
      // afghani (1927-2002)
      "AFA": [ "AFA", "AFA", 130],
      // afghani
      "AFN": [ "AFN", "Af", 2],
      // albanske lek
      "ALL": [ "ALL", "lek", 2],
      // armenske dram
      "AMD": [ "AMD", "dram", 2],
      // nederlandske antillegylden
      "ANG": [ "ANG", "NA f.", 2],
      // angolanske kwanza
      "AOA": [ "AOA", "AOA", 2],
      // angolanske kwanza (1977-1990)
      "AOK": [ "AOK", "AOK", 130],
      // angolanske nye kwanza (1990-2000)
      "AON": [ "AON", "AON", 130],
      // angolanske kwanza reajustado (1995-1999)
      "AOR": [ "AOR", "AOR", 130],
      // argentinske australer
      "ARA": [ "ARA", "ARA", 130],
      // argentinske pesos (1983-1985)
      "ARP": [ "ARP", "ARP", 130],
      // argentinske pesos
      "ARS": [ "ARS", "Arg$", 2, "AR$"],
      // østerrikske shilling
      "ATS": [ "ATS", "ATS", 130],
      // australske dollar
      "AUD": [ "AUD", "$A", 2, "AU$"],
      // arubiske gylden
      "AWG": [ "AWG", "AWG", 2],
      // aserbajdsjanske manat (1993-2006)
      "AZM": [ "AZM", "AZM", 130],
      // bosnisk-hercegovinske dinarer
      "BAD": [ "BAD", "BAD", 130],
      // bosnisk-hercegovinske mark (konvertible)
      "BAM": [ "BAM", "KM", 2],
      // barbadiske dollar
      "BBD": [ "BBD", "BDS$", 2],
      // bangladeshiske taka
      "BDT": [ "BDT", "Tk", 2, "Tk"],
      // belgiske franc (konvertible)
      "BEC": [ "BEC", "BEC", 130],
      // belgiske franc
      "BEF": [ "BEF", "BF", 130],
      // belgiske franc (finansielle)
      "BEL": [ "BEL", "BEL", 130],
      // bulgarske lev (hard)
      "BGL": [ "BGL", "lev", 130],
      // bulgarske lev
      "BGN": [ "BGN", "BGN", 2],
      // bahrainske dinarer
      "BHD": [ "BHD", "BD", 3],
      // burundiske franc
      "BIF": [ "BIF", "Fbu", 0],
      // bermudiske dollar
      "BMD": [ "BMD", "Ber$", 2],
      // bruneiske dollar
      "BND": [ "BND", "BND", 2],
      // boliviano
      "BOB": [ "BOB", "Bs", 2],
      // bolivianske pesos
      "BOP": [ "BOP", "BOP", 130],
      // bolivianske mvdol
      "BOV": [ "BOV", "BOV", 130],
      // brasilianske cruzeiro novo (1967-1986)
      "BRB": [ "BRB", "BRB", 130],
      // brasilianske cruzado
      "BRC": [ "BRC", "BRC", 130],
      // brasilianske cruzeiro (1990-1993)
      "BRE": [ "BRE", "BRE", 130],
      // brasilianske realer
      "BRL": [ "BRL", "BRL", 2, "R$"],
      // brasilianske cruzado novo
      "BRN": [ "BRN", "BRN", 130],
      // brasilianske cruzeiro
      "BRR": [ "BRR", "BRR", 130],
      // bahamske dollar
      "BSD": [ "BSD", "BSD", 2],
      // bhutanske ngultrum
      "BTN": [ "BTN", "Nu", 130],
      // burmesiske kyat
      "BUK": [ "BUK", "BUK", 130],
      // botswanske pula
      "BWP": [ "BWP", "BWP", 2],
      // hviterussiske nye rubler (1994-1999)
      "BYB": [ "BYB", "BYB", 130],
      // hviterussiske rubler
      "BYR": [ "BYR", "Rbl", 0],
      // beliziske dollar
      "BZD": [ "BZD", "BZ$", 2],
      // kanadiske dollar
      "CAD": [ "CAD", "Can$", 2, "C$"],
      // kongolesiske franc (congolais)
      "CDF": [ "CDF", "CDF", 2],
      // WIR euro
      "CHE": [ "CHE", "CHE", 130],
      // sveitsiske franc
      "CHF": [ "CHF", "SwF", 2, "CHF"],
      // WIR franc
      "CHW": [ "CHW", "CHW", 130],
      // chilenske unidades de fomento
      "CLF": [ "CLF", "CLF", 128],
      // chilenske pesos
      "CLP": [ "CLP", "Ch$", 0, "CL$"],
      // kinesiske yuan renminbi
      "CNY": [ "CNY", "Y", 2, "RMB¥"],
      // colombianske pesos
      "COP": [ "COP", "Col$", 2, "COL$"],
      // unidad de valor real
      "COU": [ "COU", "COU", 130],
      // costaricanske colon
      "CRC": [ "CRC", "C", 2, "CR₡"],
      // gamle serbiske dinarer
      "CSD": [ "CSD", "CSD", 130],
      // tsjekkoslovakiske koruna (hard)
      "CSK": [ "CSK", "CSK", 130],
      // kubanske pesos
      "CUP": [ "CUP", "$MN", 2, "$MN"],
      // kappverdiske escudo
      "CVE": [ "CVE", "CVEsc", 2],
      // kypriotiske pund
      "CYP": [ "CYP", "£C", 130],
      // tsjekkiske koruna
      "CZK": [ "CZK", "Kč", 2, "Kč"],
      // østtyske ostmark
      "DDM": [ "DDM", "DDM", 130],
      // tyske mark
      "DEM": [ "DEM", "DEM", 130],
      // djiboutiske franc
      "DJF": [ "DJF", "DF", 0],
      // danske kroner
      "DKK": [ "DKK", "Dkr", 2, "kr"],
      // dominikanske pesos
      "DOP": [ "DOP", "RD$", 2, "RD$"],
      // algeriske dinarer
      "DZD": [ "DZD", "DA", 2],
      // ecuadorianske sucre
      "ECS": [ "ECS", "ECS", 130],
      // ecuadorianske unidad de valor constante (UVC)
      "ECV": [ "ECV", "ECV", 130],
      // estiske kroon
      "EEK": [ "EEK", "EEK", 2],
      // egyptiske pund
      "EGP": [ "EGP", "LE", 2, "LE"],
      // ekwele
      "EQE": [ "EQE", "EQE", 130],
      // eritreiske nakfa
      "ERN": [ "ERN", "ERN", 2],
      // spanske peseta (A-konto)
      "ESA": [ "ESA", "ESA", 130],
      // spanske peseta (konvertibel konto)
      "ESB": [ "ESB", "ESB", 130],
      // spanske peseta
      "ESP": [ "ESP", "ESP", 128],
      // etiopiske birr
      "ETB": [ "ETB", "Br", 2],
      // euro
      "EUR": [ "EUR", "EUR", 2, "€"],
      // finske mark
      "FIM": [ "FIM", "FIM", 130],
      // fijianske dollar
      "FJD": [ "FJD", "F$", 2],
      // Falkland-pund
      "FKP": [ "FKP", "FKP", 2],
      // franske franc
      "FRF": [ "FRF", "FRF", 130],
      // britiske pund sterling
      "GBP": [ "GBP", "GBP", 2, "GB£"],
      // georgiske kupon larit
      "GEK": [ "GEK", "GEK", 130],
      // georgiske lari
      "GEL": [ "GEL", "lari", 2],
      // ghanesiske cedi
      "GHC": [ "GHC", "GHC", 130],
      // gibraltarske pund
      "GIP": [ "GIP", "GIP", 2],
      // gambiske dalasi
      "GMD": [ "GMD", "GMD", 2],
      // guineanske franc
      "GNF": [ "GNF", "GF", 0],
      // guineanske syli
      "GNS": [ "GNS", "GNS", 130],
      // ekvatorialguineanske ekwele guineana
      "GQE": [ "GQE", "GQE", 130],
      // greske drakmer
      "GRD": [ "GRD", "GRD", 130],
      // guatemalanske quetzal
      "GTQ": [ "GTQ", "Q", 2],
      // portugisiske guinea escudo
      "GWE": [ "GWE", "GWE", 130],
      // Guinea-Bissau-pesos
      "GWP": [ "GWP", "GWP", 2],
      // guyanske dollar
      "GYD": [ "GYD", "G$", 2],
      // Hongkong-dollar
      "HKD": [ "HKD", "HK$", 2, "HK$"],
      // Hoduras Lempira
      "HNL": [ "HNL", "L", 2],
      // kroatiske dinarer
      "HRD": [ "HRD", "HRD", 130],
      // kroatiske kuna
      "HRK": [ "HRK", "HRK", 2],
      // haitiske gourde
      "HTG": [ "HTG", "HTG", 2],
      // ungarske forinter
      "HUF": [ "HUF", "Ft", 2],
      // indonesiske rupier
      "IDR": [ "IDR", "Rp", 2],
      // irske pund
      "IEP": [ "IEP", "IR£", 130],
      // israelske pund
      "ILP": [ "ILP", "ILP", 130],
      // israelske nye shekler
      "ILS": [ "ILS", "IL₪", 2, "IL₪"],
      // indiske rupier
      "INR": [ "INR", "INR", 2, "Rs"],
      // irakske dinarer
      "IQD": [ "IQD", "ID", 3],
      // iranske rialer
      "IRR": [ "IRR", "RI", 2],
      // islandske kroner
      "ISK": [ "ISK", "kr", 2, "kr"],
      // italienske lire
      "ITL": [ "ITL", "ITL", 128],
      // jamaikanske dollar
      "JMD": [ "JMD", "J$", 2, "JA$"],
      // jordanske dinarer
      "JOD": [ "JOD", "JD", 3],
      // japanske yen
      "JPY": [ "JPY", "JPY", 0, "JP¥"],
      // kenyanske shilling
      "KES": [ "KES", "K Sh", 2],
      // kirgisiske som
      "KGS": [ "KGS", "som", 2],
      // kambodsjanske riel
      "KHR": [ "KHR", "CR", 2],
      // komoriske franc
      "KMF": [ "KMF", "CF", 0],
      // nordkoreanske won
      "KPW": [ "KPW", "KPW", 2],
      // sørkoreanske won
      "KRW": [ "KRW", "KR₩", 0, "KR₩"],
      // kuwaitiske dinarer
      "KWD": [ "KWD", "KD", 3],
      // caymanske dollar
      "KYD": [ "KYD", "KYD", 2],
      // kasakhstanske tenge
      "KZT": [ "KZT", "T", 2],
      // laotiske kip
      "LAK": [ "LAK", "LAK", 2],
      // libanesiske pund
      "LBP": [ "LBP", "LL", 2],
      // srilankiske rupier
      "LKR": [ "LKR", "SL Re", 2, "SLRs"],
      // liberiske dollar
      "LRD": [ "LRD", "LRD", 2],
      // lesothiske loti
      "LSL": [ "LSL", "M", 130],
      // maloti
      "LSM": [ "LSM", "LSM", 130],
      // litauiske lita
      "LTL": [ "LTL", "LTL", 2],
      // litauiske talonas
      "LTT": [ "LTT", "LTT", 130],
      // luxemburgske konvertible franc
      "LUC": [ "LUC", "LUC", 130],
      // luxemburgske franc
      "LUF": [ "LUF", "LUF", 128],
      // luxemburgske finansielle franc
      "LUL": [ "LUL", "LUL", 130],
      // latviske lats
      "LVL": [ "LVL", "LVL", 2],
      // latviske rubler
      "LVR": [ "LVR", "LVR", 130],
      // libyske dinarer
      "LYD": [ "LYD", "LD", 3],
      // marokkanske dirham
      "MAD": [ "MAD", "MAD", 2],
      // marokkanske franc
      "MAF": [ "MAF", "MAF", 130],
      // moldovske leu
      "MDL": [ "MDL", "MDL", 2],
      // madagassiske ariary
      "MGA": [ "MGA", "MGA", 0],
      // madagassiske franc
      "MGF": [ "MGF", "MGF", 128],
      // makedonske denarer
      "MKD": [ "MKD", "MDen", 2],
      // maliske franc
      "MLF": [ "MLF", "MLF", 130],
      // myanmarske kyat
      "MMK": [ "MMK", "MMK", 2],
      // mongolske tugrik
      "MNT": [ "MNT", "Tug", 2, "MN₮"],
      // makaoske pataca
      "MOP": [ "MOP", "MOP", 2],
      // mauritanske ouguiya
      "MRO": [ "MRO", "UM", 2],
      // maltesiske lira
      "MTL": [ "MTL", "Lm", 130],
      // maltesiske pund
      "MTP": [ "MTP", "MTP", 130],
      // mauritiske rupier
      "MUR": [ "MUR", "MUR", 2],
      // maldiviske rufiyaa
      "MVR": [ "MVR", "MVR", 2],
      // malawiske kwacha
      "MWK": [ "MWK", "MK", 2],
      // meksikanske pesos
      "MXN": [ "MXN", "MEX$", 2, "Mex$"],
      // meksikanske sølvpesos (1861-1992)
      "MXP": [ "MXP", "MXP", 130],
      // meksikanske unidad de inversion (UDI)
      "MXV": [ "MXV", "MXV", 130],
      // malaysiske ringgit
      "MYR": [ "MYR", "RM", 2, "RM"],
      // mosambikiske escudo
      "MZE": [ "MZE", "MZE", 130],
      // gamle mosambikiske metical
      "MZM": [ "MZM", "Mt", 130],
      // mosambikiske metical
      "MZN": [ "MZN", "MZN", 2],
      // namibiske dollar
      "NAD": [ "NAD", "N$", 130],
      // nigerianske naira
      "NGN": [ "NGN", "NGN", 2],
      // nicaraguanske cordoba
      "NIC": [ "NIC", "NIC", 130],
      // nicaraguanske cordoba oro
      "NIO": [ "NIO", "NIO", 2],
      // nederlandske gylden
      "NLG": [ "NLG", "NLG", 130],
      // norske kroner
      "NOK": [ "NOK", "kr", 2, "NOkr"],
      // nepalske rupier
      "NPR": [ "NPR", "Nrs", 2],
      // new zealandske dollar
      "NZD": [ "NZD", "$NZ", 2],
      // omanske rialer
      "OMR": [ "OMR", "RO", 3],
      // panamanske balboa
      "PAB": [ "PAB", "B/.", 2, "B/."],
      // peruvianske inti
      "PEI": [ "PEI", "PEI", 130],
      // peruvianske nye sol
      "PEN": [ "PEN", "S/.", 2, "S/."],
      // peruvianske sol
      "PES": [ "PES", "PES", 130],
      // papuanske kina
      "PGK": [ "PGK", "PGK", 2],
      // filippinske pesos
      "PHP": [ "PHP", "PHP", 2, "PHP"],
      // pakistanske rupier
      "PKR": [ "PKR", "Pra", 2, "PKRs."],
      // polske zloty
      "PLN": [ "PLN", "Zl", 2],
      // polske zloty (1950-1995)
      "PLZ": [ "PLZ", "PLZ", 130],
      // portugisiske escudo
      "PTE": [ "PTE", "PTE", 130],
      // paraguayanske guarani
      "PYG": [ "PYG", "PYG", 0],
      // qatarske rialer
      "QAR": [ "QAR", "QR", 2],
      // rhodesiske dollar
      "RHD": [ "RHD", "RHD", 130],
      // gamle rumenske leu
      "ROL": [ "ROL", "leu", 130],
      // rumenske leu
      "RON": [ "RON", "RON", 2],
      // serbiske dinarer
      "RSD": [ "RSD", "RSD", 2],
      // russiske rubler
      "RUB": [ "RUB", "руб", 2, "руб"],
      // russiske rubler (1991-1998)
      "RUR": [ "RUR", "RUR", 130],
      // rwandiske franc
      "RWF": [ "RWF", "RWF", 0],
      // saudiarabiske riyaler
      "SAR": [ "SAR", "SRl", 2, "SR"],
      // salomonske dollar
      "SBD": [ "SBD", "SI$", 2],
      // seychelliske rupier
      "SCR": [ "SCR", "SR", 2],
      // sudanesiske dinarer
      "SDD": [ "SDD", "SDD", 130],
      // sudanesiske pund
      "SDP": [ "SDP", "SDP", 130],
      // svenske kroner
      "SEK": [ "SEK", "Skr", 2, "kr"],
      // singaporske dollar
      "SGD": [ "SGD", "S$", 2, "S$"],
      // sankthelenske pund
      "SHP": [ "SHP", "SHP", 2],
      // slovenske tolar
      "SIT": [ "SIT", "SIT", 130],
      // slovakiske koruna
      "SKK": [ "SKK", "Sk", 2],
      // sierraleonske leone
      "SLL": [ "SLL", "SLL", 2],
      // somaliske shilling
      "SOS": [ "SOS", "So. Sh.", 2],
      // surinamske dollar
      "SRD": [ "SRD", "SRD", 2],
      // surinamske gylden
      "SRG": [ "SRG", "Sf", 130],
      // Sao Tome og Principe-dobra
      "STD": [ "STD", "Db", 2],
      // sovjetiske rubler
      "SUR": [ "SUR", "SUR", 130],
      // salvadoranske colon
      "SVC": [ "SVC", "SVC", 2],
      // syriske pund
      "SYP": [ "SYP", "LS", 2],
      // swazilandske lilangeni
      "SZL": [ "SZL", "E", 2],
      // thailandske baht
      "THB": [ "THB", "THB", 2, "THB"],
      // tadsjikiske rubler
      "TJR": [ "TJR", "TJR", 130],
      // tadsjikiske somoni
      "TJS": [ "TJS", "TJS", 2],
      // turkmenske manat
      "TMM": [ "TMM", "TMM", 2],
      // tunisiske dinarer
      "TND": [ "TND", "TND", 3],
      // tonganske paʻanga
      "TOP": [ "TOP", "T$", 2],
      // timoresiske escudo
      "TPE": [ "TPE", "TPE", 130],
      // tyrkiske lire
      "TRL": [ "TRL", "TL", 128],
      // ny tyrkisk lire
      "TRY": [ "TRY", "YTL", 2, "YTL"],
      // trinidadiske dollar
      "TTD": [ "TTD", "TT$", 2],
      // taiwanske nye dollar
      "TWD": [ "TWD", "NT$", 2, "NT$"],
      // tanzanianske shilling
      "TZS": [ "TZS", "T Sh", 2],
      // ukrainske hryvnia
      "UAH": [ "UAH", "UAH", 2],
      // ukrainske karbovanetz
      "UAK": [ "UAK", "UAK", 130],
      // ugandiske shilling (1966-1987)
      "UGS": [ "UGS", "UGS", 130],
      // ugandiske shilling
      "UGX": [ "UGX", "U Sh", 2],
      // amerikanske dollar
      "USD": [ "USD", "USD", 2, "US$"],
      // amerikanske dollar (neste dag)
      "USN": [ "USN", "USN", 130],
      // amerikanske dollar (samme dag)
      "USS": [ "USS", "USS", 130],
      // uruguayanske pesos (1975-1993)
      "UYP": [ "UYP", "UYP", 130],
      // uruguayanske peso uruguayo
      "UYU": [ "UYU", "Ur$", 2, "UY$"],
      // usbekiske sum
      "UZS": [ "UZS", "UZS", 2],
      // venezuelanske bolivar
      "VEB": [ "VEB", "Be", 130],
      // vietnamesiske dong
      "VND": [ "VND", "₫", 26, "₫"],
      // vanuatiske vatu
      "VUV": [ "VUV", "VT", 0],
      // vestsamoiske tala
      "WST": [ "WST", "WST", 2],
      // CFA franc BEAC
      "XAF": [ "XAF", "XAF", 0],
      // sølv
      "XAG": [ "XAG", "XAG", 130],
      // gull
      "XAU": [ "XAU", "XAU", 130],
      // europeisk sammensatt enhet
      "XBA": [ "XBA", "XBA", 130],
      // europeisk monetær enhet
      "XBB": [ "XBB", "XBB", 130],
      // europeisk kontoenhet (XBC)
      "XBC": [ "XBC", "XBC", 130],
      // europeisk kontoenhet (XBD)
      "XBD": [ "XBD", "XBD", 130],
      // østkaribiske dollar
      "XCD": [ "XCD", "EC$", 2],
      // spesielle trekkrettigheter
      "XDR": [ "XDR", "XDR", 130],
      // europeisk valutaenhet
      "XEU": [ "XEU", "XEU", 130],
      // franske gullfranc
      "XFO": [ "XFO", "XFO", 130],
      // franske UIC-franc
      "XFU": [ "XFU", "XFU", 130],
      // CFA franc BCEAO
      "XOF": [ "XOF", "XOF", 0],
      // palladium
      "XPD": [ "XPD", "XPD", 130],
      // CFP franc
      "XPF": [ "XPF", "CFPF", 0],
      // platina
      "XPT": [ "XPT", "XPT", 130],
      // RINET-fond
      "XRE": [ "XRE", "XRE", 130],
      // ukjent eller ugyldig valuta
      "XXX": [ "XXX", "XXX", 130],
      // jemenittiske dinarer
      "YDD": [ "YDD", "YDD", 130],
      // jemenittiske rialer
      "YER": [ "YER", "YRl", 2, "YER"],
      // jugoslaviske dinarer (hard)
      "YUD": [ "YUD", "YUD", 130],
      // jugoslaviske noviy-dinarer
      "YUM": [ "YUM", "YUM", 130],
      // jugoslaviske konvertible dinarer
      "YUN": [ "YUN", "YUN", 130],
      // sørafrikanske rand (finansielle)
      "ZAL": [ "ZAL", "ZAL", 130],
      // sørafrikanske rand
      "ZAR": [ "ZAR", "R", 2, "ZAR"],
      // zambiske kwacha
      "ZMK": [ "ZMK", "ZMK", 2],
      // zairiske nye zaire
      "ZRN": [ "ZRN", "ZRN", 130],
      // zairiske zaire
      "ZRZ": [ "ZRZ", "ZRZ", 130],
      // zimbabwiske dollar
      "ZWD": [ "ZWD", "Z$", 2],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "andorranske pesetas");
    result.put("AED", "UAE dirham");
    result.put("AFA", "afghani (1927-2002)");
    result.put("AFN", "afghani");
    result.put("ALL", "albanske lek");
    result.put("AMD", "armenske dram");
    result.put("ANG", "nederlandske antillegylden");
    result.put("AOA", "angolanske kwanza");
    result.put("AOK", "angolanske kwanza (1977-1990)");
    result.put("AON", "angolanske nye kwanza (1990-2000)");
    result.put("AOR", "angolanske kwanza reajustado (1995-1999)");
    result.put("ARA", "argentinske australer");
    result.put("ARP", "argentinske pesos (1983-1985)");
    result.put("ARS", "argentinske pesos");
    result.put("ATS", "østerrikske shilling");
    result.put("AUD", "australske dollar");
    result.put("AWG", "arubiske gylden");
    result.put("AZM", "aserbajdsjanske manat (1993-2006)");
    result.put("BAD", "bosnisk-hercegovinske dinarer");
    result.put("BAM", "bosnisk-hercegovinske mark (konvertible)");
    result.put("BBD", "barbadiske dollar");
    result.put("BDT", "bangladeshiske taka");
    result.put("BEC", "belgiske franc (konvertible)");
    result.put("BEF", "belgiske franc");
    result.put("BEL", "belgiske franc (finansielle)");
    result.put("BGL", "bulgarske lev (hard)");
    result.put("BGN", "bulgarske lev");
    result.put("BHD", "bahrainske dinarer");
    result.put("BIF", "burundiske franc");
    result.put("BMD", "bermudiske dollar");
    result.put("BND", "bruneiske dollar");
    result.put("BOB", "boliviano");
    result.put("BOP", "bolivianske pesos");
    result.put("BOV", "bolivianske mvdol");
    result.put("BRB", "brasilianske cruzeiro novo (1967-1986)");
    result.put("BRC", "brasilianske cruzado");
    result.put("BRE", "brasilianske cruzeiro (1990-1993)");
    result.put("BRL", "brasilianske realer");
    result.put("BRN", "brasilianske cruzado novo");
    result.put("BRR", "brasilianske cruzeiro");
    result.put("BSD", "bahamske dollar");
    result.put("BTN", "bhutanske ngultrum");
    result.put("BUK", "burmesiske kyat");
    result.put("BWP", "botswanske pula");
    result.put("BYB", "hviterussiske nye rubler (1994-1999)");
    result.put("BYR", "hviterussiske rubler");
    result.put("BZD", "beliziske dollar");
    result.put("CAD", "kanadiske dollar");
    result.put("CDF", "kongolesiske franc (congolais)");
    result.put("CHE", "WIR euro");
    result.put("CHF", "sveitsiske franc");
    result.put("CHW", "WIR franc");
    result.put("CLF", "chilenske unidades de fomento");
    result.put("CLP", "chilenske pesos");
    result.put("CNY", "kinesiske yuan renminbi");
    result.put("COP", "colombianske pesos");
    result.put("COU", "unidad de valor real");
    result.put("CRC", "costaricanske colon");
    result.put("CSD", "gamle serbiske dinarer");
    result.put("CSK", "tsjekkoslovakiske koruna (hard)");
    result.put("CUP", "kubanske pesos");
    result.put("CVE", "kappverdiske escudo");
    result.put("CYP", "kypriotiske pund");
    result.put("CZK", "tsjekkiske koruna");
    result.put("DDM", "østtyske ostmark");
    result.put("DEM", "tyske mark");
    result.put("DJF", "djiboutiske franc");
    result.put("DKK", "danske kroner");
    result.put("DOP", "dominikanske pesos");
    result.put("DZD", "algeriske dinarer");
    result.put("ECS", "ecuadorianske sucre");
    result.put("ECV", "ecuadorianske unidad de valor constante (UVC)");
    result.put("EEK", "estiske kroon");
    result.put("EGP", "egyptiske pund");
    result.put("EQE", "ekwele");
    result.put("ERN", "eritreiske nakfa");
    result.put("ESA", "spanske peseta (A-konto)");
    result.put("ESB", "spanske peseta (konvertibel konto)");
    result.put("ESP", "spanske peseta");
    result.put("ETB", "etiopiske birr");
    result.put("EUR", "euro");
    result.put("FIM", "finske mark");
    result.put("FJD", "fijianske dollar");
    result.put("FKP", "Falkland-pund");
    result.put("FRF", "franske franc");
    result.put("GBP", "britiske pund sterling");
    result.put("GEK", "georgiske kupon larit");
    result.put("GEL", "georgiske lari");
    result.put("GHC", "ghanesiske cedi");
    result.put("GIP", "gibraltarske pund");
    result.put("GMD", "gambiske dalasi");
    result.put("GNF", "guineanske franc");
    result.put("GNS", "guineanske syli");
    result.put("GQE", "ekvatorialguineanske ekwele guineana");
    result.put("GRD", "greske drakmer");
    result.put("GTQ", "guatemalanske quetzal");
    result.put("GWE", "portugisiske guinea escudo");
    result.put("GWP", "Guinea-Bissau-pesos");
    result.put("GYD", "guyanske dollar");
    result.put("HKD", "Hongkong-dollar");
    result.put("HNL", "Hoduras Lempira");
    result.put("HRD", "kroatiske dinarer");
    result.put("HRK", "kroatiske kuna");
    result.put("HTG", "haitiske gourde");
    result.put("HUF", "ungarske forinter");
    result.put("IDR", "indonesiske rupier");
    result.put("IEP", "irske pund");
    result.put("ILP", "israelske pund");
    result.put("ILS", "israelske nye shekler");
    result.put("INR", "indiske rupier");
    result.put("IQD", "irakske dinarer");
    result.put("IRR", "iranske rialer");
    result.put("ISK", "islandske kroner");
    result.put("ITL", "italienske lire");
    result.put("JMD", "jamaikanske dollar");
    result.put("JOD", "jordanske dinarer");
    result.put("JPY", "japanske yen");
    result.put("KES", "kenyanske shilling");
    result.put("KGS", "kirgisiske som");
    result.put("KHR", "kambodsjanske riel");
    result.put("KMF", "komoriske franc");
    result.put("KPW", "nordkoreanske won");
    result.put("KRW", "sørkoreanske won");
    result.put("KWD", "kuwaitiske dinarer");
    result.put("KYD", "caymanske dollar");
    result.put("KZT", "kasakhstanske tenge");
    result.put("LAK", "laotiske kip");
    result.put("LBP", "libanesiske pund");
    result.put("LKR", "srilankiske rupier");
    result.put("LRD", "liberiske dollar");
    result.put("LSL", "lesothiske loti");
    result.put("LSM", "maloti");
    result.put("LTL", "litauiske lita");
    result.put("LTT", "litauiske talonas");
    result.put("LUC", "luxemburgske konvertible franc");
    result.put("LUF", "luxemburgske franc");
    result.put("LUL", "luxemburgske finansielle franc");
    result.put("LVL", "latviske lats");
    result.put("LVR", "latviske rubler");
    result.put("LYD", "libyske dinarer");
    result.put("MAD", "marokkanske dirham");
    result.put("MAF", "marokkanske franc");
    result.put("MDL", "moldovske leu");
    result.put("MGA", "madagassiske ariary");
    result.put("MGF", "madagassiske franc");
    result.put("MKD", "makedonske denarer");
    result.put("MLF", "maliske franc");
    result.put("MMK", "myanmarske kyat");
    result.put("MNT", "mongolske tugrik");
    result.put("MOP", "makaoske pataca");
    result.put("MRO", "mauritanske ouguiya");
    result.put("MTL", "maltesiske lira");
    result.put("MTP", "maltesiske pund");
    result.put("MUR", "mauritiske rupier");
    result.put("MVR", "maldiviske rufiyaa");
    result.put("MWK", "malawiske kwacha");
    result.put("MXN", "meksikanske pesos");
    result.put("MXP", "meksikanske sølvpesos (1861-1992)");
    result.put("MXV", "meksikanske unidad de inversion (UDI)");
    result.put("MYR", "malaysiske ringgit");
    result.put("MZE", "mosambikiske escudo");
    result.put("MZM", "gamle mosambikiske metical");
    result.put("MZN", "mosambikiske metical");
    result.put("NAD", "namibiske dollar");
    result.put("NGN", "nigerianske naira");
    result.put("NIC", "nicaraguanske cordoba");
    result.put("NIO", "nicaraguanske cordoba oro");
    result.put("NLG", "nederlandske gylden");
    result.put("NOK", "norske kroner");
    result.put("NPR", "nepalske rupier");
    result.put("NZD", "new zealandske dollar");
    result.put("OMR", "omanske rialer");
    result.put("PAB", "panamanske balboa");
    result.put("PEI", "peruvianske inti");
    result.put("PEN", "peruvianske nye sol");
    result.put("PES", "peruvianske sol");
    result.put("PGK", "papuanske kina");
    result.put("PHP", "filippinske pesos");
    result.put("PKR", "pakistanske rupier");
    result.put("PLN", "polske zloty");
    result.put("PLZ", "polske zloty (1950-1995)");
    result.put("PTE", "portugisiske escudo");
    result.put("PYG", "paraguayanske guarani");
    result.put("QAR", "qatarske rialer");
    result.put("RHD", "rhodesiske dollar");
    result.put("ROL", "gamle rumenske leu");
    result.put("RON", "rumenske leu");
    result.put("RSD", "serbiske dinarer");
    result.put("RUB", "russiske rubler");
    result.put("RUR", "russiske rubler (1991-1998)");
    result.put("RWF", "rwandiske franc");
    result.put("SAR", "saudiarabiske riyaler");
    result.put("SBD", "salomonske dollar");
    result.put("SCR", "seychelliske rupier");
    result.put("SDD", "sudanesiske dinarer");
    result.put("SDP", "sudanesiske pund");
    result.put("SEK", "svenske kroner");
    result.put("SGD", "singaporske dollar");
    result.put("SHP", "sankthelenske pund");
    result.put("SIT", "slovenske tolar");
    result.put("SKK", "slovakiske koruna");
    result.put("SLL", "sierraleonske leone");
    result.put("SOS", "somaliske shilling");
    result.put("SRD", "surinamske dollar");
    result.put("SRG", "surinamske gylden");
    result.put("STD", "Sao Tome og Principe-dobra");
    result.put("SUR", "sovjetiske rubler");
    result.put("SVC", "salvadoranske colon");
    result.put("SYP", "syriske pund");
    result.put("SZL", "swazilandske lilangeni");
    result.put("THB", "thailandske baht");
    result.put("TJR", "tadsjikiske rubler");
    result.put("TJS", "tadsjikiske somoni");
    result.put("TMM", "turkmenske manat");
    result.put("TND", "tunisiske dinarer");
    result.put("TOP", "tonganske paʻanga");
    result.put("TPE", "timoresiske escudo");
    result.put("TRL", "tyrkiske lire");
    result.put("TRY", "ny tyrkisk lire");
    result.put("TTD", "trinidadiske dollar");
    result.put("TWD", "taiwanske nye dollar");
    result.put("TZS", "tanzanianske shilling");
    result.put("UAH", "ukrainske hryvnia");
    result.put("UAK", "ukrainske karbovanetz");
    result.put("UGS", "ugandiske shilling (1966-1987)");
    result.put("UGX", "ugandiske shilling");
    result.put("USD", "amerikanske dollar");
    result.put("USN", "amerikanske dollar (neste dag)");
    result.put("USS", "amerikanske dollar (samme dag)");
    result.put("UYP", "uruguayanske pesos (1975-1993)");
    result.put("UYU", "uruguayanske peso uruguayo");
    result.put("UZS", "usbekiske sum");
    result.put("VEB", "venezuelanske bolivar");
    result.put("VND", "vietnamesiske dong");
    result.put("VUV", "vanuatiske vatu");
    result.put("WST", "vestsamoiske tala");
    result.put("XAF", "CFA franc BEAC");
    result.put("XAG", "sølv");
    result.put("XAU", "gull");
    result.put("XBA", "europeisk sammensatt enhet");
    result.put("XBB", "europeisk monetær enhet");
    result.put("XBC", "europeisk kontoenhet (XBC)");
    result.put("XBD", "europeisk kontoenhet (XBD)");
    result.put("XCD", "østkaribiske dollar");
    result.put("XDR", "spesielle trekkrettigheter");
    result.put("XEU", "europeisk valutaenhet");
    result.put("XFO", "franske gullfranc");
    result.put("XFU", "franske UIC-franc");
    result.put("XOF", "CFA franc BCEAO");
    result.put("XPD", "palladium");
    result.put("XPF", "CFP franc");
    result.put("XPT", "platina");
    result.put("XRE", "RINET-fond");
    result.put("XXX", "ukjent eller ugyldig valuta");
    result.put("YDD", "jemenittiske dinarer");
    result.put("YER", "jemenittiske rialer");
    result.put("YUD", "jugoslaviske dinarer (hard)");
    result.put("YUM", "jugoslaviske noviy-dinarer");
    result.put("YUN", "jugoslaviske konvertible dinarer");
    result.put("ZAL", "sørafrikanske rand (finansielle)");
    result.put("ZAR", "sørafrikanske rand");
    result.put("ZMK", "zambiske kwacha");
    result.put("ZRN", "zairiske nye zaire");
    result.put("ZRZ", "zairiske zaire");
    result.put("ZWD", "zimbabwiske dollar");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "andorranske pesetas",
      "AED": "UAE dirham",
      "AFA": "afghani (1927-2002)",
      "AFN": "afghani",
      "ALL": "albanske lek",
      "AMD": "armenske dram",
      "ANG": "nederlandske antillegylden",
      "AOA": "angolanske kwanza",
      "AOK": "angolanske kwanza (1977-1990)",
      "AON": "angolanske nye kwanza (1990-2000)",
      "AOR": "angolanske kwanza reajustado (1995-1999)",
      "ARA": "argentinske australer",
      "ARP": "argentinske pesos (1983-1985)",
      "ARS": "argentinske pesos",
      "ATS": "østerrikske shilling",
      "AUD": "australske dollar",
      "AWG": "arubiske gylden",
      "AZM": "aserbajdsjanske manat (1993-2006)",
      "BAD": "bosnisk-hercegovinske dinarer",
      "BAM": "bosnisk-hercegovinske mark (konvertible)",
      "BBD": "barbadiske dollar",
      "BDT": "bangladeshiske taka",
      "BEC": "belgiske franc (konvertible)",
      "BEF": "belgiske franc",
      "BEL": "belgiske franc (finansielle)",
      "BGL": "bulgarske lev (hard)",
      "BGN": "bulgarske lev",
      "BHD": "bahrainske dinarer",
      "BIF": "burundiske franc",
      "BMD": "bermudiske dollar",
      "BND": "bruneiske dollar",
      "BOB": "boliviano",
      "BOP": "bolivianske pesos",
      "BOV": "bolivianske mvdol",
      "BRB": "brasilianske cruzeiro novo (1967-1986)",
      "BRC": "brasilianske cruzado",
      "BRE": "brasilianske cruzeiro (1990-1993)",
      "BRL": "brasilianske realer",
      "BRN": "brasilianske cruzado novo",
      "BRR": "brasilianske cruzeiro",
      "BSD": "bahamske dollar",
      "BTN": "bhutanske ngultrum",
      "BUK": "burmesiske kyat",
      "BWP": "botswanske pula",
      "BYB": "hviterussiske nye rubler (1994-1999)",
      "BYR": "hviterussiske rubler",
      "BZD": "beliziske dollar",
      "CAD": "kanadiske dollar",
      "CDF": "kongolesiske franc (congolais)",
      "CHE": "WIR euro",
      "CHF": "sveitsiske franc",
      "CHW": "WIR franc",
      "CLF": "chilenske unidades de fomento",
      "CLP": "chilenske pesos",
      "CNY": "kinesiske yuan renminbi",
      "COP": "colombianske pesos",
      "COU": "unidad de valor real",
      "CRC": "costaricanske colon",
      "CSD": "gamle serbiske dinarer",
      "CSK": "tsjekkoslovakiske koruna (hard)",
      "CUP": "kubanske pesos",
      "CVE": "kappverdiske escudo",
      "CYP": "kypriotiske pund",
      "CZK": "tsjekkiske koruna",
      "DDM": "østtyske ostmark",
      "DEM": "tyske mark",
      "DJF": "djiboutiske franc",
      "DKK": "danske kroner",
      "DOP": "dominikanske pesos",
      "DZD": "algeriske dinarer",
      "ECS": "ecuadorianske sucre",
      "ECV": "ecuadorianske unidad de valor constante (UVC)",
      "EEK": "estiske kroon",
      "EGP": "egyptiske pund",
      "EQE": "ekwele",
      "ERN": "eritreiske nakfa",
      "ESA": "spanske peseta (A-konto)",
      "ESB": "spanske peseta (konvertibel konto)",
      "ESP": "spanske peseta",
      "ETB": "etiopiske birr",
      "EUR": "euro",
      "FIM": "finske mark",
      "FJD": "fijianske dollar",
      "FKP": "Falkland-pund",
      "FRF": "franske franc",
      "GBP": "britiske pund sterling",
      "GEK": "georgiske kupon larit",
      "GEL": "georgiske lari",
      "GHC": "ghanesiske cedi",
      "GIP": "gibraltarske pund",
      "GMD": "gambiske dalasi",
      "GNF": "guineanske franc",
      "GNS": "guineanske syli",
      "GQE": "ekvatorialguineanske ekwele guineana",
      "GRD": "greske drakmer",
      "GTQ": "guatemalanske quetzal",
      "GWE": "portugisiske guinea escudo",
      "GWP": "Guinea-Bissau-pesos",
      "GYD": "guyanske dollar",
      "HKD": "Hongkong-dollar",
      "HNL": "Hoduras Lempira",
      "HRD": "kroatiske dinarer",
      "HRK": "kroatiske kuna",
      "HTG": "haitiske gourde",
      "HUF": "ungarske forinter",
      "IDR": "indonesiske rupier",
      "IEP": "irske pund",
      "ILP": "israelske pund",
      "ILS": "israelske nye shekler",
      "INR": "indiske rupier",
      "IQD": "irakske dinarer",
      "IRR": "iranske rialer",
      "ISK": "islandske kroner",
      "ITL": "italienske lire",
      "JMD": "jamaikanske dollar",
      "JOD": "jordanske dinarer",
      "JPY": "japanske yen",
      "KES": "kenyanske shilling",
      "KGS": "kirgisiske som",
      "KHR": "kambodsjanske riel",
      "KMF": "komoriske franc",
      "KPW": "nordkoreanske won",
      "KRW": "sørkoreanske won",
      "KWD": "kuwaitiske dinarer",
      "KYD": "caymanske dollar",
      "KZT": "kasakhstanske tenge",
      "LAK": "laotiske kip",
      "LBP": "libanesiske pund",
      "LKR": "srilankiske rupier",
      "LRD": "liberiske dollar",
      "LSL": "lesothiske loti",
      "LSM": "maloti",
      "LTL": "litauiske lita",
      "LTT": "litauiske talonas",
      "LUC": "luxemburgske konvertible franc",
      "LUF": "luxemburgske franc",
      "LUL": "luxemburgske finansielle franc",
      "LVL": "latviske lats",
      "LVR": "latviske rubler",
      "LYD": "libyske dinarer",
      "MAD": "marokkanske dirham",
      "MAF": "marokkanske franc",
      "MDL": "moldovske leu",
      "MGA": "madagassiske ariary",
      "MGF": "madagassiske franc",
      "MKD": "makedonske denarer",
      "MLF": "maliske franc",
      "MMK": "myanmarske kyat",
      "MNT": "mongolske tugrik",
      "MOP": "makaoske pataca",
      "MRO": "mauritanske ouguiya",
      "MTL": "maltesiske lira",
      "MTP": "maltesiske pund",
      "MUR": "mauritiske rupier",
      "MVR": "maldiviske rufiyaa",
      "MWK": "malawiske kwacha",
      "MXN": "meksikanske pesos",
      "MXP": "meksikanske sølvpesos (1861-1992)",
      "MXV": "meksikanske unidad de inversion (UDI)",
      "MYR": "malaysiske ringgit",
      "MZE": "mosambikiske escudo",
      "MZM": "gamle mosambikiske metical",
      "MZN": "mosambikiske metical",
      "NAD": "namibiske dollar",
      "NGN": "nigerianske naira",
      "NIC": "nicaraguanske cordoba",
      "NIO": "nicaraguanske cordoba oro",
      "NLG": "nederlandske gylden",
      "NOK": "norske kroner",
      "NPR": "nepalske rupier",
      "NZD": "new zealandske dollar",
      "OMR": "omanske rialer",
      "PAB": "panamanske balboa",
      "PEI": "peruvianske inti",
      "PEN": "peruvianske nye sol",
      "PES": "peruvianske sol",
      "PGK": "papuanske kina",
      "PHP": "filippinske pesos",
      "PKR": "pakistanske rupier",
      "PLN": "polske zloty",
      "PLZ": "polske zloty (1950-1995)",
      "PTE": "portugisiske escudo",
      "PYG": "paraguayanske guarani",
      "QAR": "qatarske rialer",
      "RHD": "rhodesiske dollar",
      "ROL": "gamle rumenske leu",
      "RON": "rumenske leu",
      "RSD": "serbiske dinarer",
      "RUB": "russiske rubler",
      "RUR": "russiske rubler (1991-1998)",
      "RWF": "rwandiske franc",
      "SAR": "saudiarabiske riyaler",
      "SBD": "salomonske dollar",
      "SCR": "seychelliske rupier",
      "SDD": "sudanesiske dinarer",
      "SDP": "sudanesiske pund",
      "SEK": "svenske kroner",
      "SGD": "singaporske dollar",
      "SHP": "sankthelenske pund",
      "SIT": "slovenske tolar",
      "SKK": "slovakiske koruna",
      "SLL": "sierraleonske leone",
      "SOS": "somaliske shilling",
      "SRD": "surinamske dollar",
      "SRG": "surinamske gylden",
      "STD": "Sao Tome og Principe-dobra",
      "SUR": "sovjetiske rubler",
      "SVC": "salvadoranske colon",
      "SYP": "syriske pund",
      "SZL": "swazilandske lilangeni",
      "THB": "thailandske baht",
      "TJR": "tadsjikiske rubler",
      "TJS": "tadsjikiske somoni",
      "TMM": "turkmenske manat",
      "TND": "tunisiske dinarer",
      "TOP": "tonganske paʻanga",
      "TPE": "timoresiske escudo",
      "TRL": "tyrkiske lire",
      "TRY": "ny tyrkisk lire",
      "TTD": "trinidadiske dollar",
      "TWD": "taiwanske nye dollar",
      "TZS": "tanzanianske shilling",
      "UAH": "ukrainske hryvnia",
      "UAK": "ukrainske karbovanetz",
      "UGS": "ugandiske shilling (1966-1987)",
      "UGX": "ugandiske shilling",
      "USD": "amerikanske dollar",
      "USN": "amerikanske dollar (neste dag)",
      "USS": "amerikanske dollar (samme dag)",
      "UYP": "uruguayanske pesos (1975-1993)",
      "UYU": "uruguayanske peso uruguayo",
      "UZS": "usbekiske sum",
      "VEB": "venezuelanske bolivar",
      "VND": "vietnamesiske dong",
      "VUV": "vanuatiske vatu",
      "WST": "vestsamoiske tala",
      "XAF": "CFA franc BEAC",
      "XAG": "sølv",
      "XAU": "gull",
      "XBA": "europeisk sammensatt enhet",
      "XBB": "europeisk monetær enhet",
      "XBC": "europeisk kontoenhet (XBC)",
      "XBD": "europeisk kontoenhet (XBD)",
      "XCD": "østkaribiske dollar",
      "XDR": "spesielle trekkrettigheter",
      "XEU": "europeisk valutaenhet",
      "XFO": "franske gullfranc",
      "XFU": "franske UIC-franc",
      "XOF": "CFA franc BCEAO",
      "XPD": "palladium",
      "XPF": "CFP franc",
      "XPT": "platina",
      "XRE": "RINET-fond",
      "XXX": "ukjent eller ugyldig valuta",
      "YDD": "jemenittiske dinarer",
      "YER": "jemenittiske rialer",
      "YUD": "jugoslaviske dinarer (hard)",
      "YUM": "jugoslaviske noviy-dinarer",
      "YUN": "jugoslaviske konvertible dinarer",
      "ZAL": "sørafrikanske rand (finansielle)",
      "ZAR": "sørafrikanske rand",
      "ZMK": "zambiske kwacha",
      "ZRN": "zairiske nye zaire",
      "ZRZ": "zairiske zaire",
      "ZWD": "zimbabwiske dollar",
    };
  }-*/;
}
