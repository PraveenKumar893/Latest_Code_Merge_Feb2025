package com.LinkedListDataStructurePackages;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LinkedListMain {

	public static void main(String[] args) {
		
		NodeFunctions fun = new NodeFunctions();
		fun.insert(23);
		fun.insert(43);
		fun.insert(31);
		fun.insert(29);
		
		fun.show();
		fun.reverse();
		
		fun.insertAt(89);
		fun.insertAtBegaining(2,657);
		fun.delete(4);
		fun.show();
		
		
		System.out.println(" In Function LinkedList ");
		
		LinkedList<Integer> hjk = new LinkedList<>();
		hjk.add(23);
		hjk.add(3);
		hjk.add(1, 45);
		hjk.addLast(46);
		
		hjk.push(456);
		hjk.peek();
		
		hjk.forEach(jk -> System.out.println(jk));

		System.out.println("sdddssd " + hjk.peek());
		
		Stack<Integer> asa = new Stack<>();
		asa.push(12);
		asa.push(12);
		asa.push(123);
		asa.push(112);
		asa.push(124);
		
		System.out.println(" Que structuree " + " " );
		
		fun.enque(9);
		fun.enque(91);
		fun.enque(29);
		
		fun.showQueue();
		fun.dequeue();
		fun.showQueue();


		

	}

}
