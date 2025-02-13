package com.RestAPIdemo.RestAPI.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class flightDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long flightId;
	@Size(max = 25 , message = "The flight name not gerater than 25 Characters")
	private String flightName;
	private String source;
	private String destination;
    @Min(value = 18, message = "Economy class value must be at least 18")
    @Max(value = 45, message = "Economy class value must not exceed 45")
	private Integer economyClass;
	
	

	public flightDetails() {
		super();
	}

	public flightDetails(long flightId, String flightName, String source, String destination , Integer economyClass) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.economyClass = economyClass;
	}
	
	public Integer getEconomyClass() {
		return economyClass;
	}

	public void setEconomyClass(Integer economyClass) {
		this.economyClass = economyClass;
	}

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
