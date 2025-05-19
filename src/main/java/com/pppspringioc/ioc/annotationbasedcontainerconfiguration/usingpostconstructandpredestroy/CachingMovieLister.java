package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingpostconstructandpredestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class CachingMovieLister {

    @PostConstruct
    public void populateMovieCache() {
        System.out.println("[CachingMovieLister] @PostConstruct 실행: Movie Cache를 초기화합니다.");
        // 실제 캐싱 로직(예: DB 조회, 파일 로드 등)을 여기에 구현할 수 있습니다.
    }

    @PreDestroy
    public void clearMovieCache() {
        System.out.println("[CachingMovieLister] @PreDestroy 실행: Movie Cache를 정리합니다.");
        // 실제 캐시 정리 로직(예: 메모리 해제, 임시 파일 삭제 등)을 여기에 구현할 수 있습니다.
    }
}
