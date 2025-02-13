package com.Algorithms.Algoriths;

public interface interfaceconcepts {
	
	public void methodswrite();
	
	default void scope() {
		System.out.println(" The default method is called ");
	}

	static void display() {
		System.out.println(" The static method reference is Callled  ");
	}
}
