package com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example2.config.AppConfig;
import com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example2.model.ExampleBean;

public class Main {

    public static void main(String[] args) {
        // Spring ApplicationContext 생성
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // ExampleBean 가져오기
        ExampleBean exampleBean = context.getBean(ExampleBean.class);
        System.out.println("Final Bean: " + exampleBean);

        // 컨텍스트 종료
        context.close();
    }
}
