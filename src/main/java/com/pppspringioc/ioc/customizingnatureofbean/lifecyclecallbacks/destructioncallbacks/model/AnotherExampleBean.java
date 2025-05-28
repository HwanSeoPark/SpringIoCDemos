package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.destructioncallbacks.model;

import org.springframework.beans.factory.DisposableBean;

public class AnotherExampleBean implements DisposableBean {

    @Override
    public void destroy() {
        System.out.println("AnotherExampleBean: destroy logic executed.");
    }
}