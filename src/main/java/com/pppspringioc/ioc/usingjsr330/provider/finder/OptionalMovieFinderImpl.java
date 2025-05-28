package com.pppspringioc.ioc.usingjsr330.provider.finder;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("movieFinder2")
@Scope("prototype")
public class OptionalMovieFinderImpl implements MovieFinder {

    @Override
    public String findAll() {
        return "OptionalMovieFinderImpl: Searching for alternative movies...";
    }
}
