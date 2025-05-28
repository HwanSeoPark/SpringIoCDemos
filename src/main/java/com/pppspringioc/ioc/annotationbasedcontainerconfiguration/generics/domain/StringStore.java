package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.generics.domain;

import java.util.ArrayList;
import java.util.List;

public class StringStore implements Store<String> {

    private final List<String> storage = new ArrayList<>();

    @Override
    public void addItem(String item) {
        storage.add(item);
    }

    @Override
    public String getItem(int index) {
        return storage.get(index);
    }

    @Override
    public String storeType() {
        return "StringStore";
    }
}
