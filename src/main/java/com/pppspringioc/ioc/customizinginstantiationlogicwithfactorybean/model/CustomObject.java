package com.pppspringioc.ioc.customizinginstantiationlogicwithfactorybean.model;

public class CustomObject {

    private String name;
    private int value;

    public CustomObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "CustomObject{name='" + name + "', value=" + value + "}";
    }
}
