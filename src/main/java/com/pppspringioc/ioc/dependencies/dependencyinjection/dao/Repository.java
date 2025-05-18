package com.pppspringioc.ioc.dependencies.dependencyinjection.dao;

import org.springframework.stereotype.Component;

//어노테이션 기반 구성 메타데이터
@Component
public class Repository {
	
	public void save() {
     System.out.println("Data saved!");
 }

}