package com.pppspringioc.ioc.componentconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.componentconfig.beans.TestBeanA;
import com.pppspringioc.ioc.componentconfig.beans.TestBeanB;

//@Configuration(proxyBeanMethods=false) <-- @Component 등가
@Component // @Configuration 대신에...
public class AppConfig {

	@Bean
	public TestBeanA testBeanA() {
		return new TestBeanA();
	}

	@Bean
	public TestBeanB testBeanB() {
		return new TestBeanB(testBeanA());
	}
}
