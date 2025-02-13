package com.DataStructuresAlgorithsms;

import java.util.Arrays;

public class QuickSort {
	
	static void quickSortAlgorithms() {
		
		int [] arr = {12,34,123,89,1,4,3};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {

			int pi = partitions(arr, low, high);

			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}

	static int partitions(int[] arr, int low, int high) {
		
		int i = low-1;
		int pi = arr[high];
		
		for(int j =low ; j<high ; j++) {
			if(arr[j] <= pi) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}

	public static void main(String[] args) {
		
		quickSortAlgorithms() ;

	}

}
