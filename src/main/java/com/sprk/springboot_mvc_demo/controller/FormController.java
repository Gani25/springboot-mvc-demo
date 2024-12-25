package com.sprk.springboot_mvc_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sprk.springboot_mvc_demo.model.Student;

@Controller
public class FormController {

    @Value("${countries}")
    private List<String> allCountries;
    @Value("${skills}")
    private List<String> allSkills;

    @GetMapping("/show-form")
    public String showStudentForm(Model model) {
        // Empty Student
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("countries", allCountries);
        model.addAttribute("allSkills", allSkills);
        return "student-form";
    }

    @PostMapping("/save")
    public String processForm(@ModelAttribute Student student) {

        System.out.println(student);
        // model.addAttribute("studentObj", student);

        return "index";
    }

}
