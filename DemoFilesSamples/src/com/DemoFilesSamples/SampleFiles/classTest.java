package com.DemoFilesSamples.SampleFiles;

import java.util.Scanner;

public class classTest {
	

	public static void main(String[] args) {
		
		System.out.println("Enter Values");
		
		Scanner sc = new Scanner(System.in);
		String str =  sc.nextLine(); //FIRSTNAME#MIDDLENAME#LASTNAME@AGE
				
		System.out.println(str.split("#").length-1);
		
		System.out.println(str.split("@").length-1);
		
		String str2 = str.replace("#", "$").substring(0, str.lastIndexOf("@"));
		
		System.out.println(str2);
		
		String firstName = str.split("#")[0].toUpperCase();
		
		String lastName = str.split("#")[2].toLowerCase();
		
		System.out.println(firstName);
		
		System.out.println(lastName.substring(0, lastName.lastIndexOf("@")));
		
		String gh = str.replaceAll("#", " ").replace("@", " ");
		
		System.out.println( " Entire String  " + gh);
		
		StringBuilder build = new StringBuilder(firstName);
		
		System.out.println(build.reverse());
				
	}

}
