package com.pppspringioc.ioc.customizinginstantiationlogicwithfactorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.customizinginstantiationlogicwithfactorybean.config.AppConfig;
import com.pppspringioc.ioc.customizinginstantiationlogicwithfactorybean.model.CustomObject;
import com.pppspringioc.ioc.customizinginstantiationlogicwithfactorybean.model.CustomObjectFactoryBean;

public class Main {

    public static void main(String[] args) {
        // ApplicationContext 생성
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // FactoryBean이 생성한 CustomObject 가져오기
        CustomObject customObject = context.getBean("customObjectFactoryBean", CustomObject.class);
        System.out.println("CustomObject: " + customObject);

        // FactoryBean 자체 가져오기
        CustomObjectFactoryBean factoryBean = context.getBean("&customObjectFactoryBean", CustomObjectFactoryBean.class);
        System.out.println("FactoryBean: " + factoryBean);

        // 컨텍스트 종료
        context.close();
    }
}
