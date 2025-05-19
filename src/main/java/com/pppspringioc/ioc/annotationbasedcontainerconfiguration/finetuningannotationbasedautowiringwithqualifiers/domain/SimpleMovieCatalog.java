package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.domain;

public class SimpleMovieCatalog implements MovieCatalog {

    private final String name;

    public SimpleMovieCatalog(String name) {
        this.name = name;
    }

    @Override
    public String getCatalogName() {
        return this.name;
    }
}
