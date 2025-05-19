package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.customautowire.service;

import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.customautowire.marker.MyMarker;

@Component
@MyMarker
public class MyServiceImplB implements MyService {

    @Override
    public void doSomething() {
        System.out.println("B is doing something.");
    }
}
