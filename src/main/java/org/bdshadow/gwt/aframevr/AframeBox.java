package org.bdshadow.gwt.aframevr;

import elemental2.dom.DomGlobal;
import elemental2.dom.Element;
import jsinterop.annotations.JsOverlay;

/**
 * @author Dmitrii Bocharov <bdshadow@gmail.com>
 */
public class AframeBox extends AframeEntity {

  public final String getColor() {
    return this.entity.getAttribute("color");
  }

  public String getTag() {
    return "a-box";
  }

  public final void setColor(String color) {
    entity.setAttribute("color", color);
  }

  public final String getPosition(){
    return this.entity.getAttribute("position");
  }

  public final void setPosition(String position){
    this.entity.setAttribute("position", position);
  }

  public final String getRotation(){
    return this.entity.getAttribute("rotation");
  }

  public final void setRotation(String rotation){
    this.entity.setAttribute("rotation", rotation);
  }

}
