package com.pppspringioc.ioc.beandefinitioninheritance.model;

public class TestBean {
    private String name;
    private int age;

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void init() {
        System.out.println("TestBean initialized with name=" + name + ", age=" + age);
    }
}
