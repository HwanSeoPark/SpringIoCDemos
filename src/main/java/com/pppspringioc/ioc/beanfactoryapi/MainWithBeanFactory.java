package com.pppspringioc.ioc.beanfactoryapi;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;


public class MainWithBeanFactory {
    public static void main(String[] args) {
    	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        // 수동 등록
        factory.registerBeanDefinition("messageService", new RootBeanDefinition(MessageService.class));
        factory.registerBeanDefinition("clientService", new RootBeanDefinition(ClientService.class));

        // AutowiredAnnotationBeanPostProcessor 수동 등록
        AutowiredAnnotationBeanPostProcessor postProcessor = new AutowiredAnnotationBeanPostProcessor();
        postProcessor.setBeanFactory(factory); // ❗ 반드시 설정
        factory.addBeanPostProcessor(postProcessor);

        // 빈 획득
        ClientService client = factory.getBean("clientService", ClientService.class);
        client.execute();
    }
}
