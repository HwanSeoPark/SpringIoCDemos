package com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example1.config.AppConfig;
import com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example1.model.SimpleBean;

public class Main {

    public static void main(String[] args) {
        // Spring ApplicationContext 생성
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // SimpleBean 가져오기
        SimpleBean simpleBean = context.getBean(SimpleBean.class);
        System.out.println("Final Bean: " + simpleBean);

        // 컨텍스트 종료
        context.close();
    }
}
