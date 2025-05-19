package com.pppspringioc.ioc.autowire.mybeanpostprocessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyRepository myRepository;

    // @Autowired를 사용하여 의존성 자동 주입
    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void performService() {
        System.out.println("Service is running with repository: " + myRepository.getData());
    }
}