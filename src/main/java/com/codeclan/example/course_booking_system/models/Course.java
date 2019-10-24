package com.codeclan.example.course_booking_system.models;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String town;
    private int starRating;
    private List<Booking> courseBookings;

    public Course(String name, String town, int starRating) {
        this.name = name;
        this.town = town;
        this.starRating = starRating;
        this.courseBookings = new ArrayList<>();
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

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public List<Booking> getCourseBookings() {
        return courseBookings;
    }

    public void setCourseBookings(List<Booking> courseBookings) {
        this.courseBookings = courseBookings;
    }
}
