package com.codeclan.example.course_booking_system.controllers;

import com.codeclan.example.course_booking_system.models.Customer;
import com.codeclan.example.course_booking_system.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/courses/findByCourse/{name}")
    public List<Customer> getAllCustomersByCourse(@PathVariable String name) {
        return customerRepository.getAllCustomersByCourse(name);
    }
}
