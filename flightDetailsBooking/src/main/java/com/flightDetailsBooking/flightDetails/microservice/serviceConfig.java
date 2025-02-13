package com.flightDetailsBooking.flightDetails.microservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class serviceConfig {
	
	@Bean
	public WebClient webclient() {
		return WebClient.builder().build();
	}
	
	public Object creatingServices(long id, int ticketno) {
		
		Object obj = webclient().get()
			    .uri(uriBuilder -> uriBuilder
			        .scheme("http")
			        .host("localhost")
			        .port(8081)
			        .path("/flightAvailablity/flightSeatCheck")
			        .queryParam("flightId", id)
			        .queryParam("ticketno", ticketno)
			        .build())
			    .retrieve()
			    .bodyToMono(Object.class)
			    .block();
	
		//	webclient().get().uri("http://localhost:8081/flightAvailablity/flightSeatCheck"
		//	, u -> u.queryParam("flightId", id).build())
		 // .retrieve().bodyToMono(Object.class).block();
	  System.out.println(obj);
	  return obj;
	}

}
