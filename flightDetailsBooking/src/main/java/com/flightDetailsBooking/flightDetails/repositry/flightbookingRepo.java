package com.flightDetailsBooking.flightDetails.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightDetailsBooking.flightDetails.modal.flightbooking;

public interface flightbookingRepo extends JpaRepository<flightbooking, Long > {

}
