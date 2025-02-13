package com.Algorithms.Algoriths;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class collectionsInJava {
	
	static void listMethods() {
		
		List<String> userlist = new ArrayList<>();
		
		userlist.add("Praveen");
		userlist.add("Ksdusd");
		userlist.add("Kumar");
		userlist.add("lskdkds");
		
	//	userlist.remove(2);
		Iterator<String> jnjsd = userlist.iterator();
		while(jnjsd.hasNext()) {
			System.out.println(jnjsd.next());
		}

		System.out.println(userlist.toString());
		
		System.out.println(userlist.stream().sorted((s1,s2) -> s2.compareTo(s1)).toList());
		
				
		List<Integer> userNo = new LinkedList<>();
		
		userNo.add(43);
		userNo.add(21);
		userNo.add(134);
		userNo.add(null);
		userNo.add(9);
		
		List<Integer> sasa = userNo.stream().sorted(Comparator.nullsLast(Comparator.reverseOrder())).toList();
		
		System.out.println(userNo.stream().filter(op ->  op != null).
				sorted((s1,s2) -> s1-s2).toList());

		System.out.println(sasa);
		
		//int ,char double , float  == > Integer , Double , Character  , Float
		
	}
	
	static void mapMethods() {
		
		Map<String, Integer> utilMap = new HashMap<>(); // not maintained order
		
		Map<String, Integer> utilMaps = new LinkedHashMap<>(); // order maintained
		
		utilMaps.put("Praveen", 90);
		utilMaps.put("Kumar", 91);
		utilMaps.put("sdds", 92);

		System.out.println(utilMaps);
		int i = 0;
		for(int dsds : utilMaps.values()) {
			i++;
			System.out.println(dsds + i );
		}
		int j = 0;
		for(String ds : utilMaps.keySet()) {
			j++;
			System.out.println(ds + j);
			
		}
		
		for(Entry<String, Integer> entryset : utilMaps.entrySet()) {
			
			System.out.print(entryset.getKey() + "  " + entryset.getValue() + " " );
		}

	}

	public static void main(String[] args) {
		listMethods();
		mapMethods();
	}

}
