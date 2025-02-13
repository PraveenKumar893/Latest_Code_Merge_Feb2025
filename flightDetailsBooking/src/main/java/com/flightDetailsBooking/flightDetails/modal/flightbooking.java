package com.flightDetailsBooking.flightDetails.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight_details")
public class flightbooking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long flightId;
	private String flightName;
	private String source;
	private String Destination;
	private int economyClass;
	private int premiumEconomyClass;
	private int bussinessClass;
	
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
		return Destination;
	}
	public void setDestination(String destination) {
		this.Destination = destination;
	}
	public int getEconomyClass() {
		return economyClass;
	}
	public void setEconomyClass(int economyClass) {
		this.economyClass = economyClass;
	}
	public int getPremiumEconomyClass() {
		return premiumEconomyClass;
	}
	public void setPremiumEconomyClass(int premiumEconomyClass) {
		this.premiumEconomyClass = premiumEconomyClass;
	}
	public int getBussinessClass() {
		return bussinessClass;
	}
	public void setBussinessClass(int bussinessClass) {
		this.bussinessClass = bussinessClass;
	}
	public flightbooking(long flightId, String flightName, String source, String destination, int economyClass,
			int premiumEconomyClass, int bussinessClass) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.source = source;
		this.Destination = destination;
		this.economyClass = economyClass;
		this.premiumEconomyClass = premiumEconomyClass;
		this.bussinessClass = bussinessClass;
	}
	public flightbooking() {
		super();
	}
	
	
}
