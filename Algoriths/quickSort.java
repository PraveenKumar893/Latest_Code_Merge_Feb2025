package com.Algorithms.Algoriths;

import java.util.Arrays;

public class quickSort {

	private static void reverseSortedArray(int[] num2, int k , int jk) {
		 while(k < jk) {
			 int temp = num2[k];
	            num2[k] = num2[jk];
	            num2[jk] = temp;
	            k++;
	            jk--;
		 }
		
		 System.out.println(Arrays.toString(num2));
	}
	
	public static void reverseDigits() {
		
		int [] num = {1,1,2};
		
		int[] csd = Arrays.stream(num).distinct().toArray();
		System.out.println(csd.length);
		
		System.out.println(Arrays.toString(csd));
		
			}

	public static void main(String[] args) {
		
		
		int [] num2 = {1,2,3,4,5,6,7} ;  int k = 3 ; //Output: [5,6,7,1,2,3,4]
		int j = k%num2.length;
		
		reverseSortedArray(num2,0,num2.length-1);
		reverseSortedArray(num2,0,k-1);
		reverseSortedArray(num2,k,num2.length-1);
		reverseDigits();
		
	}


}
