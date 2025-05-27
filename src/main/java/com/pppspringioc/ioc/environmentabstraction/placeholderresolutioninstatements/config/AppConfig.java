package com.pppspringioc.ioc.environmentabstraction.placeholderresolutioninstatements.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import com.pppspringioc.ioc.environmentabstraction.placeholderresolutioninstatements.domain.ConfigClass;

@Configuration
@PropertySource("classpath:application.properties")
// 위의 어노테이션을 쓰면 PropertySourcesPlaceholderConfigurer안쓰고 @Value사용 할 수 있다
public class AppConfig {

    @Value("${customer}")
    private String customer;

    @Bean
    public ConfigClass config(Environment environment) {
        // customer = "acme" 라면 다음처럼 경로 구성
        String resourcePath = "com/bank/service/" + customer + "-config.xml";
        return new ConfigClass(resourcePath);
    }
}
