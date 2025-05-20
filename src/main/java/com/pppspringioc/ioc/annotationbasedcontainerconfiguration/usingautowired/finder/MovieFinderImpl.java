package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.finder;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary // 자바기반,어노테이션 기반 둘다 쓸수 있음
		 // 현재 MovieFinder을 구현한 구현체가 2개임
@Component
public class MovieFinderImpl implements MovieFinder {
	// @Primary를 보면
	// 누군가 MoviceFinder을 DI하고싶은 존재가 어디딘가 있다.
    
	@Override
    public String findAll() {
        return "MovieFinderImpl: Searching for movies...";
    }
}
