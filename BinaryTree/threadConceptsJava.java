package BinaryTree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class threadfiles implements Runnable {
	
	static int balance = 0;
	
	private final String value ;
	private final int amount;
	
	public threadfiles(String value, int amount) {
		super();
		this.value = value;
		this.amount = amount;
	}

	public void run() {
		
		if(value.toUpperCase().equalsIgnoreCase("DEPOSIT")) {
			addAmount(amount);
		} else {
			try {
				withdraw(amount);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	 void addAmount(int depositedAmount) {
		 
		 System.out.println(" Deposit Add Amount Is Processed.......");
		 balance += depositedAmount ;
		 System.out.println(" Total Balance : " + balance);
		 notify();
	}
	 
	  void withdraw(int withdrawnAmont) throws InterruptedException {
		 System.out.println(" Deposit Amount Is Processed.......");
		 wait(10);
		 balance -= withdrawnAmont ;
		 System.out.println(" Remaining Balance : " + balance);
	 }
	
	
	
}

public class threadConceptsJava {

	public static void main(String[] args) throws InterruptedException {
		
	//	Thread th1 = new Thread(new threadfiles("DEPOSIT", 90000));
	//	Thread th2 = new Thread(new threadfiles("Withdraw", 1000));
		
	//	th1.start();
	//	Thread.sleep(10);
	//	th2.start();
		
		String str = "MR_UNI_EXEC_116_26" ;
		
		String sstr = str.split("_")[3];
		
		System.out.println(str + "  " + sstr);
		
		String exs = "CustomerName_116" ;
		
		if(exs.contains(sstr)) {
			System.out.println(true);
		}
		
	}

}
