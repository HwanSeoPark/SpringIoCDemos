package com.pppspringioc.ioc.beandefinitioninheritance;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.beandefinitioninheritance.config.BeanInheritanceConfig;
import com.pppspringioc.ioc.beandefinitioninheritance.model.DerivedTestBean;


public class Main {
	
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(BeanInheritanceConfig.class);

        DerivedTestBean bean = context.getBean("inheritsWithDifferentClass", 
        		DerivedTestBean.class);
        System.out.println("✔ name: " + bean.getName());
        System.out.println("✔ age: " + bean.getAge());

        context.close();
    }

}
