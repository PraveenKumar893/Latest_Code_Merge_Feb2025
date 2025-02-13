package BinaryTree;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class sdd implements Serializable {
	
	transient String name;
}

public class timeComplexity {
	
	static void subStringWithTimeCOmplexity() {
		
		String str = "Praveen" ;
		int max = 0 , maxlength = 0;
		Set<Character> duplicateSet = new HashSet<>() ;
		
		for(int i = 0 ; i<str.length() ; i++ ) {
			
			if(duplicateSet.contains(str.charAt(i))) {
				duplicateSet.remove(str.charAt(max));
				max++;
				break;
			}
			duplicateSet.add(str.charAt(i));
			
			maxlength = Math.max(maxlength, i-max+1) ;
		}
		
		System.out.println(maxlength);
		
		System.out.println(" The SubString Values....  " + str.substring(0, maxlength));
		
		Map<Character, Integer> submap = new HashMap<>() ;
		int start = 0 ; int end = 0;
		
		for(int i = 0 ; i<str.length() ; i++) {
			
			if(submap.containsKey(str.charAt(i))) {
				start = Math.max(start, submap.get(str.charAt(i)) + 1);
			}
			submap.put(str.charAt(i), i) ;
			
			end = Math.max(end, i-start+1) ;
		}
		
		System.out.println(" The SubString Values.... " + str.substring(0, end));
		
	}
	
	static void reverseintArrayAndStringValues() {

		int[] num = { 12, 44, 334, 23, 145,12,67,334};

		int largest = Arrays.stream(num).boxed().distinct()
				.sorted((s1, s2) -> s2 - s1).skip(1).findFirst().get();

		System.out.println(" The largest Number.... " + largest);
		
		// Second Approach
		
		int max = 0 ; int semax = 0 ;
		
		for(int n1 : num) {
		   if(n1 > max) {
			   max = semax;
			   max = n1;
		   } else if(n1 > semax && n1 != max) {
			   semax = n1;
		   }
		}
		
		System.out.println(" The largest Number.... " + max + "  " + semax);

		// reverse An Array
		
		int [] num2 = {12,44,56,78,90};
		
	 int[] sdasa = 	IntStream.range(0, num2.length)
		  .map(op -> num2[num2.length - 1 - op]).toArray() ;
	 
	   System.out.println(Arrays.toString(sdasa));
	   
	   int j = num2.length-1;
	   for(int i = 0 ; i<num2.length/2;i++) {
		   int temp = num2[i] ;
		   num2[i] = num2[j];
		   num2[j] = temp;
		   j--;  
	   }
	   
	   System.out.println(Arrays.toString(num2));
	   
	   // Reverse A String using Array and Chars
	   
	   String [] stt = {"H" ,"E" ,"L" , "L" , "O"};
	   
	   
	   String [] nsam = IntStream.range(0, stt.length)
	     .mapToObj(op -> stt[stt.length-1-op]).distinct()
	     .toArray(String[] :: new) ;
	   
	     System.out.println(Arrays.toString(nsam));
	     
		   int jk = stt.length-1;
	     
	     for(int i = 0 ;i<stt.length/2;i++) {
		    	 String temp = stt[i];
			     stt[i] = stt[jk];
			     stt[jk] = temp;
			     jk--;
	     }
	     
	     System.out.println(Arrays.toString(stt));
	     
	     String strt ="Praveen" ;
	     
	     
	    String assa =  strt.chars().mapToObj(op -> (char) op).distinct()
	       .map(String :: valueOf).collect(Collectors.joining()) ;
	    
	    System.out.println(" Remove Duplicate Entries  " + assa);
	     
	    String sdasas = IntStream.range(0, strt.length())
	    		.mapToObj(op -> strt.charAt(strt.length()-1-op)).distinct()
	    		.map(String :: valueOf).collect(Collectors.joining()) ;
	    		
	    System.out.println(sdasas);
	}
	
	static void removeDuplicatesInString() {
		
		String str = "Praveen";
		Set<Character> duplicateSet = new HashSet<>();
		StringBuilder sd = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(duplicateSet.add(ch)) {
				sd.append(ch);
			}
		}
		
