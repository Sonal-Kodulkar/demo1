package com.javadeveloperzone.controller;

import com.javadeveloperzone.webdto.UserRegistrationDto;
import jdk.nashorn.api.scripting.JSObject;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
//@RequestMapping("/signUp")
public class SignUpPage {

    @PostMapping (value = "/signUp",
            consumes = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE},
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE})

    public String signUp(@RequestBody String user, HttpServletRequest httpServletRequest)
    {
        JSONObject jsonObject = new JSONObject(user);
        User user1= new User();
        user1.setUsername(jsonObject.getString("Username"));
        user1.setPassword(jsonObject.getString("Password"));
        user1.setPassword(jsonObject.getString("ReEnterPassword"));
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.saveMethod(user1);

        return "PageSignUp";
    }

}
