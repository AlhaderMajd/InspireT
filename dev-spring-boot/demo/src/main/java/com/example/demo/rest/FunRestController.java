package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Set up rest controller
public class FunRestController {
    //expose "/" that return "Hello World"
    @GetMapping("/") //Handle HTTP GET requests
    public String sayHello(){
        return "Hellow!";
    }

    @GetMapping("/workout")
    public String gitDailyWorkout(){
        return "Run a hard 5k";
    }

    @GetMapping("/sayMyName")
    public String majd(){
        return "Majd Abdullah fawze Alhader";
    }

}
