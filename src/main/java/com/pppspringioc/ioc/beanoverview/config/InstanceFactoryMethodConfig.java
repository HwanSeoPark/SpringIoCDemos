package com.pppspringioc.ioc.beanoverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstanceFactoryMethodConfig {

    @Bean
    public DefaultServiceLocator serviceLocator() {
        return new DefaultServiceLocator(); // 팩토리 Bean 생성
    }

    @Bean
    public ServerService serverService(DefaultServiceLocator serviceLocator) {
        return serviceLocator.createServerServiceInstance(); // 팩토리 메서드 호출
    }

    @Bean
    public AccountService accountService(DefaultServiceLocator serviceLocator) {
        return serviceLocator.createAccountServiceInstance(); // 다른 팩토리 메서드 호출
    }
}

class DefaultServiceLocator {
    private static final ServerService serverService = new ServerService();
    private static final AccountService accountService = new AccountService();

    public ServerService createServerServiceInstance() {
        return serverService;
    }

    public AccountService createAccountServiceInstance() {
        return accountService;
    }
}

class ServerService {
    public ServerService() {
        System.out.println("ServerService created.");
    }
}

class AccountService {
    public AccountService() {
        System.out.println("AccountService created.");
    }
}