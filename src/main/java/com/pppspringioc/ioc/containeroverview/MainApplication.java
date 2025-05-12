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
		ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);
        										   
        PetStoreServiceImpl petStoreService = 
        		context.getBean(PetStoreServiceImpl.class);
        
        // petStoreService를 사용하여 비즈니스 로직 수행
        petStoreService.addItem("dog");
    }
}

