package com.DemoFilesSamples.SampleFiles;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class TrickyAlgorithmsQuestion {
	
	private static void findSecondLargest(int[] arr, int n) {
		//1,2,3,421,5,61,72,8,9,10
		
		int max = arr[0];
		for(int i = 0 ; i<n;i++) {
			if(max < arr[i] ) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
		int maxx = 0;
		int semax = 0 ;
		
		for(int i = 0 ; i<n ;i++) {
			if(arr[i]>arr[maxx]) {
				semax = maxx;
				maxx = i;
			} else if(arr[i] < arr[maxx]) {
				if(semax == 0 || arr[semax] < arr[i] ) {
					semax = i;
				}
			}
		}
		System.out.println(arr[semax]);
	}
	
	private static void findMissingNumbers() {
		
		int[] num = {1,2,3,4,5} ;
		
		int n = num.length+1;
		
        int sumExpected = n * (n + 1) / 2;
        int sumActual = 0;

        for (int bv : num) {
            sumActual += bv;
        }
        
        System.out.println(sumExpected - sumActual);

	}


	private static void reversingAnarray(int[] arr, int n) {
		
		int [] saas = new int [n];
		int temp = 0;
		
		for(int i = 0 ; i<n;i++) {
			
			saas[i] = arr[n-1-i];
			
		}
		
		Arrays.stream(saas).forEach(System.out::println);
		System.out.println("  asa   ");
		Arrays.stream(arr).forEach(System.out::println);

		
	}


	
	public static void main(String[] args) {
		
		
		int [] arr = {1,2,3,421,5,61,72,8,9,10};
		int n = 10;
		
		int [] arr1 = new int[5];
		
		arr1[0] = 45;
		arr1[1] = 5;
		arr1[2] = 145;

		Arrays.stream(arr1).forEach(System.out::println);
				
		
	//	findSecondLargest(arr,n);
	//	findMissingNumbers();
	//	reversingAnarray(arr,n);

	}


}
