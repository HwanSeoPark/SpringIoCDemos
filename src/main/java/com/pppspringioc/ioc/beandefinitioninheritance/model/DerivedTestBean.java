package com.pppspringioc.ioc.beandefinitioninheritance.model;

public class DerivedTestBean extends TestBean {
    public void initialize() {
        System.out.println("DerivedTestBean initialized with name=" + getName() + ", age=" + getAge());
    }
}
