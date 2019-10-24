package com.codeclan.example.course_booking_system.controllers;

import com.codeclan.example.course_booking_system.models.Course;
import com.codeclan.example.course_booking_system.repositories.courseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/customers/findByName/{name}")
    public List<Course> getAllCoursesByCustomer(@PathVariable String name) {
        return courseRepository.getAllCoursesByCustomer(name);
    }

}
