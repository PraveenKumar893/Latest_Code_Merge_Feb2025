package com.DemoFilesSamples.SampleFiles;

import java.util.ArrayList;
import java.util.List;

public class trickyQuestions {
	
	public void print(Integer i) {
		System.out.println("Integer " + i);
	}
	
	public void print(int i) {
		System.out.println("Int " + i);
	}

	public void print(long i) {
		System.out.println("Long " + i);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		trickyQuestions dsd = new trickyQuestions();
		dsd.print(10);
		
		// Quetion : 2
		
		String str1 = "Praveen" ;//SCP string constant pool
		String str2 = new String("Praveen");//heap memoery
		String str4 = new String("Praveen");
		
		String str3 = str2.intern();
		System.out.println(str1==str3);
		
		//Reverse a String
		
		String gh = "Praveen";
		String jk = "";
		
		for(int i = 0 ; i<gh.length();i++) {			
			jk =  gh.charAt(i) + jk;
		}
		
		System.out.println(jk);
		
		final List<Integer> numbers  = new ArrayList<>();
		
		numbers.add(32);
		numbers.add(33);
		numbers.add(34);
		numbers.add(35);
		
		List<Integer> numberss  = new ArrayList<>();
		
		for(int i = numbers.size()-1;i>=0;i--) {
			numberss.add(numbers.get(i));
		}

		System.out.println(numberss);

		String lkjd = " The World Is So Curious Than members jdsjh dsjhjdjsa sdjhds   " ;
		
		 String[] ssad = lkjd.split("");
		 
		 String djd = ssad[ssad.length-1];
		 
		 System.out.println(djd);
				
		 stringCompare();
		 
		 String bnv = "Praveen" ;
		 
		 System.out.println(" Stringbuffer 11 " + bnv);
		 
	        String newString = "h" + bnv.substring(1);
		 
		 System.out.println(" Stringbuffer 12 " + newString);
		 
		 String str12 = new String("Praveen");
		 
		 StringBuffer query = new StringBuffer();
		 
		 query.append("Praveen sdsd ");
		 
		 voidColumnsChabne(str12,query);
		 
		 System.out.println(" str12 str12 " +str12 + "  dsdsdsdsfs " + query.toString());
		 

	}
	

	private static void voidColumnsChabne(String str12, StringBuffer query) {
		
		str12 = "Kumar";
		
		query.append("Kumar");
		
		System.out.println("ddsdkdsj  " + str12);
		
		
	}

	private static void stringCompare() {
		
		List<String> stringList = new ArrayList<>();
		
		stringList.add("Praveen");
		stringList.add("Compares");
		stringList.add("Kumar");
		stringList.add("Praveen");
				
	}

}
