package com.pppspringioc.ioc.componentconfig.beans;

public class TestBeanB {

	private TestBeanA testBeanA;
	
	public TestBeanB(TestBeanA testBeanA) {
		this.testBeanA = testBeanA;
	}
}
