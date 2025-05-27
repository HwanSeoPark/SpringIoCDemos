package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.event.PersonCreatedEvent;
import com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.model.Person;

public class PersonService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void createPerson(String name) {
        Person person = new Person(name);
        System.out.println("👤 Person created: " + name);
        publisher.publishEvent(new PersonCreatedEvent(person));
    }
}
