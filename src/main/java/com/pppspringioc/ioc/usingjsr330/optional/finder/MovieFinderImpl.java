package com.pppspringioc.ioc.usingjsr330.optional.finder;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component // movieFinderImpl
public class MovieFinderImpl implements MovieFinder {

    @Override
    public String findAll() {
        return "MovieFinderImpl: Searching for movies...";
    }
}
