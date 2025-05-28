package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.annotationbasedeventlisteners.listener;


import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.annotationbasedeventlisteners.event.BlockedListEvent;
import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.annotationbasedeventlisteners.event.ListUpdateEvent;

@Component
public class BlockedListNotifier {

    private String notificationAddress = "admin@yourcompany.com";

    @EventListener
    public ListUpdateEvent processBlockedListEvent(BlockedListEvent event) {
        System.out.printf("🔔 [%s] 차단 알림: %s%n", notificationAddress, event.getBlockedEmail());
        // 리턴하면 해당 이벤트가 다시 publish됨
        return new ListUpdateEvent(this);
    }

    @EventListener(ListUpdateEvent.class)
    public void handleListUpdate(ListUpdateEvent event) {
        System.out.println("📄 차단 목록 업데이트 알림 수신 완료");
    }
}
