package com.DemoFilesSamples.SampleFiles;

import java.util.Scanner;

public class tnqbooksProblem {
	
	// Question 1 :  input : aa2bbbaacbbb  output : bbb  abcedfghbc
	// Question 2  :  multiples of 3 and 5 input : 10 output :  3+5+6+9 = 23
	
	 static String checkLongestPattern(String str) {
		 String res = "";
		 int len = str.length();
		 
		 for(int length = 1; length <= len/2 ; length++) {
			 
			 for(int start =0;start<=len-length;start++){
				 
				 String pattern = str.substring(start, start+length);
				 int count =0;
				 
				 for(int i=0;i<=len-length;i++) {
					 if(str.substring(i, i+length).equals(pattern)) {
						 count++;
					 }
				 }
				 if(count>1 && pattern.length() > res.length()) {
					 res = pattern;
				 }
				 
			 }
		 }
		 
		 if(res.isEmpty()) {
			 return "no null";
		 } else {
			 return " longest patern " + res;
		 }
		 
	}
	
	 static int checkIsresultExceeds(int num) {
		 int sum = 0;
		 
		 for(int i = 1 ; i<num;i++) {
           if(i%3 == 0 || i%5 == 0) {
				 sum = sum+i;
			 }
		 }
		 
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Eneter String Value  ");
		String str = sc.nextLine();
		String result = checkLongestPattern(str);
		System.out.println(" The Result Valuess  " + result);
		
		System.out.println("Enter Integer Values");
		int num = sc.nextInt();
		int resultValue = checkIsresultExceeds(num);
		System.out.println(" The Result Valuess  " + resultValue);

	}

}
