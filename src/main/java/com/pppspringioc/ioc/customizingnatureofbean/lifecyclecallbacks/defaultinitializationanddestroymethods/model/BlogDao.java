package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.defaultinitializationanddestroymethods.model;


public class BlogDao {

    public void connect() {
        System.out.println("BlogDao: Connecting to the database...");
    }

    public void disconnect() {
        System.out.println("BlogDao: Disconnecting from the database...");
    }
}
