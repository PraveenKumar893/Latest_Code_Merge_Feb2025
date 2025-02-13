package com.DataStructuresAlgorithsms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

class Node {
	
	int data ;
	Node next;
	Node prev ;
	
	public Node(int data) {
		this.data = data;
	}
}

public class linkedListProplems {
	
	static Node head = null;

	static void reverseNodeInPairs() {
		
		int [] headss = {1,2,3,4,5}; // output 2,1,4,3
		
		for(int i = 0 ; i<headss.length-1; i+=2) {
			int temp = headss[i] ;
			headss[i] = headss[i+1] ;
			headss[i+1] = temp ;
		}
		
		System.out.println(Arrays.toString(headss));
		
		Node currents = head;
		Node dsa = head;
		
		  while(currents != null) {
			  System.out.println(currents.data);
			  currents = currents.next ;
		  }

		
	//	Node current = head ; // 1 2 3 4 2 1 4 3  75 76 77 78  76 75 78 77
//		Node dummy = new Node(0);
//		dummy.next = head;
//		Node prev = dummy;
// 		
//		while(head != null && head.next != null ) {
//			
//			Node first = head ;
//			Node second = head.next;
//			
//			prev.next = second;
//			first.next = second.next;
//			second.next = first ;
//			
//			prev = first;
//			head = head.next ;
//		}
//		
//		 Node current = dummy.next;
//		  while(current != null) {
//			  System.out.println(current.data + " ");
//			  current = current.next ;
//		  }
		
		System.out.println(" The Values gets the Result");
		
		Node dsd = new Node(0);
		dsd.next = head;
		Node pree = dsd ;
		
		int count  = 0;
		while(dsa != null) {
			count++;
			dsa = dsa.next ;
		}
		
		for(int i = 0 ; i<count-1; i+=2) {  // 77 76 78 75
			int asas = pree.next.data ;
			pree.next.data = pree.next.next.data ;
			pree.next.next.data = asas;
			
			pree = pree.next.next ;
		}
		
		Node asas = dsd.next ;
		
		while(asas != null) {
			System.out.print(asas.data + " ");
			asas = asas.next ;
		}
	}
	
	static void removeNthNode() {
		
		  int [] num =  {1,2,3,4,5} ;
		  int n = 2 ;
		  int min = num.length-n ;
		  
		int[] scsd = IntStream.range(0, num.length)
				.filter(op -> op != min).map(lk -> num[lk]).toArray() ;
				
		  System.out.println(Arrays.toString(scsd));
		  
		   // remove nth elemetn in list 
		  
		  Node dummy = new Node(0);
		  dummy.next = head;
		  Node first = dummy;
		  Node second = dummy;
		  
		  for(int i = 0 ; i<=n; i++) {
			  first = first.next;
		  }
		  while(first != null) {
			  first = first.next;
			  second = second.next;
		  }
		  
		  second.next = second.next.next;
		  
		 Node current = dummy.next;
		 
		 while(current != null) {
			 System.out.print(current.data + " ");
			 current = current.next;
		 } 

		 // Two pointer Approach
		  Node currents = head ;
		  int count = 0;
		  while(currents != null) {
			  count++;
			  currents = currents.next ;
		  }
		  int target = count - n;
		  Node dummys = new Node(0);
		  dummys.next = head;
		  currents = dummy;
		  
		  for(int i = 0 ;i<target; i++) {
			  currents = currents.next;
		  }
		  
		  currents.next = currents.next.next ;
		  
		  Node sd = dummys.next ;
		  
		  while(sd != null){
			  System.out.print(sd.data + " ");
			  sd = sd.next ;
		  }
		  
		}
	
