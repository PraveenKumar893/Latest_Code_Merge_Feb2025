package com.oopsConcepts.java;

	
	class Employye {
		static String name ; // same variable used for all the objects . Called by using class name 
        int empId;
        String dept;
        
        public void Show() {
        	
        	System.out.println(name + " " + empId + " " + dept);
        }
        
        public static void showf(Employye e1) {
        	System.out.println(name + " " + e1.empId + " " + e1.dept + " dssdsddsdasas");
        }

	}
	
	public class polymorphism {


	public static void main(String[] args) {
		
		Employye e1 = new Employye();
		e1.dept ="science";
		e1.empId = 233;
		Employye.name = "sdsddssdd";
		
		Employye e2 = new Employye();
		e2.dept ="Social";
		e2.empId = 234;
		e2.name = "dsds";
		
		e1.Show();
		e2.Show();
		
		Employye.showf(e1);

				
		
	}

}
