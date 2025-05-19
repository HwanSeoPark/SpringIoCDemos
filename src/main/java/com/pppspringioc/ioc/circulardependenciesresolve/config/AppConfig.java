package com.pppspringioc.ioc.circulardependenciesresolve.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.circulardependenciesresolve.service.ClassA;
import com.pppspringioc.ioc.circulardependenciesresolve.service.ClassB;

import jakarta.annotation.PostConstruct;

@Configuration
public class AppConfig {
	
	@Autowired
    private ApplicationContext context;

    @Bean
    public ClassA classA() {
        return new ClassA();
    }

    @Bean
    public ClassB classB() {
        return new ClassB();
    }
    
    @PostConstruct
    public void configureDependencies() {
    	// Get beans from ApplicationContext
        ClassA classA = context.getBean(ClassA.class);
        ClassB classB = context.getBean(ClassB.class);

        classA.setClassB(classB);
        classB.setClassA(classA);
    }

//    public void configureDependencies(ClassA classA, ClassB classB) {
//        classA.setClassB(classB);
//        classB.setClassA(classA);
//    }
}