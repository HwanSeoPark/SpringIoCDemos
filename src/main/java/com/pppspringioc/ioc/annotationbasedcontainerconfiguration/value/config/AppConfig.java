package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.value.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.value.converter.MyCustomConverter;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.value.domain.MapBasedRecommender;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.value.domain.MovieRecommender;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    /**
     * @Bean 팩토리 메서드가 static 이여야, Spring이 초기 단계에서 이 Bean을 인식해
     * ${} placeholder가 해결되지 않았을 경우 예외를 던져서 엄격 모드 가능
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        // 엄격모드: 값이 없으면 에러 발생
        // 원하는 경우 setIgnoreUnresolvablePlaceholders(false)로 가능
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setIgnoreUnresolvablePlaceholders(false); 
        return configurer;
    }

    /**
     * 사용자가 정의한 Converter나 Formatter를 등록하고 싶으면
     * ConversionService Bean을 등록 가능
     */
    @Bean
    public ConversionService conversionService() {
        DefaultFormattingConversionService cs = new DefaultFormattingConversionService();
        cs.addConverter(new MyCustomConverter()); 
        return cs;
    }

    @Bean
    public MovieRecommender movieRecommender() {
        // @Value를 통한 생성자 주입 -> Spring이 적절히 값을 대체
        return new MovieRecommender();
    }

    @Bean
    public MapBasedRecommender mapBasedRecommender() {
        return new MapBasedRecommender();
    }
}
