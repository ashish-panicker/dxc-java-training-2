package com.dxc.learning.demoapp1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    // endpoint hello
    // HTTP GET

    @GetMapping("/hello")
    public String hello() {
        return "Hello from spring boot";
    }

    // endpoint hello with name
    // HTTP GET
    // hello/ashish -> Hello from spring boot, Ashish
    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello from spring boot, " + name;
    }

    // endpoint that accept two numbers and return thr sum
    // HTTP GET
    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable int num1, @PathVariable int num2) {
        return "The sum = " + (num1 + num2);
    }

}
