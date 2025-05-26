package com.pppspringioc.ioc.usingjsr330.inject.finder;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("movieFinder2")
public class OptionalMovieFinderImpl implements MovieFinder {

    @Override
    public String findAll() {
        return "OptionalMovieFinderImpl: Searching for alternative movies...";
    }
}
