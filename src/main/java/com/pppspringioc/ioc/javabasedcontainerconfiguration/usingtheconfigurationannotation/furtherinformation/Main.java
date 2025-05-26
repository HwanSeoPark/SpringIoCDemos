package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.config.*;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.client.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("▶▶▶ With Proxy (default)");
		var ctx1 = new AnnotationConfigApplicationContext(AppConfigWithProxy.class);
		ClientService s1a = ctx1.getBean("clientService1", ClientService.class);
		ClientService s1b = ctx1.getBean("clientService2", ClientService.class);
		s1a.process();
		s1b.process();
		ctx1.close();

		System.out.println("\n▶▶▶ Without Proxy (proxyBeanMethods = false)");
		var ctx2 = new AnnotationConfigApplicationContext(AppConfigWithoutProxy.class);
		ClientService s2a = ctx2.getBean("clientService1", ClientService.class);
		ClientService s2b = ctx2.getBean("clientService2", ClientService.class);
		s2a.process();
		s2b.process();
		ctx2.close();

		System.out.println("\n▶▶▶ @Component 방식");
		var ctx3 = new AnnotationConfigApplicationContext("com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.config");
		ClientService s3a = ctx3.getBean("clientService3", ClientService.class);
		ClientService s3b = ctx3.getBean("clientService4", ClientService.class);
		s3a.process();
		s3b.process();
		ctx3.close();
	}
}
