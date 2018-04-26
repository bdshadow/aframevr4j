package org.bdshadow.gwt.aframevr;

import elemental2.dom.Attr;
import elemental2.dom.Element;
import elemental2.dom.Node;
import java.util.stream.Stream;
import org.treblereel.gwt.three4g.objects.Group;
import org.treblereel.gwt.three4g.scenes.Scene;

/**
 * @author Dmitrii Bocharov <bdshadow@gmail.com>
 */
public class AframeScene extends AframeTag {

  public AframeScene(Element parentElement) {
    super();
    parentElement.appendChild(this.entity);
  }

  public String getTagName() {
    return "a-scene";
  }

  @Override
  public Scene getObject3D() {
    return (Scene) super.getObject3D();
  }

  public void setEmbedded() {
    this.entity.setAttribute("embedded", "");
  }

  public Node appendChild(AframeEntity node) {
    return entity.appendChild(node.getHTMLElement());
  }

  public void addFog(Fog fog) {
    if (fog == null) {
      return;
    }
    this.entity.setAttribute("fog", fog.toString());
  }

  public static class Fog {
    enum TYPE {
      LINEAR("linear"),
      EXPONENTIAL("exponential");

      String value;

      TYPE(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
    }

    public TYPE type = null;
    public String color = null;
    public Float near = null;
    public Float far = null;
    public Float density = null;

    @Override
    public String toString() {
      StringBuilder result = new StringBuilder();
      toStringOne(result, "type", type);
      toStringOne(result, "color", color);
      toStringOne(result, "near", near);
      toStringOne(result, "far", far);
      toStringOne(result, "density", density);

      if (result.toString().endsWith("; ")) {
        result.delete(result.length()-2, result.length()-1);
      }
      return result.toString();
    }

    private void toStringOne(StringBuilder result, String name, Object value) {
      if (value != null) {
        result.append(name).append(": ").append(value.toString()).append("; ");
      }
    }
  }
}
