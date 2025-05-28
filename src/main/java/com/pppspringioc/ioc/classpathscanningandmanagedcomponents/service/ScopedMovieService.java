package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.service;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("session")
public class ScopedMovieService {
    public void print() {
        System.out.println("Session Scoped MovieService.");
    }
}
