package com.pppspringioc.ioc.autowire.orderedbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

        // MovieRecommender 빈을 가져와서 메서드 호출
        MovieRecommender recommender = context.getBean(MovieRecommender.class);
        recommender.recommendMovies();

	}

}
