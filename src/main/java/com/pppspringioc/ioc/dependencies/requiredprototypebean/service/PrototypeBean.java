package com.pppspringioc.ioc.dependencies.requiredprototypebean.service;

public class PrototypeBean {

	private int count = 0;
	
	public PrototypeBean() {}

	public int getCount() {
		return count++;
	}
	
}
