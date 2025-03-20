package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Set up rest controller
public class FunRestController {

    //inject properties for: coach.name and taem.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: "+coachName+", Team name: "+teamName;
    }

    //expose "/" that return "Hello World"
    @GetMapping("/") //Handle HTTP GET requests
    public String sayHello(){
        return "Hello World";
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
