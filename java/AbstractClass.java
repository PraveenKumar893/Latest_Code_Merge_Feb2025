package com.oopsConcepts.java;


  abstract class absass {
	
	  abstract public void run();
	static  void sdds () {
		 System.out.println("dsds");
	 }
	
}

abstract class anonmyus {
	
	anonmyus() {
		System.out.println(" The Constructor Is Called ......");
	}
	
	void displaySpeed() {
		System.out.println(" The Speed is Calculating.........");
	}
//	abstract void showSpeed();
}


class sdsda extends absass {

	 public void run() {
		
		System.out.println(" Running 100 Km/hr");
		
	}
	
	
}

public class AbstractClass {
		

	public static void main(String[] args) {
		
		sdsda nm = new sdsda();
		nm.run();
		sdsda.sdds();
		
		anonmyus jk = new anonmyus() {
		};
		
	//	jk.showSpeed();
		jk.displaySpeed();

	}

}
