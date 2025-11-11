package com.example.demo.Controller;

import com.example.demo.Service.HelloService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    

    @GetMapping("/hello")
    public String hello(){
        return "Hello, This is my first Spring Boot API";
    }

    @GetMapping("/api/v1/great")
    public String helloTwo(){
        return helloService.great();
    }

    @GetMapping("/api/v1/bye")
    public String bye(){
        return helloService.bye();
    }

    @GetMapping("/api/v1/helloJson")
    public ResponseEntity<Map<String,String>> sayHello(){
        return ResponseEntity.ok(helloService.sayhello());
    }
}
