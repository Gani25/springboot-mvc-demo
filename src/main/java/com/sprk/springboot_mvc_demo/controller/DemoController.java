package com.sprk.springboot_mvc_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class DemoController {

    @GetMapping("/hello")

    public String showHelloPage(Model model){
        Date date = new Date();

        model.addAttribute("serverDate", date);
        return "hello";
    }

}
