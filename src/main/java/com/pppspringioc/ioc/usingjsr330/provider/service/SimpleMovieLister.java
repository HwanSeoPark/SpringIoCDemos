package com.pppspringioc.ioc.usingjsr330.provider.service;

import com.pppspringioc.ioc.usingjsr330.provider.finder.MovieFinder;

import jakarta.inject.Inject;
import jakarta.inject.Provider;

public class SimpleMovieLister {

	// ObjectProvider와 동일한 기능을 수행
	private Provider<MovieFinder> movieFinederProvider;

	        // Provider 인터페이스 구현체를 누가 만들까? : Spring IoC Container가 생성
	@Inject // DependencyObjectProvider 인스턴스를 통해 구현체를 생성
	public void setMovieFinder(Provider<MovieFinder> movieFinederProvider) {
		this.movieFinederProvider = movieFinederProvider;
	}

	public String listMovies() {
		// 매번 MovieFinder 인터페이스 구현체 중, ProtoType의 scope를 가지는 새로운 빈을 생성하여 리턴함.
		MovieFinder movieFinder = this.movieFinederProvider.get();
		return movieFinder.toString() + movieFinder.findAll();
		// ...
	}
}
