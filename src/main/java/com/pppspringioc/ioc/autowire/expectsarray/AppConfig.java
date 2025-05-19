package com.pppspringioc.ioc.autowire.expectsarray;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MovieCatalog actionMovieCatalog() {
        return new ActionMovieCatalog();
    }

    @Bean
    public MovieCatalog comedyMovieCatalog() {
        return new ComedyMovieCatalog();
    }

    @Bean
    public MovieRecommender movieRecommender() {
        return new MovieRecommender();
    }
}