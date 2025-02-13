package com.oopsConcepts.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Abstraction {
	
	private static void reverseAString(String str) {
		String gh = "";
		for(int i = 0 ; i<str.length();i++) {
			
			gh = str.charAt(i)+gh;
			
		}
		
		System.out.println(gh);
		
	}

	
	public static void main(String[] args) throws IOException {
		
	//	String str = "Praveen";
		System.out.println(" Enter Values");
		BufferedReader buffer =  new BufferedReader(new InputStreamReader(System.in));
		String hj = buffer.readLine();
		reverseAString(hj);
		
		int Speed = (int) Math.random();
		
		System.out.println(Speed);
		
		
		
	}


}
