package com.pppspringioc.ioc.usingjsr330.inject.finder;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component // movieFinderImpl
@Qualifier("movieFinder1")
public class MovieFinderImpl implements MovieFinder {

    @Override
    public String findAll() {
        return "MovieFinderImpl: Searching for movies...";
    }
}
