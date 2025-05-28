package com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.simpleconstruction.dependency;

import org.springframework.stereotype.Component;

@Component  // 또는 @Named
public class Dependency1 {
	public String getMessage() {
		return "Hello from Dependency1";
	}
}