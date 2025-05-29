package com.pppspringioc.ioc.beanfactoryapi.defaultbeanfactroy;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class Main {

	public static void main(String[] args) {
		
		AppConfig config = new AppConfig();
		DefaultListableBeanFactory factory =
				config.createBeanFactory();
		
		Printer print =
				factory.getBean(Printer.class);
		
		print.print("Printer Class");
		
		HelloService hello = 
				(HelloService) factory.getBean("helloservice");

		hello.sayHello();
		
		return;
	}

}
