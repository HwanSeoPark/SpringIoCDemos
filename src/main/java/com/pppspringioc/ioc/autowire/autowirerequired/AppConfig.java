package com.pppspringioc.ioc.autowire.autowirerequired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "com.intheeast.ioc.autowire.autowirerequired")
public class AppConfig {
	// MovieFinder 빈을 정의하지 않으면 SimpleMovieLister는 이를 생략하고 동작
    // 주석 처리된 부분을 해제하면 빈이 주입됨

     @Bean
     public MovieFinder movieFinder() {
         return new DefaultMovieFinder();
     }
}