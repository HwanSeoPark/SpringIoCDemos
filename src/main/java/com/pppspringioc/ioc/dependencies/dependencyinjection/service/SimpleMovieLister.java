package com.pppspringioc.ioc.dependencies.dependencyinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class SimpleMovieLister {

    private MovieFinder movieFinder;
    
    public SimpleMovieLister() {
        
    }

    // Constructor-based Dependency Injection
    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
    
    // Setter method for DI
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void listMovies() {
        System.out.println(movieFinder.findMovies());
    }
}