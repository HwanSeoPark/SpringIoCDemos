package com.pppspringioc.ioc.beanoverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.pppspringioc.ioc.beanoverview.examples.ExpensiveBean;

@Configuration
public class LazyInitConfig {

    @Bean
    @Lazy // Lazy 초기화 설정
    public ExpensiveBean expensiveBean() {
        return new ExpensiveBean();
    }
}