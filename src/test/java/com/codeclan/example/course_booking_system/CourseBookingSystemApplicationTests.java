package com.codeclan.example.course_booking_system;

import com.codeclan.example.course_booking_system.models.Course;
import com.codeclan.example.course_booking_system.repositories.bookingRepository.BookingRepository;
import com.codeclan.example.course_booking_system.repositories.courseRepository.CourseRepository;
import com.codeclan.example.course_booking_system.repositories.customerRepository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class CourseBookingSystemApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canGetAllCoursesWithARating() {
		List<Course> foundCourses = courseRepository.findCoursesByStarRating(3);
		assertEquals(1, foundCourses.size());
		assertEquals("React", foundCourses.get(0).getName());
	}

}
