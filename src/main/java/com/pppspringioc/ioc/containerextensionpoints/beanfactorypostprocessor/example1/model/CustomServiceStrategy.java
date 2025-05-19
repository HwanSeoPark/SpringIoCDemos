package com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example1.model;

public class CustomServiceStrategy extends ServiceStrategy {

    @Override
    public void execute() {
        System.out.println("Executing custom ServiceStrategy.");
    
    
    }
}
