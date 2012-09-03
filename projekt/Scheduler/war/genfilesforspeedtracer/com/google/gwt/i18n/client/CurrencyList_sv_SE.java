package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_sv_SE extends com.google.gwt.i18n.client.CurrencyList_sv {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("SEK", "kr", 2, "kr");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "SEK", "kr", 2, "kr"];
  }-*/;
}
