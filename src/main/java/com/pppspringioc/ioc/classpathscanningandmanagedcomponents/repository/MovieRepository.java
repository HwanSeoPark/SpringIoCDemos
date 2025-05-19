package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.repository;


import java.util.List;

import com.pppspringioc.ioc.classpathscanningandmanagedcomponents.domain.Movie;

public interface MovieRepository {
    List<Movie> findMovies();
}
