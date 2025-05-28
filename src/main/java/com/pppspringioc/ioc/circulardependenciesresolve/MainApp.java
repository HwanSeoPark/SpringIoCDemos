package com.pppspringioc.ioc.circulardependenciesresolve;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.circulardependenciesresolve.config.AppConfig;
import com.pppspringioc.ioc.circulardependenciesresolve.service.ClassA;

public class MainApp {
	public static void main(String[] args) {
        // Load Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ClassA classA = context.getBean(ClassA.class);

        // Test circular dependency
        classA.doSomething();
    }
}