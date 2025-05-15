package com.pppspringioc.ioc.dependencies.dependencyinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 빈의 디폴트 이름은 보통 클래스의 이름인데, 클래스의 첫글자가 소문자인 이름이 디폴트 이름임.
public class Aservice { // 
	
	private Bservice bService;
	
	@Autowired
	public Aservice(Bservice bService) {
		this.bService = bService;
	}

	public Bservice getbService() {
		return bService;
	}

	@Autowired
	public void setbService(Bservice bService) {
		this.bService = bService;
	}
	
	

}