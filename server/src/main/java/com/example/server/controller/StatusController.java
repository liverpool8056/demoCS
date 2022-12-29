package com.example.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/demo-test")
public class StatusController {

    @GetMapping(value="/CHECK_HEALTH/", produces = "application/json")
    public String health(HttpServletResponse response){
//        RuntimeException e = new RuntimeException("custom");
//        throw e;
        return "health";
    }
}
