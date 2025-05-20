package com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example2.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    	if (beanFactory.containsBeanDefinition("serviceStrategy")) {
            ((BeanDefinitionRegistry) beanFactory).removeBeanDefinition("serviceStrategy");

            BeanDefinition newDef = BeanDefinitionBuilder
                .genericBeanDefinition(CustomServiceStrategy.class)
                .getBeanDefinition();

            ((BeanDefinitionRegistry) beanFactory).registerBeanDefinition("serviceStrategy", newDef);

            System.out.println("Replaced 'serviceStrategy' with CustomServiceStrategy.");
        }
    }
}
