package com.pppspringioc.ioc.beanoverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicBeanConfig {

	@Bean
    public ExampleBean exampleBean() {
        return new ExampleBean(); // 디폴트 생성자를 사용하여 인스턴스 생성
    }
}

class ExampleBean {
    public ExampleBean() {
        System.out.println("ExampleBean created using default constructor.");
    }
}
