package com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.collections.config.AppConfig;
import com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.collections.model.ComplexObject;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);
        
        ComplexObject complexObject = context.getBean(ComplexObject.class);
        System.out.println(complexObject);
    }
}