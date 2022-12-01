package com.example.demo1;

import org.junit.Test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


public class HelloResource {


    @Test
    public String hello() {
        return "Hello, Worl111d!";
    }
}