package com.Algorithms.Algoriths;

 class ThreadValuesss implements Runnable {

	public void run() {
			
		Thread.currentThread().getName();
		
		
	}
	
}

public class ThreadConceptsLevel implements Runnable {

	private final int ThreadId ;
	
	private static int count = 0;
	
	private final static Object lock = new Object();
	
	public ThreadConceptsLevel(int threadID) {
		this.ThreadId = threadID;
	}

	@Override
	public void run() {
		while(true) {
			synchronized (lock) {
					if(count >= 10) {
						break;
					}
					if(count%2 == ThreadId) {
						count++;
						System.out.println("Thread is Running " + Thread.currentThread().getName() + " sdsd " + count);
						lock.notifyAll();
					} else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadConceptsLevel(0), " Thread 1");
		Thread t2 = new Thread(new ThreadConceptsLevel(1), " Thread 12");

		t1.start();	
		t2.start();
	}
}
