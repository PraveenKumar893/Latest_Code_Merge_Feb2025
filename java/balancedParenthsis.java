package com.oopsConcepts.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class balancedParenthsis {
	
	public int num = 20 ;
	static int num12  =30 ;
	
	private static boolean parenthesis(String hj) {
		
		Stack<Character> sd = new Stack<>();
		boolean ds = false;
		
		for(int i = 0 ;i < hj.length();i++) {
			
			if(hj.charAt(i) == '{' || hj.charAt(i) == '(' || hj.charAt(i) == '[') {
				sd.push(hj.charAt(i));
			} else  {
				if (sd.isEmpty()) {
                    return false;
                }
		  System.out.println(sd);

		char ch =  sd.pop();
		if ((hj.charAt(i) == '}' && ch != '{') ||
                (hj.charAt(i) == ')' && ch != '(') ||
                (hj.charAt(i) == ']' && ch != '[')) {
                return false;
            }
		}
	}
		return sd.isEmpty();		
	}
	
	public static void hdjsdhdjsdsas() {
		
		balancedParenthsis ds = new balancedParenthsis();
		
		ds.num = 40;
		
		num12 = 90 ;
		
		ds.sdjhsdjdsjh();
		
		num12  =100 ;
		
       balancedParenthsis ds1 = new balancedParenthsis();
		
		ds1.num = 50;
		
		System.out.println(ds.num);
		System.out.println(num12);
		System.out.println(ds1.num);

	}

	public void sdjhsdjdsjh() {
		System.out.println(num12);
	}



	public static void main(String[] args) throws IOException {
		
	//	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	//	String hj = reader.readLine();
		
	//	boolean hjsa = parenthesis();
		
	//	System.out.println(hjsa);\
		
		
		hdjsdhdjsdsas();
		
		
	}



}
