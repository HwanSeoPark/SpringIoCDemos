package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.startupndshutdowncallbacks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.startupndshutdowncallbacks.config.AppConfig;

public class Main {
	
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Application is running...");
        
        // context.start() 메서드를 호출하지 않으면,
        // Lifecycle를 구현한 빈의 start 메서드가 호출되지 않음!
        context.start();
        
        // 컨텍스트를 종료하여 정지(stop) 콜백을 실행
        context.close();
    }

}
