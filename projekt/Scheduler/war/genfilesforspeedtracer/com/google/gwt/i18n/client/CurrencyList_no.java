package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_no extends com.google.gwt.i18n.client.CurrencyList_nb {
  
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
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0));
    // albanske lek
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0));
    // armenske dram
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 0));
    // nederlandske antillegylden
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2));
    // angolanske kwanza
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2));
    // angolanske kwanza (1977-1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130));
    // angolanske nye kwanza (1990-2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130));
    // angolanske kwanza reajustado (1995-1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130));
    // argentinske australer
    result.put("ARA", new CurrencyDataImpl("ARA", "₳", 130));
    // ARL
    result.put("ARL", new CurrencyDataImpl("ARL", "ARL", 130));
    // ARM
    result.put("ARM", new CurrencyDataImpl("ARM", "ARM", 130));
    // argentinske pesos (1983-1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130));
    // argentinske pesos
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$"));
    // østerrikske shilling
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130));
    // australske dollar
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$"));
    // arubiske gylden
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2));
    // aserbajdsjanske manat (1993-2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130));
    // aserbajdsjanske manat
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2));
    // bosnisk-hercegovinske dinarer
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130));
    // bosnisk-hercegovinske mark (konvertible)
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2));
    // barbadiske dollar
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2));
    // bangladeshiske taka
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk"));
    // belgiske franc (konvertible)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 2));
    // belgiske franc
    result.put("BEF", new CurrencyDataImpl("BEF", "BF", 130));
    // belgiske franc (finansielle)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 2));
    // bulgarske lev (hard)
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130));
    // bulgarske lev
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2));
    // bahrainske dinarer
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3));
    // burundiske franc
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0));
    // bermudiske dollar
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2));
    // bruneiske dollar
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2));
    // boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2));
    // bolivianske pesos
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130));
    // bolivianske mvdol
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 2));
    // brasilianske cruzeiro novo (1967-1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130));
    // brasilianske cruzado
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130));
    // brasilianske cruzeiro (1990-1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130));
    // brasilianske realer
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$"));
    // brasilianske cruzado novo
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130));
    // brasilianske cruzeiro
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130));
    // BRZ
    result.put("BRZ", new CurrencyDataImpl("BRZ", "BRZ", 130));
    // bahamske dollar
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2));
    // bhutanske ngultrum
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2));
    // burmesiske kyat
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130));
    // botswanske pula
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2));
    // hviterussiske nye rubler (1994-1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130));
    // hviterussiske rubler
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 0));
    // beliziske dollar
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2));
    // kanadiske dollar
    result.put("CAD", new CurrencyDataImpl("CAD", "C$", 2, "C$"));
    // kongolesiske franc (congolais)
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2));
    // WIR euro
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 2));
    // sveitsiske franc
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF"));
    // WIR franc
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 2));
    // CLE
    result.put("CLE", new CurrencyDataImpl("CLE", "CLE", 130));
    // chilenske unidades de fomento
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 0));
    // chilenske pesos
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$"));
    // kinesiske yuan renminbi
    result.put("CNY", new CurrencyDataImpl("CNY", "RMB¥", 2, "RMB¥"));
    // colombianske pesos
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 0, "COL$"));
    // unidad de valor real
    result.put("COU", new CurrencyDataImpl("COU", "COU", 2));
    // costaricanske colon
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 0, "CR₡"));
    // gamle serbiske dinarer
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130));
    // tsjekkoslovakiske koruna (hard)
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130));
    // CUC
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2));
    // kubanske pesos
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN"));
    // kappverdiske escudo
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2));
    // kypriotiske pund
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130));
    // tsjekkiske koruna
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč"));
    // østtyske ostmark
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130));
    // tyske mark
    result.put("DEM", new CurrencyDataImpl("DEM", "DM", 130));
    // djiboutiske franc
    result.put("DJF", new CurrencyDataImpl("DJF", "DJF", 0));
    // danske kroner
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr"));
    // dominikanske pesos
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$"));
    // algeriske dinarer
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2));
    // ecuadorianske sucre
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130));
    // ecuadorianske unidad de valor constante (UVC)
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 2));
    // estiske kroon
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 2));
    // egyptiske pund
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE"));
    // EQE
    result.put("EQE", new CurrencyDataImpl("EQE", "EQE", 130));
    // eritreiske nakfa
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2));
    // spanske peseta (A-konto)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 2));
    // spanske peseta (konvertibel konto)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 2));
    // spanske peseta
    result.put("ESP", new CurrencyDataImpl("ESP", "Pts", 128));
    // etiopiske birr
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2));
    // euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€"));
    // finske mark
    result.put("FIM", new CurrencyDataImpl("FIM", "mk", 130));
    // fijianske dollar
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2));
    // Falkland-pund
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2));
    // franske franc
    result.put("FRF", new CurrencyDataImpl("FRF", "₣", 130));
    // britiske pund sterling
    result.put("GBP", new CurrencyDataImpl("GBP", "GB£", 2, "GB£"));
    // georgiske kupon larit
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130));
    // georgiske lari
    result.put("GEL", new CurrencyDataImpl("GEL", "GEL", 2));
    // ghanesisk cedi (1979-2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130));
    // ghanesisk cedi
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2));
    // gibraltarske pund
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2));
    // gambiske dalasi
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2));
    // guineanske franc
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0));
    // guineanske syli
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130));
    // ekvatorialguineanske ekwele guineana
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130));
    // greske drakmer
    result.put("GRD", new CurrencyDataImpl("GRD", "₯", 130));
    // guatemalanske quetzal
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2));
    // portugisiske guinea escudo
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130));
    // Guinea-Bissau-pesos
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 2));
    // guyanske dollar
    result.put("GYD", new CurrencyDataImpl("GYD", "GY$", 0));
    // Hongkong-dollar
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$"));
    // Hoduras Lempira
    result.put("HNL", new CurrencyDataImpl("HNL", "HNL", 2));
    // kroatiske dinarer
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130));
    // kroatiske kuna
    result.put("HRK", new CurrencyDataImpl("HRK", "kn", 2));
    // haitiske gourde
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2));
    // ungarske forinter
    result.put("HUF", new CurrencyDataImpl("HUF", "Ft", 0));
    // indonesiske rupier
    result.put("IDR", new CurrencyDataImpl("IDR", "Rp", 0));
    // irske pund
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130));
    // israelske pund
    result.put("ILP", new CurrencyDataImpl("ILP", "I£", 130));
    // israelsk gammel shekel
    result.put("ILR", new CurrencyDataImpl("ILR", "ILR", 130));
    // israelske nye shekler
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪"));
    // indiske rupier
    result.put("INR", new CurrencyDataImpl("INR", "Rs", 2, "Rs"));
    // irakske dinarer
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0));
    // iranske rialer
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0));
    // gammel islandsk krone
    result.put("ISJ", new CurrencyDataImpl("ISJ", "ISJ", 130));
    // islandske kroner
    result.put("ISK", new CurrencyDataImpl("ISK", "Ikr", 0, "kr"));
    // italienske lire
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128));
    // jamaikanske dollar
    result.put("JMD", new CurrencyDataImpl("JMD", "J$", 2, "JA$"));
    // jordanske dinarer
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3));
    // japanske yen
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥"));
    // kenyanske shilling
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2));
    // kirgisiske som
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2));
    // kambodsjanske riel
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2));
    // komoriske franc
    result.put("KMF", new CurrencyDataImpl("KMF", "CF", 0));
    // nordkoreanske won
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0));
    // sørkoreanske won
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩"));
    // kuwaitiske dinarer
    result.put("KWD", new CurrencyDataImpl("KWD", "KD", 3));
    // caymanske dollar
    result.put("KYD", new CurrencyDataImpl("KYD", "KY$", 2));
    // kasakhstanske tenge
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2));
    // laotiske kip
    result.put("LAK", new CurrencyDataImpl("LAK", "₭", 0));
    // libanesiske pund
    result.put("LBP", new CurrencyDataImpl("LBP", "LB£", 0));
    // srilankiske rupier
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs"));
    // liberiske dollar
    result.put("LRD", new CurrencyDataImpl("LRD", "L$", 2));
    // lesothiske loti
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2));
    // LSM
    result.put("LSM", new CurrencyDataImpl("LSM", "LSM", 130));
    // litauiske lita
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 2));
    // litauiske talonas
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130));
    // luxemburgske konvertible franc
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 2));
    // luxemburgske franc
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128));
    // luxemburgske finansielle franc
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 2));
    // latviske lats
    result.put("LVL", new CurrencyDataImpl("LVL", "Ls", 2));
    // latviske rubler
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130));
    // libyske dinarer
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3));
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
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2));
    // maliske franc
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130));
    // myanmarske kyat
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0));
    // mongolske tugrik
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 0, "MN₮"));
    // makaoske pataca
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP$", 2));
    // mauritanske ouguiya
    result.put("MRO", new CurrencyDataImpl("MRO", "UM", 0));
    // maltesiske lira
    result.put("MTL", new CurrencyDataImpl("MTL", "Lm", 130));
    // maltesiske pund
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130));
    // mauritiske rupier
    result.put("MUR", new CurrencyDataImpl("MUR", "MURs", 0));
    // maldiviske rufiyaa
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2));
    // malawiske kwacha
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2));
    // meksikanske pesos
    result.put("MXN", new CurrencyDataImpl("MXN", "Mex$", 2, "Mex$"));
    // meksikanske sølvpesos (1861-1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130));
    // meksikanske unidad de inversion (UDI)
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 2));
    // malaysiske ringgit
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM"));
    // mosambikiske escudo
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130));
    // gamle mosambikiske metical
    result.put("MZM", new CurrencyDataImpl("MZM", "Mt", 130));
    // mosambikiske metical
    result.put("MZN", new CurrencyDataImpl("MZN", "MTn", 2));
    // namibiske dollar
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2));
    // nigerianske naira
    result.put("NGN", new CurrencyDataImpl("NGN", "₦", 2));
    // nicaraguanske cordoba
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130));
    // nicaraguanske cordoba oro
    result.put("NIO", new CurrencyDataImpl("NIO", "C$", 2));
    // nederlandske gylden
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130));
    // norske kroner
    result.put("NOK", new CurrencyDataImpl("NOK", "kr", 2, "NOkr"));
    // nepalske rupier
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2));
    // new zealandske dollar
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2));
    // omanske rialer
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3));
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
    result.put("PHP", new CurrencyDataImpl("PHP", "₱", 2, "PHP"));
    // pakistanske rupier
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 0, "PKRs."));
    // polske zloty
    result.put("PLN", new CurrencyDataImpl("PLN", "zł", 2));
    // polske zloty (1950-1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130));
    // portugisiske escudo
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130));
    // paraguayanske guarani
    result.put("PYG", new CurrencyDataImpl("PYG", "₲", 0));
    // qatarske rialer
    result.put("QAR", new CurrencyDataImpl("QAR", "QR", 2));
    // rhodesiske dollar
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130));
    // gamle rumenske leu
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130));
    // rumenske leu
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2));
    // serbiske dinarer
    result.put("RSD", new CurrencyDataImpl("RSD", "din.", 0));
    // russiske rubler
    result.put("RUB", new CurrencyDataImpl("RUB", "руб", 2, "руб"));
    // russiske rubler (1991-1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130));
    // rwandiske franc
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0));
    // saudiarabiske riyaler
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR"));
    // salomonske dollar
    result.put("SBD", new CurrencyDataImpl("SBD", "SI$", 2));
    // seychelliske rupier
    result.put("SCR", new CurrencyDataImpl("SCR", "SRe", 2));
    // sudanesiske dinarer
    result.put("SDD", new CurrencyDataImpl("SDD", "LSd", 130));
    // sudanske pund
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2));
    // sudanesiske pund
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130));
    // svenske kroner
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr"));
    // singaporske dollar
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$"));
    // sankthelenske pund
    result.put("SHP", new CurrencyDataImpl("SHP", "SH£", 2));
    // slovenske tolar
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130));
    // slovakiske koruna
    result.put("SKK", new CurrencyDataImpl("SKK", "Sk", 130));
    // sierraleonske leone
    result.put("SLL", new CurrencyDataImpl("SLL", "Le", 0));
    // somaliske shilling
    result.put("SOS", new CurrencyDataImpl("SOS", "Ssh", 0));
    // surinamske dollar
    result.put("SRD", new CurrencyDataImpl("SRD", "SR$", 2));
    // surinamske gylden
    result.put("SRG", new CurrencyDataImpl("SRG", "Sf", 130));
    // Sao Tome og Principe-dobra
    result.put("STD", new CurrencyDataImpl("STD", "Db", 0));
    // sovjetiske rubler
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130));
    // salvadoranske colon
    result.put("SVC", new CurrencyDataImpl("SVC", "SV₡", 130));
    // syriske pund
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0));
    // swazilandske lilangeni
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2));
    // thailandske baht
    result.put("THB", new CurrencyDataImpl("THB", "THB", 2, "THB"));
    // tadsjikiske rubler
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130));
    // tadsjikiske somoni
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2));
    // turkmenske manat
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128));
    // tunisiske dinarer
    result.put("TND", new CurrencyDataImpl("TND", "DT", 3));
    // tonganske paʻanga
    result.put("TOP", new CurrencyDataImpl("TOP", "T$", 2));
    // timoresiske escudo
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130));
    // tyrkiske lire
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128));
    // ny tyrkisk lire
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL"));
    // trinidadiske dollar
    result.put("TTD", new CurrencyDataImpl("TTD", "TT$", 2));
    // taiwanske nye dollar
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$"));
    // tanzanianske shilling
    result.put("TZS", new CurrencyDataImpl("TZS", "TSh", 0));
    // ukrainske hryvnia
    result.put("UAH", new CurrencyDataImpl("UAH", "₴", 2));
    // ukrainske karbovanetz
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130));
    // ugandiske shilling (1966-1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130));
    // ugandiske shilling
    result.put("UGX", new CurrencyDataImpl("UGX", "USh", 0));
    // amerikanske dollar
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$"));
    // amerikanske dollar (neste dag)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 2));
    // amerikanske dollar (samme dag)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 2));
    // Uruguayan Peso en Unidades Indexadas
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 2));
    // uruguayanske pesos (1975-1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130));
    // uruguayanske peso uruguayo
    result.put("UYU", new CurrencyDataImpl("UYU", "$U", 2, "UY$"));
    // usbekiske sum
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 0));
    // venezuelanske bolivar
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130));
    // venezuelanske bolivar fuerte
    result.put("VEF", new CurrencyDataImpl("VEF", "Bs.F.", 2));
    // vietnamesiske dong
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫"));
    // vanuatiske vatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VT", 0));
    // vestsamoiske tala
    result.put("WST", new CurrencyDataImpl("WST", "WS$", 2));
    // CFA franc BEAC
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0));
    // sølv
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 2));
    // gull
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 2));
    // europeisk sammensatt enhet
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 2));
    // europeisk monetær enhet
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 2));
    // europeisk kontoenhet (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 2));
    // europeisk kontoenhet (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 2));
    // østkaribiske dollar
    result.put("XCD", new CurrencyDataImpl("XCD", "XCD", 2));
    // spesielle trekkrettigheter
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 2));
    // europeisk valutaenhet
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 2));
    // franske gullfranc
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 2));
    // franske UIC-franc
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
    // ukjent eller ugyldig valuta
    result.put("XXX", new CurrencyDataImpl("XXX", "XXX", 2));
    // jemenittiske dinarer
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130));
    // jemenittiske rialer
    result.put("YER", new CurrencyDataImpl("YER", "YR", 0, "YER"));
    // jugoslaviske dinarer (hard)
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130));
    // jugoslaviske noviy-dinarer
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130));
    // jugoslaviske konvertible dinarer
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130));
    // sørafrikanske rand (finansielle)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 2));
    // sørafrikanske rand
    result.put("ZAR", new CurrencyDataImpl("ZAR", "R", 2, "ZAR"));
    // zambiske kwacha
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZK", 0));
    // zairiske nye zaire
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130));
    // zairiske zaire
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130));
    // zimbabwiske dollar
    result.put("ZWD", new CurrencyDataImpl("ZWD", "Z$", 128));
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
      "AFN": [ "AFN", "AFN", 0],
      // albanske lek
      "ALL": [ "ALL", "ALL", 0],
      // armenske dram
      "AMD": [ "AMD", "AMD", 0],
      // nederlandske antillegylden
      "ANG": [ "ANG", "ANG", 2],
      // angolanske kwanza
      "AOA": [ "AOA", "AOA", 2],
      // angolanske kwanza (1977-1990)
      "AOK": [ "AOK", "AOK", 130],
      // angolanske nye kwanza (1990-2000)
      "AON": [ "AON", "AON", 130],
      // angolanske kwanza reajustado (1995-1999)
      "AOR": [ "AOR", "AOR", 130],
      // argentinske australer
      "ARA": [ "ARA", "₳", 130],
      // ARL
      "ARL": [ "ARL", "ARL", 130],
      // ARM
      "ARM": [ "ARM", "ARM", 130],
      // argentinske pesos (1983-1985)
      "ARP": [ "ARP", "ARP", 130],
      // argentinske pesos
      "ARS": [ "ARS", "AR$", 2, "AR$"],
      // østerrikske shilling
      "ATS": [ "ATS", "ATS", 130],
      // australske dollar
      "AUD": [ "AUD", "AU$", 2, "AU$"],
      // arubiske gylden
      "AWG": [ "AWG", "AWG", 2],
      // aserbajdsjanske manat (1993-2006)
      "AZM": [ "AZM", "AZM", 130],
      // aserbajdsjanske manat
      "AZN": [ "AZN", "AZN", 2],
      // bosnisk-hercegovinske dinarer
      "BAD": [ "BAD", "BAD", 130],
      // bosnisk-hercegovinske mark (konvertible)
      "BAM": [ "BAM", "BAM", 2],
      // barbadiske dollar
      "BBD": [ "BBD", "BBD", 2],
      // bangladeshiske taka
      "BDT": [ "BDT", "Tk", 2, "Tk"],
      // belgiske franc (konvertible)
      "BEC": [ "BEC", "BEC", 2],
      // belgiske franc
      "BEF": [ "BEF", "BF", 130],
      // belgiske franc (finansielle)
      "BEL": [ "BEL", "BEL", 2],
      // bulgarske lev (hard)
      "BGL": [ "BGL", "BGL", 130],
      // bulgarske lev
      "BGN": [ "BGN", "BGN", 2],
      // bahrainske dinarer
      "BHD": [ "BHD", "BHD", 3],
      // burundiske franc
      "BIF": [ "BIF", "BIF", 0],
      // bermudiske dollar
      "BMD": [ "BMD", "BMD", 2],
      // bruneiske dollar
      "BND": [ "BND", "BND", 2],
      // boliviano
      "BOB": [ "BOB", "BOB", 2],
      // bolivianske pesos
      "BOP": [ "BOP", "BOP", 130],
      // bolivianske mvdol
      "BOV": [ "BOV", "BOV", 2],
      // brasilianske cruzeiro novo (1967-1986)
      "BRB": [ "BRB", "BRB", 130],
      // brasilianske cruzado
      "BRC": [ "BRC", "BRC", 130],
      // brasilianske cruzeiro (1990-1993)
      "BRE": [ "BRE", "BRE", 130],
      // brasilianske realer
      "BRL": [ "BRL", "R$", 2, "R$"],
      // brasilianske cruzado novo
      "BRN": [ "BRN", "BRN", 130],
      // brasilianske cruzeiro
      "BRR": [ "BRR", "BRR", 130],
      // BRZ
      "BRZ": [ "BRZ", "BRZ", 130],
      // bahamske dollar
      "BSD": [ "BSD", "BSD", 2],
      // bhutanske ngultrum
      "BTN": [ "BTN", "BTN", 2],
      // burmesiske kyat
      "BUK": [ "BUK", "BUK", 130],
      // botswanske pula
      "BWP": [ "BWP", "BWP", 2],
      // hviterussiske nye rubler (1994-1999)
      "BYB": [ "BYB", "BYB", 130],
      // hviterussiske rubler
      "BYR": [ "BYR", "BYR", 0],
      // beliziske dollar
      "BZD": [ "BZD", "BZD", 2],
      // kanadiske dollar
      "CAD": [ "CAD", "C$", 2, "C$"],
      // kongolesiske franc (congolais)
      "CDF": [ "CDF", "CDF", 2],
      // WIR euro
      "CHE": [ "CHE", "CHE", 2],
      // sveitsiske franc
      "CHF": [ "CHF", "CHF", 2, "CHF"],
      // WIR franc
      "CHW": [ "CHW", "CHW", 2],
      // CLE
      "CLE": [ "CLE", "CLE", 130],
      // chilenske unidades de fomento
      "CLF": [ "CLF", "CLF", 0],
      // chilenske pesos
      "CLP": [ "CLP", "CL$", 0, "CL$"],
      // kinesiske yuan renminbi
      "CNY": [ "CNY", "RMB¥", 2, "RMB¥"],
      // colombianske pesos
      "COP": [ "COP", "COL$", 0, "COL$"],
      // unidad de valor real
      "COU": [ "COU", "COU", 2],
      // costaricanske colon
      "CRC": [ "CRC", "CR₡", 0, "CR₡"],
      // gamle serbiske dinarer
      "CSD": [ "CSD", "CSD", 130],
      // tsjekkoslovakiske koruna (hard)
      "CSK": [ "CSK", "CSK", 130],
      // CUC
      "CUC": [ "CUC", "CUC", 2],
      // kubanske pesos
      "CUP": [ "CUP", "$MN", 2, "$MN"],
      // kappverdiske escudo
      "CVE": [ "CVE", "CVE", 2],
      // kypriotiske pund
      "CYP": [ "CYP", "CYP", 130],
      // tsjekkiske koruna
      "CZK": [ "CZK", "Kč", 2, "Kč"],
      // østtyske ostmark
      "DDM": [ "DDM", "DDM", 130],
      // tyske mark
      "DEM": [ "DEM", "DM", 130],
      // djiboutiske franc
      "DJF": [ "DJF", "DJF", 0],
      // danske kroner
      "DKK": [ "DKK", "kr", 2, "kr"],
      // dominikanske pesos
      "DOP": [ "DOP", "RD$", 2, "RD$"],
      // algeriske dinarer
      "DZD": [ "DZD", "DZD", 2],
      // ecuadorianske sucre
      "ECS": [ "ECS", "ECS", 130],
      // ecuadorianske unidad de valor constante (UVC)
      "ECV": [ "ECV", "ECV", 2],
      // estiske kroon
      "EEK": [ "EEK", "EEK", 2],
      // egyptiske pund
      "EGP": [ "EGP", "LE", 2, "LE"],
      // EQE
      "EQE": [ "EQE", "EQE", 130],
      // eritreiske nakfa
      "ERN": [ "ERN", "ERN", 2],
      // spanske peseta (A-konto)
      "ESA": [ "ESA", "ESA", 2],
      // spanske peseta (konvertibel konto)
      "ESB": [ "ESB", "ESB", 2],
      // spanske peseta
      "ESP": [ "ESP", "Pts", 128],
      // etiopiske birr
      "ETB": [ "ETB", "ETB", 2],
      // euro
      "EUR": [ "EUR", "€", 2, "€"],
      // finske mark
      "FIM": [ "FIM", "mk", 130],
      // fijianske dollar
      "FJD": [ "FJD", "FJD", 2],
      // Falkland-pund
      "FKP": [ "FKP", "FKP", 2],
      // franske franc
      "FRF": [ "FRF", "₣", 130],
      // britiske pund sterling
      "GBP": [ "GBP", "GB£", 2, "GB£"],
      // georgiske kupon larit
      "GEK": [ "GEK", "GEK", 130],
      // georgiske lari
      "GEL": [ "GEL", "GEL", 2],
      // ghanesisk cedi (1979-2007)
      "GHC": [ "GHC", "GHC", 130],
      // ghanesisk cedi
      "GHS": [ "GHS", "GHS", 2],
      // gibraltarske pund
      "GIP": [ "GIP", "GIP", 2],
      // gambiske dalasi
      "GMD": [ "GMD", "GMD", 2],
      // guineanske franc
      "GNF": [ "GNF", "GNF", 0],
      // guineanske syli
      "GNS": [ "GNS", "GNS", 130],
      // ekvatorialguineanske ekwele guineana
      "GQE": [ "GQE", "GQE", 130],
      // greske drakmer
      "GRD": [ "GRD", "₯", 130],
      // guatemalanske quetzal
      "GTQ": [ "GTQ", "GTQ", 2],
      // portugisiske guinea escudo
      "GWE": [ "GWE", "GWE", 130],
      // Guinea-Bissau-pesos
      "GWP": [ "GWP", "GWP", 2],
      // guyanske dollar
      "GYD": [ "GYD", "GY$", 0],
      // Hongkong-dollar
      "HKD": [ "HKD", "HK$", 2, "HK$"],
      // Hoduras Lempira
      "HNL": [ "HNL", "HNL", 2],
      // kroatiske dinarer
      "HRD": [ "HRD", "HRD", 130],
      // kroatiske kuna
      "HRK": [ "HRK", "kn", 2],
      // haitiske gourde
      "HTG": [ "HTG", "HTG", 2],
      // ungarske forinter
      "HUF": [ "HUF", "Ft", 0],
      // indonesiske rupier
      "IDR": [ "IDR", "Rp", 0],
      // irske pund
      "IEP": [ "IEP", "IEP", 130],
      // israelske pund
      "ILP": [ "ILP", "I£", 130],
      // israelsk gammel shekel
      "ILR": [ "ILR", "ILR", 130],
      // israelske nye shekler
      "ILS": [ "ILS", "₪", 2, "IL₪"],
      // indiske rupier
      "INR": [ "INR", "Rs", 2, "Rs"],
      // irakske dinarer
      "IQD": [ "IQD", "IQD", 0],
      // iranske rialer
      "IRR": [ "IRR", "IRR", 0],
      // gammel islandsk krone
      "ISJ": [ "ISJ", "ISJ", 130],
      // islandske kroner
      "ISK": [ "ISK", "Ikr", 0, "kr"],
      // italienske lire
      "ITL": [ "ITL", "ITL", 128],
      // jamaikanske dollar
      "JMD": [ "JMD", "J$", 2, "JA$"],
      // jordanske dinarer
      "JOD": [ "JOD", "JOD", 3],
      // japanske yen
      "JPY": [ "JPY", "JP¥", 0, "JP¥"],
      // kenyanske shilling
      "KES": [ "KES", "Ksh", 2],
      // kirgisiske som
      "KGS": [ "KGS", "KGS", 2],
      // kambodsjanske riel
      "KHR": [ "KHR", "KHR", 2],
      // komoriske franc
      "KMF": [ "KMF", "CF", 0],
      // nordkoreanske won
      "KPW": [ "KPW", "KPW", 0],
      // sørkoreanske won
      "KRW": [ "KRW", "₩", 0, "KR₩"],
      // kuwaitiske dinarer
      "KWD": [ "KWD", "KD", 3],
      // caymanske dollar
      "KYD": [ "KYD", "KY$", 2],
      // kasakhstanske tenge
      "KZT": [ "KZT", "KZT", 2],
      // laotiske kip
      "LAK": [ "LAK", "₭", 0],
      // libanesiske pund
      "LBP": [ "LBP", "LB£", 0],
      // srilankiske rupier
      "LKR": [ "LKR", "SLRs", 2, "SLRs"],
      // liberiske dollar
      "LRD": [ "LRD", "L$", 2],
      // lesothiske loti
      "LSL": [ "LSL", "LSL", 2],
      // LSM
      "LSM": [ "LSM", "LSM", 130],
      // litauiske lita
      "LTL": [ "LTL", "LTL", 2],
      // litauiske talonas
      "LTT": [ "LTT", "LTT", 130],
      // luxemburgske konvertible franc
      "LUC": [ "LUC", "LUC", 2],
      // luxemburgske franc
      "LUF": [ "LUF", "LUF", 128],
      // luxemburgske finansielle franc
      "LUL": [ "LUL", "LUL", 2],
      // latviske lats
      "LVL": [ "LVL", "Ls", 2],
      // latviske rubler
      "LVR": [ "LVR", "LVR", 130],
      // libyske dinarer
      "LYD": [ "LYD", "LYD", 3],
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
      "MKD": [ "MKD", "MKD", 2],
      // maliske franc
      "MLF": [ "MLF", "MLF", 130],
      // myanmarske kyat
      "MMK": [ "MMK", "MMK", 0],
      // mongolske tugrik
      "MNT": [ "MNT", "MN₮", 0, "MN₮"],
      // makaoske pataca
      "MOP": [ "MOP", "MOP$", 2],
      // mauritanske ouguiya
      "MRO": [ "MRO", "UM", 0],
      // maltesiske lira
      "MTL": [ "MTL", "Lm", 130],
      // maltesiske pund
      "MTP": [ "MTP", "MTP", 130],
      // mauritiske rupier
      "MUR": [ "MUR", "MURs", 0],
      // maldiviske rufiyaa
      "MVR": [ "MVR", "MVR", 2],
      // malawiske kwacha
      "MWK": [ "MWK", "MWK", 2],
      // meksikanske pesos
      "MXN": [ "MXN", "Mex$", 2, "Mex$"],
      // meksikanske sølvpesos (1861-1992)
      "MXP": [ "MXP", "MXP", 130],
      // meksikanske unidad de inversion (UDI)
      "MXV": [ "MXV", "MXV", 2],
      // malaysiske ringgit
      "MYR": [ "MYR", "RM", 2, "RM"],
      // mosambikiske escudo
      "MZE": [ "MZE", "MZE", 130],
      // gamle mosambikiske metical
      "MZM": [ "MZM", "Mt", 130],
      // mosambikiske metical
      "MZN": [ "MZN", "MTn", 2],
      // namibiske dollar
      "NAD": [ "NAD", "NAD", 2],
      // nigerianske naira
      "NGN": [ "NGN", "₦", 2],
      // nicaraguanske cordoba
      "NIC": [ "NIC", "NIC", 130],
      // nicaraguanske cordoba oro
      "NIO": [ "NIO", "C$", 2],
      // nederlandske gylden
      "NLG": [ "NLG", "NLG", 130],
      // norske kroner
      "NOK": [ "NOK", "kr", 2, "NOkr"],
      // nepalske rupier
      "NPR": [ "NPR", "NPR", 2],
      // new zealandske dollar
      "NZD": [ "NZD", "NZ$", 2],
      // omanske rialer
      "OMR": [ "OMR", "OMR", 3],
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
      "PHP": [ "PHP", "₱", 2, "PHP"],
      // pakistanske rupier
      "PKR": [ "PKR", "PKRs.", 0, "PKRs."],
      // polske zloty
      "PLN": [ "PLN", "zł", 2],
      // polske zloty (1950-1995)
      "PLZ": [ "PLZ", "PLZ", 130],
      // portugisiske escudo
      "PTE": [ "PTE", "PTE", 130],
      // paraguayanske guarani
      "PYG": [ "PYG", "₲", 0],
      // qatarske rialer
      "QAR": [ "QAR", "QR", 2],
      // rhodesiske dollar
      "RHD": [ "RHD", "RHD", 130],
      // gamle rumenske leu
      "ROL": [ "ROL", "ROL", 130],
      // rumenske leu
      "RON": [ "RON", "RON", 2],
      // serbiske dinarer
      "RSD": [ "RSD", "din.", 0],
      // russiske rubler
      "RUB": [ "RUB", "руб", 2, "руб"],
      // russiske rubler (1991-1998)
      "RUR": [ "RUR", "RUR", 130],
      // rwandiske franc
      "RWF": [ "RWF", "RWF", 0],
      // saudiarabiske riyaler
      "SAR": [ "SAR", "SR", 2, "SR"],
      // salomonske dollar
      "SBD": [ "SBD", "SI$", 2],
      // seychelliske rupier
      "SCR": [ "SCR", "SRe", 2],
      // sudanesiske dinarer
      "SDD": [ "SDD", "LSd", 130],
      // sudanske pund
      "SDG": [ "SDG", "SDG", 2],
      // sudanesiske pund
      "SDP": [ "SDP", "SDP", 130],
      // svenske kroner
      "SEK": [ "SEK", "kr", 2, "kr"],
      // singaporske dollar
      "SGD": [ "SGD", "S$", 2, "S$"],
      // sankthelenske pund
      "SHP": [ "SHP", "SH£", 2],
      // slovenske tolar
      "SIT": [ "SIT", "SIT", 130],
      // slovakiske koruna
      "SKK": [ "SKK", "Sk", 130],
      // sierraleonske leone
      "SLL": [ "SLL", "Le", 0],
      // somaliske shilling
      "SOS": [ "SOS", "Ssh", 0],
      // surinamske dollar
      "SRD": [ "SRD", "SR$", 2],
      // surinamske gylden
      "SRG": [ "SRG", "Sf", 130],
      // Sao Tome og Principe-dobra
      "STD": [ "STD", "Db", 0],
      // sovjetiske rubler
      "SUR": [ "SUR", "SUR", 130],
      // salvadoranske colon
      "SVC": [ "SVC", "SV₡", 130],
      // syriske pund
      "SYP": [ "SYP", "SYP", 0],
      // swazilandske lilangeni
      "SZL": [ "SZL", "SZL", 2],
      // thailandske baht
      "THB": [ "THB", "THB", 2, "THB"],
      // tadsjikiske rubler
      "TJR": [ "TJR", "TJR", 130],
      // tadsjikiske somoni
      "TJS": [ "TJS", "TJS", 2],
      // turkmenske manat
      "TMM": [ "TMM", "TMM", 128],
      // tunisiske dinarer
      "TND": [ "TND", "DT", 3],
      // tonganske paʻanga
      "TOP": [ "TOP", "T$", 2],
      // timoresiske escudo
      "TPE": [ "TPE", "TPE", 130],
      // tyrkiske lire
      "TRL": [ "TRL", "TRL", 128],
      // ny tyrkisk lire
      "TRY": [ "TRY", "TL", 2, "YTL"],
      // trinidadiske dollar
      "TTD": [ "TTD", "TT$", 2],
      // taiwanske nye dollar
      "TWD": [ "TWD", "NT$", 2, "NT$"],
      // tanzanianske shilling
      "TZS": [ "TZS", "TSh", 0],
      // ukrainske hryvnia
      "UAH": [ "UAH", "₴", 2],
      // ukrainske karbovanetz
      "UAK": [ "UAK", "UAK", 130],
      // ugandiske shilling (1966-1987)
      "UGS": [ "UGS", "UGS", 130],
      // ugandiske shilling
      "UGX": [ "UGX", "USh", 0],
      // amerikanske dollar
      "USD": [ "USD", "US$", 2, "US$"],
      // amerikanske dollar (neste dag)
      "USN": [ "USN", "USN", 2],
      // amerikanske dollar (samme dag)
      "USS": [ "USS", "USS", 2],
      // Uruguayan Peso en Unidades Indexadas
      "UYI": [ "UYI", "UYI", 2],
      // uruguayanske pesos (1975-1993)
      "UYP": [ "UYP", "UYP", 130],
      // uruguayanske peso uruguayo
      "UYU": [ "UYU", "$U", 2, "UY$"],
      // usbekiske sum
      "UZS": [ "UZS", "UZS", 0],
      // venezuelanske bolivar
      "VEB": [ "VEB", "VEB", 130],
      // venezuelanske bolivar fuerte
      "VEF": [ "VEF", "Bs.F.", 2],
      // vietnamesiske dong
      "VND": [ "VND", "₫", 24, "₫"],
      // vanuatiske vatu
      "VUV": [ "VUV", "VT", 0],
      // vestsamoiske tala
      "WST": [ "WST", "WS$", 2],
      // CFA franc BEAC
      "XAF": [ "XAF", "FCFA", 0],
      // sølv
      "XAG": [ "XAG", "XAG", 2],
      // gull
      "XAU": [ "XAU", "XAU", 2],
      // europeisk sammensatt enhet
      "XBA": [ "XBA", "XBA", 2],
      // europeisk monetær enhet
      "XBB": [ "XBB", "XBB", 2],
      // europeisk kontoenhet (XBC)
      "XBC": [ "XBC", "XBC", 2],
      // europeisk kontoenhet (XBD)
      "XBD": [ "XBD", "XBD", 2],
      // østkaribiske dollar
      "XCD": [ "XCD", "XCD", 2],
      // spesielle trekkrettigheter
      "XDR": [ "XDR", "XDR", 2],
      // europeisk valutaenhet
      "XEU": [ "XEU", "XEU", 2],
      // franske gullfranc
      "XFO": [ "XFO", "XFO", 2],
      // franske UIC-franc
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
      // ukjent eller ugyldig valuta
      "XXX": [ "XXX", "XXX", 2],
      // jemenittiske dinarer
      "YDD": [ "YDD", "YDD", 130],
      // jemenittiske rialer
      "YER": [ "YER", "YR", 0, "YER"],
      // jugoslaviske dinarer (hard)
      "YUD": [ "YUD", "YUD", 130],
      // jugoslaviske noviy-dinarer
      "YUM": [ "YUM", "YUM", 130],
      // jugoslaviske konvertible dinarer
      "YUN": [ "YUN", "YUN", 130],
      // sørafrikanske rand (finansielle)
      "ZAL": [ "ZAL", "ZAL", 2],
      // sørafrikanske rand
      "ZAR": [ "ZAR", "R", 2, "ZAR"],
      // zambiske kwacha
      "ZMK": [ "ZMK", "ZK", 0],
      // zairiske nye zaire
      "ZRN": [ "ZRN", "ZRN", 130],
      // zairiske zaire
      "ZRZ": [ "ZRZ", "ZRZ", 130],
      // zimbabwiske dollar
      "ZWD": [ "ZWD", "Z$", 128],
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
    result.put("AZN", "aserbajdsjanske manat");
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
    result.put("GHC", "ghanesisk cedi (1979-2007)");
    result.put("GHS", "ghanesisk cedi");
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
    result.put("ILR", "israelsk gammel shekel");
    result.put("ILS", "israelske nye shekler");
    result.put("INR", "indiske rupier");
    result.put("IQD", "irakske dinarer");
    result.put("IRR", "iranske rialer");
    result.put("ISJ", "gammel islandsk krone");
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
    result.put("SDG", "sudanske pund");
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
    result.put("UYI", "Uruguayan Peso en Unidades Indexadas");
    result.put("UYP", "uruguayanske pesos (1975-1993)");
    result.put("UYU", "uruguayanske peso uruguayo");
    result.put("UZS", "usbekiske sum");
    result.put("VEB", "venezuelanske bolivar");
    result.put("VEF", "venezuelanske bolivar fuerte");
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
    result.put("XTS", "testvalutakode");
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
      "AZN": "aserbajdsjanske manat",
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
      "GHC": "ghanesisk cedi (1979-2007)",
      "GHS": "ghanesisk cedi",
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
      "ILR": "israelsk gammel shekel",
      "ILS": "israelske nye shekler",
      "INR": "indiske rupier",
      "IQD": "irakske dinarer",
      "IRR": "iranske rialer",
      "ISJ": "gammel islandsk krone",
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
      "SDG": "sudanske pund",
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
      "UYI": "Uruguayan Peso en Unidades Indexadas",
      "UYP": "uruguayanske pesos (1975-1993)",
      "UYU": "uruguayanske peso uruguayo",
      "UZS": "usbekiske sum",
      "VEB": "venezuelanske bolivar",
      "VEF": "venezuelanske bolivar fuerte",
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
      "XTS": "testvalutakode",
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
