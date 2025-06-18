package com.pppspringioc.ioc.dependencies.methodinjection.lookupmethodinjection2.config;

import org.springframework.context.annotation.*;

import com.pppspringioc.ioc.dependencies.methodinjection.lookupmethodinjection2.service.Invoice;
import com.pppspringioc.ioc.dependencies.methodinjection.lookupmethodinjection2.service.OrderService;

@Configuration
@ComponentScan(basePackages= {"com.pppspringioc.ioc.dependencies.methodinjection.lookupmethodinjection2"})
public class AppConfig {

    @Bean
    @Scope("prototype")
    public Invoice invoice() {
        return new Invoice();
    }
}