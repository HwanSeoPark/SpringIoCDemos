package com.pppspringioc.ioc.autowire.mybeanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // MyService 빈을 가져와서 메서드 호출
        MyService myService = context.getBean(MyService.class);
        myService.performService();
    }
}