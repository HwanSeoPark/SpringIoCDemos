package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.resourceinjection.domain;


public class MyMovieFinder implements MovieFinder {

    @Override
    public String findMovieByTitle(String title) {
        return "Found movie: " + title;
    }
}
