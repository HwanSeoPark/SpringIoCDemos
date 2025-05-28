package com.pppspringioc.ioc.beanscope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pppspringioc.ioc.beanscope.model.DefaultAccountService;
import com.pppspringioc.ioc.beanscope.model.MyBean;
import com.pppspringioc.ioc.beanscope.model.PrototypeDependency;
import com.pppspringioc.ioc.beanscope.model.SingletonWithPrototype;

@Configuration
public class AppConfig {

    // Singleton Scope (Default)
    @Bean
    public DefaultAccountService defaultAccountService() {
        return new DefaultAccountService();
    }

    // Prototype Scope
    @Bean
    @Scope("prototype")
    public PrototypeDependency prototypeDependency() {
        return new PrototypeDependency();
    }

    // Lifecycle Bean
    @Bean
    public MyBean myBean() {
        return new MyBean();
    }

    // Singleton with Prototype Dependency
    @Bean
    public SingletonWithPrototype singletonWithPrototype(org.springframework.beans.factory.ObjectFactory<PrototypeDependency> prototypeFactory) {
        return new SingletonWithPrototype(prototypeFactory);
    }
}