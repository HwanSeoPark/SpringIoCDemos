package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingpostconstructandpredestroy;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Spring Legacy @PostConstruct / @PreDestroy 예제 시작 ===");
        
        // 자바 기반 설정 클래스를 이용해 컨텍스트를 생성한다.
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Bean 가져오기 (필요하다면)
        CachingMovieLister lister = context.getBean(CachingMovieLister.class);
        
        System.out.println("[Main] 영화 캐싱 상태를 확인 또는 사용 가능...");
        
        // 컨텍스트를 닫으면 @PreDestroy가 호출됨
        context.close();
        System.out.println("=== Spring Legacy 예제 종료 ===");
    }
}
