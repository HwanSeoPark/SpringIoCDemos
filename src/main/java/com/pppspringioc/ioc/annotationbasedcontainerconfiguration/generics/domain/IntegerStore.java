package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.generics.domain;

import java.util.ArrayList;
import java.util.List;

public class IntegerStore implements Store<Integer> {

    private final List<Integer> storage = new ArrayList<>();

    @Override
    public void addItem(Integer item) {
        storage.add(item);
    }

    @Override
    public Integer getItem(int index) {
        return storage.get(index);
    }

    @Override
    public String storeType() {
        return "IntegerStore";
    }
}
