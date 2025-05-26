package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.domain.*;

@Configuration
public class ServiceConfig {

	// JdbcAccountRepository가 주입될 것임
	@Autowired
	private AccountRepository accountRepository;  // RepositoryConfig에서 주입됨

	@Bean
	public TransferService transferService() {
		return new TransferServiceImpl(accountRepository);
	}
}
