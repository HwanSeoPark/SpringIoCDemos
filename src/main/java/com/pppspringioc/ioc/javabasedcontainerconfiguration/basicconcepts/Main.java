package com.pppspringioc.ioc.javabasedcontainerconfiguration.basicconcepts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.basicconcepts.config.AppConfigNoProxy;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.basicconcepts.config.AppConfigProxy;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.basicconcepts.service.B;

public class Main {
	
	public static void main(String[] args) {
		// try resource 절
		System.out.println("▶▶▶ @Configuration (proxyBeanMethods = true) 테스트");
		try (AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfigProxy.class)) {
//			B b1 = ctx.getBean(B.class);
//			B b2 = ctx.getBean(B.class);
//			System.out.println("B1 == B2? " + (b1 == b2));
		}
//		▶▶▶ @Configuration (proxyBeanMethods = true) 테스트
//		Called a()
//		A 인스턴스 생성됨:A@2b662a77
//		Called b()
//		B 인스턴스 생성됨: 전달된 A = A@2b662a77
				
		System.out.println("\n▶▶▶ @Configuration (proxyBeanMethods = false) 테스트");
		try (AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfigNoProxy.class)) {
//			B b1 = ctx.getBean(B.class);
//			B b2 = ctx.getBean(B.class);
//			System.out.println("B1 == B2? " + (b1 == b2));
		}
		//▶▶▶ @Configuration (proxyBeanMethods = false) 테스트
//		Called a()
//		A 인스턴스 생성됨:A@17c1bced <<< 스프링 컨테이너가 호출한 A
//		Called b() <<< 이 때부터는 B메서드에서 호출한 A
//		Called a()
//		A 인스턴스 생성됨:A@4034c28c
//		B 인스턴스 생성됨: 전달된 A = A@4034c28c

	
	
	}

}
