package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.declaringbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.declaringbean.config.AppConfig;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.declaringbean.service.*;


public class Main {
	
	public static void main(String[] args) {
        ApplicationContext ctx = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // TransferService만 구현하고 싶을때
//        TransferService transferService = ctx.getBean(TransferService.class);
//        transferService.transfer();
        
        // 여러 인터페이스를 구현한 구현체를 쓰고싶은 경우
        TransferServiceImpl transferServiceImple = ctx.getBean(TransferServiceImpl.class);
        transferServiceImple.transfer();
        transferServiceImple.audit();
        transferServiceImple.log();
            
    }

}
