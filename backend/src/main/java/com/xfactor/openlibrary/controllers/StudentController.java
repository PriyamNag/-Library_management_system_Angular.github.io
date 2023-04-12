package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Student;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("students")
public class StudentController {
    ArrayList<Student> lStudents = new ArrayList<>();

    @PostMapping("/saveStudents")
    public Student saveStudent(@RequestBody Student student) {
        lStudents.add(student);
        return student;
    }

    @GetMapping("/getAllStudents")
    public ArrayList<Student> getAllStudents() {
        return lStudents;
    }
}