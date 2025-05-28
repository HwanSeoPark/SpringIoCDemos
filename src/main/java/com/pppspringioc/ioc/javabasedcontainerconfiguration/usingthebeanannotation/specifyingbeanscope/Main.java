package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.config.AppConfig;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope.EncryptorManagerLookup;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope.EncryptorManagerProvider;

public class Main {
	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// prototype빈을 @Lookup과 Provider을 통해 생성하는 법
		
		System.out.println("=== @Lookup 사용 ===");
		var m1 = ctx.getBean(EncryptorManagerLookup.class);
		m1.process("Hello");
		m1.process("World");

		System.out.println("=== ObjectProvider 사용 ===");
		var m2 = ctx.getBean(EncryptorManagerProvider.class);
		m2.process("Hello");
		m2.process("World");

		ctx.close();
	}
}