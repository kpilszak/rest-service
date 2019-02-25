package com.projects.restservice;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    public String helloWorld() {
        return "Hello world";
    }
}
