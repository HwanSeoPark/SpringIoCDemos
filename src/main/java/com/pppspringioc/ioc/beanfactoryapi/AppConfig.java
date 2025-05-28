package com.pppspringioc.ioc.beanfactoryapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MessageService messageService() {
        return new MessageService();
    }

    @Bean
    public ClientService clientService() {
        return new ClientService();
    }
}