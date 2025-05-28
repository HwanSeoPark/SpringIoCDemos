package com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.simpleconstruction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.simpleconstruction.dependency.*;
import com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.simpleconstruction.service.*;

public class Main {
    public static void main(String[] args) {
    	// 이런 식으로 사용 가능은 하다
    	ApplicationContext ctx =
        		new AnnotationConfigApplicationContext(
		            MyServiceImpl.class,
		            Dependency1.class, 
		            Dependency2.class
		        );

        MyService myService = ctx.getBean(MyService.class);
        myService.doStuff();
        
//        Dependency1 dependency1 = ctx.getBean(Dependency1.class);
//        dependency1.getMessage();
//        Dependency2 dependency2 = ctx.getBean(Dependency2.class);
//        dependency2.getInfo();
    }
}