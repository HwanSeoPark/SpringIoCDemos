package com.pppspringioc.ioc.usingjsr330.provider;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.usingjsr330.provider.config.AppConfig;
import com.pppspringioc.ioc.usingjsr330.provider.service.SimpleMovieLister;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);
		
		SimpleMovieLister simpleMovieLister = 
				context.getBean(SimpleMovieLister.class);
		
		String str1 = simpleMovieLister.listMovies();
		String str2 = simpleMovieLister.listMovies();
		String str3 = simpleMovieLister.listMovies();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
