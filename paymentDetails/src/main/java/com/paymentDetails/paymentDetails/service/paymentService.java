package com.paymentDetails.paymentDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentDetails.paymentDetails.Modal.paymentInfo;
import com.paymentDetails.paymentDetails.repositry.paymentRepo;

@Service
public class paymentService {

	@Autowired
	private paymentRepo paymentRepo;

	public paymentInfo getTicketDetailsAgainstTicketId(int ticketId) {
		return paymentRepo.findById(ticketId).get();
	}

	
	 public paymentInfo getdetailsfromflightIdandTicketId(long flightId , int
	  ticketno) {
	  System.out.println(paymentRepo.findByFlightIdAndTicketno(flightId, ticketno));
	  return paymentRepo.findByFlightIdAndTicketno(flightId, ticketno);
	 }


	public paymentInfo getAccountDetails(int ticketNo) {
		return paymentRepo.findById(ticketNo).get() ;
	}
}