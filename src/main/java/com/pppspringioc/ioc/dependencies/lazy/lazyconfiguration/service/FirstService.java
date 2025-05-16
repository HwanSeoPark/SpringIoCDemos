package com.pppspringioc.ioc.dependencies.lazy.lazyconfiguration.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class FirstService {
    public FirstService() {
        System.out.println("[FirstService] Constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("[FirstService] @PostConstruct initialization logic executed");
    }

    public void doSomething() {
        System.out.println("[FirstService] Doing something...");
    }
}