package com.pppspringioc.ioc.containeroverview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.containeroverview.config.AppConfig;
import com.pppspringioc.ioc.containeroverview.service.PetStoreServiceImpl;

public class MainApplication {
	public static void main(String[] args) {
       
		// ioc 컨테이너를 쓰지 않는다면 
		// new키워드를 통해 사용할 class들의 인스턴스 메서드와
		// 호출식들을 다 작성해야함
		ApplicationContext context = // 자바의 추상화 철학으로 이렇게 작성함 
        		new AnnotationConfigApplicationContext(AppConfig.class);
		// 컴파일된 AppConfig.class를 IoC 컨테이너에 전달함
		// 컨테이너가 생성, 소멸, 스코프까지 관리
		
        PetStoreServiceImpl petStoreService = 
        		context.getBean(PetStoreServiceImpl.class);
        // 컨테이너가 AppConfig 인스턴스화 메서드를 잘 만들었는지 확인하는 메서드
        
        
        // petStoreService를 사용하여 비즈니스 로직 수행
        petStoreService.addItem("dog");

	
	
	
	
	
	
	
	
	}
}

