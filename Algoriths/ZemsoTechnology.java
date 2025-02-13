package com.Algorithms.Algoriths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;

public class ZemsoTechnology {
	
	static void longSequnceCharacterafterRoration() {
		
		String sd1 = "an" ; String sd2 = "banana"; //left shift operations
		String prefix ="" ;
		String longPrfix = "" ;
		
		for(int i = 0 ; i<sd2.length();i++) {
			String rotated = sd2.substring(1) + sd2.charAt(0) ;
			prefix = findCommonPrefix(sd1 , rotated);
			
			if(prefix.length() > longPrfix.length()) {
				longPrfix = prefix;
			}
			sd2 = rotated ;
		}
		
		System.out.println(" The Longest Common prefix " + longPrfix);
	}
	
	static String findCommonPrefix(String sd , String rotated) {
		
		int minlength = Math.min(sd.length(), rotated.length()) ;
		StringBuilder prefix = new StringBuilder() ;
		
		for(int i = 0 ; i < minlength ; i++ ) {
			
			if(sd.charAt(i) == rotated.charAt(i)) {
				prefix.append(sd.charAt(i));
			} else {
				break;
			}
		}
		
		return prefix.toString();
		
	}
	
	static void reverseAnarray() {
		int [] arr = {1,2,3,4,5}; // 13254
		int arrsize = arr.length%2 == 0 ? 3 : 2;
		Arrays.sort(arr);
		
		for(int i = 0 ; i<arr.length-1 ; i+=arrsize ) {
			int temp = arr[i+1];
			arr[i+1] = arr[i+2];
			arr[i+2] = temp;
			
			System.out.println(Arrays.toString(arr));
		}
					
	}
	
	static void sortedArraysUsingList() {
		
		int [] arr = {10,12,20,30,25,40,32,31,35,50,60}; // 30 25 40 32 31 35
		
		int [] newarr = arr.clone() ;
		
		Arrays.sort(newarr); 
		
		int start = arr.length; int end = 0 ;
		
		for(int i = 0 ; i<arr.length;i++) {
			
			if(arr[i] != newarr[i]) {
				
				start = Math.min(start, i);
				end = Math.max(end, i);
			}
		}
		
		if(end - start >= 0) {
			System.out.println(end-start+1);
		}
	}
	
	static void SecondLargestCharcter() {
		
		String str = " I am a good Programmer";
		
		String [] assa = str.split(" ");
		
		String sdsaas = Arrays.stream(assa).sorted((s1,s2) -> s2.length() - s1.length()).skip(1).findFirst().get() ;
		
		System.out.println(sdsaas);
		
	}

	public static void main(String[] args) {
		
		longSequnceCharacterafterRoration() ;
		reverseAnarray() ;
		sortedArraysUsingList() ;
		SecondLargestCharcter() ;

	}

}
