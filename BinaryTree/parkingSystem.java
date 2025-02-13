package BinaryTree;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class ticketDetails {
	
	private String slotId;
	private String vehicleType;
	private String vehicleName;
	private LocalDateTime inTime;
	private LocalDateTime outTime ;
	
	public ticketDetails(String slotId, String vehicleType, String vehicleName, LocalDateTime inTime,
			LocalDateTime outTime) {
		super();
		this.slotId = slotId;
		this.vehicleType = vehicleType;
		this.vehicleName = vehicleName;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	public String getSlotId() {
		return slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public LocalDateTime getInTime() {
		return inTime;
	}

	public void setInTime(LocalDateTime inTime) {
		this.inTime = inTime;
	}

	public LocalDateTime getOutTime() {
		return outTime;
	}

	public void setOutTime(LocalDateTime outTime) {
		this.outTime = outTime;
	}	
}

abstract class vehicle {
	
	abstract int ticketSlotNo(ticketDetails det) ;
		
}

class car extends vehicle {

	int  ticketSlotNo(ticketDetails ticket) {
		LocalDateTime in = ticket.getInTime() ;
		LocalDateTime out = ticket.getOutTime() ;
		
	    long hour = Duration.between(in, out).toHours();
		
		int roundedHours = (int) Math.ceil(hour);
		
		
		return roundedHours;
	}

}

class bike extends vehicle {

	int ticketSlotNo(ticketDetails det) {
		return 0;
		
	}

	
}

public class parkingSystem {
	
	static List<String> guidList = new ArrayList<>() ;
	
	static String generateId() {
        String randomString = UUID.randomUUID().toString().
        		replace("-", "").substring(0, 10);
		System.out.println(randomString);
		guidList.add(randomString);
		
		return randomString;
	}	


	 static void calculateFare(int hoursCal) {

		 int amount  = 8;
		 if(hoursCal <= 8) {
			 System.out.println("Amount  RS : " + amount);
		 } else {
			 int fare = hoursCal/8;
			 System.out.println("Amount  RS : " + (amount*fare));
		 }
	}



	public static void main(String[] args) {
		
		String randomValjues= generateId();
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime futureDateTime = now.plusDays(2);
		ticketDetails ticket = new ticketDetails(randomValjues, "CAR", "HYNDAI", LocalDateTime.now(),futureDateTime);
		int hoursCal = 0;
		car obj = new car();
		hoursCal = obj.ticketSlotNo(ticket);
		calculateFare(hoursCal);
		
		
	}

}
