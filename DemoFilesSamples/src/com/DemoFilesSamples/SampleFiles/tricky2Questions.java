package com.DemoFilesSamples.SampleFiles;

 class base {
	
	 public base() {
		 System.out.println(" Base Classes ");
	 }
}
 
  class dervied extends base {
	  
	  public dervied() {
		  System.out.println("dervied");
	  }
  }
  
  class dfgdsd extends dervied{
	  
	  public dfgdsd() {
		  System.out.println("dfgdsd ");
	  }
  }


public class tricky2Questions {
	
	public static void main(String[] args) {
		
		dervied bn = new dfgdsd();

	}

}
