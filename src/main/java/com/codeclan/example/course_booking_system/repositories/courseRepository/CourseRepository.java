package com.codeclan.example.course_booking_system.repositories.courseRepository;

import com.codeclan.example.course_booking_system.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
