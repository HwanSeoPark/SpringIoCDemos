package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.config;


import org.springframework.context.annotation.*;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.client.*;

@Configuration(proxyBeanMethods = false)
public class AppConfigWithoutProxy {
	// proxyBeanMethods = false라 스프링 IoC 컨테이너가 개입을 안함
	
	@Bean
	public ClientDao clientDao() {
		return new ClientDaoImpl();
	}

	@Bean
	public ClientService clientService1() {
		ClientServiceImpl service = new ClientServiceImpl();
		service.setClientDao(clientDao());  // 일반 호출 → 매번 새 인스턴스 가능성 있음
		return service;
	}
	// 이때 생성되는 것은 Bean이 아닌 인스턴스다
	
	@Bean
	public ClientService clientService2() {
		ClientServiceImpl service = new ClientServiceImpl();
		service.setClientDao(clientDao());
		return service;
	}
}
