package com.oopsConcepts.java;

public class staticMethod {
	
	static int num = 30;
	
	 staticMethod() {
		 System.out.println(num);
	}
	 
	 void insertShwo (int hj) {
		 
		 System.out.println(" HJ JJ  " + hj + "  " + num);
	 }

	public static void main(String[] args) {
		
		staticMethod sd = new staticMethod();
		sd.insertShwo(39);
		num = 40;
		staticMethod sd2 = new staticMethod();

	}

}
