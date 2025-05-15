package com.pppspringioc.ioc.dependencies.lazy.config;

import javax.sql.DataSource;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
//import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.pppspringioc.ioc.dependencies.lazy.model.AnotherBean;
import com.pppspringioc.ioc.dependencies.lazy.model.ExpensiveToCreateBean;


@Configuration
public class AppConfig {

//	@Bean
//	public DataSource dataSource() {
//		
//		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
//		
//		dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
//		dataSource.setUrl("jdbc:mysql://localhost:3306/testdb?characterEncoding=UTF-8");
//		dataSource.setUsername("root");
//		dataSource.setPassword("1234");
//
//		return dataSource;
//	}
	
	
    @Bean
    @Lazy
    public ExpensiveToCreateBean lazyBean() {
        return new ExpensiveToCreateBean();
    }

    @Bean
    public AnotherBean notLazyBean() {
        return new AnotherBean();
    }
}