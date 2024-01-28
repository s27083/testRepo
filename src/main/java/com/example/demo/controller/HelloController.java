package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<String> getIndex() {
        return ResponseEntity.ok("Hello World!") ;
    }

    @GetMapping("/error")
    public String elo() {
        return "Hello World!" ;
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World!" ;
    }
}