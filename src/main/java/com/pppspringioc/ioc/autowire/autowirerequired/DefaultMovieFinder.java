package com.pppspringioc.ioc.autowire.autowirerequired;

public class DefaultMovieFinder implements MovieFinder {

    @Override
    public void findMovies() {
        System.out.println("Finding movies using DefaultMovieFinder.");
    }
}