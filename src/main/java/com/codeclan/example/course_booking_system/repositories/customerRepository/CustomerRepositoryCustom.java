package com.codeclan.example.course_booking_system.repositories.customerRepository;

import com.codeclan.example.course_booking_system.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getAllCustomersByCourse(String courseName);
}
