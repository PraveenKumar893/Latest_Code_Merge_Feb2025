package com.oopsConcepts.java;


class SingleInheritance{
	
	void display() {
		System.out.println(" !@# SIngle Called ");
	}
}

class SingleInheritancess extends SingleInheritance{
	
	void displaydssd() {
		System.out.println(" SIngle Called ");
	}

}

class multipleInheritance extends SingleInheritancess{
	
	void show() {
		System.out.println(" multipleInheritance Called ");
	}
}


class overridng  extends multipleInheritance {
	
	void show () {
		System.out.println(" overirderes Called ");
	}
}


public class inheritance extends overridng {

	public static void main(String[] args) {
		
		SingleInheritancess ssa = new SingleInheritancess();
		ssa.display();
		ssa.displaydssd();
		
	//	multipleInheritance kl = new multipleInheritance();
	//	kl.display();
	//	kl.displaydssd();
	//	kl.show();
		
		multipleInheritance assa = new multipleInheritance();
		assa.show();

	}

}
