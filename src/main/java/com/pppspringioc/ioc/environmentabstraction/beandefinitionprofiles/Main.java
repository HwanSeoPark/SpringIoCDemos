package com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles.config.*;
import com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles.dao.SampleDao;

public class Main {
    public static void main(String[] args) {
        // 1. 스프링 컨테이너 생성
        AnnotationConfigApplicationContext ctx = 
        		new AnnotationConfigApplicationContext();

        // 2. 활성화할 프로필 설정 (예: default, dev, prod)
        ctx.getEnvironment().setActiveProfiles("default");
//      ctx.getEnvironment().setActiveProfiles("dev");
//       ctx.getEnvironment().setActiveProfiles("prod");         
        // 만약 3개다 활성화 돼있지 않으면 default 프로필이 설정된다.
        
        // 3. 구성 클래스 등록
        ctx.register(AppConfig.class, 
        		DefaultDataConfig.class,
        		DevDataSourceConfig.class, 
        		ProdDataSourceConfig.class);

        // 4. 컨테이너 초기화 (빈 등록 및 생성)
        ctx.refresh();
        
        System.out.println("📦 등록된 Spring Bean 목록:");
        String[] beanNames = ctx.getBeanDefinitionNames();

        for (String name : beanNames) {
            Object bean = ctx.getBean(name);
            System.out.printf("🔸 빈 이름: %-30s | 타입: %s%n", name, bean.getClass().getName());
        }
        
        System.out.println("\n*********************************************************************************************************");


        // 5. DAO 빈 사용
        SampleDao dao = ctx.getBean(SampleDao.class);
        dao.testConnection();

        // 6. 컨텍스트 종료
        ctx.close();
    }
}
