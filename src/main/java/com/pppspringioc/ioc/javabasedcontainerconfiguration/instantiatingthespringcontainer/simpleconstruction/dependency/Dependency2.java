package com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.simpleconstruction.dependency;

import org.springframework.stereotype.Component;

@Component  // 또는 @Named
public class Dependency2 {
	public String getInfo() {
		return "Info from Dependency2";
	}
}