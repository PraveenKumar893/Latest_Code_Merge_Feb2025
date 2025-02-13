package com.Algorithms.Algoriths;

class voltaileVariable implements Runnable {
	
	private volatile boolean flag = false;

	public void run() {
		
		while(!flag) {
			flag = true;
			System.out.println(flag);
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}

public class voltaileKeyword {

	public static void main(String[] args) {

		Thread t1 = new Thread(new voltaileVariable() , "Threads1");
		Thread t2 = new Thread(new voltaileVariable() , "Threads2");
		Thread t3 = new Thread(new voltaileVariable() , "Threads3");
		Thread t4 = new Thread(new voltaileVariable() , "Threads4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
