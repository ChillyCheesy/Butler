package com.chillycheesy.butler.pages;

import com.chillycheesy.modulo.pages.factory.GetRequest;
import com.chillycheesy.modulo.pages.factory.ResponseResource;

public class ButlerPage {

    @GetRequest("/butler")
    @ResponseResource
    public String butler() { return "public"; }

}
