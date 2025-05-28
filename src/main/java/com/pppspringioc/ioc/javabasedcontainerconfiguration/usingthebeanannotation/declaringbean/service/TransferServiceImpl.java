package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.declaringbean.service;

public class TransferServiceImpl implements TransferService, Auditable, Loggable{

	@Override
	public void transfer() {
		System.out.println("TransferServiceImpl transfer");
	}
	
	
	@Override
	public void audit() {
		System.out.println("Auditing transfer...");
	}

	@Override
	public void log() {
		System.out.println("Logging transfer...");
	}

}
