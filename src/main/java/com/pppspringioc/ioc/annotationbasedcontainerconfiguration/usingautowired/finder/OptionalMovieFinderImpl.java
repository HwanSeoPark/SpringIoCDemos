package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.finder;

import org.springframework.stereotype.Component;

@Component
public class OptionalMovieFinderImpl implements MovieFinder {

    @Override
    public String findAll() {
        return "OptionalMovieFinderImpl: Searching for alternative movies...";
    }
}
