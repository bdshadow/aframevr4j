package org.bdshadow.gwt.aframevr;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import org.bdshadow.gwt.aframevr.resources.AframevrTextResource;

/**
 * @author Dmitrii Bocharov <bdshadow@gmail.com>
 */
public class Aframevr implements EntryPoint {

    @Override
    public void onModuleLoad() {
        loadThreeJS();
    }

    public static void loadThreeJS(){
        load("three.js");
    }

    public static void loadThreeJSMin(){
        load("three.min.js");
    }

    private static void load(String scriptName) {
        ScriptInjector.fromString(AframevrTextResource.IMPL.getAframevrJs().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

    }

}
