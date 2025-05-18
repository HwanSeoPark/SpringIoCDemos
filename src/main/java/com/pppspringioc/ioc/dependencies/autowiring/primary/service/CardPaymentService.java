package com.pppspringioc.ioc.dependencies.autowiring.primary.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pppspringioc.ioc.dependencies.autowiring.PaymentService;

//이 어노테이션의 value 엘리먼트는 이 구성 메타데이터로 생성될 빈의 이름을 지정하는 역할
// 디폴트 이름 : 클래스 이름(첫 알파벳은 소문자)
@Component("cardPaymentService") // Bean 이름 지정
public class CardPaymentService implements PaymentService {
    @Override
    public void pay(int amount) {
        System.out.println("💳 Card payment of " + amount + " processed.");
    }
}