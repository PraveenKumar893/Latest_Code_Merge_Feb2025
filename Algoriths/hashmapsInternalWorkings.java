package com.Algorithms.Algoriths;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class hashmapsInternalWorkings {
	
	static void hashMapfunctions() {
		
	Map<String, Integer> hashmaps = new LinkedHashMap<>();
		hashmaps.put("21", 21);
		hashmaps.put("22", 22);
		hashmaps.put("23", 23);
		hashmaps.put("24", 24);
		
		System.out.println(hashmaps);
		
		for(Entry<String, Integer> ey :  hashmaps.entrySet()) {
			
			System.out.println(ey.getKey() + " " + ey.getValue());
			hashmaps.put("25", 25);
		}
	}
	
	static void hashTableFunctions() {
		
		Map<String, Integer> hashTable = new Hashtable<>();
		hashTable.put("21", 21);
		hashTable.put("22", 22);
		hashTable.put("23", 23);
		hashTable.put("24", 24);
		
		System.out.println(hashTable);
		
		for(Entry<String, Integer> ey :  hashTable.entrySet()) {
			
			System.out.println(ey.getKey() + " " + ey.getValue());
			hashTable.put("30", 30);
		}
	}
	
	static void concurrentHashMap() {
		
		Map<String, Integer> concurrent = new ConcurrentHashMap<>();
		concurrent.put("21", 21);
		concurrent.put("22", 22);
		concurrent.put("23", 23);
		concurrent.put("24", 24);
		
		System.out.println(concurrent);
		
		for(Entry<String, Integer> ey :  concurrent.entrySet()) {
			
			System.out.println(ey.getKey() + " " + ey.getValue());
			concurrent.put("30", 30);
		}
	}
	
	
	public static void main(String[] args) {
		
		hashMapfunctions();
		hashTableFunctions();
		concurrentHashMap();
		
	}

}
