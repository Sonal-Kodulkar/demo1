package com.javadeveloperzone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingPage {

    @GetMapping("/greetings")
    public String greetings()
    {

        return "PageGreeting";
    }
}
