package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.value.config.AppConfig;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.value.domain.MapBasedRecommender;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.value.domain.MovieRecommender;

public class Main {
    public static void main(String[] args) {
        // 스프링 컨텍스트 생성 (자바 기반 설정)
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        // MovieRecommender Bean 가져오기
        MovieRecommender recommender = context.getBean(MovieRecommender.class);
        recommender.printInfo();

        // MapBasedRecommender Bean
        MapBasedRecommender mapRecommender = context.getBean(MapBasedRecommender.class);
        mapRecommender.printMapInfo();

        context.close();
    }
}
