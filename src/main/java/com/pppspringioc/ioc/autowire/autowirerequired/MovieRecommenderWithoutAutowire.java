package com.pppspringioc.ioc.autowire.autowirerequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MovieRecommenderWithoutAutowire {

    private final MovieCatalog actionMovieCatalog;
    private final MovieCatalog comedyMovieCatalog;
    private final MovieCatalog dramaMovieCatalog;


//    public MovieRecommenderWithoutAutowire() {
//    	this.actionMovieCatalog = null;
//        this.comedyMovieCatalog = null;
//        this.dramaMovieCatalog = null;
//        System.out.println("Default constructor called");
//    }
    
    // 세 개의 생성자가 선언됨, 하지만 어노테이션 없음
//    public MovieRecommenderWithoutAutowire(MovieCatalog actionMovieCatalog) {
//        this.actionMovieCatalog = actionMovieCatalog;
//        this.comedyMovieCatalog = null;
//        this.dramaMovieCatalog = null;
//        System.out.println("Single parameter constructor called");
//    }

    
//    public MovieRecommenderWithoutAutowire(MovieCatalog actionMovieCatalog, 
//    		MovieCatalog comedyMovieCatalog) {
//        this.actionMovieCatalog = actionMovieCatalog;
//        this.comedyMovieCatalog = comedyMovieCatalog;
//        this.dramaMovieCatalog = null;
//        System.out.println("Two parameter constructor called");
//    }
    
    // 주 생성자로 사용될 생성자
    public MovieRecommenderWithoutAutowire(MovieCatalog actionMovieCatalog, 
    		MovieCatalog comedyMovieCatalog,
    		MovieCatalog dramaMovieCatalog) {
        this.actionMovieCatalog = actionMovieCatalog;
        this.comedyMovieCatalog = comedyMovieCatalog;
        this.dramaMovieCatalog = dramaMovieCatalog;
        System.out.println("Tree parameter constructor called");
    }

    public void recommendMovies() {
        if (actionMovieCatalog != null) {
            System.out.println("Recommending from: " + actionMovieCatalog.getCatalogName());
            actionMovieCatalog.displayMovies();
        }

        if (comedyMovieCatalog != null) {
            System.out.println("Recommending from: " + comedyMovieCatalog.getCatalogName());
            comedyMovieCatalog.displayMovies();
        }
        
        if (dramaMovieCatalog != null) {
            System.out.println("Recommending from: " + dramaMovieCatalog.getCatalogName());
            dramaMovieCatalog.displayMovies();
        }
    }
}
