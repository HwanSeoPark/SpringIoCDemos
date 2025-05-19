package com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example1.model;

import jakarta.annotation.PostConstruct;

public class OtherBean {

	private String message;

	public OtherBean(String message) {
		this.message = message;
	}

	@PostConstruct
    public void init() {
    	System.out.println("OtherBean:init()");
    }
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
