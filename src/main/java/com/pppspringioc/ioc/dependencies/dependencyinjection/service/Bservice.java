package com.pppspringioc.ioc.dependencies.dependencyinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 어노테이션 기반 구성 메타데이터 : Spring IoC 컨테이너를 위해 존재하는 어노테이션
@Component
public class Bservice {
	
	private Aservice aService;
	
	public Bservice() {
		System.out.println("Bservice Constructor");
	}
	
	// 아래 컨스트럭터는 Spring IoC 컨테이너가 호출
	// 그런데,,, 디펜던시 발견!!!
	@Autowired
	public Bservice(Aservice aService) {
		this.aService = aService;
	}

	public Aservice getaService() {
		return aService;
	}

	@Autowired
	public void setaService(Aservice aService) {
		this.aService = aService;
	}

}