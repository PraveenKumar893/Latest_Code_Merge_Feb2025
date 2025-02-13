package com.Algorithms.Algoriths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayObject {
	
	private static void printresultStream(Object[] arr) {
		
		int n = arr.length; // 1,2,3,4,5,6,7,8
		
		for(Object ele : arr) {
			
			if(ele instanceof Object[]) {
				printresultStream((Object[]) ele);
			} else {
				System.out.print(ele);
			}
		}
		
		
	}
	
	private static void sortusingthirdArray() {
		
		int [] n1 = {4,2,34,1};
		int[] n2 = {3,5,12};
		
		int [] n3 =  new int[n1.length + n2.length];
		
		System.out.println(" ");
		
		System.out.println(n3.length);
		
		for(int i = 0 ; i<n1.length;i++) {
			
			n3[i] = n1[i];
		}
		
		for(int i = 0 ; i<n2.length;i++) {
			
			n3[n3.length-i-1] = n2[i];
		}

		
		System.out.println(Arrays.toString(n3));
		
		
		Arrays.sort(n3);
		
		for(int e : n3) {
			System.out.println(e);
		}
		
		
	}
	
	public static void removeDuplicateinString() {
		
		String str  = "Praveen" ;
		
		StringBuilder sf = new StringBuilder();
		
		Set<Character> nm = new HashSet<>();
		
		for(char df : str.toCharArray()) {
			if(nm.add(df)) {
				sf.append(df);
			}
		}
		
		System.out.println(sf.toString());
		
		
	}
	
	public static void findMaxandMinusingArrays() {

		int num3 [] = {122,34,21,332,343,1};
		//	setMaxAndMinArray(num3,0,num3.length-1);
		selectionSort(num3);
	}



	  static void selectionSort(int[] num3) {
		  int hg = num3.length-1;
		  int maxIndex = -1 ;
		  int temp = 0 ;
		  
		  for(int i = 0 ;i<hg;i++) {
			  maxIndex = i;
			  
			  for(int j = i+1 ; j<num3.length;j++) {
				  
				  if(num3[maxIndex] < num3[j]) {
						maxIndex = j;
					}
			  }
				temp = num3[maxIndex];
				num3[maxIndex] = num3[i];
				num3[i] = temp;
			  }
		  
		  System.out.println(" sddd  ");
		  System.out.println(Arrays.toString(num3));
		  
	        for (int i = 1; i < num3.length / 2; i += 2) {
	            temp = num3[num3.length - i];
	            num3[num3.length - i] = num3[i];
	            num3[i] = temp;
	        }

		  
		  
		  System.out.println(Arrays.toString(num3));
		
	}

	static void setMaxAndMinArray(int[] num3, int max, int k) { //122,34,21,332,343,1
		 
		 int maxnn = num3[max];

			for(int i = 0 ; i<k;i++) {
				if(maxnn < num3[i] ) {
					maxnn = num3[i];
					
					int temp = num3[i];
					num3[i] = num3[max];
					num3[max] = temp;
				} 
			}
			 maxnn = num3[max+1]; //[343, 34, 21, 122, 332, 1] [343, 21, 34, 122, 332, 1]
			for(int i = 1 ;i<=k;i++) {
				 if(maxnn > num3[i]) {
					 maxnn = num3[i];
					int temp = num3[i];
					num3[i] = num3[max + 1];
					num3[max + 1] = temp;
				}
			}
	}
	
	 static void removeDuplicatess() {
		
	int [] arrsa = {1,2,3,2,3,1};
		
		int [] kl = Arrays.stream(arrsa).distinct().toArray();
		
		for(int i = 0 ;i<kl.length;i++) {
			
			arrsa[i] = kl[i];
		}
		
		System.out.println(Arrays.toString(arrsa));
		
		Set<Integer> sdd = new HashSet<>();
		
		for(Integer i : arrsa) {
			sdd.add(i);
		}
		
		System.out.println(sdd);		
	}

	 static int[] findDuplicatesinArray() {
		 
		// Input: nums1 = [1,2,2,1]; nums2 = [2,2] Output: [2,2] [1,2,2,1]
		 int [] dsd = null;
		 int [] nums1 = {1,2,2,1}; int [] nums2 = {1,2} ;
		  int [] result =  Arrays.stream(nums1).filter(kl -> Arrays.stream(nums2)
				  .allMatch(op -> op == kl))
		      .toArray();
			  List<Integer> num23 = Arrays.stream(nums1).boxed().toList();
			 List<Integer> num24 = Arrays.stream(nums2).boxed().toList();
			 
			 List<Integer> sa = num23.stream().filter(num24::contains).collect(Collectors.toList());

	        if(sa.size() <= nums1.length && sa.size() >= nums2.length){
	            dsd = new int[nums2.length];
	        } else if(sa.size() >= nums1.length && sa.size() <= nums2.length){
	            dsd = new int[nums1.length];
	        }
	        else {
	            dsd = new int[sa.size()];
	        }

	        int j = 0;
	        for(int df : sa){
	        	if(dsd.length != j) {
		            dsd[j] = df;
	        	} else {
	        		break;
	        	}
	            j++;
	        }		  
		  System.out.println(Arrays.toString(result));
		  
		  
		return result;

		  
		 
	 }


	public static void main(String[] args) {
		
		Object [] arr = {1,2,3,new Object[] {4,5, new Object[] {6},7},8};
		
		printresultStream(arr);
		
		sortusingthirdArray();
		
		removeDuplicateinString();
		
		findMaxandMinusingArrays();
		
		removeDuplicatess();
		
		int [] sdsd = findDuplicatesinArray();
		
		System.out.println(" sddsdsddds " + Arrays.toString(sdsd));
		

	}

	


}
