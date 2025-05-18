package com.pppspringioc.ioc.dependencies.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.dependencies.dependson.config.AppConfig;
import com.pppspringioc.ioc.dependencies.dependson.model.ExampleBean;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieving beans to trigger initialization
        ExampleBean beanOne = context.getBean("beanOne", ExampleBean.class);
        System.out.println(beanOne);

        ExampleBean beanOneWithMultipleDependencies = context.getBean("beanOneWithMultipleDependencies", ExampleBean.class);
        System.out.println(beanOneWithMultipleDependencies);
    }
}