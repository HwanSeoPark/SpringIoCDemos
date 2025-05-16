package com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.collectionmerge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.collections.model.ComplexObject;

public class MainApp {
    public static void main(String[] args) {
        // ApplicationContext 초기화 (Java Config 기반)
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // parent 빈 가져오기
        ComplexObject parentBean = (ComplexObject) context.getBean("parent");
        System.out.println("Parent Bean: " + parentBean);

        // child 빈 가져오기
        ComplexObject childBean = (ComplexObject) context.getBean("child");
        System.out.println("Child Bean: " + childBean);

        // 개별 값 출력 (자식 Bean에서 support가 덮어씌워졌는지 확인)
        System.out.println("\nChild adminEmails:");
        childBean.getAdminEmails().forEach((key, value) ->
                System.out.println(key + " = " + value));
    }
}