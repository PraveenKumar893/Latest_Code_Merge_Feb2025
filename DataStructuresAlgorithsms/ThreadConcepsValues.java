package com.DataStructuresAlgorithsms;




class threadss implements Runnable {

	private final String values;
	
	private final int num1;

	private final int num2;

	public threadss(String values, int num1, int num2 ) {
		this.values = values;
		this.num1 = num1;
		this.num2 = num2;
	}

	public void run() {
		
		switch (values.toUpperCase()) {
		case "ADD" :
            System.out.println(Thread.currentThread().getName() + " Result: " + (num1 + num2));
            break;
		case "SUB" : 
             System.out.println(Thread.currentThread().getName() + " Result: " + (num1 - num2));
             break;
		case "MUL" :
            System.out.println(Thread.currentThread().getName() + " Result: " + (num1 * num2));
            break;
		}
		
	}

}

public class ThreadConcepsValues {

	public static void main(String[] args) {

		Thread th1 = new Thread(new threadss("ADD", 10, 10), "Thread21");
		Thread th2 = new Thread(new threadss("SUB", 90, 10), "Thread22");
		Thread th3 = new Thread(new threadss("MUL", 10, 5), "Thread23");
	//	Thread th4 = new Thread(new threadss("STOP", 10, 5), "Thread24");
		

		th1.start();
		th2.start();
		th3.start();
	//	th4.start();

	}

}
