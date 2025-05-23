package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback.config;

import org.springframework.context.annotation.*;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback.qualifiers‎.Format;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback.qualifiers‎.Genre;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback.qualifiers‎.MovieQualifier;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback.qualifiers‎.Offline;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback.model.*;



@Configuration
@ComponentScan(basePackages = "com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback")
public class AppConfig {

    @Bean
    @Genre("Action") // @Genre는 @Qualifier를 상속
    public MovieCatalog actionCatalog() {
        return new SimpleMovieCatalog("Action Catalog");
    }

    @Bean
    @Genre("Comedy")
    public MovieCatalog comedyCatalog() {
        return new SimpleMovieCatalog("Comedy Catalog");
    }

    @Bean
    @Offline
    public MovieCatalog offlineCatalog() {
        return new SimpleMovieCatalog("Offline Catalog");
    }

    @Bean
    @MovieQualifier(genre = "Action", format = Format.VHS)
    public MovieCatalog actionVhsCatalog() {
        return new SimpleMovieCatalog("Action VHS Catalog");
    }

    @Bean
    @MovieQualifier(genre = "Comedy", format = Format.VHS)
    public MovieCatalog comedyVhsCatalog() {
        return new SimpleMovieCatalog("Comedy VHS Catalog");
    }

    @Bean
    @MovieQualifier(genre = "Action", format = Format.DVD)
    public MovieCatalog actionDvdCatalog() {
        return new SimpleMovieCatalog("Action DVD Catalog");
    }

    @Bean
    @MovieQualifier(genre = "Comedy", format = Format.BLURAY)
    public MovieCatalog comedyBluRayCatalog() {
        return new SimpleMovieCatalog("Comedy BluRay Catalog");
    }
}