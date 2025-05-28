package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.resourceinjection.service;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.resourceinjection.domain.MovieFinder;

import jakarta.annotation.Resource;

public class SimpleMovieLister {

    private MovieFinder movieFinder;

    @Resource(name = "myMovieFinder")
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void listMovies() {
        System.out.println("[SimpleMovieLister] " + movieFinder.findMovieByTitle("Inception"));
    }
}
