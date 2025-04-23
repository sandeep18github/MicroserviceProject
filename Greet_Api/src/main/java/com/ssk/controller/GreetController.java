package com.ssk.controller;

import com.ssk.client.WelcomeFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @Autowired
    private WelcomeFeignClient welcomeFeignClient;

    @GetMapping("/greet")
    public String getGreetMsg() {

        String welcomeMsg = welcomeFeignClient.getWelcomeMsg();

        String greetMsg = "Good Morning Microservice 2";
        return greetMsg + welcomeMsg;
    }
}
