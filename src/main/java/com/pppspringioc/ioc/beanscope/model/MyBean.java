package com.pppspringioc.ioc.beanscope.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class MyBean {
    @PostConstruct
    public void init() {
        System.out.println("MyBean is initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("MyBean is destroyed");
    }
}