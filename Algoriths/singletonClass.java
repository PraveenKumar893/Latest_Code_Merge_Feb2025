package com.Algorithms.Algoriths;

class singleton {
	
	 static singleton obj = new singleton();
	
	
	private singleton() {
		System.out.println(" A class is Created ");
	}
	
	public static singleton getInstance() {
		return obj;
		
	}
	
}

public class singletonClass {

	public static void main(String[] args) {
		
		singleton abas = singleton.getInstance();
		singleton abass = singleton.getInstance();
		singleton abasa = singleton.getInstance();
		
		System.out.println(" 11  "  + abas.hashCode() );
		System.out.println(" 12  "  + abass.hashCode() );
		System.out.println(" 13  "  + abasa.hashCode() );


		

	}

}
