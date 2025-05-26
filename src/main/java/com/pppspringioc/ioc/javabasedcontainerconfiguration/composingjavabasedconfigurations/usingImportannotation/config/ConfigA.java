package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingImportannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingImportannotation.beans.BeanA;

@Configuration
public class ConfigA {

	@Bean
	public BeanA beanA() {
		System.out.println("✅ ConfigA.beanA() 호출됨");
		return new BeanA();
	}
}