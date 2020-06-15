package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class testController {

    @RequestMapping("hello")
    public String helloWord(){
        int value=0;
        for(int i=0; i<5; i++){
            value++;
        }
        return "SpringBoot";
    }

}