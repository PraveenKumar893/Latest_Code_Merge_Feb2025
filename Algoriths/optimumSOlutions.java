package com.Algorithms.Algoriths;


interface construct {
	
	default void constructf () {
		
		System.out.println(" Default method Calleds ");
	}
	
	static void statcicsa () {
		
		System.out.println( " Static Methods Called ss");
	}
	
	public void interfacedisplay();
}


class interfaceimplements implements construct {

	public void interfacedisplay() {
		
		System.out.println(" Interface method over display ");
		
	}
	
}


// final abstract class abstraction The class abstraction can be either abstract or final, not both

 abstract class abstraction {
	 
	 abstract void classAbstratc() ;
	 
	 public abstraction() {
		 
		 System.out.println(" Abstract Class Constructor Called......");
	}
	 
	 
	 void abstactdisplay() {
		 System.out.println(" Abstract Display fieldss ");
	 }
	
}
 
class abstarctclassval extends abstraction {

	void classAbstratc() {
		
		System.out.println(" Abstarct Method Callled ");
		
	}
	
}

class animals {
	
	void display() {
		System.out.println(" Display fieldsss ");
	}
	
}

class dogss extends animals {
	
	void barksss() {
		System.out.println(" Barksss fieldss");
	}
	
	void sdkjksd () {
		System.out.println(" Methodss 2 Called  ");
	}
	
}

// casting 

class casting {
	
	
	public void implictandExplictCasting() {
		
		// implict casting 
		
			int num1 = 100;
			double dbl1 = num1;
			
			System.out.println(num1);
			System.out.println(dbl1);
			
		// explict casting
			
			double dbl2 = 10.98;
			int num2 = (int) dbl2;
		
			System.out.println(dbl2);
			System.out.println(num2);

	}
	
}

public class optimumSOlutions {

	public static void main(String[] args) {

		dogss fg = new dogss();
		fg.barksss();
		fg.display();
		fg.sdkjksd();
		
		animals nmc = new dogss();
		nmc.display();
	//	nmc.barksss();
		((dogss) nmc).barksss(); 
	//	cannot call bark() using nmc because Animals 
	//	does not have the barksss() method. To fix this, you can either:
	//  Add bark() to the Animals class, or
	//	Use casting if you are sure the object is of type Dogs:
	
	// Abstraction	
		new abstarctclassval().abstactdisplay();
		
		new abstarctclassval().classAbstratc();
		
	// interface
		
		new interfaceimplements().constructf();
		
		new interfaceimplements().interfacedisplay();
		
		construct.statcicsa();					
	}

}
