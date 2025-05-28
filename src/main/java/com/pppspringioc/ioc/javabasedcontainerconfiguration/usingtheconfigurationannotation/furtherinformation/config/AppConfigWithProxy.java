package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.config;

import org.springframework.context.annotation.*;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.client.*;

@Configuration  // default: proxyBeanMethods = true
public class AppConfigWithProxy {

	@Bean
	public ClientDao clientDao() {
		return new ClientDaoImpl();
	}

	@Bean
	public ClientService clientService1() {
		ClientServiceImpl service = new ClientServiceImpl();
		service.setClientDao(clientDao());  // 프록시 통해 싱글톤 유지
		return service;
	}

	@Bean
	public ClientService clientService2() {
		ClientServiceImpl service = new ClientServiceImpl();
		service.setClientDao(clientDao());  // 프록시 통해 싱글톤 유지
		return service;
	}
}
