package com.example.Task_manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String main(Map<String, Object> model) {
        return "home";
    }
}
