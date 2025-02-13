package com.Algorithms.Algoriths;

class statvariable {
	
	static int count = 0;
	int val = 0;
	
	
	public statvariable() {
		count++;
		val++;
		System.out.println(" xsddsds " + count + "  sdsddsd s  " + val);
	}
		
	static {
		
		System.out.println(count++ + ++count);
	}
	
	static void printnumbers() {
			System.out.println(" The values is Printed " ); // Cannot make a static reference to the non-static field val
	}
}

public class staticVariable {

	public static void main(String[] args) {
		
		statvariable sdds = new statvariable();
		statvariable sddsq = new statvariable();
		statvariable sddsw = new statvariable();

	}

}
