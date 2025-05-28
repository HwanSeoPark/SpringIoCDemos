package com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example1.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example1.model.DataSource;
import com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example1.postprocessor.DataSourcePostProcessor;

@Configuration
public class AppConfig {

	@Bean
    public static DataSourcePostProcessor dataSourcePostProcessor() {
        return new DataSourcePostProcessor();
    }

    @Bean
    public DataSource dataSource() {
    	// 초기값 (나중에 BeanFactoryPostProcessor가 덮어씀)
        DataSource ds = new DataSource();
        ds.setDriverClassName("original.Driver");
        ds.setUrl("original:url");
        ds.setUsername("original_user");
        return ds;
    }
}