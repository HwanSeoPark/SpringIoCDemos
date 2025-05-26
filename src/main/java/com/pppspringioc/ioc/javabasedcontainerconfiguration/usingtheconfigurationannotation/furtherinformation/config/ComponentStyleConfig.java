package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.client.*;

@Component
public class ComponentStyleConfig {

	@Bean
	public ClientDao clientDao() {
		return new ClientDaoImpl();
	}

	@Bean
	public ClientService clientService3() {
		ClientServiceImpl service = new ClientServiceImpl();
		service.setClientDao(clientDao());
		return service;
	}

	@Bean
	public ClientService clientService4() {
		ClientServiceImpl service = new ClientServiceImpl();
		service.setClientDao(clientDao());
		return service;
	}
}
