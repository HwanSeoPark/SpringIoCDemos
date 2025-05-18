package com.pppspringioc.ioc.dependencies.methodinjection.lookupmethodInjection.model;

public interface Command {
    void setState(Object state);
    Object execute();
}