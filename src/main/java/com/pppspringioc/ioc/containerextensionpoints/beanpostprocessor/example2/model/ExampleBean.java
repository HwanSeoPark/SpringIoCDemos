package com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example2.model;

public class ExampleBean {

    private String message;

    public ExampleBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ExampleBean{message='" + message + "'}";
    }
}
