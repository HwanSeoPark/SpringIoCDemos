package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.startupndshutdowncallbacks.model;

import org.springframework.context.Lifecycle;

public class CustomLifecycleBean implements Lifecycle {

    private boolean running = false;

    @Override
    public void start() {
        System.out.println("CustomLifecycleBean: Starting...");
        running = true;
    }

    @Override
    public void stop() {
        System.out.println("CustomLifecycleBean: Stopping...");
        running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }
}

