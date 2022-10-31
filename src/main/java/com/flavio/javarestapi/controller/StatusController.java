package com.flavio.javarestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")

@RestController
public class StatusController {
    @GetMapping("status")
    public String check() {
        return "online";
    }

}
