package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.value.domain;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component 를 붙여도 되고, 아니면 Config에서 직접 @Bean 등록해도 됨
@Component
public class MovieRecommender {

    /**
     * 1) 프로퍼티 파일에서 catalog.name을 가져옴
     *    없으면 "defaultCatalog" 사용
     */
    @Value("${catalog.name:defaultCatalog}")
    private String catalogName;

    /**
     * 2) 프로퍼티 파일에서 catalog.size를 가져옴 (int로 자동 변환)
     *    없으면 50 사용
     */
    @Value("${catalog.size:50}")
    private int catalogSize;

    /**
     * 3) SpEL 예시:
     *    systemProperties['user.catalog'] + "Catalog"
     *    user.catalog 시스템 프로퍼티가 없으면 null + "Catalog" => "nullCatalog" 
     */
    @Value("#{systemProperties['user.catalog'] + 'Catalog'}")
    private String dynamicCatalog;

    public MovieRecommender() {
    }

    public void printInfo() {
        System.out.println("[MovieRecommender] Catalog Name = " + catalogName);
        System.out.println("[MovieRecommender] Catalog Size = " + catalogSize);
        System.out.println("[MovieRecommender] Dynamic Catalog = " + dynamicCatalog);
    }

    // getters, setters ...
}
