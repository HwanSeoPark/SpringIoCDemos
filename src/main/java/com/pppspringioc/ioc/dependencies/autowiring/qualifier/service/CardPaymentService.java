package com.pppspringioc.ioc.dependencies.autowiring.qualifier.service;

import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.dependencies.autowiring.PaymentService;

@Component("cardPaymentService")  // Bean 이름 지정 (명시적 이름)
public class CardPaymentService implements PaymentService {
    @Override
    public void pay(int amount) {
        System.out.println("💳 Card payment of " + amount + " processed.");
    }
}