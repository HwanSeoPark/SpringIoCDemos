package com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example1.model.CustomBeanPostProcessor;
import com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example1.model.OtherBean;
import com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example1.model.SimpleBean;

@Configuration
public class AppConfig {

	// BeanPostProcessor도 Bean으로 등록
	// 이것도 Spring IoC 컨테이너가 관리
    @Bean
    public static CustomBeanPostProcessor beanPostProcessor() {
        return new CustomBeanPostProcessor();
    }

    @Bean
    public SimpleBean simpleBean() {
//       return new SimpleBean("Hello, BeanPostProcessor!");
        return new SimpleBean("");
    }

    @Bean
    public OtherBean otherBean() {
    	return new OtherBean("");
    }



}
