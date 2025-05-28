package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.annotationbasedeventlisteners.event;

import org.springframework.context.ApplicationEvent;

public class BlockedListEvent extends ApplicationEvent {
    private final String blockedEmail;

    public BlockedListEvent(Object source, String blockedEmail) {
        super(source);
        this.blockedEmail = blockedEmail;
    }

    public String getBlockedEmail() {
        return blockedEmail;
    }
}
