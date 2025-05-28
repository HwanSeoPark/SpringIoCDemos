package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.shutdowngracefully.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.shutdowngracefully.model.ExampleService;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public ExampleService exampleService() {
        return new ExampleService();
    }
}
