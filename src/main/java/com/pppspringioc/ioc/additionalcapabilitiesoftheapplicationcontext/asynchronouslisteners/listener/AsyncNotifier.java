package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.event.PersonCreatedEvent;

@Component
public class AsyncNotifier {

    @Async
    @EventListener
    public void notifyCreation(PersonCreatedEvent event) {
        System.out.println("📨 [Async] Notification sent for person: " + event.getEntity().getName() +
                           " | Thread: " + Thread.currentThread().getName());
        // throw new RuntimeException("비동기 예외 테스트"); // 예외 테스트용
    }
}
