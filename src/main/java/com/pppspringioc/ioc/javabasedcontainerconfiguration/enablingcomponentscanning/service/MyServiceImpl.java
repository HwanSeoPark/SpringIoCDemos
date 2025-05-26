package com.pppspringioc.ioc.javabasedcontainerconfiguration.enablingcomponentscanning.service;

import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.enablingcomponentscanning.denpendency.*;

@Component
public class MyServiceImpl implements MyService {

	private final Dependency1 d1;
	private final Dependency2 d2;

	public MyServiceImpl(Dependency1 d1, Dependency2 d2) {
		this.d1 = d1;
		this.d2 = d2;
	}

	@Override
	public void doStuff() {
		System.out.println("✅ " + d1.getMessage());
		System.out.println("✅ " + d2.getInfo());
	}
}