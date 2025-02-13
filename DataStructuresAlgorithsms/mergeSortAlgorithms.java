package com.DataStructuresAlgorithsms;

import java.util.Arrays;
import java.util.stream.Stream;

public class mergeSortAlgorithms {
	
	
	static void mergeSortAlgorthims() {
		
		int [] num = {12,44,22,123,89,2} ;
		mergeSort(num,0,num.length-1);
		System.out.println(Arrays.toString(num));
	}
	
	 static void mergeSort(int[] num, int low, int high) {
		 if(low < high) {
			 int mid = (low + high)/2;
			 mergeSort(num,low,mid);
			 mergeSort(num,mid+1,high);	 
			 
			 mergeSorting(num,low,high,mid);
		 }
		 System.out.println(num);
		
	}

	 static void mergeSorting(int[] num, int low, int high, int mid) {
		 
		 int n1 =  mid - low +1 ;
		 int n2 = high - mid  ;
		 
		 int [] arr1 = new int[n1];
		 int [] arr2 = new int[n2];
		 
	        for (int i = 0; i < n1; i++)
	        	arr1[i] = num[low + i];
	        for (int j = 0; j < n2; j++)
	        	arr2[j] = num[mid + 1 + j];
	        int i = 0, j = 0, k = low;

	        while (i < n1 && j < n2) {
	            if (arr1[i] <= arr2[j]) {
	                num[k] = arr1[i];
	                i++;
	            } else {
	                num[k] = arr2[j];
	                j++;
	            }
	            k++;
	        }
	        
	        while (i < n1) {
	            num[k] = arr1[i];
	            i++;
	            k++;
	        }
	        
	        while (j < n2) {
	            num[k] = arr2[j];
	            j++;
	            k++;
	        }

		System.out.println(Arrays.toString(num));
	}

	public static void main(String[] args) {
		
		mergeSortAlgorthims() ;
	}

}
