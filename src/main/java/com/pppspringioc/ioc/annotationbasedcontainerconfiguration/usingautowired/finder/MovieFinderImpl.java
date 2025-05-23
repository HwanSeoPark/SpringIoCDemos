package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.finder;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary // 자바기반,어노테이션 기반 둘다 쓸수 있음
		 // 현재 MovieFinder을 구현한 구현체가 2개임
@Component/*("movieFinderImpl")*/ // 디폴트로 이름이 이렇게 돼있음
@Qualifier("movieFinder1") // <- @Qualifier("movieFinder1") 이건 이름이 아니다
public class MovieFinderImpl implements MovieFinder {
	// @Primary를 보면
	// 누군가 MovieFinder을 DI하고싶은 존재가 어디딘가 있다.
    
	@Override
    public String findAll() {
        return "MovieFinderImpl: Searching for movies...";
    }
}
