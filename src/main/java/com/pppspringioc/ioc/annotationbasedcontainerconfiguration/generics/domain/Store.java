package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.generics.domain;

public interface Store<T> {
    void addItem(T item);

    T getItem(int index);

    String storeType();
}
