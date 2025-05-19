package com.pppspringioc.ioc.autowire.mybeanpostprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;

@Configuration
@ComponentScan(basePackages = "com.intheeast.ioc.autowire.mybeanpostprocessor")
public class AppConfig {

    // BeanPostProcessor는 명시적으로 설정되어야 함
    @Bean
    public static BeanFactoryPostProcessor myBeanFactoryPostProcessor() {
        return beanFactory -> System.out.println("BeanFactoryPostProcessor executed.");
    }
}