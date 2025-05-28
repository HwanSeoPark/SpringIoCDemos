package com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.dependency.Dependency1;

@Configuration
public class AppConfig {
	@Bean
	public Dependency1 dependency1() {
		return new Dependency1();
	}
}