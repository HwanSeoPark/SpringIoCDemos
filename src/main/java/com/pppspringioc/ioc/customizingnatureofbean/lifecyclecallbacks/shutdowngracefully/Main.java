package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.shutdowngracefully;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.shutdowngracefully.config.AppConfig;
import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.shutdowngracefully.model.ExampleService;

public class Main {

    public static void main(String[] args) {
        // Spring ApplicationContext 생성
        ConfigurableApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // Shutdown Hook 등록 -> Shutdown은 JVM의 종료를 의미
        context.registerShutdownHook(); //<- 이 메서드를 안쓰고 마지막에 context.close(); 사용해도 된다
        // JVM이 죽을때 
        // @Bean(initMethod = "init", destroyMethod = "cleanup")
        // 위의 메서드가 있는 애들을 호출하겠다 의미
        // context.close(); 가 실행되지 않아도 종료될수 있게 만드는 메서드(우와한 종료)

        // 애플리케이션 로직 실행
        ExampleService service = context.getBean(ExampleService.class);
        service.doWork();

        System.out.println("Application is running...");

        // 컨텍스트를 명시적으로 닫지 않아도 종료 시 자동으로 호출됩니다.        
        /* context.close();*/ // Spring IoC 컨테이너를 종료하겠다 
        // close를 하지 않으면 Spring Ioc 컨테이너는 JVM이 종료될때 종료된다
     }
}
