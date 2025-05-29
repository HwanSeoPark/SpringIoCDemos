package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pppspringioc.ioc.classpathscanningandmanagedcomponents.qualifier.Online;
import com.pppspringioc.ioc.classpathscanningandmanagedcomponents.repository.MovieRepository;

@Service
//@Online
public class QualifierMovieService {

    @Autowired
    private MovieRepository movieRepository;

    public void printMovies() {
        System.out.println("Online Movies: " + movieRepository.findMovies());
    }
}
