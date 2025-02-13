package com.flightAvailablity.flightAvailablity.microservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "paymentDetails" , url = "http://localhost:8083/paymentDetails")
public interface feignService {
	
	@GetMapping("/welcome")
	@ResponseBody
	public String welcomepayment() ;
	
	@GetMapping("/getAccountDetails/{id}")
	public Object getAccountDetails(@PathVariable int id);

}
