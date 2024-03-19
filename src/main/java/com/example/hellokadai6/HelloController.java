package com.example.hellokadai6;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return"hello world";
    }

    @DeleteMapping("/hello")
    public String deletehello(){
        return"delete hello";
    }

    @PostMapping("/hello")
    public String posthello(){return "post hello";}

}
