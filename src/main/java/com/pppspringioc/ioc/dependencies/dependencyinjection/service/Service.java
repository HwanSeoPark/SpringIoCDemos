package com.pppspringioc.ioc.dependencies.dependencyinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.dependencies.dependencyinjection.dao.Repository;

//어노테이션 기반 구성 메타데이터
@Component
public class Service {
    //private final Repository repository = null;
	@Autowired
	private Repository repository;

    // 생성자를 통한 의존성 주입
//    @Autowired
//    public Service(Repository repository) {
//        this.repository = repository;
//    }
    
//    public Service() {}
//    
//    @Autowired
//    public void setRepository(Repository repository) {
//        this.repository = repository;
//    }
//
    public void performAction() {
        repository.save();
    }
    
    public Repository getRepo() {
    	return this.repository;
    }
}