package com.pppspringioc.ioc.environmentabstraction.placeholderresolutioninstatements.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

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

    // @PropertySource를 사용했기 때문에 아래처럼 작성안해도 된다
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
//        // 절대 경로=C:\development\Workspace\codes\spring_legacy\SpringIoCDemos\src\main\resources\example.properties
//        // The default class loader will be used for loading the resource.
//        configurer.setLocation(new ClassPathResource("example.properties"));
//        return configurer;
//    }    

}
