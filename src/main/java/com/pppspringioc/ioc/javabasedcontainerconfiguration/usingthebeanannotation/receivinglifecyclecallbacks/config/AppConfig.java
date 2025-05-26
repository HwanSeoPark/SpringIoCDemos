package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.receivinglifecyclecallbacks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.receivinglifecyclecallbacks.lifecycle.BeanAwareSet1;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.receivinglifecyclecallbacks.lifecycle.BeanAwareSet2;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.receivinglifecyclecallbacks.lifecycle.BeanDestroy;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.receivinglifecyclecallbacks.lifecycle.BeanInit;

@Configuration
public class AppConfig {

	@Bean(initMethod = "customInit")
	public BeanInit beanInit() {
		return new BeanInit();
	}

	@Bean(destroyMethod = "customDestroy")
	public BeanDestroy beanDestroy() {
		return new BeanDestroy();
	}

	@Bean
	public BeanAwareSet1 beanAwareSet1() {
		return new BeanAwareSet1();
	}

	@Bean
	public BeanAwareSet2 beanAwareSet2() {
		return new BeanAwareSet2();
	}
}