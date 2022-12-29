package com.example.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class HttpStatusController {

    @GetMapping("/408")
    @ResponseStatus(code = HttpStatus.REQUEST_TIMEOUT, reason = "timeout")
    public String s408(){
        return "good";
    }
}
