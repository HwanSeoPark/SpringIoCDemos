package com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.dependency.Dependency2;

@Configuration
public class OtherConfig {
	@Bean
	public Dependency2 dependency2() {
		return new Dependency2();
	}
}