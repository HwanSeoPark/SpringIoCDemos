package com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles.service.EmailNotificationService;
import com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles.service.NotificationService;
import com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles.service.NotificationServiceStub;
import com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles.service.SlackNotificationService;

@Configuration
@ComponentScan(basePackages = "com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles")
public class AppConfig {
    
	@Bean
    @Profile({"dev", "default"}) // <- dev 또는(OR) default
    public NotificationService stubNotificationService() {
        return new NotificationServiceStub();
    }

    @Bean
    @Profile("prod")
    @Primary // 다중 알림 서비스가 있을 때 우선순위 지정
    public NotificationService emailNotificationService() {
        return new EmailNotificationService();
    }

    @Bean
    @Profile("prod")
    public NotificationService slackNotificationService() {
        return new SlackNotificationService();
    }
}
