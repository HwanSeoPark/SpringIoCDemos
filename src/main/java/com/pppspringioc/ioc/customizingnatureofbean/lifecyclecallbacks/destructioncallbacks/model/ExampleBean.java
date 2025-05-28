package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.destructioncallbacks.model;

public class ExampleBean {

    public void cleanup() {
        System.out.println("ExampleBean: Cleanup logic executed.");
    }
}