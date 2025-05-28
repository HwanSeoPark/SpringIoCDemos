package com.pppspringioc.ioc.usingjsr330.namedclass.finder;

import org.springframework.stereotype.Component;

@Component // movieFinderImpl
public class MovieFinderImpl implements MovieFinder {

    @Override
    public String findAll() {
        return "MovieFinderImpl: Searching for movies...";
    }
}
