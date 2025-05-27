package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.applicationstartuptracking;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;


public class Main {
    public static void main(String[] args) {
        // FlightRecorderApplicationStartup을 통해 StartupStep 기록 활성화
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext();
        
        context.setApplicationStartup(new FlightRecorderApplicationStartup());

        context.register(AppConfig.class);
        context.refresh();

        System.out.println("🚀 Application started.");

        context.close();
    }
}
