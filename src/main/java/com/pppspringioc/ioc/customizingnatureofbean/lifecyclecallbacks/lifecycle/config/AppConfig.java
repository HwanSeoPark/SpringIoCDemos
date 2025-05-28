package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.lifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.lifecycle.service.*;

@Configuration
public class AppConfig {

	@Bean
	public LifeCycleService lifeCycleService() {
		return new LifeCycleService();
	}
	
}
