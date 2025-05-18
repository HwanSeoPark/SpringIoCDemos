package com.pppspringioc.ioc.dependencies.dependencyinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.dependencies.dependencyinjection.service.MovieFinder;
import com.pppspringioc.ioc.dependencies.dependencyinjection.service.SimpleMovieFinder;
import com.pppspringioc.ioc.dependencies.dependencyinjection.service.SimpleMovieLister;


@Configuration
@ComponentScan({"com.intheeast.ioc.dependencies.dependencyinjection"})
public class AppConfig {

    // Define MovieFinder bean
    @Bean
    public MovieFinder movieFinder() {
        return new SimpleMovieFinder();
    }

    // Define SimpleMovieLister bean
    @Bean
    public SimpleMovieLister movieLister(MovieFinder movieFinder) {
    	SimpleMovieLister movieLister = new SimpleMovieLister();
        movieLister.setMovieFinder(movieFinder); // Setter-based DI
        return movieLister;
        
        //return new SimpleMovieLister(movieFinder);
    }
}