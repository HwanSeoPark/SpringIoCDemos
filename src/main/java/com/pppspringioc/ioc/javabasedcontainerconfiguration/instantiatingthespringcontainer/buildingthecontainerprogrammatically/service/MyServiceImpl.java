package com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.service;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.dependency.Dependency1;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.dependency.Dependency2;

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