package org.bdshadow.gwt.aframevr;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import jsinterop.base.JsConstructorFn;
import org.bdshadow.gwt.aframevr.resources.AframevrTextResource;

/**
 * @author Dmitrii Bocharov <bdshadow@gmail.com>
 */
public class Aframevr implements EntryPoint {

  @Override
  public void onModuleLoad() {
    loadAframevrJS();

//    DomGlobal.customElements.define("a-box", (JsConstructorFn<AframeBox>) args -> {});
//    DomGlobal.customElements.define("a-cylinder", (JsConstructorFn<AframeCylinder>) args -> {});
//    DomGlobal.customElements.define("a-plane", (JsConstructorFn<AframePlane>) args -> {});
//    DomGlobal.customElements.define("a-scene", (JsConstructorFn<AframeScene>) args -> {});
//    DomGlobal.customElements.define("a-sky", (JsConstructorFn<AframeSky>) args -> {});
//    DomGlobal.customElements.define("a-sphere", (JsConstructorFn<AframeSphere>) args -> {});
  }

  public static void loadAframevrJS() {
    load("aframe.js");
  }

  public static void loadAframevrJSMin() {
    load("aframe.min.js");
  }

  private static void load(String scriptName) {
    ScriptInjector.fromString(AframevrTextResource.IMPL.getAframevrJs().getText())
        .setWindow(ScriptInjector.TOP_WINDOW).inject();
  }

}
