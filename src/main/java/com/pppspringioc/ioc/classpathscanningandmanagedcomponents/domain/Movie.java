package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.domain;


public class Movie {
    private String title;
    private String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" + "title='" + title + '\'' + ", genre='" + genre + '\'' + '}';
    }
}
