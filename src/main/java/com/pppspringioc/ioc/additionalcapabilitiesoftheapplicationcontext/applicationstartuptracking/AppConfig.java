package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.applicationstartuptracking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfig {

    @Bean
    public HeavyService heavyService() {
        return new HeavyService();
    }
}
