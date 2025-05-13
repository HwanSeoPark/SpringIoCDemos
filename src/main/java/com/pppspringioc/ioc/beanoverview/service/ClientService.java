package com.pppspringioc.ioc.beanoverview.service;

public class ClientService {
	
	private static final ClientService instance = new ClientService();

    private ClientService() {
        System.out.println("ClientService created.");
    }

    public static ClientService createInstance() {
        return instance;
    }


}