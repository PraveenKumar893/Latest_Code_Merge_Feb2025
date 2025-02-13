package com.DataStructuresAlgorithsms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class lineaAndBinarySearch {
	
	static void linearSearch() {
		
		int [] num = {1,45,67,89,18,88} ;
		int target = 88;
		
		for(int i = 0 ; i<num.length;i++) {
			if(num[i] == target) {
				System.out.println(" The Values Found at indesxes Is " + i + " " + num[i]);
				break;
			}
		}
		
		IntStream.range(0, num.length).filter(op -> num[op] == target)
		     .forEach(io -> System.out.println(" The Stream Values Found " + io + " " + num[io]));
		
	}
	
	static void binarySearch() {
		
		int [] num1 = {1,45,32,44,2,67,53};
		Arrays.sort(num1);
		int tar = 67;
		int start = 0 ;
		int end = num1.length-1;
		
		while(start <= end) {
			int mid = (start+end)/2 ;
			if(num1[mid] == tar) {
				System.out.println(" The Binary Search Values Found at indesxes Is " + mid + " " + num1[mid]);
				break;
			} else if(num1[mid] < tar) {
				start = mid +1 ;
			} else {
				start = mid - 1;
			}
		}
		
	}
	
	static void swappingTwoNumbersWithoutArguments() {
		
		int a = 10 ; int b = 15 ;
		
	//	System.out.println(a == b ? (a != b ? b : a ) : a);
		 a = a+b;
		 b = a-b;
		 a = a-b ;
		 
		 System.out.println(" After Swapping  a : " + a + "  B : " + b);

	}
	
	static void calculatelengthbasedOnString() {
		
		List<String> lists = List.of("Dog", "Zebra", "Cat", "Cow", "Buffalo", "Lion", "goat", "monkey");
		
	 lists.stream().collect(Collectors.groupingBy(String :: length))
		  .entrySet().stream().forEach(op -> System.out.println(op.getKey().toString() + "  "
				 + " Lenghth  : "  + op.getValue() + " Size : " + op.getValue().size() ));

	}

	public static void main(String[] args) {
		linearSearch();
		binarySearch() ;
		swappingTwoNumbersWithoutArguments() ;
		calculatelengthbasedOnString() ;
	}

}
