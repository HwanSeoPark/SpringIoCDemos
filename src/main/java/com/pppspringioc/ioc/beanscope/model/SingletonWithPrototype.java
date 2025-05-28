package com.pppspringioc.ioc.beanscope.model;

import org.springframework.beans.factory.ObjectFactory;

public class SingletonWithPrototype {
    private final ObjectFactory<PrototypeDependency> prototypeFactory;

    public SingletonWithPrototype(ObjectFactory<PrototypeDependency> prototypeFactory) {
        this.prototypeFactory = prototypeFactory;
    }

    public void usePrototype() {
        PrototypeDependency prototype = prototypeFactory.getObject();
        System.out.println("Using prototype: " + prototype);
    }
}