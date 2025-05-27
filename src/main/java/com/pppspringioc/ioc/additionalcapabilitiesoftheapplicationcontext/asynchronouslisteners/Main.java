package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.service.PersonService;
import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService service = ctx.getBean(PersonService.class);

        service.createPerson("Alice");
        service.createPerson("Bob");

        // 비동기 출력이 완료될 때까지 잠깐 대기
        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        ctx.close();
    }
}
