package com.pppspringioc.ioc.dependencies.autowiring.autowirecandidate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.dependencies.autowiring.PaymentService;

@Component
public class PaymentManager {

    @Autowired  // byType 주입
    private PaymentService paymentService;

    public void process() {
        paymentService.pay(3000);
    }
}