package com.DemoFilesSamples.SampleFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Advanceprogramming {
	
	
	final int oppsd = 0;
	
	public static Predicate<List<Map<String, Object>>> checkisNullorEmpty = list -> list != null && !list.isEmpty();
	
	public  static void sortUsingArrayFields(int[] arr) {
		int n  = arr.length ;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] % 2 != 0 && arr[j] % 2 != 0) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                } else if (arr[i] % 2 == 0 && arr[j] % 2 == 0 ) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        
        for (int i : arr) {
            System.out.print(i + " ");
        }

	}
	
	public static void filterSeriesDuplicatesValues(int[] arrs) {
		int [] arr = {7,7,7,1,2,2,2,2,5,5,5,5,5,6,8,9,9,9,4};
		boolean max = false;
		int j = 0;
		int [] temp = new int[arr.length];
		for(int i = 0 ; i<arr.length;i++) {
			if(i != arr.length-1 && arr[i] != arr[i+1]) {
				temp[j] = arr[i+1];
				j++;
				max = false;
			} else if(!max && j >0) {
				max = true;
				j--;
			}
		}
		System.out.println("filterSeriesDuplicatesValues  " + j);
		
		for(int k = 0 ; k<=j; k++) {
			
			System.out.print(temp[k] + " ");
		}
		
	}
	
	public static void mergeSoringArrays () {
		
		int[] arr1 = { 1, 4, 5, 0, 0, 0 };
		int[] arr2 = { 2, 3, 6 };
		int i = arr1.length - arr2.length - 1;
		int j = arr2.length - 1;
		int k = arr1.length - 1;

		while (j >= 0) {
			if (arr1[i] > arr2[j]) {
				arr1[k] = arr1[i];
				i--;
			} else {
				arr1[k] = arr2[j];
				j--;
			}
			k--;
		}
		
        for (int m = 1; m < arr1.length; m++) {
            int key = arr1[m];
            int n = m - 1;

            while (n >= 0 && arr1[n] > key) {
                arr1[n + 1] = arr1[n];
                n--;
            }

            arr1[n + 1] = key;
        }

		
		System.out.println("Merge Valuesss");
		for (int value : arr1) {
			System.out.print(value + " ");
		}

	}
	
	public static void sumOfnvalueswithoutforloop () {
		
		int n = 6 ; // 1+2+3+4+5 = 15
		int sd = n*(n+1)/2;
		System.out.println(" sumOfnvalueswithoutforloop   " + sd);
		
	}
	
	public static void arrayReverseMethod (int[] arr) {
		
		System.out.println(Arrays.toString(arr));
		int j = 0 , temp = 0 ;
		int n = (arr.length-1)/2;
		for(int i = 0; i<n;i++) {
			temp = arr[j];
			arr[j] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
			j++; 
		}
		System.out.print(Arrays.toString(arr));
			}
	public static void waveArrayMethod () {
		
		int [] arr = {10, 5, 6, 3, 2, 20, 100, 80};
		Arrays.sort(arr);
		int j = 1;
		for(int i=0;i<arr.length-1;i++) {
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	public static  void sortanarray() {
		int [] arr = {3,4,5,2,7,10,1}; //12345710
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]  =temp;					
				}
			}
		}
		System.out.println("Array Reverse Methodssss");
		for(int i : arr) {
			System.out.println(i + " ");
		}
	}

	public static void stringremoveextraSpace() {
		
		String str1 = "I   am   the   best" ;
		
		String hj = str1.replaceAll("\\s+"," ");
		
		System.out.println(hj);
		
	}
	
	  public static void temperatureseries() {
		  
		  int [] arr = {73,74,75,71,69,72,76,73};  //output [1,1,4,2,1,1,0,0]
		  int n = 0;
		  int [] ghd = new int[arr.length];
		  for(int i=0;i<arr.length-1;i++) {
			  n = 0;
			  for (int j=i+1;j<=arr.length-1;j++) {
				  if(arr[j] > arr[i]) {
					  n++;
					  ghd[i] = n;
					  break;
				  } else {
					  n++;
				  }
			  }
		  }
		  System.out.println(Arrays.toString(ghd));
		
	}
		public static void main(String[] args) {		
		//Input  34512  output 52314 input [7,7,7,1,2,2,8,9,4] output:1,8,9,4		
		 int [] arr = {3,4,5,2,7};
		sortUsingArrayFields(arr);
		Map<String, Object> sdda = new HashMap<>();
		sdda.put("sds", "cbcsd");
		System.out.println(sdda);
		List<Map<String, Object>> ssd = new ArrayList<>();
		ssd.add(sdda);
		if(checkisNullorEmpty.test(ssd)) {
			System.out.println("Array is not  empty");
		}
		filterSeriesDuplicatesValues(arr);
		mergeSoringArrays();
		sumOfnvalueswithoutforloop();
		arrayReverseMethod(arr);
		waveArrayMethod();
		sortanarray();
		stringremoveextraSpace();
		temperatureseries();
}
}
