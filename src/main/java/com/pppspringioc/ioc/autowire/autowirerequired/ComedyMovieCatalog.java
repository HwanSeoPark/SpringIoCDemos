package com.pppspringioc.ioc.autowire.autowirerequired;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1) // 가장 높은 우선순위 (1)
@Primary // 디폴트 빈으로 설정
public class ComedyMovieCatalog implements MovieCatalog {

    @Override
    public String getCatalogName() {
        return "Comedy Movie Catalog";
    }

    @Override
    public void displayMovies() {
        System.out.println("Displaying comedy movies.");
    }
}