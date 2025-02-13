package com.Algorithms.Algoriths;

class callbyrefernce {
	
	String name ;

	public callbyrefernce(String name) {
		this.name = name;
	}
}

public class CallbyValueandreference {
	
	static void callingMethod(int num) {
		
		System.out.println("before proceedingss " +  num);
		
		num = 345;
		
		System.out.println(" before proceedingss " + num);
	}
	
	static void modifyMethodsName(callbyrefernce cvb) {
		
		cvb.name = "Kumar";
		
	}
	
	static void changeReference(callbyrefernce cvb) {
		
		cvb.name = "Kumars";
		
		System.out.println(cvb.name);
	}

	public static void main(String[] args) {
		
		int num1 = 89;
		System.out.println("before Main " +  num1);

		callingMethod(num1);
		
		System.out.println("After  Main " +  num1);
		
		callbyrefernce cvb = new callbyrefernce("Praveen");
		
		System.out.println(cvb.name);
		
	//	modifyMethodsName(cvb);
		
		System.out.println(cvb.name);
		
		changeReference(cvb);

		System.out.println(cvb.name);
		
		System.out.println(0%3 + " " + 1%3 + " " + 2%3 + " " + 3%3);


	}

}
