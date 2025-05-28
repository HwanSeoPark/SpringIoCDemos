package com.pppspringioc.ioc.customizingnatureofbean.applicationcontextawarebeannameaware.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CustomAwareBean implements ApplicationContextAware, BeanNameAware {

    private ApplicationContext applicationContext;
    private String beanName;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("ApplicationContext set in CustomAwareBean.");
    }

    @Override
    public void setBeanName(String name) throws BeansException {
        this.beanName = name;
        System.out.println("BeanName set to '" + name + "' in CustomAwareBean.");
    }

    public void printBeanDetails() {
        System.out.println("Bean Name: " + beanName);
        System.out.println("Number of beans in ApplicationContext: " + applicationContext.getBeanDefinitionCount());
    }
}
