package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.Initializationcallbacks.model;

import jakarta.annotation.PostConstruct;

public class OtherExampleBean {

	@PostConstruct
	public void init() {
		System.out.println("OtherExampleBean:init");
	}
}
