package com.sprk.springboot_mvc_demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sprk.springboot_mvc_demo.model.Student;

import jakarta.annotation.PostConstruct;

@Controller
public class StudentController {

    private List<Student> students = new ArrayList<>();

    @PostConstruct
    void init() {
        System.out.println("~~~~Init Method Executes~~~~");
        students.add(new Student(1, "Rohan Deshmukh", "Male", false));
        students.add(new Student(2, "Rohit Jadhav", "Male", true));
        students.add(new Student(3, "Rohit Das", "Male", false));
        students.add(new Student(4, "Pranjal Sharma", "Female", true));
    }

    // NOUN instead of VERBS
    @GetMapping("/student")
    public String getMethodName(Model model) {

        model.addAttribute("students", students);
        return "dashboard";
    }

}
