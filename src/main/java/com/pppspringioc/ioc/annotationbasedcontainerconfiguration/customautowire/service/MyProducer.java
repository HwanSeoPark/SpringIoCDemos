package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.customautowire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.customautowire.marker.YourMarker;

@Component
public class MyProducer {
	
	@Autowired
	@YourMarker
	private MyService myService;

	public void test() {
        myService.doSomething();
    }
}
