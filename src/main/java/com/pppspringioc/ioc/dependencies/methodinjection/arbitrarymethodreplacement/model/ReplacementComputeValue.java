package com.pppspringioc.ioc.dependencies.methodinjection.arbitrarymethodreplacement.model;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ReplacementComputeValue implements MethodReplacer {

    @Override
    public Object reimplement(Object target, Method method, Object[] args) throws Throwable {
        // New implementation for the computeValue method
        String input = (String) args[0];
        return "Replaced Value: " + input.toUpperCase();
    }
}