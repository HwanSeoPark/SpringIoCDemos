package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MovieController {
    public void display() {
        System.out.println("MovieController: Display movies.");
    }
}
