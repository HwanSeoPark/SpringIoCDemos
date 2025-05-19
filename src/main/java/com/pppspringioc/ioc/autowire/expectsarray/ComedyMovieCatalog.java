package com.pppspringioc.ioc.autowire.expectsarray;

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