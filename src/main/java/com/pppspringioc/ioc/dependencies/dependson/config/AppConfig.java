package com.pppspringioc.ioc.dependencies.dependson.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.pppspringioc.ioc.dependencies.dependson.model.ExampleBean;
import com.pppspringioc.ioc.dependencies.dependson.model.JdbcAccountDao;
import com.pppspringioc.ioc.dependencies.dependson.model.ManagerBean;

@Configuration
public class AppConfig {

    @Bean
    @DependsOn("manager")
    public ExampleBean beanOne() {
    	System.out.println("+beanOne");
        ExampleBean exampleBean = new ExampleBean();
        exampleBean.setManager(manager());
        System.out.println("-beanOne");
        return exampleBean;
    }

    @Bean
    public ManagerBean manager() {
        return new ManagerBean();
    }

    @Bean
    public JdbcAccountDao accountDao() {
        return new JdbcAccountDao();
    }

    @Bean
    @DependsOn({"manager", "accountDao"})
    public ExampleBean beanOneWithMultipleDependencies() {
    	System.out.println("+beanOneWithMultipleDependencies");
        ExampleBean exampleBean = new ExampleBean();
        exampleBean.setManager(manager());
    	System.out.println("-beanOneWithMultipleDependencies");
        return exampleBean;
    }
}