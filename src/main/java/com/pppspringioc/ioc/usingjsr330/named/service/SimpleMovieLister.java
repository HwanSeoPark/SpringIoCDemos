package com.pppspringioc.ioc.usingjsr330.named.service;

import com.pppspringioc.ioc.usingjsr330.named.finder.MovieFinder;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class SimpleMovieLister {

	private MovieFinder movieFinder;

	@Inject
	public void setMovieFinder(@Named("optionalMovieFinderImpl")MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}

	public void listMovies() {
		System.out.println(this.movieFinder.findAll());
		// ...
	}
}
