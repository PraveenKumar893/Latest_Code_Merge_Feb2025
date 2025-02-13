package com.Algorithms.Algoriths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class complexArrayProblemUsingStringInteger {
	
	static void reverseIntArrayusingSteams() {
		
		int [] num = {3,4,2,1,9};
		// reverse an Array
		int j = num.length-1;
		
		for(int i = 0 ;i<num.length/2;i++) {
			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
			j--;
		}
		System.out.println(" Normal Methodss " + Arrays.toString(num));
		
		// Reverse An Array Using Java 8 Streams Methods
		
		int [] num1 = {31,43,2,1,9};
		
	//	IntStream.range(0, num1.length).map(kl -> num1[num1.length - 1 - kl]).toArray();
		
		System.out.println(" Stream Methodss " + 
		  Arrays.toString(IntStream.range(0, num1.length).map(kl -> num1[num1.length - 1 - kl]).toArray()) );

	}
	
	static void reverseStringArrayusingSteams() {
		
		String [] str = {"W", "O" ,"R" ,"L" ,"D" };
		
		String [] sdjhsd = IntStream.range(0, str.length).mapToObj(op -> str[str.length - 1 -op])
				.toArray(String [] :: new );
		
		System.out.println(" Stream Methodss " + Arrays.toString(sdjhsd));
		
		// Normal Array Methodss
		
		String[] str1 = { "W", "O", "R", "L", "D" };
		int j = str1.length - 1;

		for (int i = 0; i < str1.length / 2; i++) {
			String temp = str1[i];
			str1[i] = str1[j];
			str1[j] = temp;
			j--;
		}
		
		System.out.println(" NorMal Methodss In String  " + Arrays.toString(str1));
	}
	
	static void findMaxAndMinValuesFromRightToLeft() {
		
		// find Max From right to Left
		List<Integer> result = new ArrayList<>();
		int [] nums = {12 ,34 , 56 ,79 ,8};
		int n = 0;
		
		for (int i = nums.length - 1; i >= 0; i--) {

			if (nums[i] > n) {
				result.add(0, nums[i]);
				n = nums[i];
			}
		}
		System.out.println(result);
		
		// find min from right to left
		
		int [] nums1 = {34,5,7,9,10};
		int kl = Integer.MAX_VALUE;
		List<Integer> smallerValueList = new ArrayList<>();
		
		for(int  i = nums1.length-1; i>=0;i--) {
			if(nums1[i]<kl) {
				smallerValueList.add(0, nums1[i]);;
				kl = nums1[i];
			}
		}
		System.out.println(" Array Valuess  " + smallerValueList);
	}
	
	static void findMaxAndMinValuesFromLeftToRight() {
		
		int [] num = {34,4,56,7,89};
		int max = 0;
		int min = num[0];
		List<Integer> maxresultList = new ArrayList<>();
		List<Integer> minresultList = new ArrayList<>();
		
		for(int i = 1 ;i<num.length;i++) {
				if(num[i] > max) {
					max = num[i];
					maxresultList.add(num[i]);
				}
				
				if(num[i] < min) {
					min = num[i];
					minresultList.add(num[i]);
				}
		}
		System.out.println(" Max values from left to right " + maxresultList);
		System.out.println(" Min values from left to right " + minresultList);
	}
	
	static void SumOfArrays() {
		
		int [] num1 = {1,2,3,4,5,6} ;
		
	int dsdsasas = 	Arrays.stream(num1).boxed().mapToInt(op -> op%2 == 0 ? op : 0).sum();
	
	int asad = Arrays.stream(num1).boxed().filter(op -> op%2 == 0).reduce(Integer :: sum).get() ;
	
	int sadaadaas = Arrays.stream(num1).filter(op -> op%2 == 0).sum();
	
	Arrays.stream(num1).boxed().forEach(op -> System.out.println(op*5));
	
	Consumer<Integer> listValues = con -> System.out.println(con*5);
	
	Arrays.stream(num1).boxed().forEach(listValues);
	
	Arrays.stream(num1).forEach(pl -> System.out.println(pl*5));
	
	int sddssdas = Arrays.stream(num1).boxed().mapToInt(po -> po*5).reduce(Integer :: sum).getAsInt() ;
	
	int dsasaa = Arrays.stream(num1).boxed().mapToInt(op -> op*5).sum() ;
	
	System.out.println(dsdsasas + " " + asad + "  " + sadaadaas + " " + sddssdas + " " + dsasaa );
	
	String saassa = "Halith|-|Single,Married|-|Dollar" ;
	
	String  [] asasa = saassa.split("\\|") ;
	
	Map<String, String > sdsd = new LinkedHashMap<>() ;
	
	sdsd.put("dssd", asasa[0]) ;
	if(!sdsd.get("dssd").toString().isEmpty()) {
		String sd = sdsd.get("dssd").toString() ;
		sd = sd + "|" + asasa[1];
		sdsd.put("dssd", sd) ;
	}
	
		
	}
	
	public void displayfields() {
		
       List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(10, 2, 3, 4, 5));
        
       ListIterator<Integer> iterator = list.listIterator(list.size());
       int i = 0;
       while(iterator.hasPrevious()) {
    	   list.remove(i);
    	   list.add(i, iterator.previous());
    	   i++;
       }
       
       System.out.println(list);
	}		
	public static void main(String[] args) {
		
		reverseIntArrayusingSteams();
		reverseStringArrayusingSteams();
		findMaxAndMinValuesFromRightToLeft();
		findMaxAndMinValuesFromLeftToRight();
		SumOfArrays();
		new complexArrayProblemUsingStringInteger().displayfields();		

	}

}
