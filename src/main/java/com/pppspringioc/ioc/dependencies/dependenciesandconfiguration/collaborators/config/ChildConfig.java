package com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.collaborators.config;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.collaborators.service.AccountService;


@Configuration
public class ChildConfig {

    @Bean
    // DependsOn이란 이 어노테이션이 적용된 팩토리 메서드가 호출되기 위해서는
    // 설결 조건으로 accountService라는 이름의 어노테이션이
    // 컨테이너 등록되어 있어야 함
    @DependsOn("accountService") // 부모 컨텍스트의 빈에 의존성을 명시
    public ProxyFactoryBean accountServiceProxy(AccountService accountService) {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(accountService); // 부모 컨텍스트의 빈을 참조
        return proxyFactoryBean;
    }
}