package com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles.service;

public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("📧 [Email] 운영자에게 이메일 전송: " + message);
    }
}