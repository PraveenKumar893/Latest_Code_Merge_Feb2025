package com.Algorithms.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

class students {

	private int stdId;
	private String name;

	public students(int stdId, String name) {
		this.stdId = stdId;
		this.name = name;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "students [stdId=" + stdId + ", name=" + name + "]";
	}

}

public class comparatorNdComparable {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
	    list1.add(32);
	    list1.add(34);
	    list1.add(981);
	    list1.add(654);
	    
	    Set<Integer> sd = new TreeSet<>();
	    sd.add(2);
	    sd.add(124);
	    sd.add(981);
	    sd.add(654);
	    
	    Map<Integer, String> sorted = new HashMap<>();
	    sorted.put(3212, "Praveen");
	    sorted.put(32, "Kumar");
	    sorted.put(2121, "Maharaj");
	    sorted.put(98, "Fixxo");
	    
	  List<Entry<Integer, String>> ddsdaas = sorted.entrySet().stream().
			  sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
			   .collect(Collectors.toList());
	    
	    System.out.println(ddsdaas);


	    
	   // int n =234;
	   // System.out.println(n%10 + "  " + n/10);
	    
	    List<Integer> dsds =  list1.stream().sorted().toList();
	    
	    System.out.println(dsds);
	    
	    System.out.println(sd);
	    
	    List<students> stdList = new ArrayList<>();
	    stdList.add(new students(3212, "Praveen"));
	    stdList.add(new students(22, "Kumar"));
	    stdList.add(new students(75, "Maharaja"));
	    stdList.add(new students(124, "MPKM"));
	    
	  //  stdList.sort(Comparator.comparing(students::getStdId));
	    
	    stdList.stream().sorted((s1,s2) -> s2.getStdId() - s1.getStdId());
	    
	    System.out.println(stdList);
	}

}
