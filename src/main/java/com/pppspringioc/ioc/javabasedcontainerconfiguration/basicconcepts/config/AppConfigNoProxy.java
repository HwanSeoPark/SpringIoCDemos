package com.pppspringioc.ioc.javabasedcontainerconfiguration.basicconcepts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.basicconcepts.service.A;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.basicconcepts.service.B;

@Configuration(proxyBeanMethods = false)  // "lite" 모드
public class AppConfigNoProxy {

	@Bean
	public A a() {
		System.out.println("Called a()");
		return new A();
	}

	@Bean
	public B b() {
		System.out.println("Called b()");
		return new B(a());  // a()는 일반 메서드 호출 → 매번 새로운 A 인스턴스 생성
		 // proxyBeanMethods = false이기 때문에
		 // 만들어진 a() Bean이 아닌 A의 메서드가 전달됨
	}
}