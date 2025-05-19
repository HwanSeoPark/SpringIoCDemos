package com.pppspringioc.ioc.customizinginstantiationlogicwithfactorybean.model;

import org.springframework.beans.factory.FactoryBean;

public class CustomObjectFactoryBean implements FactoryBean<CustomObject> {

    private String name = "DefaultName";
    private int value = 42;

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public CustomObject getObject() {
        // 객체 생성 로직
        return new CustomObject(name, value);
    }

    @Override
    public Class<?> getObjectType() {
        return CustomObject.class;
    }

    @Override
    public boolean isSingleton() {
        return true; // 싱글톤으로 반환
    }
}
