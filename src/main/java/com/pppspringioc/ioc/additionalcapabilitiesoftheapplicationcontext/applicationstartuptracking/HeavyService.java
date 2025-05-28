package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.applicationstartuptracking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.core.metrics.StartupStep;

public class HeavyService implements ApplicationContextAware {

    private ApplicationStartup applicationStartup;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
    	this.applicationStartup =
    	        ((AbstractApplicationContext) applicationContext).getApplicationStartup();
        // 커스텀 StartupStep 수집
        StartupStep step = applicationStartup.start("custom.heavyService.init");
        step.tag("description", "initializing heavy service");
        simulateHeavyStartupTask();
        step.end();
    }

    private void simulateHeavyStartupTask() {
        try {
            Thread.sleep(500); // 무거운 초기화 시뮬레이션
            System.out.println("🔧 HeavyService initialized.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
