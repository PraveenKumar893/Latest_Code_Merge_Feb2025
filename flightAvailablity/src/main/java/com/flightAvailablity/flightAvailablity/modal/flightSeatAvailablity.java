package com.flightAvailablity.flightAvailablity.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight_seats_availabilty")
public class flightSeatAvailablity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long flightId;
	private String source;
	private String Destination;
	private int economySeats;
	private int businessSeats;
	private int premiumEconomySeats;
	
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
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
	public int getEconomySeats() {
		return economySeats;
	}
	public void setEconomySeats(int economySeats) {
		this.economySeats = economySeats;
	}
	public int getBusinessSeats() {
		return businessSeats;
	}
	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}
	public int getPremiumEconomySeats() {
		return premiumEconomySeats;
	}
	public void setPremiumEconomySeats(int premiumEconomySeats) {
		this.premiumEconomySeats = premiumEconomySeats;
	}
	public flightSeatAvailablity(long flightId, String source, String destination, int economySeats, int businessSeats,
			int premiumEconomySeats) {
		super();
		this.flightId = flightId;
		this.source = source;
		this.Destination = destination;
		this.economySeats = economySeats;
		this.businessSeats = businessSeats;
		this.premiumEconomySeats = premiumEconomySeats;
	}
	
	public flightSeatAvailablity() {
		super();
	}

}
