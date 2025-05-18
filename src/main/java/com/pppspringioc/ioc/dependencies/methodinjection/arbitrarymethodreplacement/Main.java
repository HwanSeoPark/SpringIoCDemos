package com.pppspringioc.ioc.dependencies.methodinjection.arbitrarymethodreplacement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.pppspringioc.ioc.dependencies.methodinjection.arbitrarymethodreplacement.config.AppConfig;
import com.pppspringioc.ioc.dependencies.methodinjection.arbitrarymethodreplacement.model.MyValueCalculator;



public class Main {
    public static void main(String[] args) throws Throwable {
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        MyValueCalculator calculator = context.getBean(MyValueCalculator.class);
        System.out.println(calculator.computeValue("hello world")); // Output: Replaced Value: HELLO WORLD
    }
}