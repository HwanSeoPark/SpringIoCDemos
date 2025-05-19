package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.lifecycle.service;

import org.springframework.context.Lifecycle;

public class LifeCycleService implements Lifecycle {
	private boolean isRunning = false;
	
	
	@Override
	public void start() {
		isRunning = true;
		System.out.println("LifeCycleService:start");
		
	}

	@Override
	public void stop() {
		System.out.println("LifeCycleService:stop");
		
	}

	@Override
	public boolean isRunning() {
		System.out.println("LifeCycleService:isRunning");
		return false;
	}
	
	public void destroy() {
		
	}
	

}
