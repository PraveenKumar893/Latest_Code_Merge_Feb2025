package com.oopsConcepts.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("serial")
class customexception extends Exception {
	
	customexception(String msg){
		super(msg);
	}
}

public class exceptionHandling {
	
    static void newExceptionMethod() throws customexception {
    	int kl = 30;
    	try {
    		if(kl/2 != 0) {
    			throw new customexception("jsdkdskdksks"); 
    		}
    		
    	} catch (customexception e) {
    		System.err.println(e.getMessage());
    		System.out.println(e.getMessage());
		}
    	catch (Exception e) {
    		e.getMessage();
		}
		
	}
    
	 static void bufferreaderException() throws IOException {
		 BufferedReader buffer = null;
		 try {
			 buffer = new BufferedReader(new InputStreamReader(System.in));
			 System.out.println(" Enter the Valuesss ");
			 int jk = Integer.parseInt(buffer.readLine());
			 System.out.println(" sddsdssasaasass  " + jk);
		 } finally {
			 buffer.close();
		 }
		
	}
	public static void main(String[] args) throws customexception, IOException  {
		
			newExceptionMethod();
			bufferreaderException();

	}

}