	static void reverseLinkedListfromleftandright() {
		
		int [] arr = {1,2,3,4,5};
		int left = 2 ;
		int right = 4 ; // 2 + 4 = 6/2 = 3
		int mid = (left + right)/2 ;
		
		while(right > mid) {
			
			int temp = arr[left-1];
			arr[left-1] = arr[right-1] ;
			arr[right-1] = temp ;
			
			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int [] arr1 = {1,2,3,4,5};
		int  lefts = 2 ;
		 int rights = 4 ;
		 
	 List<Integer> fullalist = 	 IntStream.range(0, arr.length).map(po -> arr[po])
		   .filter(op -> op >= lefts && op<= rights)
		   .map(pi -> arr[pi-1]).boxed().sorted(Comparator.reverseOrder()).toList() ;
	 
	 System.out.println(fullalist);
		
	List<Integer> fieldsList = 	IntStream.range(0, arr.length)
			   .filter(op -> op >= lefts && op<= rights)
			  .map(pi -> arr1[pi-1]).boxed().sorted(Comparator.reverseOrder()).toList();
	
	System.out.println(fieldsList);
		
	//	Node current = head; // 1,2,3,4,5 1,4,3,2,5 2 4
		Node dummy = new Node(0);
		dummy.next = head;
		Node prev = dummy;  // 75 76 77 78 79
		
		left = 2;
		right = 4;
		
		for(int i = 1 ; i<left ; i++) {
			prev = prev.next;			
		}
		
		Node current = prev.next ;
		Node next ;
		
		for(int i = 0 ; i<right-left ; i++) {
			next = current.next;
			current.next = next.next;
			next.next = prev.next;
			prev.next = next;
		}
		
		Node sd = dummy.next;
		
		while(sd != null) {
			System.out.print(sd.data + " ");
			sd = sd.next ;
		}
		
	}
	
	static void inBuiltMethodsForLinkedList() {
		
		LinkedList<Integer> linkedss = new LinkedList<>() ;
		linkedss.add(89);
		linkedss.add(90);
		System.out.println(linkedss);
		linkedss.addFirst(818);
		System.out.println(linkedss);
		linkedss.addLast(91);
		System.out.println(linkedss);		
		
		System.out.println(linkedss.peek());
		System.out.println(linkedss.peekFirst());
		System.out.println(linkedss.peekLast());
		System.out.println(linkedss.poll());
		System.out.println(linkedss.pollFirst());
		System.out.println(linkedss.pollLast());
		
		
		linkedss.descendingIterator().forEachRemaining(op ->System.out.println(op));

		
	}
	

	void addmethos(int data) {
		 
		 Node node = new Node(data);
		 Node currentNode = head;
		 
		 if(head == null) {
			 head = node;
		 } else {
			 while(currentNode.next != null) {
				 currentNode = currentNode.next ;
			 }
				 currentNode.next = node;
		 }
		
	}
	
	void printValuess() {
		
		Node current = head ;
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next ;
		}
		
		System.out.println(" \n The list printed");
	}
	
	void addFirst(int data) {
		Node node =  new Node(data);
		node.next = head;
		head = node;
	}
	
	void deleteValues(int data) {
		
		Node current  = head ;
		
		while(current.next != null && current.next.data != data) {
			current = current.next ;
		}
		
		if(current.next != null) {
			current.next = current.next.next ;
		}
		
	}
	
	void addcentre(int data) {
		Node current = head;
		int count = 0;
		
		while(current !=  null) {
			count++;
			current = current.next;
		}
		
		int mid = count/2 ;
		current = head;
		
		for(int i = 0 ; i<mid-1; i++) {
	        current = current.next;			
		}
		
		Node newnodes = new Node(data);
		newnodes.next = current.next;
		current.next = newnodes ;
	}
	
	public static void main(String[] args) {
				
		linkedListProplems obj = new linkedListProplems();
		obj.addmethos(76);
		obj.addmethos(77);
		obj.addmethos(78);
		obj.addmethos(79);
		obj.addFirst(75);
		obj.addcentre(89);
	//	obj.deleteValues(78);
		obj.printValuess();
	//	reverseNodeInPairs();
	//	removeNthNode();
		reverseLinkedListfromleftandright();
	//	inBuiltMethodsForLinkedList() ;
	}

}
