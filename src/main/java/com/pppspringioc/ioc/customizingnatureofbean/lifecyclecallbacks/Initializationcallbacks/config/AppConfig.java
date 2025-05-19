package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.Initializationcallbacks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 
import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.Initializationcallbacks.model.AnotherExampleBean;
import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.Initializationcallbacks.model.ExampleBean;
import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.Initializationcallbacks.model.OtherExampleBean;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init")
    public ExampleBean exampleBean() {
        return new ExampleBean();
    }

    @Bean
    public AnotherExampleBean anotherExampleBean() {
        return new AnotherExampleBean();
    }

    @Bean
    public OtherExampleBean otherExampleBean() {
    	return new OtherExampleBean();
    }
    
}