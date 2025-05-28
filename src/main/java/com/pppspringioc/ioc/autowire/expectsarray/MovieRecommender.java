package com.pppspringioc.ioc.autowire.expectsarray;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieRecommender {

//    @Autowired
//    private MovieCatalog[] movieCatalogs;
    
    private Set<MovieCatalog> movieCatalogs;
    
    @Autowired
    public void setMovieCatalogs(Set<MovieCatalog> movieCatalogs) {
        this.movieCatalogs = movieCatalogs;
    }


    public void recommendMovies() {
        for (MovieCatalog catalog : movieCatalogs) {
            System.out.println("Recommending from: " + catalog.getCatalogName());
            catalog.displayMovies();
        }
    }
}