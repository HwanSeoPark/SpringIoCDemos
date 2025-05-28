package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback.config.AppConfig;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback.component.MovieRecommender;

public class MainApp {
	
	public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var recommender = context.getBean(MovieRecommender.class);
        recommender.printCatalogs();
    }

}