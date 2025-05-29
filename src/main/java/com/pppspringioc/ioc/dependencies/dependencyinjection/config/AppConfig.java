package com.pppspringioc.ioc.dependencies.dependencyinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import com.pppspringioc.ioc.dependencies.dependencyinjection.service.MovieFinder;
import com.pppspringioc.ioc.dependencies.dependencyinjection.service.SimpleMovieFinder;
import com.pppspringioc.ioc.dependencies.dependencyinjection.service.SimpleMovieLister;


@Configuration
@ComponentScan({"com.pppspringioc.ioc.dependencies.dependencyinjection"})
public class AppConfig {

    // Define MovieFinder bean
    @Bean
    public MovieFinder movieFinder() {
        return new SimpleMovieFinder();
    }

    // Define SimpleMovieLister bean
    @Bean
    public SimpleMovieLister movieLister(MovieFinder movieFinder) {
    	SimpleMovieLister movieLister = new SimpleMovieLister();
        movieLister.setMovieFinder(movieFinder); // Setter-based DI
        return movieLister;
        
        //return new SimpleMovieLister(movieFinder);
    }

    // @Value 어노테이션으로 주입되려면, 반드시 다음 configure가 필요함!
    // Placeholder? 란? : 구글 검색창에 디폴트로 나타나는 "Google 검색 또는 URL 입력" 이 스트링을 플레이스홀더
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        // 절대 경로=C:\development\Workspace\codes\spring_legacy\SpringIoCDemos\src\main\resources\example.properties
        // The default class loader will be used for loading the resource.
        configurer.setLocation(new ClassPathResource("example.properties"));
        return configurer;
        // 나중에 @PropertySource 어노테이션 쓰면 이거 안써도 된다
    }

}