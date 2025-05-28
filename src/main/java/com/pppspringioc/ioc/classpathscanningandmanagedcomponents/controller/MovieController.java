package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.controller;

import org.springframework.stereotype.Controller;

@Controller // Component를 기반으로하는 스테레오 어노테이션
public class MovieController {
    public void display() {
        System.out.println("MovieController: Display movies.");
    }
}
