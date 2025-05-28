package com.pppspringioc.ioc.circulardependenciesresolve.service;

public class ClassA {
    private ClassB classB;

    public void setClassB(ClassB classB) {
        this.classB = classB;
    }

    public void doSomething() {
        System.out.println("ClassA is doing something");
        if (classB != null) {
            classB.doSomething();
        }
    }
}