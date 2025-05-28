package com.pppspringioc.ioc.usingjsr330.named.finder;

import org.springframework.stereotype.Component;

@Component //Default name of the Bean : optionalMovieFinderImpl
public class OptionalMovieFinderImpl implements MovieFinder {

    @Override
    public String findAll() {
        return "OptionalMovieFinderImpl: Searching for alternative movies...";
    }
}
