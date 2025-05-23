package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.resourceinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.resourceinjection.config.AppConfig;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.resourceinjection.domain.CustomerPreferenceDao;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.resourceinjection.service.MovieRecommender;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.resourceinjection.service.SimpleMovieLister;

public class Main {
    public static void main(String[] args) {
        // 자바 기반 설정으로 스프링 컨텍스트 생성
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        // 0) CustomerPreferenceDao 사용 예시
        CustomerPreferenceDao dao = 
        		(CustomerPreferenceDao) context.getBean("CustomerPreferenceDao2");
        
        
        // 1) SimpleMovieLister 사용 예시
        SimpleMovieLister lister = context.getBean(SimpleMovieLister.class);
        lister.listMovies();

        // 2) MovieRecommender 사용 예시
        MovieRecommender recommender = context.getBean(MovieRecommender.class);
        recommender.recommendMovie();

        context.close();
    }
}
