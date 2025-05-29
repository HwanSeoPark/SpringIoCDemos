package com.pppspringioc.ioc.beanfactoryapi.defaultbeanfactroy;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class AppConfig {

	// DefaultListableBeanFactory는 BeanFactory인터페이스의 구현체
	public DefaultListableBeanFactory createBeanFactory() {
		DefaultListableBeanFactory factory =
				new DefaultListableBeanFactory();

		// GenericBeanDefinition -> 일반적인 BeanDefinition(빈 정의)
		GenericBeanDefinition printDef =
				new GenericBeanDefinition();
		printDef.setBeanClass(Printer.class);
		factory.registerBeanDefinition("printer", printDef);

		GenericBeanDefinition helloDef =
				new GenericBeanDefinition();
		helloDef.setBeanClass(HelloService.class);
		helloDef.getPropertyValues().add("printer", factory.getBean("printer")); // 의존성 주입
		factory.registerBeanDefinition("helloservice", helloDef);
		
		return factory;
				
	}
}
