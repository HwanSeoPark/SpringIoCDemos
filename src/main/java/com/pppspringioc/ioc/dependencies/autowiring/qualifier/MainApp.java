package com.pppspringioc.ioc.dependencies.autowiring.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.dependencies.autowiring.qualifier.config.AppConfig;
import com.pppspringioc.ioc.dependencies.autowiring.qualifier.service.PaymentManager;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        PaymentManager manager = context.getBean(PaymentManager.class);
        manager.process();
    }
}