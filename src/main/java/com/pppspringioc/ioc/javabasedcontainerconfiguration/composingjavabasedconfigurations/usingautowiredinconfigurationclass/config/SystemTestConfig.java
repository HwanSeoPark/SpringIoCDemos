package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.config;


import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import jakarta.annotation.PostConstruct;

import java.sql.Driver;

import javax.sql.DataSource;

@Configuration
@Import({ProcessorConfig.class, ServiceConfig.class, RepositoryConfig.class})
public class SystemTestConfig {
	
	public SystemTestConfig() {
		System.out.println("✅ SystemTestConfig Default Constructor");
	}

	@SuppressWarnings("unchecked")
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource ds = new SimpleDriverDataSource();
		try {
			ds.setDriverClass((Class<? extends Driver>) Class.forName("com.mysql.cj.jdbc.Driver"));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("MySQL 드라이버를 찾을 수 없습니다.", e);
		}
		
		ds.setUrl("jdbc:mysql://localhost:3306/testdb?serverTimezone=Asia/Seoul");
		ds.setUsername("root");
		ds.setPassword("1234");

		System.out.println("✅ SimpleDriverDataSource 등록 완료");
		return ds;
	}
	
	@PostConstruct
    public void init() {
		System.out.println("✅ ++ SystemTestConfig initialized");
        // 이 메서드 내에서 동일한 구성 클래스의 비정적 @Bean 메서드에 접근하지 마세요
        // 예: dataSource(); (비정적 메서드 접근 금지)
//		 DataSource dataSource = dataSource(); //<-- 이렇게 작성하지 마라!!
		// ⚠️ 주의: 이 방식은 Spring 컨테이너에 등록된 dataSource 빈을 요청하는 것이 아님
        // 현재 @Bean 메서드를 직접 호출하므로, Spring이 관리하지 않는 새로운 인스턴스가 생성됨
        // 결과적으로 싱글톤 빈이 아닌 별도의 객체가 만들어져 사용됨
		
		// 이런 @PostConstruct의 init 메서드에서는
		// static으로 선언되어 있는 팩토리 메서드를 작성해서 사용하자!!
		BeanPostProcessor beanPostProcessor = ProcessorConfig.customBeanPostProcessor();
		System.out.println("✅ -- SystemTestConfig initialized");
    }
}
