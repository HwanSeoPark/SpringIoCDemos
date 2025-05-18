package com.pppspringioc.ioc.dependencies.autowiring.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.dependencies.autowiring.PaymentService;
import com.pppspringioc.ioc.dependencies.autowiring.primary.config.AppConfig;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        PaymentService paymentService = context.getBean(PaymentService.class);  // @Primary 가 적용된 Bean 주입
        paymentService.pay(1000);
    }
}