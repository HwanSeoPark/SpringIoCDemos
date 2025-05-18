package com.pppspringioc.ioc.dependencies.methodinjection.lookupmethodInjection.model;

public class AsyncCommand implements Command {
	
    private Object state;

    @Override
    public void setState(Object state) {
        this.state = state;
    }

    @Override
    public Object execute() {
        // 실행 로직 (간단한 예시로 상태를 반환)
        return "Executing command with state: " + state;
    }
}