package com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example2.model;

public class CustomServiceStrategy extends ServiceStrategy {

    @Override
    public void execute() {
//    	super.execute();
        System.out.println("Executing custom ServiceStrategy.");
    }
}