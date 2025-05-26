package com.pppspringioc.ioc.usingjsr330.namedclass.service;

import com.pppspringioc.ioc.usingjsr330.namedclass.finder.MovieFinder;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component 어노테이션 대신에 @Named, 디폴트면 이름이 simpleMovieLister
@Named("movieListener")//<-Bean 이름을 지정하겠다  // @ManagedBean("movieListener") could be used as well
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
