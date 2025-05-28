package com.pppspringioc.ioc.usingjsr330.namedclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.usingjsr330.namedclass.config.AppConfig;
import com.pppspringioc.ioc.usingjsr330.namedclass.service.SimpleMovieLister;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);
		
		SimpleMovieLister simpleMovieLister = 
				context.getBean(SimpleMovieLister.class);
		
		simpleMovieLister.listMovies();
		
	}

}
