package com.pppspringioc.ioc.javabasedcontainerconfiguration.enablingcomponentscanning.denpendency;

import org.springframework.stereotype.Component;

@Component
public class Dependency2 {
	public String getInfo() {
		return "Info from Dependency2";
	}
}