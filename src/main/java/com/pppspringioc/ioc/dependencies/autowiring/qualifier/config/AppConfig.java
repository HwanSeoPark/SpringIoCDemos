package com.pppspringioc.ioc.dependencies.autowiring.qualifier.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.intheeast.ioc.dependencies.autowiring.qualifier")  // @Component 들을 스캔
public class AppConfig {
}