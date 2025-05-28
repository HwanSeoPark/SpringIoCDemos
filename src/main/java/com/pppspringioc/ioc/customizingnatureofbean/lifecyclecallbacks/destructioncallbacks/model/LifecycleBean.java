package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.destructioncallbacks.model;

import org.springframework.context.SmartLifecycle;

public class LifecycleBean implements SmartLifecycle {

    private boolean running = false;

    @Override
    public void start() {
        System.out.println("LifecycleBean: Starting...");
        running = true;
    }

    @Override
    public void stop() {
        System.out.println("LifecycleBean: Stopping...");
        running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public int getPhase() {
        return 0; // Determines the phase order during lifecycle events
    }

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable callback) {
        stop();
        callback.run();
    }
}
