package com.example.demo.Controller;


import com.example.demo.Model.Faculty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/faculty")
public class FacultyController {

    @GetMapping("/")
    public List<Faculty> getFaculty(){
        return  List.of(
                new Faculty("Robert","Cleaner",4000),
                new Faculty("Erling","Technician",6000)
        );
    }
}
