package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.domain.*;

import javax.sql.DataSource;

@Configuration
public class RepositoryConfig {

	// SimpleDriverDataSource가 주입될 것임.
//	@Autowired
//	private DataSource dataSource;
	
	// 이렇게 쓰는게 바람직하다
	@Bean
	public AccountRepository accountRepository(DataSource dataSource) {
		return new JdbcAccountRepository(dataSource);
	}
}
