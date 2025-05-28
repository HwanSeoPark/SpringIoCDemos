package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.finder.MovieFinder;

@Service
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    // Setter Injection
    @Autowired
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void listMovies() {
        System.out.println("[SimpleMovieLister] " + movieFinder.findAll());
    }
}