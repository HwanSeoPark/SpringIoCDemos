package com.pppspringioc.ioc.environmentabstraction.placeholderresolutioninstatements.domain;

public class ConfigClass {
    private final String resourcePath;

    public ConfigClass(String resourcePath) {
        this.resourcePath = resourcePath;
        System.out.println("✔ ConfigClass created with resourcePath: " + resourcePath);
    }

    public String getResourcePath() {
        return resourcePath;
    }
}
