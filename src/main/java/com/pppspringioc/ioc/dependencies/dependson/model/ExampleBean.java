package com.pppspringioc.ioc.dependencies.dependson.model;

import org.springframework.beans.factory.annotation.Autowired;

public class ExampleBean {
    private ManagerBean manager;    
    

    public ExampleBean() {
		System.out.println("ExampleBean Default Contructor");
	}

    @Autowired
	public void setManager(ManagerBean manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "ExampleBean initialized with ManagerBean: " + (manager != null);
    }
}