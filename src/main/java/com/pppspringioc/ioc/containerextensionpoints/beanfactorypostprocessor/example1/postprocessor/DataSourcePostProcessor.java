package com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example1.postprocessor;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DataSourcePostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
            throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("dataSource");

        // 빈 정의 수준에서 프로퍼티를 수정함
        beanDefinition.getPropertyValues().add("driverClassName", "org.h2.Driver");
        beanDefinition.getPropertyValues().add("url", "jdbc:h2:mem:testdb");
        beanDefinition.getPropertyValues().add("username", "admin");
    }
}