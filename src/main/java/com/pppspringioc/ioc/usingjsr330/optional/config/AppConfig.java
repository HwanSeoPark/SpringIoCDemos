package com.pppspringioc.ioc.usingjsr330.optional.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.usingjsr330.optional.service.SimpleMovieLister;

@Configuration
@ComponentScan({"com.pppspringioc.ioc.usingjsr330.optional"})
public class AppConfig {

	@Bean
	public SimpleMovieLister simpleMoviewLister() {
		return new SimpleMovieLister();
	}
}
