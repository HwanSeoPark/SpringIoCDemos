package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.util;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class ActionMovieCatalog implements MovieCatalog {

    @Override
    public String getCatalogName() {
        return "ActionMovieCatalog";
    }
}
