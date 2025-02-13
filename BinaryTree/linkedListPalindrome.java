package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

class Nodelists {
	
	int data;
	Nodelists next ;
	
	public Nodelists(int data) {
		super();
		this.data = data;
	}
}

public class linkedListPalindrome {
	
	Nodelists head ;
	
	public void InsertData(int data) {
		
		Nodelists sa = new Nodelists(data);
		
		if(head == null) {
			head = sa;
		} else {
			Nodelists current = head;
			while(current.next != null) {
				current = current.next ;
			}
			current.next = sa ;
		}		
	}
	
	public void insertAtStart(int data) {
		
		Nodelists nmsa = new Nodelists(data);
		nmsa.next = head;
		head = nmsa;
	}

	public void displaylists() {
		
		Nodelists current = head;
		
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	void linkedlistPalindrome() {
		
		Nodelists current = head;
		Stack<Integer> saas = new Stack<>();
		
		while(current != null) {
			saas.push(current.data);
			current = current.next;
		}
		
		Nodelists sda = head;
		
		while(sda !=null) {
			if(sda.data != saas.pop()) {
				break;
			}
			sda = sda.next ;
		}
		System.out.println(" Is palindrome");
	}
	
	static void palindromefuncss() {
		
		int num1 = 1221;
		int num = num1; int reversed = 0 ;
		
	//	String assa = new StringBuilder(String.valueOf(num)).reverse().toString() ;
		
	//	System.out.println(Integer.parseInt(assa));
		
		while(num > 0) {
			int sd = num%10;
            reversed = reversed * 10 + sd;
            num /= 10;
		}
		
		System.out.println(" Original Valuess " + num1 + " Reversed.... " + reversed);
		
		int [] arr = {1,2,4,5,6};
		int n = arr.length ;
		
		int val = (n*(n+1))/2 ;
		
		int aas = Arrays.stream(arr).reduce(Integer :: sum).getAsInt() ;
				
		System.out.println(aas - val);
		
		int [] arr1 = {1,2,3,4,5,6};
		
		System.out.println(Arrays.stream(arr1).filter(op -> op%2 == 0).sum());
		
	}
	
	void insertvaluesincentre(int data) {
		
		Nodelists current = head;
		int count = 0 ;
		while(current != null) {
			count++;
			current = current.next;
		}
		int mid = count/2;
		current = head;
		
		for(int i =0 ; i<mid ; i++) {
			current = current.next ;
		}
		 
		Nodelists asa = new Nodelists(data);
		 asa.next = current.next;
		 current.next = asa;
		
	}
	
	static void mergeIntervals() {
		
		int[][] sadas = { {1,3}, {2,6}, {8,10}, {15,18}};
		
		Arrays.sort(sadas, (a,b) -> a[0] - b[0]);
		
		Stack<int[]> ssa = new Stack<>();
		
		for(int[] zx : sadas) {
			
			if(!ssa.isEmpty() && ssa.peek()[1] >= zx[0]) {
                ssa.peek()[1] = Math.max(ssa.peek()[1], zx[1]);
			} else {
				ssa.push(zx);
			}
		}
		
	 int[][] ssas = ssa.toArray(new int[ssa.size()][]);
	 
     for (int[] interval : ssas) {
         System.out.println(Arrays.toString(interval));
     }
     Collections.reverse(ssa);
     while(!ssa.isEmpty()) {
    	 System.out.println(Arrays.toString(ssa.pop()));
     }
	}
	
	public void deleteValues(int data) {
		
		Nodelists current = head;
		
		while(current != null && current.next.data != data) {
			current = current.next ;
		}
		
		if(current.next != null) {
			current.next = current.next.next ;
		}
	}
	
	static void twopointerfunctions() {
		
		int [] arr = {2,7,8,3};
		int target = 10;
		Set<Integer> duplias = new HashSet<>() ;
		
		for(int i = 0 ; i<arr.length ; i++) {
			for(int j = i+1 ; j<arr.length ; j++) {
				if((arr[i]+arr[j]) == target) {
					System.out.println(" The Values found... " + arr[i] + " " + arr[j]);
					break;
				}
			}
		}
		
		for(int sa : arr) {		
			int cassa = target - sa ;
			if(!duplias.contains(sa)) {
				System.out.println(" The indexes found.... " + sa + " " +  cassa);
				break;
			}			
			duplias.add(sa);		
		}			
	}
	
	static void listConsidernullValues() {
		
		List<Integer> intlist = new ArrayList<>() ;
		intlist.add(2);
		intlist.add(3);
		intlist.add(56);
		intlist.add(67);
		intlist.add(45);
		intlist.add(89);
		intlist.add(67);
		intlist.add(null);
		
		ListIterator<Integer> sdds = intlist.listIterator() ;
		
	//	int[] asas = intlist.stream().mapToInt(Integer :: intValue).toArray() ;
		
	//s	System.out.println(Arrays.toString(asas));
		
		int[] dsds = intlist.stream().mapToInt(op -> op == null ?0:op.intValue()).toArray() ;		
		System.out.println(Arrays.toString(dsds));
		
		// find  second largest numbers  
		int firsmax = 0 ; int semax = 0;
		while(sdds.hasNext()) {
			
			Integer current = sdds.next();
			
			if(current == null) continue;
			
			if(current > firsmax) {
				semax = firsmax;
				firsmax = current;
			} else if(current > semax && current != firsmax) {
			   semax = current ;
			}
		}
		
		System.out.println(" The Second largest Number.... "+ firsmax + " " + semax);
		
		//  Arrays values
		
		int fimax = 0 ; int secmax = 0; int thirdmax = 0;
		
		for(int hj : dsds) {
			
		    if(hj == 0 ) continue ; 
			
			if(hj > fimax) {
				thirdmax = secmax;
				secmax = fimax ;
				fimax = hj;
			} else if(hj > secmax && hj != fimax) {
				thirdmax = secmax;
				secmax = hj;
			} else if(hj > thirdmax && hj != secmax) {
				thirdmax = hj;
			}
		
 	}
		
		System.out.println(" The Second Largest Number.... " + fimax + " " + secmax + " " + thirdmax);
		
	}
	
	static void twoDimensionalArrayProblems() {
		
		int [][] matrix = {{1,3,0} , {56,80,8} , {34,5,44}};
		
		List<Integer> sdsd = Arrays.stream(matrix).flatMapToInt(Arrays :: stream).boxed()
		  .sorted(Comparator.reverseOrder()).toList() ;
		
		System.out.println(sdsd);
		
		Set<Integer> rowSet = new HashSet<>();
		Set<Integer> colset = new HashSet<>() ;
		
		for(int i = 0 ; i<matrix.length ; i++) {
			for(int j = 0 ; j<matrix[i].length ; j++) {
				if(matrix[i][j] == 0) {
					rowSet.add(i);
					colset.add(j);
				}
			}
		}
		
		for(int row : rowSet) {
			Arrays.fill(matrix[row], 0);
//			for(int i = 0 ; i<matrix[row].length ; i++) {
//				matrix[row][i] = 0;
//			}
		}
		
		for(int col : colset) {
			for(int i = 0 ; i<matrix.length ; i++) {
				matrix[i][col] = 0;
			}
		}
		
		for(int [] sa : matrix) {
			System.out.println(Arrays.toString(sa));
		}
	}
	
	static void algorithsmsUsingList() {
		List<Integer> sortList = new ArrayList<>() ;
		sortList.add(1);
		sortList.add(2);
		sortList.add(33);
		sortList.add(45);
		sortList.add(0);
		sortList.add(45);

		
		int n = sortList.size()-1 ;
				
	//	sortList.sort(Comparator.comparingInt(Integer::intValue));
		
		System.out.println(sortList);
		
		System.out.println(sortList.stream().sorted().toList()) ;
		
		for(int i = 0 ; i<n ; i++) {
			for(int j = 0 ; j<n-i-1; j++) {
				Integer sas = sortList.get(j);
				Integer asas = sortList.get(j+1) ;
			//	if(sas == null || asas == null ) continue ;
				  if(sas >= asas) {
					  sortList.set(j, asas);
					  sortList.set(j+1, sas);
				  }
			}
		}
		
		System.out.println(" Bubble Sort...... " + sortList);
	}
	
	static void nullIterationsListValues() {
		
		List<Integer> sortyff = new ArrayList<>() ;
		
		sortyff.add(90);
		sortyff.add(90);
		sortyff.add(89);
		sortyff.add(102);
		
	List<Integer> sdsd = sortyff.stream().collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()))
		.entrySet().stream().filter(op -> op.getValue() > 1)
		.map(Map.Entry :: getKey).toList() ;
	//	.map(pi -> pi.getKey()).toList() ;
	
	System.out.println(sdsd);
	
		Collections.sort(sortyff , Comparator.nullsLast(Comparator.naturalOrder()));
		
	//	List<Integer> sds = sortyff.stream().sorted(Comparator.nullsLast(Comparator.naturalOrder())).toList()  ;
		
	//	System.out.println(sds);
		
		System.out.println(sortyff);
		
		int [] assa = {1,23,4,56,0};
		
		
		List<Integer> dsgshd = Arrays.stream(assa).boxed().sorted(Comparator.reverseOrder()).toList();
		
		
		System.out.println(dsgshd);
	}
	
	public static void main(String[] args) {
		
		linkedListPalindrome obj = new linkedListPalindrome() ;
		obj.InsertData(2);
		obj.InsertData(2);
		obj.InsertData(1);
		obj.insertAtStart(1);
		obj.displaylists();
		obj.linkedlistPalindrome();
		palindromefuncss();
		obj.insertvaluesincentre(3);
		obj.displaylists();
		obj.deleteValues(3);
		System.out.println("  dk");
		obj.displaylists();
		mergeIntervals();
		twopointerfunctions();
		listConsidernullValues() ;
		twoDimensionalArrayProblems();
		algorithsmsUsingList() ;
		nullIterationsListValues() ;

	}

}
