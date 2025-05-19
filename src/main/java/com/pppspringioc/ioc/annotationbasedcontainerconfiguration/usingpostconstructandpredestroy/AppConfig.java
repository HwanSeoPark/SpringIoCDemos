package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingpostconstructandpredestroy;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    /**
     * CommonAnnotationBeanPostProcessor를 Bean으로 등록하여
     * @PostConstruct, @PreDestroy 등을 인식하도록 설정한다.
     */
    @Bean
    public static CommonAnnotationBeanPostProcessor commonAnnotationBeanPostProcessor() {
        return new CommonAnnotationBeanPostProcessor();
    }

    /**
     * @PostConstruct, @PreDestroy 테스트용 Bean
     */
    @Bean
    public CachingMovieLister cachingMovieLister() {
        return new CachingMovieLister();
    }
}
