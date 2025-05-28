package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.resourceinjection.service;

import jakarta.annotation.Resource;
import org.springframework.context.ApplicationContext;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.resourceinjection.domain.CustomerPreferenceDao;

public class MovieRecommender {

    // 1) @Resource without name => 빈의 타입이 CustomerPreferenceDao인 빈을 찾음
    @Resource
    private CustomerPreferenceDao customerPreferenceDao;

    // 2) Known resolvable dependency => ApplicationContext
    @Resource
    private ApplicationContext context;

    public void recommendMovie() {
        System.out.println("[MovieRecommender] Recommending movie...");
        System.out.println(" - " + customerPreferenceDao.getPreferences());
        System.out.println(" - ApplicationContext ID = " + context.getId());
    }
}
