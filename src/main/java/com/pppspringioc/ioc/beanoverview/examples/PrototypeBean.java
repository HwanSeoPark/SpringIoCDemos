package com.pppspringioc.ioc.beanoverview.examples;

public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("PrototypeBean created.");
    }

    public void performAction() {
        System.out.println("Performing action in PrototypeBean.");
    }
}