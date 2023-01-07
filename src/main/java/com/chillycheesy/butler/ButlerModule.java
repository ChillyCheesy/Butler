package com.chillycheesy.butler;

import com.chillycheesy.butler.pages.ButlerPageManager;
import com.chillycheesy.modulo.modules.Module;

/**
 * Butler Module main class.
 *
 * @author chillycheesy
 */
public class ButlerModule extends Module {

    /**
     * ButlerPageManager instance.
     */
    private ButlerPageManager pageManager;

    /**
     * On Butler is loaded.
     */
    @Override
    protected void onLoad() {
        pageManager = new ButlerPageManager();
        pageManager.load(this);
    }

    /**
     * On Butler is started.
     */
    @Override
    protected void onStart() {
        pageManager.start();
    }

    /**
     * On Butler is stopped.
     */
    @Override
    protected void onStop() {
        pageManager.stop();
    }

}
