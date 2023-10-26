package com.example.vale.tutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
@RequestMapping(path = "/Hello")
    public String getGreeting() {
        return "Hello World";
    }
}
