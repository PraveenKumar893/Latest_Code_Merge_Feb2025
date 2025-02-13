package BinaryTree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class hackerRankProblems {
	
	static void insertionSortAlgorithms() {
		
		int [] arr = {4,3,2,1};
		int key = 0;
		int shift = 0;
		
		for(int i = 0 ; i<arr.length; i++) {
			key = arr[i];
			int j = i-1;
			
			while(j >= 0 && key < arr[j]) {
				shift++;
				arr[j + 1] = arr[j];
				j = j-1;
			}
			
			arr[j+1] = key ;
		}
		
		System.out.println(Arrays.toString(arr) + " shifet  : " + shift);
		
	}
	
	static void printStarinorderWise() {
		
		int n = 5;
		
		for(int i = n ; i>=1; i--) {
			
			for(int j = 1; j<=i ;j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		
		for(int i = 1 ; i<=n; i++) {
			
			for(int j = 1; j<=i ; j++) {
				System.out.print("  & ");
			}
			System.out.println(" ");
		}
	}
	
	static void firstNonRepeatingCharcters() {
		
		String str  = "Praveen" ;
		Set<Character> duplicateSet = new HashSet<>();
		int max = 0;
		int maxLength = 0;
		
		for(int i = 0 ; i<str.length() ; i++) {
			while(duplicateSet.contains(str.charAt(i))) {
				duplicateSet.remove(str.charAt(max));
				max++;
			}
			duplicateSet.add(str.charAt(i));
			
			maxLength = Math.max(maxLength, i - max +1);
		}
		
		System.out.println(" The Maximum Length  " + maxLength);
		
		System.out.println(" The Substring Valuess  " + str.substring(0, maxLength));
	}
	
	static void removeDuplicatesInarray() {
		
		int [] arr1 = {1,3,5,8,7};
		int [] arr2 = {1,8,5,98,79};
		
	List<Integer> fileda =	Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed())
		   .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
		   .entrySet().stream().filter(op -> op.getValue() > 1)
		   .map(Map.Entry :: getKey).toList() ;
	
	System.out.println(fileda);
	
	List<Integer> sds =   Arrays.stream(arr1).boxed()
	     .flatMap(op -> Arrays.stream(arr2).boxed().filter(pi -> pi == op))
	     .toList() ;
		
	  System.out.println(sds);
	  
	  String str = "Praveen" ;
	  
	 String ssaas =  str.chars().mapToObj(op -> (char) op).distinct()
	    .map(String :: valueOf).collect(Collectors.joining()) ;
	 
	  System.out.println(ssaas);
	  
	 String [] dsds = IntStream.range(0, str.length())
	    .mapToObj(pi -> str.charAt(str.length() - 1 -pi)).map(String :: valueOf)
	    .toArray(String [] :: new) ;
	    // .collect(Collectors.joining()) ;
	 
	   System.out.println(Arrays.toString(dsds));
	   
	   String [] sdss = {"P" ,"R" ,"F" ,"G" ,"H" }; 
	   
	  String[] dssda = IntStream.range(0, sdss.length)
	     .mapToObj(io -> sdss[sdss.length-1-io])
	     .toArray(String [] :: new) ;
	  
	  System.out.println(Arrays.toString(dssda));
	   
	}
	
	static void prefixArrayInjava() {
		
		String [] str = { "flows" , "flonm" , "flokjl" ,"flokl" } ;
		
		String prefix = str[0] ;
		
		for(int i = 1 ; i<str.length ;i++) {
			while(str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1);
				
				if(prefix.isEmpty()) {
					System.out.println(" The Values get failed.....");
				}
			}
		}
		System.out.println(" The final Values  " + prefix);
	}

	public static void main(String[] args) {
		
		insertionSortAlgorithms() ;
		printStarinorderWise();
		firstNonRepeatingCharcters() ;
		removeDuplicatesInarray();
		prefixArrayInjava() ;
	}

}
