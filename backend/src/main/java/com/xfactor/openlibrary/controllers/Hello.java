package com.xfactor.openlibrary.controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello(@RequestParam String name , int num ) {
        return "Hello!!!" + name + " is my World till " + num ;
    }

    @GetMapping("/hi/{name}/{num}")
    public String sayhi(@PathVariable String name, @PathVariable int num ){
        return "Hiiii " + name + "!! " + num;
    }
    @GetMapping("/hey/{name}/{age}")
    public HashMap<String, String> sayhey(@PathVariable String name, @PathVariable int age )
    {
        HashMap<String, String> rp=new HashMap<>();
        rp.put("name", name);
        rp.put("age", String.valueOf(age));
        return rp;
    }
}