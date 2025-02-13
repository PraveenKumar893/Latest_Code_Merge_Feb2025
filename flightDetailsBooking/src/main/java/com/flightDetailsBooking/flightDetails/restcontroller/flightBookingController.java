package com.flightDetailsBooking.flightDetails.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flightDetailsBooking.flightDetails.modal.flightbooking;
import com.flightDetailsBooking.flightDetails.service.flightBookingServices;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;

@RestController
@RequestMapping("/flightBooking")
public class flightBookingController {
	
	@Autowired
	private flightBookingServices flightBookingService;
	
	@GetMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping("/findflightbyId/{id}")
	public flightbooking findById(@PathVariable long id) {
		return flightBookingService.getFlightDetailsById(id);
	}
	
	@GetMapping("/findallflight")
	public List<flightbooking> findall() {
		return flightBookingService.getAllFlightDetails();
	}
	
	@GetMapping("/findflightSeatbyId")
	@CircuitBreaker(name = "flightAvailablity" , fallbackMethod = "circuitfailedmethod" )
	public Object findBySeatId(@RequestParam long flightId , @RequestParam int ticketno) {
		 return flightBookingService.getSeatAvailablityCheck(flightId,ticketno);
	}

   public Object circuitfailedmethod(long id , int ticketno , RuntimeException runtimeException) {
	   return "Failed to load Services" ;
   }
}
