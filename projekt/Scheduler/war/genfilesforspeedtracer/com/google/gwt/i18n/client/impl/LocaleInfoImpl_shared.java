package com.google.gwt.i18n.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class LocaleInfoImpl_shared extends com.google.gwt.i18n.client.impl.LocaleInfoImpl {
  private static native String getLocaleNativeDisplayName(
      JavaScriptObject nativeDisplayNamesNative,String localeName) /*-{
    return nativeDisplayNamesNative[localeName];
  }-*/;
  
  HashMap<String,String> nativeDisplayNamesJava;
  private JavaScriptObject nativeDisplayNamesNative;
  
  @Override
  public String[] getAvailableLocaleNames() {
    return new String[] {
      "default",
      "es",
      "es_MX",
      "fr",
      "it",
      "nn_NO",
      "no",
      "pl_PL",
      "sv",
      "sv_SE",
    };
  }
  
  @Override
  public String getLocaleNativeDisplayName(String localeName) {
    if (GWT.isScript()) {
      if (nativeDisplayNamesNative == null) {
        nativeDisplayNamesNative = loadNativeDisplayNamesNative();
      }
      return getLocaleNativeDisplayName(nativeDisplayNamesNative, localeName);
    } else {
      if (nativeDisplayNamesJava == null) {
        nativeDisplayNamesJava = new HashMap<String, String>();
        nativeDisplayNamesJava.put("es", "español");
        nativeDisplayNamesJava.put("es_MX", "español - México");
        nativeDisplayNamesJava.put("fr", "français");
        nativeDisplayNamesJava.put("it", "italiano");
        nativeDisplayNamesJava.put("nn_NO", "nynorsk - Noreg");
        nativeDisplayNamesJava.put("no", "norsk bokmål");
        nativeDisplayNamesJava.put("pl_PL", "polski - Polska");
        nativeDisplayNamesJava.put("sv", "svenska");
        nativeDisplayNamesJava.put("sv_SE", "svenska - Sverige");
      }
      return nativeDisplayNamesJava.get(localeName);
    }
  }
  
  @Override
  public boolean hasAnyRTL() {
    return false;
  }
  
  private native JavaScriptObject loadNativeDisplayNamesNative() /*-{
    return {
      "es": "español",
      "es_MX": "español - México",
      "fr": "français",
      "it": "italiano",
      "nn_NO": "nynorsk - Noreg",
      "no": "norsk bokmål",
      "pl_PL": "polski - Polska",
      "sv": "svenska",
      "sv_SE": "svenska - Sverige"
    };
  }-*/;
}
