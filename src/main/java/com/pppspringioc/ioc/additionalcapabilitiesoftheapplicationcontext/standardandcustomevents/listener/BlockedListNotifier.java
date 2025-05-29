package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.listener;


import org.springframework.context.ApplicationListener;

import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.event.BlockedListEvent;
// ApplicationListener은 알림을 받고 싶은 사람들만 구독해서 알림을 받는다는 메커니즘
// BlockedListNotifier가 ApplicationListener의 구현체로
// 결국 BlockedListNotifier가 알림을 받고 싶어함(구독할 애)
public class BlockedListNotifier implements ApplicationListener<BlockedListEvent> {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    // 누군가(Spring IoC 컨테이너)가 BlockedListEvent 이벤트를 발행하면,
    // Spring IoC 컨테이너에 의해 호출
    @Override
    public void onApplicationEvent(BlockedListEvent event) {
        System.out.printf("🔔 [%s] 알림: 차단된 이메일 감지 - %s%n",
                notificationAddress, event.getBlockedEmail());
    }
}
