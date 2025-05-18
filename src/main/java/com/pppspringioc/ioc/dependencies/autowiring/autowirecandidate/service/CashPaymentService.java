package com.pppspringioc.ioc.dependencies.autowiring.autowirecandidate.service;

import com.pppspringioc.ioc.dependencies.autowiring.PaymentService;

public class CashPaymentService implements PaymentService {
    @Override
    public void pay(int amount) {
        System.out.println("💵 Cash payment of " + amount + " processed.");
    }
}