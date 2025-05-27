package com.pppspringioc.ioc.componentconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.componentconfig.config.AppConfig;
import com.pppspringioc.ioc.componentconfig.config.FactoryMethodComponent;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class, FactoryMethodComponent.class);

		
		context.close();
	
	}

}
