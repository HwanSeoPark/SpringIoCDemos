package com.pppspringioc.ioc.additionalcapabilitiesoftheapplicationcontext.asynchronouslisteners.event;


import org.springframework.context.ApplicationEvent;
import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

public class EntityCreatedEvent<T> extends ApplicationEvent implements ResolvableTypeProvider {

    public EntityCreatedEvent(T entity) {
        super(entity);
    }

    @SuppressWarnings("unchecked")
    public T getEntity() {
        return (T) getSource();
    }

    @Override
    public ResolvableType getResolvableType() {
        return ResolvableType.forClassWithGenerics(getClass(), ResolvableType.forInstance(getSource()));
    }
}
