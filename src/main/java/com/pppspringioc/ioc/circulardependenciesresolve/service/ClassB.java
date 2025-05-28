package com.pppspringioc.ioc.circulardependenciesresolve.service;

public class ClassB {
    private ClassA classA;

    public void setClassA(ClassA classA) {
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("ClassB is doing something");        
    }
}