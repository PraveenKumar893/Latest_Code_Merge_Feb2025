package com.DemoFilesSamples.SampleFiles;

public class ThreadConcept implements Runnable {
	
	public void run() {
          System.out.println(" Thread is running ");		
	}


	public static void main(String[] args) {
		
		
		ThreadConcept sd = new ThreadConcept();
		Thread da = new Thread(sd);
		da.start();
		
	}


}
