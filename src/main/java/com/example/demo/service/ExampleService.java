package com.example.demo.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExampleService {

    public String getHello(String name) {
        return "Hello World!" + name;
    }

}
