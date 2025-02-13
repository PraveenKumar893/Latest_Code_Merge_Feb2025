package com.Algorithms.Stream;

abstract class threadsA implements Runnable {
	
}

class threadsB implements Runnable  {

	public void run() {
		System.out.println(" thread 2 is started ");
	}
	
}

class threadsC implements Runnable {

	@Override
	public void run() {
		System.out.println(" Thread 3 is started ");		
	}
	
}

public class threadConceptclass {

	public static void main(String[] args) {
		
		String str1 = "Praveen";
		System.out.println(" str1  " + str1.hashCode()+ "  " + System.identityHashCode(str1));
		str1 = "kumar";
		System.out.println(" str1s  " + str1.hashCode() + "  " + System.identityHashCode(str1));
		
		if("Kumar" == str1) {
			System.out.println(" Trueeeee");
		} else if("Praveen" == str1) {
			System.out.println(" sdhfbcbcxvbdsvhjds ");
		} else {
			System.out.println("csds");
		}

		
		Thread th1 = new Thread(new threadsA() {
			public void run() {
				System.out.println(" Thread 1 is started ");
			}
		});
		Thread th2= new Thread(new threadsB());
		th1.setPriority(Thread.MAX_PRIORITY);
		th1.start();
		th2.start();
	}

}
