package com.pppspringioc.ioc.autowire.mybeanpostprocessor;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String getData() {
        return "Repository Data";
    }
}