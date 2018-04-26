package org.bdshadow.gwt.aframevr;

import elemental2.core.JsObject;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.treblereel.gwt.three4g.core.Object3D;
import org.treblereel.gwt.three4g.objects.Group;

/**
 * @author Dmitrii Bocharov <bdshadow@gmail.com>
 */
public class AframeEntity extends AframeTag {

  @Override
  public Group getObject3D() {
    return (Group) super.getObject3D();
  }

  @Override
  public String getTagName() {
    return "a-entity";
  }

  public JsPropertyMap<Object3D> getObject3DMap() {
    Object object3DMap = JsObject.getOwnPropertyDescriptor(entity, "object3DMap").getValue();
    return Js.uncheckedCast(object3DMap);
  }

  public void setObject3D(String name, Object3D object3D) {
    JsObject.defineProperty(this.entity, name, object3D);
  }
}
