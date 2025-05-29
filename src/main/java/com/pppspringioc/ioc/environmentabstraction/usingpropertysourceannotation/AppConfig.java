package com.pppspringioc.ioc.environmentabstraction.usingpropertysourceannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")
public class AppConfig {

	// * Profile
	// * Properties
	// * System properties : Os환경변수, JVM 실행 환경...
	// Spring IoC Container가 구현체를 초기화 때, 생성함
    @Autowired
    private Environment env;

    @Bean
    public TestBean testBean() {
        TestBean bean = new TestBean();
        bean.setName(env.getProperty("testbean.name"));
        return bean;
    }
}