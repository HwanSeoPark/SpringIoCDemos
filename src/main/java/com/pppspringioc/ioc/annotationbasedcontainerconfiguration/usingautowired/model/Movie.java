package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.model;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
