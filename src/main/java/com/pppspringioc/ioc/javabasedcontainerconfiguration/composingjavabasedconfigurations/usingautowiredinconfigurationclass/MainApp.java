package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.config.SystemTestConfig;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.domain.TransferService;

public class MainApp {
    public static void main(String[] args) {
        // 1. 구성 클래스를 기반으로 애플리케이션 컨텍스트 생성
        ApplicationContext ctx = 
        		new AnnotationConfigApplicationContext(SystemTestConfig.class);

        // 2. 빈 조회
        TransferService transferService = ctx.getBean(TransferService.class);

        // 3. 로직 실행
        transferService.transfer(100.00, "A123", "C456");
    }
}