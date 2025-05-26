package com.pppspringioc.ioc.javabasedcontainerconfiguration.enablingcomponentscanning.denpendency;

import org.springframework.stereotype.Component;

@Component
public class Dependency1 {
	
	public String getMessage() {
		return "Hello from Dependency1";
	}
}