package com.paymentDetails.paymentDetails.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paymentdetails")
public class paymentInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketno;
	private long flightId;
	private int totalamount;
	private String modeoftransaction;
	private String username;
	private int seatno;
	
	public int getTicketno() {
		return ticketno;
	}
	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	public int getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	public String getmodeoftransaction() {
		return modeoftransaction;
	}
	public void setModeOfTransaction(String modeoftransaction) {
		this.modeoftransaction = modeoftransaction;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	
	public paymentInfo(int ticketno, long flightId, int totalamount, String modeoftransaction, String username,
			int seatno) {
		super();
		this.ticketno = ticketno;
		this.flightId = flightId;
		this.totalamount = totalamount;
		this.modeoftransaction = modeoftransaction;
		this.username = username;
		this.seatno = seatno;
	}
	public paymentInfo() {
		super();
	}
}
