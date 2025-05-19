package com.pppspringioc.ioc.circulardependencies.service;

public class ClassA {
    private final ClassB classB;

    public ClassA(ClassB classB) {
        this.classB = classB;
    }

    public void doSomething() {
        System.out.println("ClassA is doing something");
        classB.doSomething();
    }
}