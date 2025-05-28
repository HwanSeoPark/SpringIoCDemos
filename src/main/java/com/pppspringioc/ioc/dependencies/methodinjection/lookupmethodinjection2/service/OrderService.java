package com.pppspringioc.ioc.dependencies.methodinjection.lookupmethodinjection2.service;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

// 스테레오 타입 어노테이션은 "이 클래스가 서비스 계층의 클래스인데",
// 스프링 컨테이너에 빈으로 등록되었음한다라는 의미!
@Service // 이 경우에는 @Component 타입으로 빈을 등록해야 함.
public class OrderService {

	// 이 클래스가 Invoice라는 의존성을 가지지 않네...
    // private Invoice invoice;
	
	// 외부에서 processOrder를 호출하는데...
	public void processOrder(String orderId, double amount) {
        Invoice invoice = createInvoice();
        invoice.generate(orderId, amount);
        invoice.printInvoice();
    }

    @Lookup
    protected Invoice createInvoice() {
        return null; // 런타임에 오버라이딩됨
    }
}