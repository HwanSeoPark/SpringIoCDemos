package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.value.domain;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MapBasedRecommender {

    /**
     * SpEL을 이용해서 간단한 Map 리터럴 주입
     * 예: {'Thriller':100, 'Comedy':300}
     */
    @Value("#{{'Thriller': 100, 'Comedy': 300}}")
    private Map<String, Integer> countOfMoviesPerCatalog;

    public MapBasedRecommender() {
    }

    public void printMapInfo() {
        System.out.println("[MapBasedRecommender] countOfMoviesPerCatalog = " + countOfMoviesPerCatalog);
    }
}
