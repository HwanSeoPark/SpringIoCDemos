package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.service;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.event.BlockedListEvent;

import java.util.List;
//ApplicationEventPublisherAware -> 이벤트를 발생 시키고 싶어 하는 주체
// EmailService가 ApplicationEventPublisherAware를 구현한 구현체
// 결국 EmailService가 이벤트를 발생 시키고 싶어함
public class EmailService implements ApplicationEventPublisherAware {

    private List<String> blockedList;
    private ApplicationEventPublisher eventPublisher;

    public void setBlockedList(List<String> blockedList) {
        this.blockedList = blockedList;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.eventPublisher = publisher;
    }

    public void sendEmail(String email, String content) {
        if (blockedList.contains(email)) {
            System.out.println("🚫 차단된 이메일 주소입니다: " + email);
            eventPublisher.publishEvent(new BlockedListEvent(this, email));
        } else {
            System.out.println("📧 이메일 전송 완료: " + email);
        }
    }
}
