package com.pppspringioc.ioc.dependencies.lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.dependencies.lazy.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing ApplicationContext...");
        
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Retrieving AnotherBean...");
        context.getBean("notLazyBean");

        System.out.println("Retrieving ExpensiveToCreateBean...");
        context.getBean("lazyBean");
    }
}