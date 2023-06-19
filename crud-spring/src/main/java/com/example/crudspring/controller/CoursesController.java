package com.example.crudspring.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudspring.model.Course;
import com.example.crudspring.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor


public class CoursesController {

    
    private final CourseRepository courseRepository;

    @GetMapping
    public @ResponseBody List<Course> list(){
        return courseRepository.findAll();
    }

}
