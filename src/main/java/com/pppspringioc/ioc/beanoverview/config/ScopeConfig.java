package com.pppspringioc.ioc.beanoverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pppspringioc.ioc.beanoverview.examples.PrototypeBean;

@Configuration
public class ScopeConfig {

    @Bean
    @Scope("prototype") // 프로토타입 스코프
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }
}