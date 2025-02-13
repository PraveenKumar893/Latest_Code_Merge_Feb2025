package com.Algorithms.Algoriths;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.attribute.UserPrincipalNotFoundException;

class userdidntFind extends RuntimeException {

	public userdidntFind(String message) {
		super(message);
	}

}

public class exceptionHandlings {
	
	static void checkedexceptionHanlings()  {
		// occurs during at compile time
		// sql exception  
		// 	FileNotFoundException  | IOException ex because FileNotFoundException 
	//	 is a subclass of IOException, and they cannot be combined directly in a multi-catch block.
		try {
		FileReader files = new FileReader("hjk.txt");
		files.read();
		} catch (IOException ex) { 
			ex.getMessage();
		} catch(Exception io) {
			io.getMessage();
		}
		
	}
	
	 static void uncheckedExceptionHandling() {
		 
		 // occurs at runtime  like null pointer exception , Arrayindexoutofboundsexception , 
		 // arithmaticexceptio
		 
		 int [] num = {3,4,2};
		 
		 int num1 = 90;
		 num1 = num1/0;
		 
		 System.out.println(" sddssfsf " + num[4]);
		
	}
	 
	 static void customExceptionUsingThrowandThrows() {
		 
		 try {
			 
			 String str1 = "Praveen";
			 
			 if(!str1.equalsIgnoreCase("kl")) {
				 throw new userdidntFind("Please Try any other User");
			 }
		 }
		// catch(userdidntFind ex) {
		//	 System.out.println(ex.getMessage());
		// }
		 catch(Exception ex){
			 System.out.println("xjhnmvdshcxhxc " + ex.getMessage());
		 }
		 
	 }

	public static void main(String[] args) {
		
	//	checkedexceptionHanlings();
	//	uncheckedExceptionHandling();
		customExceptionUsingThrowandThrows();

	}

}
