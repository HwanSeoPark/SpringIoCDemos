package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.lookupmethodinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.lookupmethodinjection.config.AppConfig;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.lookupmethodinjection.model.CommandManager;

public class Main {
	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		CommandManager manager = ctx.getBean(CommandManager.class);

		Object result1 = manager.process("첫 번째 요청");
		System.out.println(result1);

		Object result2 = manager.process("두 번째 요청");
		System.out.println(result2);

		ctx.close();
	}
}