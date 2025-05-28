package com.pppspringioc.ioc.autowire.orderedbean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2) // 순서를 지정합니다. 낮을수록 우선순위가 높습니다.
public class ActionMovieCatalog implements MovieCatalog {

    @Override
    public String getCatalogName() {
        return "Action Movie Catalog";
    }

    @Override
    public void displayMovies() {
        System.out.println("Displaying action movies.");
    }
}

