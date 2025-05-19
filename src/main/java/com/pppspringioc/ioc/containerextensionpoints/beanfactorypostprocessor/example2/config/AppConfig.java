package com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example2.config;

import org.springframework.beans.factory.config.PropertyOverrideConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example2.model.DataSource;

@Configuration
public class AppConfig {

    @Bean
    public static PropertyOverrideConfigurer propertyOverrideConfigurer() {
        PropertyOverrideConfigurer configurer = new PropertyOverrideConfigurer();
        configurer.setLocation(new org.springframework.core.io.ClassPathResource("override.properties"));
        return configurer;
    }

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setDriverClassName("org.h2.Driver"); // 기본값
        dataSource.setUrl("jdbc:h2:mem:testdb");       // 기본값
        dataSource.setUsername("default_user");        // 기본값
        return dataSource;
    }
}
