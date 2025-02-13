package com.flightAvailablity.flightAvailablity.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightAvailablity.flightAvailablity.modal.flightSeatAvailablity;

public interface flightAvailblityRepo extends JpaRepository<flightSeatAvailablity, Long> {

}
