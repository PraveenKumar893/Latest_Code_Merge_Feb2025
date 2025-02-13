package com.Algorithms.Algoriths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class fileExtends {
	
	void show() {
		System.out.println(" The Class Methods Called.....");
	}
}

interface classloader {
	
	default void show() {
		System.out.println(" The Interface Method Called........");
	}
	
}


public class DataStructuresAlgorithms  {
	
	 static Integer [] nums = { 8,7,12,45,78};
	
	static void sortedArrayUsingTree() {
		
		TreeSet<Integer> treeksd = new TreeSet<>(Arrays.asList(nums));
		
		System.out.println(treeksd);
		
		System.out.println(treeksd.descendingSet());
				
	}
	
	static void sortedArrayList() {
		
		int [] nums1 = {12, 32 , 1,45,64,2} ;
		
		System.out.println(Arrays.stream(nums1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		
		System.out.println(Arrays.toString(Arrays.stream(nums1).sorted().toArray()));
		
	}
	
	public static void sortedStringList() {
		
		String str = "Hello World Is Fine" ;
		
		StringBuilder build = new StringBuilder();
		
		 String[] dsds = str.split(" ");
		 
		 System.out.println(dsds.length);
		 
		 for(int i = dsds.length-1 ; i>=0;i--) {
			 build.append(dsds[i] + " ");
		 }
		 System.out.println(build.toString());
		 
		String dsdsd =  IntStream.range(0, str.length()).mapToObj(op -> str.charAt(str.length()-1-op))
		   .map(String :: valueOf)
		   .collect(Collectors.joining());
		
		System.out.println(dsdsd);
		
	String sddsasas = 	IntStream.range(str.length(), 0)
		  .mapToObj(po -> str.charAt(str.length()-po))
		   .map(String :: valueOf).collect(Collectors.joining());
	
	 System.out.println(sddsasas);
		 
	}
	
	static void reverseNumberInLinkedLists() {
		
		List<Integer> listvalues = new LinkedList<>() ;
		listvalues.add(34);
		listvalues.add(213);
		listvalues.add(2);
		listvalues.add(56);
		
		System.out.println(listvalues); //34, 213, 2 56  -- output  : 56 2 213 34 
		ListIterator<Integer> dfg = listvalues.listIterator(listvalues.size()) ;
		int i = 0 ;
		while(dfg.hasPrevious()) {
			listvalues.set(i, dfg.previous());
			i++;
		}
		
		System.out.println(listvalues);
	}
	
	static void heightListValues() {
		 
		int [] height = {1,1,4,2,1,3} ;
		
        int[] expected = Arrays.copyOf(height, height.length);
        Arrays.sort(expected);
        int count = 0;
        for(int i = 0 ; i<height.length;i++) {
        	if(height[i] != expected[i]) {
        		count++;
        	}
        }
        
        System.out.println(count);
        
        // leet code 2 questions
        
        String name = "saeed" ; 
        String typed = "ssaaedd" ;
        
       Map<Character, Long> charmap = typed.chars().mapToObj(op -> (char) op)
          .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) ;
       
       Arrays.sort(name.toCharArray());
       
      List<Character> dssas = charmap.entrySet().stream().flatMap(pl -> name.chars().
    		   filter(lo -> pl.getKey() == lo && pl.getValue() >1)
    		    .mapToObj(i -> (char)i)
    		   ).toList() ;
      
     boolean asaas =  dssas.stream().allMatch(op -> name.chars().anyMatch(ui -> ui == op));
       
	}
	
	static void hackerRankQuestions() {
		
		int [] arr = {1,2,3,4,5} ; //5 1 2 3 4
		int n = arr.length ;
		int d = 4 ;
		d = d%n ;
		
		List<Integer> linkedlistVlaues = new CopyOnWriteArrayList<>(Arrays.stream(arr).boxed().toList()) ;

		System.out.println(linkedlistVlaues);
		
        List<Integer> rotatedList = new ArrayList<>();
        rotatedList.addAll(linkedlistVlaues.subList(d, n));
        
		System.out.println(rotatedList);
		
	}

	public static void main(String[] args) {
		
		sortedArrayUsingTree();
		
		sortedArrayList();
		
		sortedStringList() ;
		
		reverseNumberInLinkedLists() ;
		
		heightListValues() ;
		
		hackerRankQuestions() ;

	}

}
