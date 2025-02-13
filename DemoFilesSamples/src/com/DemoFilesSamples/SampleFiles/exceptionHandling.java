package com.DemoFilesSamples.SampleFiles;

public class exceptionHandling {
	
	public static void exceptionmessage(String str) {
		
		exceptionutil sad = new exceptionutil();
		
		if(!str.isEmpty()) {
			sad.setType("Error");
			sad.setMessage("Exception Failesssd");
		}
		
	}


	public static void main(String[] args) {
         exceptionmessage("Praveen");
	}

	
}
