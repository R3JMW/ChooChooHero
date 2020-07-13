package com.cch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class heartbeat {

    @GetMapping("ping")
    public String heartbeat() {
        return "pong";
    }
}
