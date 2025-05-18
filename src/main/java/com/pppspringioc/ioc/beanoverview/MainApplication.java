package com.pppspringioc.ioc.beanoverview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.beanoverview.config.AliasConfig;
import com.pppspringioc.ioc.beanoverview.config.AutowireConfig;
import com.pppspringioc.ioc.beanoverview.config.BasicBeanConfig;
import com.pppspringioc.ioc.beanoverview.config.InstanceFactoryMethodConfig;
import com.pppspringioc.ioc.beanoverview.config.LazyInitConfig;
import com.pppspringioc.ioc.beanoverview.config.ScopeConfig;
import com.pppspringioc.ioc.beanoverview.config.StaticFactoryMethodConfig;
import com.pppspringioc.ioc.beanoverview.dao.DataSource;
import com.pppspringioc.ioc.beanoverview.examples.ExpensiveBean;
import com.pppspringioc.ioc.beanoverview.examples.PrototypeBean;
import com.pppspringioc.ioc.beanoverview.service.PetStoreService;

public class MainApplication {
	
	
	
	public static void localVariableScope() {
		String hello = "Hello";
	}
	
	public static void main(String[] args) {
		
		//hello = "World";
		MainApplication mainApp = 
				new MainApplication();
		
		ApplicationContext context = new AnnotationConfigApplicationContext(
	            BasicBeanConfig.class,
	            StaticFactoryMethodConfig.class,
	            InstanceFactoryMethodConfig.class,
	            LazyInitConfig.class,
	            ScopeConfig.class,
	            AliasConfig.class,
	            AutowireConfig.class
	        );

        // Lazy Bean 테스트
	
        System.out.println("Requesting ExpensiveBean...");
        ExpensiveBean expensiveBean = context.getBean(ExpensiveBean.class);
        expensiveBean.doWork();

        // Prototype Bean 테스트
        System.out.println("\nRequesting PrototypeBean...");
        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        prototypeBean1.performAction();
        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
        prototypeBean2.performAction();

        // Alias 테스트
        System.out.println("\nTesting Bean Aliases...");
//        DataSource dataSource = (DataSource) context.getBean("dataSource");
        DataSource dataSource1 = (DataSource) context.getBean("primaryDataSource");
        DataSource dataSource2 = (DataSource) context.getBean("subsystemA-dataSource");
        System.out.println("DataSource1 and DataSource2 are same: " + (dataSource1 == dataSource2));

        // Autowiring 테스트
        System.out.println("\nTesting Autowired Dependencies...");
        PetStoreService petStoreService = context.getBean(PetStoreService.class);
        petStoreService.addAccount("TestAccount");
    }
}