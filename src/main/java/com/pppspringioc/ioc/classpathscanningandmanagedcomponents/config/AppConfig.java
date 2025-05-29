package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


/*
@ComponentScan의 includeFilters 속성은
@ComponentScan의 스캔 범위내에서 스테레오 타입의 어노테이션이 적용되지 않은 클래스라도
명시적(explicit)으로 Spring IoC Container에 등록하기 위해 사용,
includeFilters는 특정 조건에 맞는 클래스를 필터링해서 스프링 컨테이너에 빈으로 등록할 수 있도록 함.
디폴트 필터는 애너테이션에서 useDefaultFilters=false로 설정하여 비활성화할 수 있습니다. 
디폴트로 @ComponentScan은 @Component, @Repository, @Service, @Controller, @RestController 등을 
붙인 클래스만 자동으로 스캔
그러나 includeFilters를 사용하면 이런 어노테이션이 없거나,
특정 조건을 만족하는 클래스도 스캔 대상으로 강제 포함시킬수 있음.
 */
@Configuration
// 스프링 IoC 컨테이너에게 등록할 빈의 조건을 검
@ComponentScan( // includeFilters를 지정해도 basePackages에 없으면 빈으로 등록 되지 않는다.
        basePackages = "com.pppspringioc.ioc.classpathscanningandmanagedcomponents",
        // 지정한 패키지 내의 Component(클래스)중에
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = com.pppspringioc.ioc.classpathscanningandmanagedcomponents.qualifier.Online.class),
        // 우리가 설정한 어노테이션인 (Offline)이 적용되어있는 것만 빈등록하고
        // 대신 디폴트 필터를 제외(디폴트 필터가 있는애들은 빈등록 된다.)하고
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Comedy.*Repository"),
        // ".*Comedy.*Repository" -> Comdey문자열이 나오고 // .*의 의미는 0회 이상 나올시
        // 그 뒤에 또 어딘가에 Repository오는 문자열은 빈등록하지 마라
        scopeResolver = MyScopeResolver.class
        // 등록된 Component의 스코프를 지정한다
)
public class AppConfig {
	
}
