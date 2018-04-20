package org.bdshadow.gwt.aframevr;

import elemental2.dom.Element;
import elemental2.dom.Node;

/**
 * @author Dmitrii Bocharov <bdshadow@gmail.com>
 */
public class AframeScene extends AframeEntity {

  public AframeScene(Element parentElement) {
    super();
    parentElement.appendChild(this.entity);
  }

  public String getTag() {
    return "a-scene";
  }

  public Node appendChild(AframeEntity node) {
    return entity.appendChild(node.getEntity());
  }

  public final double getHeight() {
    return Double.valueOf(entity.getAttribute("height"));
  }

  public final void setHeight(double height) {
    entity.setAttribute("height", height);
  }

  public final double getWidth() {
    return Double.valueOf(entity.getAttribute("width"));
  }

  public final void setWidth(double width) {
    entity.setAttribute("width", width);
  }
}
