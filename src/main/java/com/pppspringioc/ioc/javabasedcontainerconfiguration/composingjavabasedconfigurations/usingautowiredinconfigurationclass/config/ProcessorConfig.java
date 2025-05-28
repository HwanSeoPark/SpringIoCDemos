package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.config;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.components.*;


@Configuration
//@ComponentScan({"com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass"})
public class ProcessorConfig {

    // 정적 @Bean 메서드로 BeanPostProcessor 정의
    @Bean
    public static BeanPostProcessor customBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }

    // 정적 @Bean 메서드로 BeanFactoryPostProcessor 정의
    @Bean
    public static BeanFactoryPostProcessor customBeanFactoryPostProcessor() {
        return new CustomBeanFactoryPostProcessor();
    }
}