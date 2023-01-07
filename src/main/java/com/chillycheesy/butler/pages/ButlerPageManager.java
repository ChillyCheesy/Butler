package com.chillycheesy.butler.pages;

import com.chillycheesy.modulo.ModuloAPI;
import com.chillycheesy.modulo.modules.Module;
import com.chillycheesy.modulo.modules.ModuloEntity;
import com.chillycheesy.modulo.pages.PageContainer;
import com.chillycheesy.modulo.pages.PageManager;

/**
 * ButlerPageManager is used to manage all Butler pages.
 * <ul>
 *  <li>Build the {@link ButlerPage} </li>
 * </ul>
 */
public class ButlerPageManager implements ModuloEntity {

    /**
     * ButlerPageManager instance.
     */
    private PageManager pageManager;

    /**
     * Module instance.
     */
    private Module module;

    /**
     * On ButlerPageManager is loaded.
     */
    @Override
    public void load(Module module) {
        final PageContainer pageContainer = ModuloAPI.getPage();
        pageManager = pageContainer.getPageManager();
        this.module = module;
    }

    /**
     * On ButlerPageManager is started.
     */
    @Override
    public void start() {
        final ButlerPage page = new ButlerPage();
        pageManager.buildAndRegisterPage(module, page);
    }

    /**
     * On ButlerPageManager is stopped.
     */
    @Override
    public void stop() {
        pageManager.removeAllItems(module);
    }

}
