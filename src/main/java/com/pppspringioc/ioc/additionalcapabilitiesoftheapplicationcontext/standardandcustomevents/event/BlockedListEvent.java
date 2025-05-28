package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.standardandcustomevents.event;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
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
