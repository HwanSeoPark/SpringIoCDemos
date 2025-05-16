package com.pppspringioc.ioc.dependencies.autowiring.autowirecandidate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.dependencies.autowiring.autowirecandidate.config.AppConfig;
import com.pppspringioc.ioc.dependencies.autowiring.autowirecandidate.service.PaymentManager;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        PaymentManager manager = context.getBean(PaymentManager.class);
        manager.process();
    }
}