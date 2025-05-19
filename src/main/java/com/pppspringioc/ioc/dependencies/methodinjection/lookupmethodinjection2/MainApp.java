package com.pppspringioc.ioc.dependencies.methodinjection.lookupmethodinjection2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.dependencies.methodinjection.lookupmethodinjection2.config.AppConfig;
import com.pppspringioc.ioc.dependencies.methodinjection.lookupmethodinjection2.service.OrderService;

public class MainApp {
	
	
	public static void main(String[] args) {
     
		// Spring 애플리케이션 컨텍스트 생성 및 설정 클래스 로드
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);

        
        OrderService orderService = context.getBean(OrderService.class);

        // 누군가가 세번의 주문을 한 상태임.
        orderService.processOrder("ORDER-1001", 150_000);
        orderService.processOrder("ORDER-1002", 275_000);
        orderService.processOrder("ORDER-1003", 89_900);
        context.close();
    }


}