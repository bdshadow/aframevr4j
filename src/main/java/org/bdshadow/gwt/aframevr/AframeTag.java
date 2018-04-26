package org.bdshadow.gwt.aframevr;

import elemental2.core.JsObject;
import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;

public abstract class AframeTag {

  protected HTMLElement entity;

  public AframeTag() {
    this.entity = (HTMLElement) DomGlobal.document.createElement(getTagName());
  }

  public HTMLElement getHTMLElement() {
    return entity;
  }

  public abstract String getTagName();

  public Object getObject3D() {
    return JsObject.getOwnPropertyDescriptor(entity, "object3D").getValue();
  }

}
