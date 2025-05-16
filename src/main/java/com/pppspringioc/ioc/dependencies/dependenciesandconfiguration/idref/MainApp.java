package com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.idref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.idref.config.AppConfig;
import com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.idref.service.ClientBean;
import com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.idref.service.TargetBean;


public class MainApp {
	
	public static void main(String[] args) {
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // ClientBean 가져오기
        ClientBean clientBean = context.getBean(ClientBean.class);

        // TargetBean 확인
        TargetBean targetBean = clientBean.getTargetBean();
        System.out.println("Target Bean Instance: " + targetBean);
        System.out.println("Target Bean Name: " + clientBean.getTargetName());
    }

}