package com.codeclan.example.course_booking_system.models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String town;
    private int age;
    private List<Booking> customerBookings;

    public Customer(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
        this.customerBookings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Booking> getCustomerBookings() {
        return customerBookings;
    }

    public void setCustomerBookings(List<Booking> customerBookings) {
        this.customerBookings = customerBookings;
    }
}
