package com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.collections.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.collections.model.ComplexObject;

//@Configuration 어노테이션이 적용된 클래스도 스프링 컨테이너에 빈으로 등록된다.
@Configuration
public class AppConfig {

    @Bean
    public ComplexObject moreComplexObject() {
        ComplexObject complexObject = new ComplexObject();

        // Setting Properties
        Properties adminEmails = new Properties();
        adminEmails.setProperty("administrator", "administrator@example.org");
        adminEmails.setProperty("support", "support@example.org");
        adminEmails.setProperty("development", "development@example.org");
        complexObject.setAdminEmails(adminEmails);

        // Setting List
        List<Object> someList = new ArrayList<>();
        someList.add("a list element followed by a reference");
        someList.add(myDataSource());
        complexObject.setSomeList(someList);

        // Setting Map
        Map<String, Object> someMap = new HashMap<>();
        someMap.put("an entry", "just some string");
        someMap.put("a ref", myDataSource());
        complexObject.setSomeMap(someMap);

        // Setting Set
        Set<Object> someSet = new HashSet<>();
        someSet.add("just some string");
        someSet.add(myDataSource());
        complexObject.setSomeSet(someSet);

        return complexObject;
    }

    @Bean
    public DataSource myDataSource() {
        // Mock DataSource bean
    	DataSource dataSource = new SimpleDriverDataSource();
        return dataSource;
    }
}