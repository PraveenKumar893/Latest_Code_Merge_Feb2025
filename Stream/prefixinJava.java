package com.Algorithms.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

abstract class mailed{

//	abstract void bullet();
	void sound() {
		System.out.println(" Sound is happening  ");
	}
}

class hjhsd extends mailed {

	
}

public class prefixinJava {
	
	static  String prefixatarray() {
		
		String [] str = {"flower" , "flow" , "flowss" , "floit"};  //{"dog","racecar","car"}; // {"flower" , "flow" , "flight"};
		
		String prefix = str[0];
		
		for(int i =0 ;i<str.length-1;i++) {
			while(str[i+1].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1);
				
                if (prefix.isEmpty()) {
                    return ""; // No common prefix
                }
			}
		}
		return prefix;
		
	}
	
	static void repeatStringValues () {
		
				String str1 = "hello";
				
				
				Set<Character> dsds = new LinkedHashSet<>();
				
				for(Character ch : str1.toCharArray()) {
					dsds.add(ch); 
				}

			String str2 = 	str1.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(LinkedHashSet::new))
				 .stream()
				 .map(String :: valueOf).collect(Collectors.joining());
			
			System.out.println(str2);
	}
	
	static void putallZerosInlast() {
		
		int [] arr = {3,2,0,0,4,0,6};
		int j = 0;
		
		for(int i = 0 ;i<arr.length;i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]  = temp;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
				
	}

	public static void main(String[] args) {
		
		String prefix = prefixatarray();
		
		System.out.println(" prefix  " + prefix);
		
		repeatStringValues();
		
		putallZerosInlast();
	}

}
