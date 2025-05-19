package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.defaultinitializationanddestroymethods;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.defaultinitializationanddestroymethods.config.AppConfig;
import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.defaultinitializationanddestroymethods.model.DefaultBlogService;

public class Main {
	
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // 빈 사용
        DefaultBlogService blogService = context.getBean(DefaultBlogService.class);
        System.out.println("Blog service is running...");

        // 컨텍스트 종료
        context.close(); // 모든 파괴 콜백이 실행됨
    }

}
