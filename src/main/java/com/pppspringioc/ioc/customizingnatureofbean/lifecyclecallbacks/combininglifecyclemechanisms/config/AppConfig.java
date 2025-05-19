package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.combininglifecyclemechanisms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.combininglifecyclemechanisms.model.CombinedLifecycleBean;

@Configuration
public class AppConfig {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public CombinedLifecycleBean combinedLifecycleBean() {
        return new CombinedLifecycleBean();
    }
}
