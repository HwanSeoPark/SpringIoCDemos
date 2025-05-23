package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // 디폴트 값이 singleton
public class SelfInjectionBean {

    @Autowired
    private SelfInjectionBean self; // 자기 자신 주입 (fallback 후보)

    public void outerMethod() {
        System.out.println("[SelfInjectionBean] outerMethod called. Delegating to self.innerMethod()");
        // 만약 AOP 프록시가 걸려 있다면, self를 통해 프록시를 거쳐서 innerMethod가 호출됨
        self.innerMethod();
    }

    public void innerMethod() {
        System.out.println("[SelfInjectionBean] innerMethod executed.");
    }
}