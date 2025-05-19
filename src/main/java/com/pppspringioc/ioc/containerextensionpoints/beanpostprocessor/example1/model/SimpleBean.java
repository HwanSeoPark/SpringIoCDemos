package com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example1.model;

import jakarta.annotation.PostConstruct;

public class SimpleBean {

    private String message;

    public SimpleBean(String message) {
        this.message = message;
    }

    @PostConstruct
    public void init() {
    	System.out.println("SimpleBean:init()");
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SimpleBean{message='" + message + "'}";
    }
}
