package com.paymentDetails.paymentDetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.paymentDetails.paymentDetails.Modal.paymentInfo;
import com.paymentDetails.paymentDetails.service.paymentService;

@RestController
@RequestMapping("/paymentDetails")
public class paymentDetailsController {
	
	@Autowired
	private paymentService paymentService;
	
	@GetMapping("/welcome")
	@ResponseBody
	public String welcomepayment() {
		return "Welcome to payment Section";
	}
	
	@GetMapping("/getPaymentDetails")
	public paymentInfo getfromFlightIdandTicketNo(@RequestParam long flightId , @RequestParam int ticketno) {
		return paymentService.getdetailsfromflightIdandTicketId(flightId,ticketno);
	}
	
	@GetMapping("/getAccountDetails/{id}")
	public paymentInfo getAccountDetails(@PathVariable int id) {
		
		return paymentService.getAccountDetails(id);
		
	}
	

}
