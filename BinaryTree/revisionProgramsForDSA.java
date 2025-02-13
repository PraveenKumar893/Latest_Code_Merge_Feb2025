package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class Nodess {
	Nodess next ;
	int data ;
	
	public Nodess(int data) {
		super();
		this.data = data;
	}
}

class BinaryNodes {
	
	BinaryNodes left;
	BinaryNodes right;
	int data;
	
	public BinaryNodes(int data) {
		super();
		this.data = data;
	}
}

public class revisionProgramsForDSA {
	
	static void arrayRevisedproblems() {
		
		// reverse an array
		int [] arr = {12,44,32,443,789};
		
	int[] jmk =	IntStream.range(0, arr.length)
		   .map(kl -> arr[arr.length-1-kl]).toArray() ;

	System.out.println(Arrays.toString(jmk));
	
	// find second max using java 8 and normal
	
	int [] arr1 = {12,345,345,67,12,90,87};
	
	int secondmax = Arrays.stream(arr1).boxed().distinct()
			.sorted(Comparator.reverseOrder()).skip(1).findFirst().get() ;
	
	System.out.println(" The Second Max " + secondmax);
	
	  int firstMax = 0;
	  int secmx = 0;
	  
	  for(int num : arr1) {
		  
		  if(num > firstMax) {
			  firstMax = secmx;
			  firstMax = num;
		  } else if(num > secmx && firstMax != num) {
			  secmx = num ;
		  }
	  }
		System.out.println(" The Second Maxss " + secmx);
	
	}

	static void stringRevisedProblems() {
		
		String [] str = {"H" , "e" ,"l" ,"l" ,"o"};
		
	 String [] mm =	IntStream.range(0, str.length)
		 .mapToObj(ki -> str[str.length-1-ki]).toArray(String [] :: new) ;
	 
	    System.out.println(Arrays.toString(mm));
	    
	    String str1 = "Praveen" ;
	    
	  String hjkl =  IntStream.range(0, str1.length()).mapToObj(op -> str1.charAt(str1.length()-1-op))
	      .map(String :: valueOf).collect(Collectors.joining()) ;
		
	     System.out.println(hjkl);
	     
	    Map<Character, Long> dsfd = str1.chars().mapToObj(c -> (char)c).
	     collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) ;
	    
	    
	  String sdasas =   str1.chars().mapToObj(kl -> (char) kl)
	      .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
	     .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	     .flatMap(op -> String.valueOf((char) op.getKey()).repeat(op.getValue().intValue())
	    		 .chars().mapToObj(l -> String.valueOf((char) l))).collect(Collectors.joining()) ;
	  
	  System.out.println(sdasas);
	  
	  String ksalaskdsd = dsfd.entrySet().stream().sorted(Map.Entry.<Character, Long>comparingByValue(Comparator.reverseOrder())
			  .thenComparing(Map.Entry.comparingByKey()))
	  .flatMap(ok -> Collections.nCopies(ok.getValue().intValue(), ok.getKey()).stream())
	  .map(String :: valueOf).collect(Collectors.joining()) ;
	  
