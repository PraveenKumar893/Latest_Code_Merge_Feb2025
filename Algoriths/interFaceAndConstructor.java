package com.Algorithms.Algoriths;

import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface classTest {	
	void display1();
	
	default void display() {
		System.out.println(" The InterFace 1 IS Called  ");
	}
}
 
interface classtest1 {
	void display2();
	void show();
	default void display() {
		System.out.println(" The InterFace 2 IS Called  ");
	}
	
	static void dskaskl() {
		System.out.println(" The Static interface........");
	}
	
}

class result implements classTest ,classtest1 {
	
	
	public result() {
		classtest1.dskaskl(); 
	}
	

	public void display2() {
		System.out.println("Display 2 Method Called ");
	}

	public void display1() {
		System.out.println("Display 1 Method Called ");
	}

	public void show() {
		
		System.out.println("The method is calledss itslef ");
		
	}

	@Override
	public void display() {
		classTest.super.display();
		classtest1.super.display();
	}	
	
}

class constructorFields {
	
	public constructorFields(String str , int ds) {
		System.out.println(" Constructor 1 Start ");
		// constructorFields(ds,str);
		new innerCOnstructorFields();
		System.out.println(" The Values Called " + str + " Fields Called  " + ds);
	}
	
	public constructorFields(int sd , String sas) {
		System.out.println(" The Values Called " + sd + " Fields Called  " + sas);
	}
	
}

class innerCOnstructorFields {
	
	public innerCOnstructorFields() {
		System.out.println("The Inner COnstructor Callleds ");
	}
}


class reflections {
	
	private String name = "Praveen";
	public int userId = 2903 ;
	
	void printinfo() {
		System.out.println(" The refelctions Called");
	}
	
	public reflections() {
		System.out.println("Reflcions constructor called");
	}
	
}

public class interFaceAndConstructor {
	
	static void functionalInterfaceConcepts() {
		
		// Predicate	
		Predicate<String> testValues = rt -> rt.length() > 0 &&  !rt.isEmpty() ;
		boolean isPresent =  testValues.test("Praveen");
		System.out.println(isPresent);
		
		//Supplier
		Supplier<Double> intvalues = () -> Math.random() ;
		System.out.println(intvalues.get());
		
		// consume
		Consumer<Integer> consumess = con ->  System.out.println(" Hello WOrldss " + con*2); 
		consumess.accept(90);
		
		// Function Values 
		Function<String, String> funcResult = String :: toUpperCase ;
		System.out.println(funcResult.apply("987"));
	}
	
	static void printStatementExecutes() {
		
		try {
			System.out.println("X");
			probliemasmas();
			System.out.println("sdds");
		}catch(Exception ex) {
			System.out.println("GH");
			ex.printStackTrace();
			System.out.println("GH1");
		}finally {
			System.out.println("FINALLY");
		}
	}

	  static void probliemasmas() throws Exception {
			throw new Exception("Invalid Values ");		
	}
	 	 
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		new result().display();
				
	//	classtest1.dskaskl();
				
		// constructor programming
		
		new constructorFields("Praveen", 23);
		
		functionalInterfaceConcepts();
		
		printStatementExecutes();
				
		Class<?> classValues = reflections.class ;
		
		Field fieldlist = classValues.getDeclaredField("name");
		fieldlist.setAccessible(true);
		
		System.out.println(fieldlist.get(new reflections()));
		
	}

}
