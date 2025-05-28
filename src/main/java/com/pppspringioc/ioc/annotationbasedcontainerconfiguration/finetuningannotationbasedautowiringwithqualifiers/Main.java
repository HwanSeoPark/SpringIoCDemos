package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.config.AppConfig;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.service.MovieRecommender;

public class Main {
    public static void main(String[] args) {
        // 자바 기반 설정을 사용하는 ApplicationContext 생성
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        // MovieRecommender 빈을 가져와서 내부 데이터 확인
        MovieRecommender recommender = context.getBean(MovieRecommender.class);
        recommender.printAll();

        context.close();
    }
}
