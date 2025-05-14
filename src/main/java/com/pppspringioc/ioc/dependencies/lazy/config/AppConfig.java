package com.pppspringioc.ioc.dependencies.lazy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.pppspringioc.ioc.dependencies.lazy.model.AnotherBean;
import com.pppspringioc.ioc.dependencies.lazy.model.ExpensiveToCreateBean;

@Configuration
public class AppConfig {

    @Bean
    @Lazy
    public ExpensiveToCreateBean lazyBean() {
        return new ExpensiveToCreateBean();
    }

    @Bean
    public AnotherBean notLazyBean() {
        return new AnotherBean();
    }
}