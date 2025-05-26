package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.injectinginterbeandependencies.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.injectinginterbeandependencies.model.BeanOne;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.injectinginterbeandependencies.model.BeanTwo;

@Configuration
public class AppConfig {

	@Bean
	public BeanOne beanOne() {
		return new BeanOne(beanTwo());
	}

	@Bean
	public BeanTwo beanTwo() {
		return new BeanTwo();
	}
}