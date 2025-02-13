package com.Algorithms.Algoriths;

 class privatefields {
	
	private privatefields() {
		
		System.out.println(" Separate Class Constructor Called ");
	}
}
 
class protectedFiles {
	
	
	protected protectedFiles() {
				
		System.out.println(" Protected File Constructor Called  ");
	}
	
}

public class constructorQuestion {
	
	private constructorQuestion(String str) {
		System.out.println(" Private Constructor Called  " + str);
	}

	public static void main(String[] args) {
		
		new constructorQuestion("Praveen");
		
		// new privatefields(); // compile time Error Has been Shown
		
		new protectedFiles();
	}
}
