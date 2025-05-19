package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.util;

import org.springframework.stereotype.Component;

@Component("mapInjectionCatalogBean")
public class MapInjectionCatalog implements MovieCatalog {
    @Override
    public String getCatalogName() {
        return "MapInjectionCatalog";
    }
}
