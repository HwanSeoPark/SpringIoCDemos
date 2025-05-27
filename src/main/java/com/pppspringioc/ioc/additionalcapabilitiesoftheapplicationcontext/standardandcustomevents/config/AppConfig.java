package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.listener.BlockedListNotifier;
import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.service.EmailService;

import java.util.List;



@Configuration
public class AppConfig {

    @Bean
    public EmailService emailService() {
        EmailService service = new EmailService();
        service.setBlockedList(List.of(
                "spam@example.com",
                "hacker@example.com",
                "john.doe@example.com"
        ));
        return service;
    }

    @Bean
    public BlockedListNotifier blockedListNotifier() {
        BlockedListNotifier notifier = new BlockedListNotifier();
        notifier.setNotificationAddress("admin@yourcompany.com");
        return notifier;
    }

    // 비동기 이벤트 멀티캐스터 설정
    @Bean(name = "applicationEventMulticaster")
    public SimpleApplicationEventMulticaster asyncEventMulticaster() {
        SimpleApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster();
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(3);
        executor.setMaxPoolSize(5);
        executor.setQueueCapacity(10);
        executor.setThreadNamePrefix("event-exec-");
        executor.initialize();

        multicaster.setTaskExecutor(executor);
        multicaster.setErrorHandler(e -> System.err.println("❌ 이벤트 처리 중 오류 발생: " + e.getMessage()));
        return multicaster;
    }
}
