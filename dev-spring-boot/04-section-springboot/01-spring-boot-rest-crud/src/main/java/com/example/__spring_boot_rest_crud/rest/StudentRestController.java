package com.example.__spring_boot_rest_crud.rest;

import com.example.__spring_boot_rest_crud.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Majd","Alhader"));
        theStudents.add(new Student("Zaid","Alhader"));
        theStudents.add(new Student("Ahmad","Alhader"));

        return theStudents;
    }
}
