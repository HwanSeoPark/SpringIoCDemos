package com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example1.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = 
        		beanFactory.getBeanDefinition("serviceStrategy");
        // Bean 정의 수정 (예: 기본 클래스 변경)
        beanDefinition.setBeanClassName("com.intheeast.ioc.containerextensionpoints.beanfactorypostprocessor.example1.model.CustomServiceStrategy");
        System.out.println("CustomBeanFactoryPostProcessor: Modified 'serviceStrategy' bean definition.");
    }
}
