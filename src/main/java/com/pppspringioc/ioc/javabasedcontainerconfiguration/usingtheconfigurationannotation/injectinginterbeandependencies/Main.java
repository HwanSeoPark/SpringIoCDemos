package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.injectinginterbeandependencies;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.injectinginterbeandependencies.config.AppConfig;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.injectinginterbeandependencies.model.BeanOne;
;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);
		
		BeanOne beanOne = (BeanOne) context.getBean("beanOne");
		System.out.println(beanOne.getBeanTwo());
		
		context.close();
	}

}
