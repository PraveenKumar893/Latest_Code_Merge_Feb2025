package com.flightAvailablity.flightAvailablity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightAvailablity.flightAvailablity.microservice.feignService;
import com.flightAvailablity.flightAvailablity.modal.flightSeatAvailablity;
import com.flightAvailablity.flightAvailablity.repositry.flightAvailblityRepo;

@Service
public class flightSeatAvailablityService {
	
	@Autowired
	private flightAvailblityRepo flightSeatRepo;
	
	@Autowired
	private feignService feignService;
	
	public void getFlightSeatCount(long flightId) {
		flightSeatRepo.findById(flightId).get();
	}

	public flightSeatAvailablity getFlightSeatCountServices(long flightId, int ticketno) {
		
	   
	   feignService.getAccountDetails(ticketno);
	   
	   System.out.println(" The Services Has been called ");
		
	   return flightSeatRepo.findById(flightId).get();
	}
	

}
