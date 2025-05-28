package com.pppspringioc.ioc.environmentabstraction.placeholderresolutioninstatements;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.environmentabstraction.placeholderresolutioninstatements.config.AppConfig;
import com.pppspringioc.ioc.environmentabstraction.placeholderresolutioninstatements.domain.ConfigClass;

public class Main {
	
	public static void main(String[] args) {
        // 시스템 프로퍼티 방식도 가능: System.setProperty("customer", "acme");

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        ConfigClass config = ctx.getBean(ConfigClass.class);
        System.out.println("✔ 경로 확인: " + config.getResourcePath());

        ctx.close();
    }

}
