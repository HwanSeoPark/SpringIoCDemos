package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired;


import java.util.Optional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.config.AppConfig;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.config.SelfInjectionBean;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.service.MovieRecommender;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.service.MultipleCatalogConsumer;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.service.MultipleConstructorsBean;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.service.OptionalInjectionBean;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.service.SimpleMovieLister;

public class Main {

	public static Optional<String> findNameById(int id) {
		if (id == 1) {
			return Optional.of("홍길동"); // 같이 있을 때
		} else {
			return Optional.empty(); // 값이 없을 때
		}
	}
	
	
    public static void main(String[] args) {
    	
    	Optional<String> nameOpt = findNameById(1);
    	// findNameById(0)이면 value 값에 null 값이 들어감    	
    	if(!nameOpt.isEmpty()) {
    		String name = nameOpt.get();
    	}else {
    		
    	} // 보통 이렇게 많이 쓴다
    	
    	nameOpt.ifPresent(name -> System.out.println("이름:" + name));
    	
    	// 값이 없으면 기본값 사용    
    	String name = nameOpt.orElse("이름없음");
    	
    	try {
    		String mustExistName = nameOpt.orElseThrow(()-> new IllegalArgumentException("이름이 존재하지 않습니다"));
    		System.out.println("필수 이름 :" + mustExistName);		
    	} catch(IllegalArgumentException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	
        // 1) Java 기반 설정 클래스(AppConfig)를 이용한 ApplicationContext 로딩
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);

        // 2) SimpleMovieLister 테스트 (Setter 주입)
        SimpleMovieLister lister = context.getBean(SimpleMovieLister.class);
        lister.listMovies();

        // 3) MovieRecommender 테스트 (생성자, 필드, 임의 메서드 주입)
        MovieRecommender recommender = context.getBean(MovieRecommender.class);
        recommender.recommendMovie();

        // 4) 배열, 컬렉션, 맵 주입 예시
        MultipleCatalogConsumer catalogConsumer = context.getBean(MultipleCatalogConsumer.class);
        catalogConsumer.printCatalogs();

        // 5) MultipleConstructorsBean 테스트
        MultipleConstructorsBean multipleConstructorsBean = context.getBean(MultipleConstructorsBean.class);
        multipleConstructorsBean.doSomething();

        // 6) OptionalInjectionBean 테스트
        OptionalInjectionBean optionalBean = context.getBean(OptionalInjectionBean.class);
        optionalBean.printOptionalField();

        // 7) Self Injection 테스트
        SelfInjectionBean selfBean = context.getBean(SelfInjectionBean.class);
        selfBean.outerMethod();

        context.close();
    }
}
