package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.customautowire.config;

import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.customautowire.marker.MyMarker;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Configuration
@ComponentScan(basePackages = "com.intheeast.ioc.annotationbasedcontainerconfiguration.customautowire")
public class AppConfig {

    // BeanFactoryPostProcessor는 static 메서드로 등록하는 편이 권장됩니다.
    @Bean
    public static CustomAutowireConfigurer customAutowireConfigurer() {
        // 1) CustomAutowireConfigurer 인스턴스 생성
        CustomAutowireConfigurer configurer = new CustomAutowireConfigurer();

        // 2) customQualifierTypes에 "MyMarker" 애노테이션 등록
        Set<Class<?>> customQualifiers = new HashSet<>();
        customQualifiers.add(MyMarker.class);
        configurer.setCustomQualifierTypes(customQualifiers);

        // 3) 리턴
        return configurer;
    }
}
