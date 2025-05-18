package com.pppspringioc.ioc.dependencies.dependencyinjection.service;

public class SimpleMovieFinder implements MovieFinder {

	@Override
	public String findMovies() {
		return "Finding movies using SimpleMovieFinder...";		
	}
}
