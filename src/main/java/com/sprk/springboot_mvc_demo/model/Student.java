package com.sprk.springboot_mvc_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Student {

    private int rollno;

    private String name;

    private String gender;

    private boolean prime;

}
