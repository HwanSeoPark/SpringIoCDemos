package com.pppspringioc.ioc.dependencies.methodinjection.model;


import java.util.Map;

public class ConcreteCommand implements Command {
    private Map<String, Object> state;

    @Override
    public void setState(Map<String, Object> state) {
        this.state = state;
    }

    @Override
    public Object execute() {
        // Perform some operation based on the state
        return "Command executed with state: " + state;
    }
}