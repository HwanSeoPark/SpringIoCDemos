package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.repository;

import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.classpathscanningandmanagedcomponents.domain.Movie;

import java.util.List;

@Component
public class ComedyMovieRepository implements MovieRepository {
    @Override
    public List<Movie> findMovies() {
        return List.of(new Movie("The Hangover", "Comedy"), new Movie("Superbad", "Comedy"));
    }
}
