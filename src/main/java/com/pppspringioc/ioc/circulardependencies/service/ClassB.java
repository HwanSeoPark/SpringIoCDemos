package com.pppspringioc.ioc.circulardependencies.service;

public class ClassB {
    private final ClassA classA;

    public ClassB(ClassA classA) {
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("ClassB is doing something");
    }
}