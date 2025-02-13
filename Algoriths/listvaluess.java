package com.Algorithms.Algoriths;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listvaluess {

	public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<>();
		number.add(1);
		number.add(2);
		number.add(3);
	//	number.add(14);
	// 	number.add(112);
		
		System.out.println(number.stream().sorted((s1,s2) -> s2-s1).skip(1).limit(1).toList());
		
		System.out.println(number.stream().sorted((n1,n2) -> n2.compareTo(n1)).toList());
		
	String sdsdaas = 	number.stream().sorted((m1,m2) -> m2%10 - m1%10)
		  .map(ui -> {
			  StringBuilder sds = new StringBuilder();
			  sds.append(ui);
			  return sds.toString();
		  }).collect(Collectors.joining());
	
	System.out.println(sdsdaas);

	}

}
