package com.pppspringioc.ioc.usingjsr330.inject.service;

import com.pppspringioc.ioc.usingjsr330.inject.finder.MovieFinder;

import jakarta.inject.Inject;

public class SimpleMovieLister {

	private MovieFinder movieFinder;

	@Inject // @Autowired 둘 중 한개 쓰기,근데 @Autowired추천
	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
	// @Autowired에는 required 메서드가 있음
	// @Inject는 빈 공간
	
	public void listMovies() {
		System.out.println(this.movieFinder.findAll());
		
	}
}
