package com.hamdi.quiz.controller;
import org.springframework.web.bind.annotation.RequestMapping;
public class indexController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
