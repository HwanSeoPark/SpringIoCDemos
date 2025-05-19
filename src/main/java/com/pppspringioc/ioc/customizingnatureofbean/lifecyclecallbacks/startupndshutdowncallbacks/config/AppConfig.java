package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.startupndshutdowncallbacks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.startupndshutdowncallbacks.model.CustomLifecycleBean;
import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.startupndshutdowncallbacks.model.CustomSmartLifecycleBean1;
import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.startupndshutdowncallbacks.model.CustomSmartLifecycleBean2;

@Configuration
public class AppConfig {

    @Bean
    public CustomLifecycleBean lifecycleBean() {
        return new CustomLifecycleBean();
    }

    @Bean
    public CustomSmartLifecycleBean1 smartLifecycleBean1() {
        return new CustomSmartLifecycleBean1();
    }
    
    @Bean
    public CustomSmartLifecycleBean2 smartLifecycleBean2() {
        return new CustomSmartLifecycleBean2();
    }
}