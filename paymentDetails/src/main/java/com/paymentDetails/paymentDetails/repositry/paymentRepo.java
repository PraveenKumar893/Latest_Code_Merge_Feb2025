package com.paymentDetails.paymentDetails.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentDetails.paymentDetails.Modal.paymentInfo;

@Repository
public interface paymentRepo extends JpaRepository<paymentInfo, Integer> {
	
	
	paymentInfo findByFlightIdAndTicketno(long flightId, int ticketno);

}
