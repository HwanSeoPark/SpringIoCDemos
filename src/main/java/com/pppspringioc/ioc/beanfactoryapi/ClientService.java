package com.pppspringioc.ioc.beanfactoryapi;

import org.springframework.beans.factory.annotation.Autowired;

public class ClientService {

    @Autowired
    private MessageService messageService;

    public void execute() {
        System.out.println("ClientService: " + messageService.getMessage());
    }
}
