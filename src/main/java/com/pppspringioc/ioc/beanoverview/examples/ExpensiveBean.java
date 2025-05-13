package com.pppspringioc.ioc.beanoverview.examples;

public class ExpensiveBean {

	public ExpensiveBean() {
        System.out.println("ExpensiveBean created lazily.");
    }

    public void doWork() {
        System.out.println("Doing work in ExpensiveBean.");
    }
}
