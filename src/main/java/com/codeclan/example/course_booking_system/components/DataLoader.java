package com.codeclan.example.course_booking_system.components;

import com.codeclan.example.course_booking_system.models.Booking;
import com.codeclan.example.course_booking_system.models.Course;
import com.codeclan.example.course_booking_system.models.Customer;
import com.codeclan.example.course_booking_system.repositories.bookingRepository.BookingRepository;
import com.codeclan.example.course_booking_system.repositories.courseRepository.CourseRepository;
import com.codeclan.example.course_booking_system.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Course course1 = new Course("React", "Edinburgh", 3);
        courseRepository.save(course1);

        Course course2 = new Course("JavaScript", "Glasgow", 5);
        courseRepository.save(course2);

        Course course3 = new Course("Java", "Glasgow", 4);
        courseRepository.save(course3);

        Customer customer1 = new Customer("Amanda",31,"Edinburgh");
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Hayden", 29, "Edinburgh");
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Alex", 51, "Glasgow");
        customerRepository.save(customer3);

        Booking booking1 = new Booking("21-03-2019", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("03-09-2017", course2, customer2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("14-02-2018", course3, customer3);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("14-02-2018", course3, customer2);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("04-10-2017", course1, customer2);
        bookingRepository.save(booking5);

    }

}
