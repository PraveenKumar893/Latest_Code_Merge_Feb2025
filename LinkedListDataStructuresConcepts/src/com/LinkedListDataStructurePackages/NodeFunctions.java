package com.LinkedListDataStructurePackages;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NodeFunctions {
	
	Node head;
	Node prev;
	int front;
	int rear;
	int size;
	int [] queue = new int[5];
	
	public void insert(int data) {
		Node sas = new Node();
		sas.data = data;
		sas.next = null;
		
		if(head == null) {
			head = sas;
		} else {
			Node n = head;
			while(n.next !=null) {
				n = n.next;
			}
			n.next = sas;
		}
		
	}
	
	public void show () {
		
		Node df = head;
		
		while(df.next != null) {
			System.out.println(df.data);
			df = df.next;
		}
		System.out.println(df.data);
	}
	
	public void reverse() {
		
	    Node current = head;
	    Stack<Integer> listStack = new Stack<>();
	    
	    while(current != null) {
	    	listStack.push(current.data);
	    	current = current.next;
	    }
	    
	    while(!listStack.isEmpty()) {
		    System.out.println(listStack.pop());
	    }
	}
	
	public void insertAt(int data) {
		Node sas = new Node();
		sas.data = data;
		sas.next = null;
		sas.next = head;
		head = sas;

	}
	
	public void insertAtBegaining(int index , int data) {
		Node sas = new Node();
		sas.data = data;
		sas.next = null;
		
		if(index == 0) {
			insertAt(data);
		} else {
			Node n = head;
			for(int i = 0; i<index-1;i++) {
				n = n.next;
			}
            sas.next = n.next;
            n.next = sas;
		}
	}
	
	public void delete(int index) {
		
		if(index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for(int i = 0; i<index-1;i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
		}
		
	}
	
	public void enque(int data) {
		// insert in queue
		
		queue[rear] = data;
		rear++;
		size++;
	}
	
	public void showQueue() {
		
		for(int i = 0 ; i<size; i++) {
			
			System.out.println(queue[i] + " " );
		}
	}
	
	public void dequeue() {
		
		int data = queue[front];
		front = front +1 ;
		size--;
		
		System.out.println(queue[front] + " " + data);
	}

}
