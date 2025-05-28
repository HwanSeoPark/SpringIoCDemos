package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.combininglifecyclemechanisms.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CombinedLifecycleBean implements InitializingBean, DisposableBean {

    // @PostConstruct 애노테이션을 사용한 초기화 메서드
    @PostConstruct
    public void postConstruct() {
        System.out.println("CombinedLifecycleBean: @PostConstruct executed.");
    }

    // InitializingBean 인터페이스를 사용한 초기화 메서드
    @Override
    public void afterPropertiesSet() {
        System.out.println("CombinedLifecycleBean: InitializingBean's afterPropertiesSet executed.");
    }

    // 커스텀 초기화 메서드
    public void customInit() {
        System.out.println("CombinedLifecycleBean: Custom init() method executed.");
    }

    // @PreDestroy 애노테이션을 사용한 파괴 메서드
    @PreDestroy
    public void preDestroy() {
        System.out.println("CombinedLifecycleBean: @PreDestroy executed.");
    }

    // DisposableBean 인터페이스를 사용한 파괴 메서드
    @Override
    public void destroy() {
        System.out.println("CombinedLifecycleBean: DisposableBean's destroy executed.");
    }

    // 커스텀 파괴 메서드
    public void customDestroy() {
        System.out.println("CombinedLifecycleBean: Custom destroy() method executed.");
    }
}
