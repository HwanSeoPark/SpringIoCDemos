package com.pppspringioc.ioc.beanfactoryapi.defaultbeanfactroy;

public class HelloService {

	private Printer printer;
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void sayHello() {
		printer.print("Hello, Spring Factroy");
	}

}
