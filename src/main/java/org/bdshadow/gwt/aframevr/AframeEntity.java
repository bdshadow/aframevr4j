package org.bdshadow.gwt.aframevr;

import elemental2.dom.DomGlobal;
import elemental2.dom.Element;

/**
 * @author Dmitrii Bocharov <bdshadow@gmail.com>
 */
public class AframeEntity {

  protected Element entity;

  public AframeEntity() {
    this.entity = DomGlobal.document.createElement(getTag());
  }

  public Element getEntity() {
    return entity;
  }

  /**
   * Children must override it
   * @return
   */
  public String getTag() {
    return "a-entity";
  }
}
