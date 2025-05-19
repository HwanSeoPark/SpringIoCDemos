package com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example2.model;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class OrderedBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 1; // 낮은 숫자가 더 높은 우선순위를 가짐
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof ExampleBean) {
            System.out.println("OrderedBeanPostProcessor - Before Initialization: " + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof ExampleBean) {
            System.out.println("OrderedBeanPostProcessor - After Initialization: " + beanName);
        }
        return bean;
    }
}
