package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.destructioncallbacks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.destructioncallbacks.model.*;

@Configuration
public class AppConfig {

    @Bean(destroyMethod = "cleanup")
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
    
    
//    @Bean
//    public LifecycleBean lifecycleBean() {
//        return new LifecycleBean();
//    }
}
