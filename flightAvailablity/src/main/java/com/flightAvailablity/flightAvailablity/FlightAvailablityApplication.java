package com.flightAvailablity.flightAvailablity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FlightAvailablityApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightAvailablityApplication.class, args);
	}

}
