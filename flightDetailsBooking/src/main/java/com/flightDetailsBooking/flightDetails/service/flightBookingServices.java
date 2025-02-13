package com.flightDetailsBooking.flightDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightDetailsBooking.flightDetails.microservice.serviceConfig;
import com.flightDetailsBooking.flightDetails.modal.flightbooking;
import com.flightDetailsBooking.flightDetails.repositry.flightbookingRepo;

@Service
public class flightBookingServices {

	@Autowired
	private flightbookingRepo flightBookingRepo;
	
	@Autowired
	private serviceConfig serveConfig;
	
	public flightbooking getFlightDetailsById(long id) {
		 
		return flightBookingRepo.findById(id).get();
	}
	
	public List<flightbooking> getAllFlightDetails() {
		
		return flightBookingRepo.findAll();
	}
	
	public Object getSeatAvailablityCheck(long flightId , int ticketno) {
	//  long flightCheckId = flightBookingRepo.findById(flightId).get().getFlightId();
	  return serveConfig.creatingServices(flightId,ticketno);
	}
}
