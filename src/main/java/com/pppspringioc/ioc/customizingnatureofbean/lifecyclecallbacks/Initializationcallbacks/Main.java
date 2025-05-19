package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.Initializationcallbacks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.Initializationcallbacks.config.AppConfig;

public class Main {
	
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // ExampleBean 및 AnotherExampleBean이 초기화 메시지를 출력합니다.
        context.close(); // 컨텍스트 종료 시 리소스 정리
    }

}
