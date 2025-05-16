package com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.collaborators.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.collaborators.service.AccountService;


@Configuration
public class ParentConfig {

    @Bean
    public AccountService accountService() {
        return new AccountService(); // 부모 컨텍스트에서 정의된 AccountService
    }
}