package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.util;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Primary
@Order(1)
@Component
public class DramaMovieCatalog implements MovieCatalog {

    @Override
    public String getCatalogName() {
        return "DramaMovieCatalog";
    }
}
