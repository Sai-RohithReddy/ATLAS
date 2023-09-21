package com.atlas.dynamodb.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloContorller {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!!";
    }
    @GetMapping("/{name}")
    public String greet(@PathVariable(value = "name") String name) {
        return "Hope you are doing good "+ name +"!";
    }
}
