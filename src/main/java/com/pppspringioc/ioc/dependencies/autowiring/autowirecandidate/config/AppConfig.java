package com.pppspringioc.ioc.dependencies.autowiring.autowirecandidate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.dependencies.autowiring.PaymentService;
import com.pppspringioc.ioc.dependencies.autowiring.autowirecandidate.service.CardPaymentService;
import com.pppspringioc.ioc.dependencies.autowiring.autowirecandidate.service.CashPaymentService;

@Configuration
@ComponentScan(basePackages = {"com.intheeast.ioc.dependencies.autowiring.autowirecandidate"})
public class AppConfig {

    @Bean  // 기본 autowireCandidate = true
    public PaymentService cardPaymentService() {
        return new CardPaymentService();
    }

    @Bean(autowireCandidate = false)  // 타입 기반 autowiring 대상에서 제외됨
    public PaymentService cashPaymentService() {
        return new CashPaymentService();
    }
}