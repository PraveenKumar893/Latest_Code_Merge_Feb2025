package com.DemoFilesSamples.SampleFiles;

public class DataStructuresAlgorithms {
	
	private static int linearSearch(int[] nums, int target) {
		
		for(int i = 0 ;i<nums.length;i++) {
			if(nums[i] == target) {
				System.out.println(" Index found in array " + i);
				return i;
			}
		}
		return -1;
	}
	
	private static int binarySearch(int[] nums, int target) {
		
		int left = 0;
		int right = nums.length-1;
		
		while(left<=right) {
			int middle = (left+right)/2;

			if(nums[middle] == target) {
				return middle;
			} else if(nums[middle] < target) {
				left = middle+ 1;
			} else {
				right = middle -1 ;
			}
		}
		
		return -1;
	}
	
	private static void selectionSort(int[] nums) {
		
		int size = nums.length;
		int maxIndex = -1;
		int temp = 0;
		
		for(int i=0; i<size-1;i++) {
			maxIndex =  i;
			for(int j=i+1 ; j<size;j++) {  //12 ,34, 22 ,89 ,90 desc order
				
				if(nums[maxIndex] < nums[j]) {
					maxIndex = j;
				}
			}
			temp = nums[maxIndex];
			nums[maxIndex] = nums[i];
			nums[i] = temp;
		}
		
		for(int l : nums) {
			
			System.out.print(l + " ");
		}
		
	}

	
	private static void insertionSort(int[] nums) {
		
		int [] numss = {12 ,34, 22 ,89 ,90} ;

		int key = 0; //12 ,34, 22 ,89 ,90
		int j = 0;
		
		for(int i = 1 ; i<numss.length;i++) {
			
			j = i-1;
			key = numss[i];
			
			while(j >= 0 && numss[j] > key) {
				numss[j+1] = numss[j];
				j--;
			}
			numss[j+1] = key;
		}
		System.out.println("");
		for(int h : numss) {
			
			System.out.print(h + " ");
		}
		
	}
	
	private static void quickSortAlgorithms(int[] arr, int low, int high) {
		 // 12 ,34, 22 ,89 ,90
		
		if(low<high) {
			
			int pi = searchPivotPoint(arr,low,high);
			
			quickSortAlgorithms(arr,low,pi-1);
			quickSortAlgorithms(arr,pi+1,high);
		}
	}

	
	private static int searchPivotPoint(int[] arr, int low, int high) {
		//12 ,34, 22 ,89 ,90
		int pivot = arr[high];
		int i = low -1;
		
		for(int j = 0 ; j<high;j++) {
			
			if(arr[j] < pivot) {
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
	
	private static void mergeSortAlgorithms(int[] arr1, int left, int right) {
		
		if(left < right) {
			
			int mid = (left+right)/2;
			mergeSortAlgorithms(arr1,left,mid);
			mergeSortAlgorithms(arr1,mid+1,right);
			mergeALgorithms(arr1,left,mid,right);
		}
		
		
	}


	private static void mergeALgorithms(int[] arr1, int left, int mid, int right) {
		
		int n1 =  mid - left + 1;
		int n2 = right - mid ;
		
		int [] larr = new int[n1];
		int [] rarr = new int[n2];
		
		for(int l =0 ; l<n1;l++) { //12 ,34, 22 ,89 ,90
			larr[l] = arr1[left+l]; 
		}
		
		for(int l =0 ; l<n2;l++) {
			rarr[l] = arr1[mid+1+l]; 
		}

		int i = 0,j = 0;
		int k = left;
		
		while(i<n1 && j<n2) {
			
			if(larr[i] <= rarr[j]) {
				arr1[k] = larr[i];
				i++;
			} else {
				arr1[k] = rarr[j];
				j++;
			}
			k++;
		}

		while(i<n1) {
			arr1[k] = larr[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr1[k] = rarr[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		
		int [] nums = {12 ,34, 22 ,89 ,90} ;
		
		int target = 89 ;
		
		System.out.println(nums.length);
		
		int result = linearSearch(nums,target); // linearSearch
		
		System.out.println("Linear Search Result " + result);
		
		int resultBinary = binarySearch(nums,target);
		
		System.out.println("Binary Search Result " + resultBinary);
		
	//	 selectionSort(nums);
		 
	//	 insertionSort(nums);
		 
		int [] arr = {12 ,34, 22 ,89 ,90} ;
		 
		// quickSortAlgorithms(arr,0,arr.length-1);
		 // sorted arrays
		//	for(int jk : arr) {
		//		System.out.print(jk + " ");
		//	}
			int [] arr1 = {123 ,342, 222 ,891 ,90} ;
			
			mergeSortAlgorithms(arr1,0,arr1.length-1);
			
			//sorted arrays
			System.out.println(" ");
			for(int n : arr1) {
				System.out.print(n + " ");
			}
	}



}
