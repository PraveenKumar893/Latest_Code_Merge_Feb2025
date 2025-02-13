package com.oopsConcepts.java;

class ThreadSample implements Runnable {
    private static Object str = new Object();

    public void run() {
        System.out.println("Thread is running  " + Thread.currentThread().getName());
        try {
            display();
            if(Thread.currentThread().getName().equalsIgnoreCase("Threadlevel1")) {
            	display();
            }else if(Thread.currentThread().getName().equalsIgnoreCase("Threadlevel21")) {
            	Thread.sleep(1000);
            	showMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void showMethod() {
    	System.out.println(str.hashCode());
    	System.out.println(" The Show method Callings ");
    	synchronized (str) {
            System.out.println("Thread resumed after wait sddssdssdsssss");
            str.notify();
		}
    	
    }

    public void display() throws InterruptedException {
    	System.out.println(str.hashCode());
        synchronized (str) {
            System.out.println("Thread is waiting");
            str.wait(); // Wait until notified
           // Thread.sleep(100); // Sleep to simulate some work being done
            System.out.println("Thread resumed after wait");
        }
    }
    
  }

public class ThreadLogics {

	public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(new ThreadSample());
        Thread th1 = new Thread(new ThreadSample());
        th.setName("Threadlevel1");
        th1.setName("Threadlevel21");
        th.start();
        Thread.sleep(500);
        th1.start();

    }
}
