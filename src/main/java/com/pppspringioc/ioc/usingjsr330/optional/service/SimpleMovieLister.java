package com.pppspringioc.ioc.usingjsr330.optional.service;

import java.util.Optional;
import java.util.function.Consumer;

import com.pppspringioc.ioc.usingjsr330.optional.finder.MovieFinder;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class SimpleMovieLister {

	// Optoinal이 wrapping하는것은 인터페이스의 구현체
	private Optional<MovieFinder> optionalFinder;

	@Inject
	public void setMovieFinder(Optional<MovieFinder> optionalFinder) {
		this.optionalFinder = optionalFinder;
		boolean isNull = this.optionalFinder.isEmpty();
		}

	public void listMovies() {
		/*     
		 public interface Consumer<MovieFinder> {
    	 void accept(MovieFinder t);
    	 }
    	 (DataType finder) -> System.out.println(finder.findAll())
		// 여기서 DataType을 컴파일러가 추론하면 MovieFinder
	
		                          // T는 현재 MovieFinder
		public void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction) {
	        if (value != null) {
	            action.accept(value);
	        } else {
	            emptyAction.run();
	        }
	    }
		*/
		optionalFinder.ifPresentOrElse(
				finder -> System.out.println(finder.findAll()),
	            () -> System.out.println(
	            		"[SimpleMovieLister] listMovies: No MovieFinder found")
	    );
	}
}