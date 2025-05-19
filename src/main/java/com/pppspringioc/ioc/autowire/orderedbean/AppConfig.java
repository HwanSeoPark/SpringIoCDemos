package com.pppspringioc.ioc.autowire.orderedbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "com.intheeast.ioc.autowire.orderedbean")
public class AppConfig {

//    @Bean
////    @Primary
////    @Order(1) // @Bean 메서드 레벨에서 순서 지정
//    public MovieCatalog comedyMovieCatalog() {
//        return new ComedyMovieCatalog();
//    }
//
//    @Bean
////    @Order(2)
//    public MovieCatalog actionMovieCatalog() {
//        return new ActionMovieCatalog();
//    }
//
//    @Bean
////    @Order(3)
//    public MovieCatalog dramaMovieCatalog() {
//        return new DramaMovieCatalog();
//    }
}