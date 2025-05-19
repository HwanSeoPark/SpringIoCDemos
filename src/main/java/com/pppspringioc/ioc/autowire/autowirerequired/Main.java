package com.pppspringioc.ioc.autowire.autowirerequired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

        SimpleMovieLister movieLister = context.getBean(SimpleMovieLister.class);
        movieLister.listMovies();
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        
        // MovieRecommender 빈을 가져와서 메서드 호출
        MovieRecommender recommender = context.getBean(MovieRecommender.class);
        recommender.recommendMovies();
        
        MovieRecommenderWithoutAutowire recommender2 = context.getBean(MovieRecommenderWithoutAutowire.class);
        recommender2.recommendMovies();

	}

}
