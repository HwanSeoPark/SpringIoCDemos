package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.injectinginterbeandependencies.model;

public class BeanOne {
	
	private final BeanTwo beanTwo;
	
	public BeanOne(BeanTwo beanTwo) {
		this.beanTwo = beanTwo;
	}
	
	public BeanTwo getBeanTwo() {
		return this.beanTwo;
	}

}
