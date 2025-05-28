package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingImportannotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingImportannotation.imports.*;

//@ComponentScan을 사용하지 않고, MyService와 MyRepository 빈을 등록할 수 있다.
@Configuration
@Import({ConfigA.class, ConfigB.class, MyService.class, MyRepository.class})
public class AppConfig {
	// 필요한 경우 다른 @Bean도 선언 가능
}