package com.flightAvailablity.flightAvailablity.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flightAvailablity.flightAvailablity.modal.flightSeatAvailablity;
import com.flightAvailablity.flightAvailablity.service.flightSeatAvailablityService;

@RestController
@RequestMapping("/flightAvailablity")
public class flightAvailablity {
	
	@Autowired
	private flightSeatAvailablityService flightSeatService;
	
	@GetMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping("/flightSeatCheckss/{id}")
	public void flightSeatAvailblityCheck(@PathVariable long flightId) {
		flightSeatService.getFlightSeatCount(flightId);
	}
	
	@RequestMapping("/flightSeatCheck")
	public flightSeatAvailablity flightSeatAvailblityCheckServices(@RequestParam long flightId ,  @RequestParam int ticketno) {
		return flightSeatService.getFlightSeatCountServices(flightId, ticketno);
	}

}
