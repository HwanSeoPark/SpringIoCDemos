package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.combininglifecyclemechanisms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.combininglifecyclemechanisms.config.AppConfig;

public class Main {
	
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // 빈 사용
        System.out.println("Application is running...");

        // 컨텍스트 종료
        context.close(); // 모든 파괴 콜백이 실행됨
    }

}
