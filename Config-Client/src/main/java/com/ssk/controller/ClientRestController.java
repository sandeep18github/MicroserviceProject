package com.ssk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestController {
    @Value("${msg}")
    private String msg;

    @GetMapping("/")
    public String getMsg() {
        return msg;
    }
}
