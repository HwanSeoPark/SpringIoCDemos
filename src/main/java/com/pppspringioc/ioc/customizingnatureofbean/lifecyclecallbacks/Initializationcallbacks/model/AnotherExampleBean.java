package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.Initializationcallbacks.model;

import org.springframework.beans.factory.InitializingBean;

public class AnotherExampleBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() {
        System.out.println("AnotherExampleBean: afterPropertiesSet logic executed.");
    }
}