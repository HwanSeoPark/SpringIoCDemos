package com.pppspringioc.ioc.dependencies.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.dependencies.dependencyinjection.config.AppConfig;
import com.pppspringioc.ioc.dependencies.dependencyinjection.dao.Repository;
import com.pppspringioc.ioc.dependencies.dependencyinjection.service.Aservice;
import com.pppspringioc.ioc.dependencies.dependencyinjection.service.Bservice;
import com.pppspringioc.ioc.dependencies.dependencyinjection.service.Service;
import com.pppspringioc.ioc.dependencies.dependencyinjection.service.SimpleMovieLister;

public class MainApp {
    public static void main(String[] args) {
        // Load the Spring context using Java-based configuration
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the SimpleMovieLister bean
        SimpleMovieLister movieLister = context.getBean(SimpleMovieLister.class);
        
        Repository repo = (Repository) context.getBean("repository");
        
        Service service = (Service) context.getBean("service");
        Repository isSameRepo = service.getRepo();
        
//        Aservice aService = (Aservice) context.getBean("aservice");
//        Bservice bService = aService.getbService();
//        Aservice isSameAService = bService.getaService();        

        // Call the listMovies method
        movieLister.listMovies();
    }
}