package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.generics.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.generics.domain.Store;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.generics.domain.StringStore;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.generics.domain.IntegerStore;

@Configuration
@ComponentScan(basePackages = "com.pppspringioc.ioc.annotationbasedcontainerconfiguration.generics")
public class AppConfig {
	
	@Bean
    public StringStore stringStore() {
        return new StringStore();
    }

    @Bean
    public IntegerStore integerStore() {
        return new IntegerStore();
    }

}
