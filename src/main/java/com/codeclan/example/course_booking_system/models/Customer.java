package com.codeclan.example.course_booking_system.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "town")
    private String town;

    @Column(name = "age")
    private int age;

    @JsonIgnoreProperties(value = "customers")
    @OneToMany(mappedBy = "customers", fetch = FetchType.LAZY)
    private List<Booking> customerBookings;

    public Customer(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
        this.customerBookings = new ArrayList<>();
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
