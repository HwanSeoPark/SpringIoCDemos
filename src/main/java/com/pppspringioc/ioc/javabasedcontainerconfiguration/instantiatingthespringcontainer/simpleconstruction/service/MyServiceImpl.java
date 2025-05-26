package com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.simpleconstruction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.simpleconstruction.dependency.*;

@Component  // 또는 @Named
public class MyServiceImpl implements MyService {

    private final Dependency1 d1;
    private final Dependency2 d2;

    // 생성자 주입
    @Autowired
    public MyServiceImpl(Dependency1 d1, Dependency2 d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public void doStuff() {
        System.out.println(d1.getMessage());
        System.out.println(d2.getInfo());
    }
}