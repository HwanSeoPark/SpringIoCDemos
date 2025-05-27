package com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles.service;

public class NotificationServiceStub implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("📨 [Stub] 메시지 전송됨 (실제로는 아무 것도 하지 않음): " + message);
    }
}