package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.service;

import org.springframework.stereotype.Service;

import com.pppspringioc.ioc.classpathscanningandmanagedcomponents.repository.MovieRepository;

import java.util.List;

@Service // Component를 기반으로하는 스테레오 어노테이션
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public void listMovies() {
        List movies = repository.findMovies();
        System.out.println("Movies: " + movies);
    }
}
