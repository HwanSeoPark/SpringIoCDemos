package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.annotationbasedeventlisteners.event;

import org.springframework.context.ApplicationEvent;

public class ListUpdateEvent extends ApplicationEvent {
    public ListUpdateEvent(Object source) {
        super(source);
    }
}
