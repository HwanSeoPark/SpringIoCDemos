package com.pppspringioc.ioc.beanfactoryapi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainWithApplicationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        ClientService client = context.getBean(ClientService.class);
        client.execute();

        context.close();
    }
}
