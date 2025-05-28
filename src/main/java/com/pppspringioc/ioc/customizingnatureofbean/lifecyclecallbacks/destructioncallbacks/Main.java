package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.destructioncallbacks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.destructioncallbacks.config.AppConfig;

public class Main {
	
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // 빈들이 초기화된 상태에서 메인 로직 실행
        System.out.println("Application is running...");

        // 컨텍스트 종료
        context.close(); // 모든 destroy 콜백 메서드가 실행됨
    }

}
