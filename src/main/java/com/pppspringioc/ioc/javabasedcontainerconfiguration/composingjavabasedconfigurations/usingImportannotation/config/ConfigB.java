package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingImportannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingImportannotation.beans.BeanB;


@Configuration
public class ConfigB {

	@Bean
	public BeanB beanB() {
		System.out.println("✅ ConfigB.beanB() 호출됨");
		return new BeanB();
	}
}