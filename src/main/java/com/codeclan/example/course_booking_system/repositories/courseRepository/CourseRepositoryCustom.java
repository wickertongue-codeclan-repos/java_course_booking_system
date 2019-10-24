package com.codeclan.example.course_booking_system.repositories.courseRepository;

import com.codeclan.example.course_booking_system.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getAllCoursesByCustomer(String customerName);

}
