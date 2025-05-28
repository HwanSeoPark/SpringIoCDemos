package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.annotationbasedeventlisteners;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.annotationbasedeventlisteners.service.EmailService;

import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.annotationbasedeventlisteners.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        EmailService emailService = context.getBean(EmailService.class);

        emailService.sendEmail("spam@example.com", "광고 메일입니다.");
        emailService.sendEmail("user@example.com", "정상 메일입니다.");

        context.close();
    }
}
