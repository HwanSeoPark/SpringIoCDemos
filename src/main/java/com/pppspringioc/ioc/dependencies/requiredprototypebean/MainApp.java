package com.pppspringioc.ioc.dependencies.requiredprototypebean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.dependencies.requiredprototypebean.config.ConfigApp;
import com.pppspringioc.ioc.dependencies.requiredprototypebean.service.SingletonBean;

public class MainApp {

	public static void main(String... args) {
		
		AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(ConfigApp.class);
		
		SingletonBean single = (SingletonBean) context.getBean(SingletonBean.class);
		single.doExcute();
		single.doExcute();
		single.doExcute();
		
		context.close();
	}
}
