package com.example.demo;



import java.io.Serializable;


public class ApiResponse<T> implements Serializable {
    private int code;
    private  String message;
    private T result;
    private boolean success;

    public  ApiResponse(){

    }
}
