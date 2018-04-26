package org.bdshadow.gwt.aframevr;

import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.treblereel.gwt.three4g.core.Object3D;
import org.treblereel.gwt.three4g.geometries.BoxGeometry;

/**
 * @author Dmitrii Bocharov <bdshadow@gmail.com>
 */
public class AframeBox extends AframeEntity {

  @Override
  public String getTagName() {
    return "a-box";
  }

  public final String getColor() {
    return this.entity.getAttribute("color");
  }

  public final void setColor(String color) {
    entity.setAttribute("color", color);
  }

  public final String getPosition() {
    return this.entity.getAttribute("position");
  }

  public final void setPosition(String position) {
    this.entity.setAttribute("position", position);
  }

  public final String getRotation() {
    return this.entity.getAttribute("rotation");
  }

  public final void setRotation(String rotation) {
    this.entity.setAttribute("rotation", rotation);
  }

}
