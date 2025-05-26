package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.components;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

//@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		System.out.println("CustomBeanFactoryPostProcessor:CustomBeanFactoryPostProcessor");
	}
}