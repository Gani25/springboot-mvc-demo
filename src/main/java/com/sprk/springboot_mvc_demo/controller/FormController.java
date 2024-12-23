package com.sprk.springboot_mvc_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sprk.springboot_mvc_demo.model.Student;

@Controller
public class FormController {

    @GetMapping("/show-form")
    public String showStudentForm(Model model) {
        // Empty Student
        Student student = new Student();
        // student.setGender("Female");
        // student.setRollno(20);
        // student.setName("Rohan");
        model.addAttribute("student", student);
        return "student-form";
    }

    @PostMapping("/save")
    public String processForm(@ModelAttribute Student student) {

        System.out.println(student);
        return "index";
    }

}