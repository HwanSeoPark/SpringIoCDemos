package com.pppspringioc.ioc.autowire.autowirerequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Map;

@Service
public class MovieRecommender {

    private Map<String, MovieCatalog> movieCatalogs;

    @Autowired
    public void setMovieCatalogs(Map<String, MovieCatalog> movieCatalogs) {
        this.movieCatalogs = movieCatalogs;
    }

    public void recommendMovies() {
        for (Map.Entry<String, MovieCatalog> entry : movieCatalogs.entrySet()) {
            System.out.println("Recommending from: " + entry.getKey());  // 빈 이름 출력
            entry.getValue().displayMovies();  // MovieCatalog 빈의 메서드 호출
        }
    }
}