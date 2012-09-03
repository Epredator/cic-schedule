package com.google.gwt.cell.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ButtonCellBase_DefaultAppearance_Resources_default_InlineClientBundleGenerator implements com.google.gwt.cell.client.ButtonCellBase.DefaultAppearance.Resources {
  private static ButtonCellBase_DefaultAppearance_Resources_default_InlineClientBundleGenerator _instance0 = new ButtonCellBase_DefaultAppearance_Resources_default_InlineClientBundleGenerator();
  private void buttonCellBaseBackgroundInitializer() {
    buttonCellBaseBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "buttonCellBaseBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?externalImage_rtl : externalImage),
      0, 0, 32, 31, false, false
    );
  }
  private static class buttonCellBaseBackgroundInitializer {
    static {
      _instance0.buttonCellBaseBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return buttonCellBaseBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource buttonCellBaseBackground() {
    return buttonCellBaseBackgroundInitializer.get();
  }
  private void buttonCellBaseStyleInitializer() {
    buttonCellBaseStyle = new com.google.gwt.cell.client.ButtonCellBase.DefaultAppearance.Style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "buttonCellBaseStyle";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GK40RFKDL{height:" + ((ButtonCellBase_DefaultAppearance_Resources_default_InlineClientBundleGenerator.this.buttonCellBaseBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ButtonCellBase_DefaultAppearance_Resources_default_InlineClientBundleGenerator.this.buttonCellBaseBackground()).getSafeUri().asString() + "\") -" + (ButtonCellBase_DefaultAppearance_Resources_default_InlineClientBundleGenerator.this.buttonCellBaseBackground()).getLeft() + "px -" + (ButtonCellBase_DefaultAppearance_Resources_default_InlineClientBundleGenerator.this.buttonCellBaseBackground()).getTop() + "px  repeat-x")  + ";height:" + ("auto")  + ";background-color:" + ("#f1f1f1")  + ";margin:" + ("0")  + ";padding:" + ("5px"+ " " +"7px")  + ";text-decoration:" + ("none")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";font-size:") + (("small")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#a0a0a0")  + ";border-radius:" + ("5px")  + ";-moz-border-radius:" + ("5px")  + ";}.GK40RFKDAB{background:" + ("#666")  + ";color:" + ("white")  + ";}.GK40RFKDP{background:" + ("#940000")  + ";color:" + ("white")  + ";}.GK40RFKDL:hover{border-color:" + ("#939393")  + ";}.GK40RFKDL[disabled]{cursor:" + ("default") ) + (";color:" + ("#888")  + ";}.GK40RFKDL[disabled]:hover{border-color:" + ("#bbb"+ " " +"#bbb"+ " " +"#a0a0a0")  + ";}.GK40RFKDBB{border:" + ("1px"+ " " +"inset"+ " " +"#ccc")  + ";}.GK40RFKDM{border-top-right-radius:" + ("0")  + ";border-bottom-right-radius:" + ("0")  + ";-moz-border-radius-topleft:" + ("0")  + ";-moz-border-radius-bottomleft:" + ("0")  + ";}.GK40RFKDN{border-left:" + ("none")  + ";border-top-left-radius:" + ("0")  + ";border-bottom-left-radius:" + ("0")  + ";-moz-border-radius-topright:") + (("0")  + ";-moz-border-radius-bottomright:" + ("0")  + ";}")) : ((".GK40RFKDL{height:" + ((ButtonCellBase_DefaultAppearance_Resources_default_InlineClientBundleGenerator.this.buttonCellBaseBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ButtonCellBase_DefaultAppearance_Resources_default_InlineClientBundleGenerator.this.buttonCellBaseBackground()).getSafeUri().asString() + "\") -" + (ButtonCellBase_DefaultAppearance_Resources_default_InlineClientBundleGenerator.this.buttonCellBaseBackground()).getLeft() + "px -" + (ButtonCellBase_DefaultAppearance_Resources_default_InlineClientBundleGenerator.this.buttonCellBaseBackground()).getTop() + "px  repeat-x")  + ";height:" + ("auto")  + ";background-color:" + ("#f1f1f1")  + ";margin:" + ("0")  + ";padding:" + ("5px"+ " " +"7px")  + ";text-decoration:" + ("none")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";font-size:") + (("small")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#a0a0a0")  + ";border-radius:" + ("5px")  + ";-moz-border-radius:" + ("5px")  + ";}.GK40RFKDAB{background:" + ("#666")  + ";color:" + ("white")  + ";}.GK40RFKDP{background:" + ("#940000")  + ";color:" + ("white")  + ";}.GK40RFKDL:hover{border-color:" + ("#939393")  + ";}.GK40RFKDL[disabled]{cursor:" + ("default") ) + (";color:" + ("#888")  + ";}.GK40RFKDL[disabled]:hover{border-color:" + ("#bbb"+ " " +"#bbb"+ " " +"#a0a0a0")  + ";}.GK40RFKDBB{border:" + ("1px"+ " " +"inset"+ " " +"#ccc")  + ";}.GK40RFKDM{border-top-left-radius:" + ("0")  + ";border-bottom-left-radius:" + ("0")  + ";-moz-border-radius-topleft:" + ("0")  + ";-moz-border-radius-bottomleft:" + ("0")  + ";}.GK40RFKDN{border-right:" + ("none")  + ";border-top-right-radius:" + ("0")  + ";border-bottom-right-radius:" + ("0")  + ";-moz-border-radius-topright:") + (("0")  + ";-moz-border-radius-bottomright:" + ("0")  + ";}"));
      }
      public java.lang.String buttonCellBase(){
        return "GK40RFKDL";
      }
      public java.lang.String buttonCellBaseCollapseLeft(){
        return "GK40RFKDM";
      }
      public java.lang.String buttonCellBaseCollapseRight(){
        return "GK40RFKDN";
      }
      public java.lang.String buttonCellBaseDefault(){
        return "GK40RFKDO";
      }
      public java.lang.String buttonCellBaseNegative(){
        return "GK40RFKDP";
      }
      public java.lang.String buttonCellBasePrimary(){
        return "GK40RFKDAB";
      }
      public java.lang.String buttonCellBasePushing(){
        return "GK40RFKDBB";
      }
    }
    ;
  }
  private static class buttonCellBaseStyleInitializer {
    static {
      _instance0.buttonCellBaseStyleInitializer();
    }
    static com.google.gwt.cell.client.ButtonCellBase.DefaultAppearance.Style get() {
      return buttonCellBaseStyle;
    }
  }
  public com.google.gwt.cell.client.ButtonCellBase.DefaultAppearance.Style buttonCellBaseStyle() {
    return buttonCellBaseStyleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAfCAYAAACGVs+MAAAAL0lEQVR42u3OMQ0AAAzDsPJnWwQbjD6OlN+5cWl7ywEAAAAAAAAAAAAAAAAA5oAHQZjT082H5T4AAAAASUVORK5CYII=";
  private static final java.lang.String externalImage_rtl = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAfCAYAAACGVs+MAAAAL0lEQVR42u3OMQ0AAAzDsPJnWwQbjD6OlN+5cWl7ywEAAAAAAAAAAAAAAAAA5oAHQZjT082H5T4AAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource buttonCellBaseBackground;
  private static com.google.gwt.cell.client.ButtonCellBase.DefaultAppearance.Style buttonCellBaseStyle;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      buttonCellBaseBackground(), 
      buttonCellBaseStyle(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("buttonCellBaseBackground", buttonCellBaseBackground());
        resourceMap.put("buttonCellBaseStyle", buttonCellBaseStyle());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'buttonCellBaseBackground': return this.@com.google.gwt.cell.client.ButtonCellBase.DefaultAppearance.Resources::buttonCellBaseBackground()();
      case 'buttonCellBaseStyle': return this.@com.google.gwt.cell.client.ButtonCellBase.DefaultAppearance.Resources::buttonCellBaseStyle()();
    }
    return null;
  }-*/;
}
