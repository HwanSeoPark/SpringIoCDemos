package com.pppspringioc.ioc.dependencies.methodinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.dependencies.methodinjection.model.Command;
import com.pppspringioc.ioc.dependencies.methodinjection.model.CommandManager;
import com.pppspringioc.ioc.dependencies.methodinjection.model.ConcreteCommand;

@Configuration
//@ComponentScan("com.intheeast.ioc.dependencies.methodinjection.model")
public class AppConfig {

    @Bean
    public Command command() {
        return new ConcreteCommand();
    }

    @Bean
    public CommandManager commandManager() {
//      return new CommandManager();
    	CommandManager cm = new CommandManager();
    	//cm.setCommand(command()); // Spring IoC Dependency Injection
    	return cm;
    }
}