package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.listener;


import org.springframework.context.ApplicationListener;

import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.event.BlockedListEvent;

public class BlockedListNotifier implements ApplicationListener<BlockedListEvent> {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @Override
    public void onApplicationEvent(BlockedListEvent event) {
        System.out.printf("🔔 [%s] 알림: 차단된 이메일 감지 - %s%n",
                notificationAddress, event.getBlockedEmail());
    }
}
