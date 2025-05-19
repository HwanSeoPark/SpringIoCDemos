package com.pppspringioc.ioc.autowire.autowirerequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    @Autowired(required = false)  
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void listMovies() {
        if (movieFinder != null) {
            movieFinder.findMovies();
        } else {
            System.out.println("No MovieFinder available.");
        }
    }
}