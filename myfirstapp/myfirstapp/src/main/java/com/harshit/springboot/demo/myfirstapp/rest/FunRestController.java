package com.harshit.springboot.demo.myfirstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello Spring World";
    }

    @GetMapping("/homepage")
    public String gethomepage(){
        return "Welcome to the Homepage";
    }

    @GetMapping("/about")
    public String about(){
        return "Do you want to know something about the project??";
    }
}
