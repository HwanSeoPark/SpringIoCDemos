package com.pppspringioc.ioc.javabasedcontainerconfiguration.enablingcomponentscanning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.enablingcomponentscanning.service.MyService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext();
		
		// com.intheeast.ioc.javabasedcontainerconfiguration.enablingcomponentscanning 
		// 하위의 모든 @Component 스캔
		ctx.scan("com.intheeast.ioc.javabasedcontainerconfiguration.enablingcomponentscanning");
		ctx.refresh();          // 컨테이너 초기화

		MyService myService = ctx.getBean(MyService.class);
		myService.doStuff();
	}
}