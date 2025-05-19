package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.shutdowngracefully.model;

public class ExampleService {

    public void init() {
        System.out.println("ExampleService: Initialization logic executed.");
    }

    public void cleanup() {
        System.out.println("ExampleService: Cleanup logic executed.");
    }

    public void doWork() {
        System.out.println("ExampleService: Performing some work...");
    }
}
