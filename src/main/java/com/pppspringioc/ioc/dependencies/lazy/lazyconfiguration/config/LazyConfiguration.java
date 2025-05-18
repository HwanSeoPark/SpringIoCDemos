package com.pppspringioc.ioc.dependencies.lazy.lazyconfiguration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.dependencies.lazy.lazyconfiguration.service.AnotherBean;
import com.pppspringioc.ioc.dependencies.lazy.lazyconfiguration.service.ExpensiveToCreateBean;

import jakarta.annotation.PostConstruct;


@Configuration
@Lazy  // 이 구성이 적용된 Configuration 클래스 내부의 Bean 들도 Lazy-init 됨
@ComponentScan(basePackages = "com.intheeast.ioc.dependencies.lazy.lazyconfiguration")
public class LazyConfiguration {
	
	@Bean
	public ExpensiveToCreateBean lazyBean() {
        return new ExpensiveToCreateBean();
	}

    @Bean
    public AnotherBean notLazyBean() {
        return new AnotherBean();
    }
	
	
	
	// @Componet 사용가능한 이유는 
	// static 클래스라 외부 클래스랑 별개로 취급하기 때문에
    @Component
    @Lazy  // 개별 Bean 에도 @Lazy 설정 가능
    public static class LazyService {
        public LazyService() {
            System.out.println("LazyService Constructor invoked");
        }

        // CallBack 메서드 : 여기서 Back은 Spring IoC 컨테이너를 의미
        //                 초기화 콜백 메서드
        @PostConstruct
        // 쓰는걸 권장하지 않지만 외우긴 해야함
        public void init() {
            System.out.println("LazyService initialized");
        }

        public void doWork() {
            System.out.println("LazyService is working...");
        }
    }
}