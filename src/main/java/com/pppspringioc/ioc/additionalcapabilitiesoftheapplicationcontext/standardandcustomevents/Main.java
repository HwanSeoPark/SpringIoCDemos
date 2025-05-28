package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.config.AppConfig;
import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.service.EmailService;

public class Main {
	
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        EmailService emailService = context.getBean(EmailService.class);

        // 테스트 이메일 전송
        emailService.sendEmail("spam@example.com", "You won a million dollars!");
        emailService.sendEmail("normal.user@example.com", "Welcome!");

        context.close();
    }

}
