package com.coudevi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResourceController {
    @GetMapping("/resource")
    public String getResource(){
        return "Protected resource accessed successfully";
    }
}
