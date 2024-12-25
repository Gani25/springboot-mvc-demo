package com.sprk.springboot_mvc_demo.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Student {

    private int rollno;

    private String name;

    private String gender;

    private String country;

    private List<String> skills;

}
