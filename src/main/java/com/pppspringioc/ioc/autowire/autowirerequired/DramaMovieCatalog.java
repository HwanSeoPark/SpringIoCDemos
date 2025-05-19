package com.pppspringioc.ioc.autowire.autowirerequired;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3) // 우선순위가 가장 낮음 (3)
public class DramaMovieCatalog implements MovieCatalog {

    @Override
    public String getCatalogName() {
        return "Drama Movie Catalog";
    }

    @Override
    public void displayMovies() {
        System.out.println("Displaying drama movies.");
    }
}