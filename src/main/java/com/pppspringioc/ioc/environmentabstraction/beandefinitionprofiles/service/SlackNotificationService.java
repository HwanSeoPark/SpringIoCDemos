package com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles.service;

public class SlackNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("💬 [Slack] 슬랙 채널로 메시지 전송: " + message);
    }
}