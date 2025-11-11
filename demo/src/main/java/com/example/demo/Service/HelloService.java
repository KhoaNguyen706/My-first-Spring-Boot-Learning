package com.example.demo.Service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class HelloService implements IHelloService{
    @Override
    public String great(){
        return "This is my first time try to write code with Service layer";
    }

    @Override
    public String bye(){
        return "This is my second time try to understand service layer";
    }

    @Override
    public Map<String,String> sayhello(){
        return Map.of("Message","First time with Json");
    }
}
