package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired")
public class AppConfig {
    // 필요한 경우 @Bean 메서드 선언 가능
	// ...
}
