package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.config;


import org.springframework.context.annotation.*;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.service.PersonService;



@Configuration
@ComponentScan(basePackages = "com.pppspringioc.listener")
@EnableAsync
public class AppConfig {

    @Bean
    public PersonService personService() {
        return new PersonService();
    }

    @Bean(name = "applicationEventMulticaster")
    public SimpleApplicationEventMulticaster asyncEventMulticaster(TaskExecutor taskExecutor) {
        SimpleApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster();
        multicaster.setTaskExecutor(taskExecutor);
        multicaster.setErrorHandler(e -> System.err.println("❌ [Event Error] " + e.getMessage()));
        return multicaster;
    }

    @Bean
    public TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor exec = new ThreadPoolTaskExecutor();
        exec.setCorePoolSize(3);
        exec.setMaxPoolSize(5);
        exec.setThreadNamePrefix("async-exec-");
        exec.initialize();
        return exec;
    }
}