		System.out.println(sd.toString());
		
		String hj = sd.toString();
		sd = new StringBuilder();
		
		for(int i = hj.length()-1; i>=0 ; i--) {
			sd.append(hj.charAt(i));
		}
		
		System.out.println(" The Repeated Values.... " + sd.toString());
		
		   String [] stt = {"H" ,"E" ,"L" , "L" , "O"};
		   Set<String> daas = new HashSet<>();
		   
		   for(String asa : stt) {
			   if(!daas.contains(asa)) {
				   daas.add(asa);
			   }
		   }
		   String [] sdsas = daas.toArray(new String[0]) ;
		   for(int i = sdsas.length-1; i>= 0 ;i--) {
			   System.out.print(sdsas[i] + " ");
		   }
		   
		   System.out.println(" ");
		   
		   String [] asaa = {"Apple" , "Orange" , "Pineapple"};
		   
		    String [] sdas = IntStream.range(0, asaa.length)
		       .mapToObj(pi -> asaa[asaa.length-1-pi]).toArray(String [] :: new ) ;
		    
		    System.out.println(Arrays.toString(sdas));
		}
	
	  static void findLargestNumber() {
		  
		  int [] arr = {121,44,543,221,78,671,543,44,121,44};
		  
		Map<Object, Object> dssjjdj = Arrays.stream(arr).boxed().
		  collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
		  .entrySet().stream().
		  sorted(Map.Entry.<Integer ,Long>comparingByValue(Comparator.reverseOrder())
				 .thenComparing(Map.Entry.comparingByKey(Comparator.reverseOrder())))
		  .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue , (e1,e2) ->e1 , LinkedHashMap :: new)) ;
	  
	     dssjjdj.entrySet().stream().forEach(op -> System.out.println(op.getKey() + " " + op.getValue()));
	     
	     
	     int [] asas = {1,2,3,4,5,6};
	     
	   List<int[]> sddsa = IntStream.range(0, asas.length-2)
	       .mapToObj(op -> Arrays.copyOfRange(asas, op, op+3)).toList() ;
	   
	   sddsa.forEach(op -> System.out.println(Arrays.toString(op)));
	   
	   System.out.println(" ");
	     
	   List<int[]> sdsas = IntStream.range(0, asas.length/3)
	        .mapToObj(op -> Arrays.copyOfRange(asas, op*3, Math.min((op+1)*3, asas.length)))
	        .toList() ;
	     
	   sdsas.stream().forEach(oi -> System.out.println(Arrays.toString(oi)));
	     
	     int [][] matrix = {
	    		 {1,23,4},
	    		 {45,0,90},
	    		 {121,3,4}
	     } ;
	     
	     
	 int grates =     Arrays.stream(matrix).flatMapToInt(Arrays :: stream).boxed()
	       .sorted(Comparator.reverseOrder()).skip(1).findFirst().get() ;
	 
	   System.out.println(grates);
	     
	     Set<Integer> rowsset = new HashSet<>();
	     Set<Integer> columnSet = new HashSet<>() ;
	     
	     for(int i = 0 ; i<matrix.length ; i++) {
	    	 
	    	 for(int j = 0 ;j<matrix[i].length ; j++) {
	    		 
	    		 if(matrix[i][j] == 0) {
	    			 rowsset.add(i);
	    			 columnSet.add(j);
	    		 }
	    	 }
	     }
	     
			for (int row : rowsset) {

				for (int i = 0; i < matrix[0].length; i++) {
					matrix[row][i] = 0;
				}
			}
			
			for (int col : columnSet) {

				for (int i = 0; i < matrix.length; i++) {
					matrix[i][col] = 0;
				}
			}
			
			for(int i = 0 ; i<matrix.length ;i++) {
	        	System.out.println(" ");
				for(int j = 0 ; j<matrix[i].length ; j++) {
					System.out.println(Arrays.toString(matrix[j]) + " ");
				}
				
			}
	
		  }
 
	public static void main(String[] args) {
		
		subStringWithTimeCOmplexity() ;
		reverseintArrayAndStringValues() ;
		removeDuplicatesInString();
		findLargestNumber() ;

	}

}
