package com.Algorithms.Algoriths;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class petAnimal {
	
	public void Sound() {
		System.out.println(" Animal Is barking ");
	}
}

class dog extends petAnimal {
	
	public void Sound() {
		System.out.println(" Dog is Barking ");
	}
	
	public void shout() {
		System.out.println(" Shoutinhg ");
	}
}

class cat extends petAnimal {
	
	public void Sound() {
		System.out.println(" cat is meowing  ");
	}	
}


public class AcentureInterview {
	
	
	public void displayResults(String str) {
		
		System.out.println("first method " + str);
	}
	
	public void displayResults(int  ik) {
		
		System.out.println("Seconds method " + ik);

	}
	
	public void showresults(String jkl , int ikl) {
		
		System.out.println(" 2 parameters first methods " + jkl + " " + ikl);
	}
	
	public void showresults(int kl , String lk) {
		
		System.out.println(" 2 parameters seconds methods " + kl + " " + lk);
	}
	
	
	static void checkedexceptionHanlings()  {
		
		// 			FileNotFoundException  || IOException ex because FileNotFoundException 
	//	    is a subclass of IOException, and they cannot be combined directly in a multi-catch block.
		try {
		FileReader files = new FileReader("hjk.txt");
		files.read();
		} catch (IOException ex) { 
			ex.getMessage();
		} catch(Exception io) {
			io.getMessage();
		}
		
	}
	
	 static void uncheckedExceptionHandling() {
		 
		 int [] num = {3,4,2};
		 
		 int num1 = 90;		 
		 System.out.println(" sddssfsf " + num[1]);
		
	}




	public static void main(String[] args) {
		
		AcentureInterview obj  = new AcentureInterview();
		obj.displayResults(null);
		obj.showresults("null",90);
		
			
		List<Integer> fillupList = new ArrayList<>();
		fillupList.add(32);
		fillupList.add(432);
		fillupList.add(null);
		fillupList.add(453);
		
		int hjkkl = fillupList.stream().sorted(Comparator.nullsLast(Comparator.reverseOrder()))
		  .skip(1).findFirst().get();

		System.out.println(hjkkl);
		
		System.out.println(fillupList);
		
		fillupList.stream().filter(op -> op != null)
		  .sorted((s1,s2) -> s2-s1).findFirst().get();
		
		System.out.println(fillupList.stream().filter(op -> op != null).toList());
		
		System.out.println(fillupList.stream().filter(op -> op != null)
				 .sorted((s1,s2) -> s2-s1).skip(1).findFirst().get());

		checkedexceptionHanlings();
		uncheckedExceptionHandling();
		
		new petAnimal().Sound();
		
		petAnimal sasa = new dog() ;
		sasa.Sound();
		((dog) sasa).shout() ;

	}

}
