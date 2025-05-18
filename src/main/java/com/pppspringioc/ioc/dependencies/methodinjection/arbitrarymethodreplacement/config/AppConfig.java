package com.pppspringioc.ioc.dependencies.methodinjection.arbitrarymethodreplacement.config;

import java.lang.reflect.Method;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.dependencies.methodinjection.arbitrarymethodreplacement.model.MyValueCalculator;
import com.pppspringioc.ioc.dependencies.methodinjection.arbitrarymethodreplacement.model.ReplacementComputeValue;

@Configuration
public class AppConfig {

    @Bean
    public MyValueCalculator myValueCalculator() {
        return new MyValueCalculator() {
            @Override
            public String computeValue(String input) throws Throwable {
                // Custom method replacement logic using Spring's MethodReplacer
                return replacementComputeValue().reimplement(this, findMethod(), new Object[]{input}).toString();
            }
        };
    }

    @Bean
    public ReplacementComputeValue replacementComputeValue() {
        return new ReplacementComputeValue();
    }

    private Method findMethod() {
        try {
            return MyValueCalculator.class.getMethod("computeValue", String.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Method not found: computeValue(String)", e);
        }
    }
}