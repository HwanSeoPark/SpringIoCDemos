package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.annotation.Genre;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.annotation.MovieQualifier;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.annotation.Offline;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.domain.Format;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.domain.MovieCatalog;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.domain.SimpleMovieCatalog;

import java.util.Set;

@Component
public class MovieRecommender {

    // 1) 문자열 Qualifier ("main")
    @Autowired
    @Qualifier("main")
    private SimpleMovieCatalog mainCatalog;

    // 2) Bean 이름과 동일(필드명 == actionMovieCatalog) -> fallback name 매칭
    //    (단, 컴파일 시 -parameters 사용 권장)
    @Autowired
    private SimpleMovieCatalog actionMovieCatalog; 
    // 이 필드는 AppConfig에서 @Bean 메서드 이름이 "actionMovieCatalog"로 생성된 빈과 매칭

    // 3) @Genre("Action") 커스텀 Qualifier
    @Autowired
    @Genre("Action")
    private MovieCatalog actionGenreCatalog;

    // 4) @Offline 커스텀 Qualifier (값 없는 애노테이션)
    @Autowired
    @Offline
    private MovieCatalog offlineCatalog;

    // 5) @MovieQualifier(genre=, format=) 커스텀 Qualifier
    @Autowired
    @MovieQualifier(format = Format.VHS, genre = "Comedy")
    private MovieCatalog comedyVhsCatalog;

    // 6) 컬렉션 주입 (@Qualifier("action")이 붙은 모든 Bean이 주입됨)
    @Autowired
    @Qualifier("action")
    private Set<MovieCatalog> actionCatalogs;

    // 7) 컨스트럭터 + Qualifier
    private final MovieCatalog constructorCatalog;
    private final CustomerPreferenceDao customerPreferenceDao;

    @Autowired
    public MovieRecommender(@Qualifier("main") MovieCatalog constructorCatalog,
                            CustomerPreferenceDao customerPreferenceDao) {
        this.constructorCatalog = constructorCatalog;
        this.customerPreferenceDao = customerPreferenceDao;
    }

    /** 테스트용 출력 메서드 */
    public void printAll() {
        System.out.println("[MovieRecommender Field Injections]");
        System.out.println("1) @Qualifier(\"main\"): " + mainCatalog.getCatalogName());
        System.out.println("2) fallback by name: " + actionMovieCatalog.getCatalogName());
        System.out.println("3) @Genre(\"Action\"): " + actionGenreCatalog.getCatalogName());
        System.out.println("4) @Offline: " + offlineCatalog.getCatalogName());
        System.out.println("5) @MovieQualifier(VHS,Comedy): " + comedyVhsCatalog.getCatalogName());

        System.out.println("6) Collection @Qualifier(\"action\"):");
        for (MovieCatalog c : actionCatalogs) {
            System.out.println("   -> " + c.getCatalogName());
        }

        System.out.println("[Constructor Injection]");
        System.out.println("7) constructorCatalog (@Qualifier(\"main\")): " 
                           + constructorCatalog.getCatalogName());
        System.out.println("   customerPreferenceDao: " + customerPreferenceDao);
    }
}
