package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.receivinglifecyclecallbacks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.receivinglifecyclecallbacks.config.AppConfig;

public class Main {
	public static void main(String[] args) {
		System.out.println("🔵 컨텍스트 초기화 시작");
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("🟢 컨텍스트 초기화 완료");

		ctx.close();  // destroy() 및 customDestroy() 호출
		System.out.println("🔴 컨텍스트 종료");
	}
}