package com.pppspringioc.ioc.componentconfig.beans;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestBean {
	
	private String name;
	private Integer i;
	private TestBean spouse;
	private String country;
	private String age;

	public TestBean(String name) {
		this.name = name;
	}
	
	public TestBean(String name, Integer i) {
		this.name = name;
		this.i = i;
	}
	
	public TestBean(String name, Integer i, String age) {
		this.name = name;
		this.i = i;
		this.age = age;
	}


}
