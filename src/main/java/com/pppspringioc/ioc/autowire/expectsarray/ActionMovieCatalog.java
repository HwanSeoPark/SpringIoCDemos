package com.pppspringioc.ioc.autowire.expectsarray;

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