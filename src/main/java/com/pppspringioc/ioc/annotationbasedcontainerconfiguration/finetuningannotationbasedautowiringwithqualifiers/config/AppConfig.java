package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.annotation.Genre;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.annotation.MovieQualifier;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.annotation.Offline;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.domain.Format;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.domain.MovieCatalog;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.domain.SimpleMovieCatalog;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.service.CustomerPreferenceDao;
//import com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.service.MovieRecommender;

@Configuration
@ComponentScan(basePackages= {"com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers"})
public class AppConfig {

    // (1) @Qualifier("main") 예제용
    @Bean
    @Qualifier("main")
    public MovieCatalog mainMovieCatalog() {
        return new SimpleMovieCatalog("MainCatalog");
    }

    // (2) 이름 = "actionMovieCatalog" → 필드명과 일치하면 fallback by name
    @Bean
    @Qualifier("action") // 동시에 "action" Qualifier도 부여
    public MovieCatalog actionMovieCatalog() {
        return new SimpleMovieCatalog("ActionCatalog1");
    }

    // (3) 같은 "action" Qualifier를 중복 사용하여, Set<MovieCatalog> 형태로 주입
    @Bean
    @Qualifier("action")
    public MovieCatalog actionMovieCatalog2() {
        return new SimpleMovieCatalog("ActionCatalog2");
    }

    // (4) 커스텀 @Genre("Action")
    @Bean
    @Genre("Action")
    public MovieCatalog actionGenreCatalog() {
        return new SimpleMovieCatalog("GenreActionCatalog");
    }

    // (5) 커스텀 @Offline (값 없음)
    @Bean
    @Offline
    public MovieCatalog offlineCatalog() {
        return new SimpleMovieCatalog("OfflineCatalog");
    }

    // (6) 커스텀 @MovieQualifier(genre, format)
    @Bean
    @MovieQualifier(genre = "Comedy", format = Format.VHS)
    public MovieCatalog comedyVhsCatalog() {
        return new SimpleMovieCatalog("ComedyVHSCatalog");
    }

    // 기타 의존성
    @Bean
    public CustomerPreferenceDao customerPreferenceDao() {
        return new CustomerPreferenceDao();
    }
    
// 다음과 같은 코드를 사용하지 않기를 바람.
//    @Bean
//    public MovieRecommender movieRecommender() {
//        return new MovieRecommender(null, null);
//    }
}
