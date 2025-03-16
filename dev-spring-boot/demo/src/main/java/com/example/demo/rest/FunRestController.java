package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Set up rest controller
public class FunRestController {
    //expose "/" that return "Hello World"
    @GetMapping("/") //Handle HTTP GET requests
    public String sayHello(){
        return "Majd Abdullah Alhader";
    }

}
