package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


/*
 디폴트 필터는 애너테이션에서 useDefaultFilters=false로 설정하여 비활성화할 수 있습니다. 
 이는 @Component, @Repository, @Service, @Controller, @RestController, @Configuration로 
 애너테이션되거나 메타 애너테이션된 클래스의 자동 감지를 효과적으로 비활성화합니다.
 */
@Configuration
// 스프링 IoC 컨테이너에게 등록할 빈의 조건을 검
@ComponentScan(
        basePackages = "com.pppspringioc.ioc.classpathscanningandmanagedcomponents",
        // 지정한 패키지 내의 Component(클래스)중에
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = com.pppspringioc.ioc.classpathscanningandmanagedcomponents.qualifier.Offline.class),
        // 우리가 설정한 어노테이션인 (Offline)이 적용되어있는 것만 빈등록하고
        // 대신 디폴트 필터를 제외(디폴트 필터가 있는애들은 빈등록 된다.)하고
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Comedy.*Repository"),
        // ".*Comedy.*Repository" -> Comdey문자열이 나오고 
        // 그 뒤에 또 어딘가에 Repository오는 문자열은 빈등록하지 마라
        scopeResolver = MyScopeResolver.class
        // 등록된 Component의 스코프를 지정한다
)
public class AppConfig {
	
}
