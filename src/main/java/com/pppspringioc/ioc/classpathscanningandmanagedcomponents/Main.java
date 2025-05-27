package com.pppspringioc.ioc.classpathscanningandmanagedcomponents;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.classpathscanningandmanagedcomponents.config.AppConfig;
import com.pppspringioc.ioc.classpathscanningandmanagedcomponents.controller.MovieController;
import com.pppspringioc.ioc.classpathscanningandmanagedcomponents.service.MovieService;
import com.pppspringioc.ioc.classpathscanningandmanagedcomponents.service.QualifierMovieService;
import com.pppspringioc.ioc.classpathscanningandmanagedcomponents.service.ScopedMovieService;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Spring Legacy Config Example ===");

        // ApplicationContext 생성 및 구성 클래스 등록
        try (AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class)) {

        	System.out.println("📦 등록된 Spring Bean 목록:");
            String[] beanNames = context.getBeanDefinitionNames();

            for (String name : beanNames) {
                Object bean = context.getBean(name);
                System.out.printf("🔸 빈 이름: %-30s | 타입: %s%n", name, bean.getClass().getName());
            }
            
            System.out.println("\n*********************************************************************************************************");
        	
        	
            // MovieService Bean 가져오기
            MovieService movieService = context.getBean(MovieService.class);
            System.out.println("\n[Main] MovieService 빈 호출:");
            movieService.listMovies();

            // QualifierMovieService Bean 가져오기
            QualifierMovieService qualifierService = context.getBean(QualifierMovieService.class);
            System.out.println("\n[Main] QualifierMovieService 빈 호출:");
            qualifierService.printMovies();

            // ScopedMovieService Bean 가져오기
            ScopedMovieService scopedService = context.getBean(ScopedMovieService.class);
            System.out.println("\n[Main] ScopedMovieService 빈 호출:");
            scopedService.print();

            // MovieController Bean 가져오기
            MovieController controller = context.getBean(MovieController.class);
            System.out.println("\n[Main] MovieController 빈 호출:");
            controller.display();

        }

        System.out.println("=== Application Finished ===");
    }
}
