package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.generics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.generics.config.AppConfig;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.generics.service.StoreService;


public class Main {
    public static void main(String[] args) {

        // 스프링 컨텍스트 초기화 (Java Config)
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        // StoreService 가져오기
        StoreService storeService = context.getBean(StoreService.class);
        storeService.testStores();

        context.close();
    }
}
