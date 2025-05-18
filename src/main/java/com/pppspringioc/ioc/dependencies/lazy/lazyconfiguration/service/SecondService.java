package com.pppspringioc.ioc.dependencies.lazy.lazyconfiguration.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class SecondService {
    public SecondService() {
        System.out.println("[SecondService] Constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("[SecondService] @PostConstruct initialization logic executed");
    }

    public void doAnotherThing() {
        System.out.println("[SecondService] Doing another thing...");
    }
}