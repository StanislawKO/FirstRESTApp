package com.kozh.springcourse.firstrestapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class FirstRESTController {

    @ResponseBody
    @GetMapping("/sayHello")
    public String sayHallo() {
        return "Hello world!";
    }
}
