package com.pppspringioc.ioc.dependencies.requiredprototypebean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pppspringioc.ioc.dependencies.requiredprototypebean.service.PrototypeBean;

@Configuration
@ComponentScan({"com.pppspringioc.ioc.dependencies.requiredprototypebean"})
public class ConfigApp {

	@Bean
	@Scope("prototype")
	public PrototypeBean prototypeBean() {
		return new PrototypeBean();
	}
	
}
