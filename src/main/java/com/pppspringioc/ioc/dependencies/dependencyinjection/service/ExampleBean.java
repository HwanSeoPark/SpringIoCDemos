package com.pppspringioc.ioc.dependencies.dependencyinjection.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExampleBean {

    private final int years;
    private final String ultimateAnswer;

    public ExampleBean(
            @Value("${example.years}") int years,
            @Value("${example.ultimateAnswer}") String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    // Getter 생략
}