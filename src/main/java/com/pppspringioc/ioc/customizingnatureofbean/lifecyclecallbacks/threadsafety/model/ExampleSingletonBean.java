package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.threadsafety.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.concurrent.atomic.AtomicInteger;

public class ExampleSingletonBean {

    private volatile boolean isActive; // 런타임 상태
    private final AtomicInteger counter = new AtomicInteger(0); // 스레드 안전한 데이터 구조

    // 초기화 콜백
    @PostConstruct
    public void init() {
        isActive = true; // 초기화 상태 설정
        System.out.println("ExampleSingletonBean: Initialized. isActive = " + isActive);
    }

    // 런타임 중 호출 가능한 메서드
    public void incrementCounter() {
        if (!isActive) {
            throw new IllegalStateException("Bean is not active!");
        }
        int currentCount = counter.incrementAndGet();
        System.out.println("ExampleSingletonBean: Counter incremented to " + currentCount);
    }

    public int getCounter() {
        return counter.get();
    }

    // 파괴 콜백
    @PreDestroy
    public void cleanup() {
        isActive = false; // 런타임 상태 종료
        System.out.println("ExampleSingletonBean: Cleanup executed. isActive = " + isActive);
    }
}
