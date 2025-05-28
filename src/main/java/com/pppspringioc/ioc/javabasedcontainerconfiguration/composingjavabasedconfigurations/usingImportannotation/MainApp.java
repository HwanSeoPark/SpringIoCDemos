package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingImportannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingImportannotation.beans.*;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingImportannotation.config.AppConfig;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingImportannotation.imports.*;


public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

		// @Bean으로 등록된 구성 클래스의 빈
		BeanA a = (BeanA) context.getBean("beanA");
		BeanB b = (BeanB) context.getBean("beanB");

		System.out.println("🔍 A 빈 = " + a);
		System.out.println("🔍 B 빈 = " + b);

		// @Import를 통해 등록된 컴포넌트 클래스의 빈
		MyService service = context.getBean(MyService.class);
		MyRepository repository = context.getBean(MyRepository.class);

		service.performService();
		repository.performRepositoryAction();
	}

}
