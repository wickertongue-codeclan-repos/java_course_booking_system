package com.codeclan.example.course_booking_system.repositories.bookingRepository;

import com.codeclan.example.course_booking_system.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> findBookingsByDate(String date);
}
