package com.pppspringioc.ioc.autowire.orderedbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieRecommender {

    private final List<MovieCatalog> movieCatalogs;
    
    private final MovieCatalog defaultCatalog; // 디폴트 빈으로 주입

    @Autowired
    public MovieRecommender(List<MovieCatalog> movieCatalogs, MovieCatalog defaultCatalog) {
        this.movieCatalogs = movieCatalogs;
        this.defaultCatalog = defaultCatalog;
    }

    public void recommendMovies() {
    	
    	System.out.println("Default recommendation from: " + defaultCatalog.getCatalogName());
        defaultCatalog.displayMovies();
        
        System.out.println("\nRecommending from all catalogs:");
        for (MovieCatalog catalog : movieCatalogs) {
            System.out.println("Recommending from: " + catalog.getCatalogName());
            catalog.displayMovies();
        }
    }
}