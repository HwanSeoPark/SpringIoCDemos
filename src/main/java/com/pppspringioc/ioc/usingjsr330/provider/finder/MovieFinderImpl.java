package com.pppspringioc.ioc.usingjsr330.provider.finder;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Primary
@Component // movieFinderImpl
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//("prototype")
@Qualifier("movieFinder1")
public class MovieFinderImpl implements MovieFinder {

    @Override
    public String findAll() {
        return "MovieFinderImpl: Searching for movies...";
    }
}