	  System.out.println(ksalaskdsd);
	  
	    
	}
	
	static void bubleSortsAlithms() {
		
		int [] arr = {32,78,998,1212,329};
		
		// bubble Sorting Ascending order
		
		for(int i = 0 ; i<arr.length ; i++) {
			for(int j = 0 ; j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		int [] arr1 = {32,78,998,1212,329};
		
		// Bubble Sort in descending order
		
		for(int i = 0 ; i<arr1.length ; i++) {
			for(int j = 0 ; j<arr1.length-i-1;j++) {
				if(arr1[j] < arr1[j+1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
	
	static void SelSortAlithms() {
		
		int[] aerd = { 89, 90, 12, 334, 213, 876 };

		for (int i = 0; i < aerd.length; i++) {
			int maxI = i;
			for (int j = i+1; j < aerd.length; j++) {
				if (aerd[maxI] > aerd[j]) {
					maxI = j;
				}
			}
			int temp = aerd[i];
			aerd[i] = aerd[maxI];
			aerd[maxI] = temp;
		}

		System.out.println(Arrays.toString(aerd));
		
		int [] arr = {34,56,78,8,90,877};
		
		for(int i = 0 ; i<arr.length ; i++) {
			int maxIn = i;
		 for(int j = i+1 ; j<arr.length ;j++) {
			 if(arr[j] > arr[maxIn]) {
				 maxIn = j;
			 }
		 }
			int temp = arr[i] ;
			arr[i] = arr[maxIn];
			arr[maxIn] = temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void primeNumberFunctions() {
		
		int num = 50 ;
		List<Integer> resultList = new ArrayList<>() ;
		
		for(int i = 2 ; i<=num ; i++) {
			boolean isPrime = prime(i);
			if(isPrime) {
				resultList.add(i);
			}
		}
		
		System.out.println(resultList);
		
	}
	
	private static boolean prime(int nums) {
		
		if(nums <= 3) return true;
		if(nums%2 == 0 || nums%3 == 0 ) return false;
		
		for(int i = 5 ; i*i <= nums ; i+=6) {
			if(nums%i == 0 || nums%(i+2) == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	static  void insertionsAlgorithsms() {
		int [] arr = {23,43,89,876,121};
		int key = 0 ;
		
		for(int i = 1 ; i<arr.length ; i++) {
			key = arr[i] ;
			int j = i-1;
			
			while(j >= 0 && key < arr[j]) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	Nodess head;
	
	void insertdata(int data) {
		
		Nodess newnode = new Nodess(data);
		
		if(head == null) {
			head = newnode ;
		} else {
			Nodess current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newnode ;
		}
	}
	
	void display() {
		
		Nodess current = head;
		
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	void insertdataAtHead(int data) {
		
		Nodess newe = new Nodess(data);
		newe.next = head;
		head = newe;
	}
	
	void iterateThrougnArrayElements() {
		
		int count = 0;
		Nodess current = head;
		
		Nodess dummy = new Nodess(0);
		dummy.next = head;
		Nodess prev = dummy ;
		
		while(current != null) {
			count++;
			current = current.next ;
		}
		
		System.out.println(" The Count Has been Calculated " + count) ;
		
		for(int i = 0 ; i<count-1 ; i+=2) {  // 71 72 73 74 75
			
			int dsa = prev.next.data;
			prev.next.data = prev.next.next.data;
			prev.next.next.data = dsa;
			
			prev = prev.next.next ;
		}
		
		current = dummy.next;
		
		while(current != null) {
			System.out.println(current.data);
			current = current.next ;
		}
		
	}
	
	static void twoDimensionalArrayProblems() {
		
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
            };
        
        Set<Integer> setrowIdx = new HashSet<>();
        Set<Integer> colrowIdx = new HashSet<>();
        
        for(int i = 0 ; i<matrix.length ; i++) {
        	
        	for(int j = 0 ; j<matrix[i].length ; j++) {
        		
        		if(matrix[i][j] == 0) {
        			setrowIdx.add(i);
        			colrowIdx.add(j) ;
        		}
        	}
        	
        }
        
        for(int row : setrowIdx) {
        	
        	for(int i = 0 ; i<matrix[row].length ;i++) {
        		matrix[i][row] = 0;
        	}       	
        }
        
        for(int col : colrowIdx) {
        	
        	for(int i = 0 ; i<matrix.length ; i++) {
        		matrix[col][i] = 0;
        	}  	
        }
        
        // display fields
        
        for(int i = 0 ; i<matrix.length ; i++) {
        	System.out.println(" ");
        	for(int j = 0 ; j<matrix[i].length ; j++) {
        		System.out.println(Arrays.toString(matrix[j]));
        	}
        }
	}
	
	 BinaryNodes heads ;
	
     void treeInsert(int data) {
    	
    	heads = insertIntoTree(heads,data) ;
    }


	 BinaryNodes insertIntoTree(BinaryNodes heads, int data) {
		
		if(heads == null) {
			heads = new BinaryNodes(data);
		} else if(heads.data > data) {
			heads.left = insertIntoTree(heads.left,data);
		}else {
			heads.right = insertIntoTree(heads.right, data);
		}
		return heads;
		
	}
	 
	 static void spaceComplexityProblems() {
		 
		 // Method 1 using for and While loops
		 
		 String str = "Praveen" ;
		 Set<Character> duplicateSet = new HashSet<>();
		 int max = 0 ;
		 int maxLength = 0 ;
		 
		 for(int i = 0 ; i<str.length(); i++) {
			 while(duplicateSet.contains(str.charAt(i))) {
				 duplicateSet.remove(str.charAt(max));
				 max++;
			 }
			 duplicateSet.add(str.charAt(i));
			 maxLength = Math.max(maxLength, i-max+1);
		 }
		 
		 System.out.println(maxLength);
		 System.out.println(" The Valuesss....... " + str.substring(0, maxLength));
		 
		 // using List 
		 
		 List<Character> listval = new ArrayList<>() ;
		 
		 for(int i = 0 ; i<str.length() ; i++) {
			 
			 if(listval.contains(str.charAt(i))) {
				 break;
			 }
			 listval.add(str.charAt(i));
		 }
		 
		String ssaad =  listval.stream().map(String :: valueOf).collect(Collectors.joining()) ;
		
		System.out.println(" The values for Loops......... " + ssaad);
		
		// using Map techniques
		
		Map<Character, Integer> charmap = new HashMap<>() ;
		int start = 0 ;
		int maxlength = 0;
		int mzzx = 0;
		
		for(int i = 0 ; i<str.length() ; i++) {
			
			if(charmap.containsKey(str.charAt(i))) {
				start = Math.max(i, charmap.get(str.charAt(i))+1);
			}
			
			charmap.put(str.charAt(i), i);
			
			if(i- start +1 > maxLength) {
				maxLength = i-start+1;
				mzzx = start;
			}
		}
		
        String longestSubstring = str.substring(mzzx, mzzx + maxLength);
        
        System.out.println(" The Longest Values Present....... " + longestSubstring);
		 
	 }

	public static void main(String[] args) {

//		arrayRevisedproblems();
//		stringRevisedProblems() ;
//		bubleSortsAlithms() ;
//		SelSortAlithms();
//		primeNumberFunctions() ;
//		insertionsAlgorithsms() ;
		
		revisionProgramsForDSA obj = new revisionProgramsForDSA();
		obj.insertdata(71);
		obj.insertdata(72);
		obj.insertdata(73);
		obj.insertdata(74);
		obj.insertdata(75);
		
	//	obj.insertdataAtHead(70);
		
		obj.iterateThrougnArrayElements();
		
//		Scanner sc = new Scanner(System.in) ;
//		int [][] mat = new int[3][3] ;
//		
//		System.out.println(" ENter Values");
//		
//		System.out.println(" ");
//		
//		for(int i = 0 ; i<mat.length ; i++) {
//			
//			for(int j = 0 ; j<mat[i].length ; j++) {
//				mat[i][j] = sc.nextInt() ;
//			}
//			
//		}
//		
//        for(int i = 0 ; i<mat.length ; i++) {
//        	for(int j = 0 ; j<mat[i].length ; j++) {
//                System.out.print(mat[i][j] + " ");
//        	}
//            System.out.println(); 
//        }
		twoDimensionalArrayProblems() ;
		obj.treeInsert(7);
		spaceComplexityProblems();
		
	//	obj.display();
	}

}
