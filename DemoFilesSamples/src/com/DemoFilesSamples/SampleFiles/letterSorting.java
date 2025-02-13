package com.DemoFilesSamples.SampleFiles;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class letterSorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the valuesss");
		
	//	String str11 = sc.nextLine();
		
		checkLetters("PraveenePr");

	}

	private static void checkLetters(String str1) {
		
		Map<Character, Integer> dsad = new HashMap<>();
		int count = 0;
		
		for(int i=0;i<str1.length();i++) {
			
            if(dsad.containsKey(str1.charAt(i))) {
				dsad.put(str1.charAt(i), dsad.getOrDefault(str1.charAt(i), 0) + 1);
			} else {
				dsad.put(str1.charAt(i), 1);
			}
		}
		System.out.println(dsad);
		
        for (Entry<Character, Integer> entry : dsad.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

		
	}

}
