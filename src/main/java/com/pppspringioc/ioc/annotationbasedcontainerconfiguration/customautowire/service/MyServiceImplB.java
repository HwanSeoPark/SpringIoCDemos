package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.customautowire.service;

import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.customautowire.marker.MyMarker;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.customautowire.marker.YourMarker;

@Component
@YourMarker
public class MyServiceImplB implements MyService {

    @Override
    public void doSomething() {
        System.out.println("B is doing something.");
    }
}
