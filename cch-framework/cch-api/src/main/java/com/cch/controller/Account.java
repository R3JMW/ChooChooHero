package com.cch.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Account {

    @PostMapping("/login")
    public String login(
            @PathVariable("user") String user,
            @PathVariable("passwd") String passwd
    ) {
        return user + " " + passwd;
    }


}
