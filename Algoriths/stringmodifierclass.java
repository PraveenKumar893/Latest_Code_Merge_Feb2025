package com.Algorithms.Algoriths;


abstract class absrrsa {
	
	 void displayfields() {
		 System.out.println("Abstract Method Called");
	 }
}

class animal {
	
	static void stastic() {
		
		System.out.println(" Static Methods Values Called sss against Animal ");
	}
	
	void display() {
	
		System.out.println(" ANimals Method Called ");
	}
}

class hshsh extends animal {
	
	static void stastic() {
		
		System.out.println(" Static Methods Values Called sss against Dogss ");
	}

	
	void display() {
		
		System.out.println(" dogs Method Called ");
	}
	
}

public class stringmodifierclass {
	
	
	public static void main(String[] args) {
		
		StringBuilder str1 = new StringBuilder("Praveen");
		StringBuilder str2 = new StringBuilder("Praveen");
		
		if(str1.equals(str2)) {
			System.out.println(str1.hashCode() + " AND  " + str2.hashCode());
		} else {
			System.out.println(str1.hashCode() + "  " + str2.hashCode());
		}
		
		String str3 = new String("Praveen").intern();
		String str4 = "Praveen" ;
		
		if(str3 == str4) {
			System.out.println(str3.hashCode() + " " + str4.hashCode());
		}
		
		/*
		 * if(str3.intern() == str4) { System.out.println(str3.hashCode() + " " +
		 * str4.hashCode()); }
		 */
		
		if(str3.equalsIgnoreCase(str4)) {
			System.out.println("true");
		}
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		if(s1 == s2) {
			System.out.println(s1.hashCode() + " " + s2.hashCode());
		}
		
		String s11 = "abcd";
		String s12 = "abcd";
		
		if(s11 == s12){
			System.out.println(s11.hashCode() + " " + s12.hashCode());
		}
		

		

		animal ani  =new hshsh();
		ani.display();
		animal.stastic();
				
	}

}
