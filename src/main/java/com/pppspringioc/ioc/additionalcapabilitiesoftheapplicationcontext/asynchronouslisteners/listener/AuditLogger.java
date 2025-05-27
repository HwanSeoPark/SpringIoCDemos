package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.listener;

import org.springframework.core.annotation.Order;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.event.PersonCreatedEvent;



@Component
public class AuditLogger {

    @EventListener
    @Order(1)
    public void logPersonCreation(PersonCreatedEvent event) {
        System.out.println("📝 [Audit] Created person: " + event.getEntity().getName());
    }
}
