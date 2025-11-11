package com.example.demo.Service;

import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.Map;

public interface IHelloService {
    String great();
    String bye();
    Map<String,String> sayhello();
}


