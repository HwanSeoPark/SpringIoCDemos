package com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example2.config.AppConfig;
import com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example2.model.DataSource;

public class Main {

    public static void main(String[] args) {
        // ApplicationContext 생성
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // DataSource 빈 가져오기
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println("Final DataSource: " + dataSource);

        // 컨텍스트 종료
        context.close();
    }
}
