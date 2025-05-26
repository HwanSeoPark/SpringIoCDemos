package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.declaringbean.config;

import org.springframework.context.annotation.Bean;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.declaringbean.service.*;

public interface BaseConfig {
	// Interface의 default 메서드에는 @Bean 사용가능
	// 둘중 한가지 경우만 사용해야함 
	
	// 서비스 인터페이스로 타입을 일관되게 참조할 때는 @Bean 리턴 타입으로 인터페이스를 선언하는 것이 안전
	// 결국 이 메서드는 TransferService의 구현체만 쓰고싶을때 사용
//	@Bean
//	default TransferService transferService() {
//		return new TransferServiceImpl();
//	}
	
	// 여러 인터페이스를 구현하거나, 구체 타입으로 직접 주입받는 상황이 있는 경우에는
	// @Bean 리턴 타입으로 구체 타입을 명시하는 것이 더 안전
	@Bean
	default TransferServiceImpl transferService() {
		return new TransferServiceImpl();
	}
}