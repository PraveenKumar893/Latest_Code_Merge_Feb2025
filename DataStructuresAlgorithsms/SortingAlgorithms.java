package com.DataStructuresAlgorithsms;

import java.util.Arrays;

public class SortingAlgorithms {
	
	static void bubbleSortinAlgoriths() {
		
		int [] num = {1,45,32,21,12,90,76};
		
		for(int i = 0 ; i<num.length-1;i++) {
			System.out.println(num[i]);
			for(int  j = 0 ;j<num.length-i-1;j++) {
				if(num[j] > num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		  
		}
		
		System.out.println(" The Sorted Arrays Using Bubble Sorting Techniques  \n" + Arrays.toString(num));
		
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num) + "   \n");
						
	}
	
	static void selectionSortingAlgorithms() {
		
		int [] num1 = {21,33,2,12,89,987,4636 };
		int n = num1.length ;
		int maxindex = 0;
		
		for(int i = 0 ; i<num1.length;i++) {
			maxindex = i ;
			
			for(int j = i+1 ; j<num1.length ; j++) {
				if(num1[maxindex] > num1[j]) {
					maxindex = j ;
				}
			}
			
			int temp = num1[i] ;
			num1[i]  = num1[maxindex] ;
			num1[maxindex] = temp;
			
		}
		
		System.out.println(Arrays.toString(num1));
		
	}
	
	static void InsertionSortingALgorthims() {
		
		int [] num = {8,32,12,6,87,1};
		int n = num.length;
		int key = 0;
		
		for(int i = 1 ;i<n; i++) {
			key = num[i] ;
			int j = i-1 ;
			while(j >= 0 && key < num[j]) {
				num[j+1] = num[j] ;
				j = j-1;
			}
			num[j+1] = key ;
		}
		
		System.out.println(" Insertion Sort Algorithms :  \n" + Arrays.toString(num));
	}

	public static void main(String[] args) { 
		
		 bubbleSortinAlgoriths();
		selectionSortingAlgorithms();
		InsertionSortingALgorthims();
	}

}
