package com.curso.curso.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "test")
    public List<String> test(){
        return List.of("apple","banana","kiwi");
    }
}