package com.javadeveloperzone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Lenovo on 19-07-2017.
 */
@Controller
public class HomePage {

    @GetMapping("/welcome")                     // it will handle all request for /welcome
    public String SpringBootHello() {
        return "welcome";           // welcome is view name. It will call welcome.jsp
    }
}
