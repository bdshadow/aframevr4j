package org.bdshadow.gwt.aframevr.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * @author Dmitrii Bocharov <bdshadow@gmail.com>
 */
public interface AframevrTextResource extends ClientBundle {

  AframevrTextResource IMPL = GWT.create(AframevrTextResource.class);

  @Source("js/aframe.js")
  TextResource getAframevrJs();

  @Source("js/aframe.min.js")
  TextResource getAframevrJsSMin();
}
