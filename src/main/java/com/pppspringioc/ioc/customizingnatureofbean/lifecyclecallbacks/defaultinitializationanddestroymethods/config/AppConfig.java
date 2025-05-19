package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.defaultinitializationanddestroymethods.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.defaultinitializationanddestroymethods.model.BlogDao;
import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.defaultinitializationanddestroymethods.model.DefaultBlogService;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public DefaultBlogService blogService() {
        DefaultBlogService service = new DefaultBlogService();
        service.setBlogDao(new BlogDao());
        return service;
    }
}
