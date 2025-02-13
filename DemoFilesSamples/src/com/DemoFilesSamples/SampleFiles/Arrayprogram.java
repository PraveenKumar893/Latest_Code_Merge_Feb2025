package com.DemoFilesSamples.SampleFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arrayprogram {
	
	public static  void removeduplicateArray(int[] a, int n) {
		Arrays.sort(a);
	    int j = 0;
	    for (int i = 0; i < a.length - 1; i++) {
	        if (a[i] != a[i + 1]) {
	            a[j] = a[i];
	            j++;
	        }
	    }
	    a[j] = a[a.length - 1];
	    for (int i = 0; i <= j; i++) {
	        //	System.out.println(a[i]);
	    }

    }  
	
	public static int removeduplicateArrayforMethod(int[] arr, int n) {
		//[12, 21, 33, 43, 67, 33, 43, 67]
		int [] dfdsd = {12, 21,12,21, 33, 43, 67, 33, 43, 67};
		int aa = dfdsd.length;
		int jk = 0 ;
		for(int i = 0 ; i<aa ; i++) {
		  for(int j=0 ; j<i ; j++) {
			  if(arr[i] == arr[j]) {
				  jk++;
				  break;
			  }
		  }
		}
		return jk;
		
	}
	
	
	public static void removeDuplicatesUsingSteam(int[] arr, int n) {
		
		int[] dssd = Arrays.stream(arr)
        .distinct()
        .toArray();		
		System.out.println("sdsdsddsds   " +  Arrays.toString(dssd));
		
	}
	
	public static void findSecondlargest(int[] arr, int n) {
		
		int max = 0;
		int seMax = -1;
		
		for(int i = 1 ; i<n;i++) {
			if(arr[i] > arr[max]) {
				seMax = max;
				max = i;
			}else if(arr[i] < arr[max]) {
				if(seMax == -1 || arr[seMax] < arr[i])
				seMax = i;
			}
		}
		System.out.println("Find second largest  "+ arr[seMax]);
		int maxnn = arr[0];
		for(int i = 0 ; i<n;i++) {
			if(maxnn < arr[i] ) {
				maxnn = arr[i];
			}
		}
		System.out.println(" FIND MAXIMNUM  "+ maxnn);
	}
	
	public static void findSecondlargestUsingSteam(int[] arr, int n) {
		
		int dfds = Arrays.stream(arr).max().getAsInt();
		
		System.out.println("findSecondlargestUsingSteam   "+dfds);
	}

	public static void main(String[] args) {
		
		int [] arr = {12, 21,12,21,33, 43, 67, 33, 43, 67} ;
		int n = arr.length;
	   removeduplicateArray(arr,n);
	   int js = removeduplicateArrayforMethod(arr,n);
	   
	   
	   for(int i = 0; i<(n-js);i++) {
		   System.out.println(arr[i]);
	   }
	   removeDuplicatesUsingSteam(arr,n);
	   findSecondlargest(arr,n);
	   findSecondlargestUsingSteam(arr,n);
	   streamListfields();
	}

	private static void streamListfields() {
		List<String> dsdssda = new ArrayList<>();
		dsdssda.add("praveen");
		dsdssda.add("kumar");
		dsdssda.add("sdsdsda");
		dsdssda.add("ckdks");
		
	//	dsdssda.sort((s1,s2) -> s1.compareToIgnoreCase(s2)); 
		
		System.out.println(dsdssda);
		
		System.out.println(dsdssda.stream().sorted().collect(Collectors.toList()));

	}

}
