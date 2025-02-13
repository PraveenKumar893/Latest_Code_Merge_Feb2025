package BinaryTree;

import java.util.Arrays;
import java.util.List;

public class interviewssshd {
	
	static void staicvoidsa() {
	
		String str = "Hello";
		String str1 = new String("Hello");
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		if(str == str2) {
			System.out.println("1" + true);
		}
		
		if(str1 == str3) {
			System.out.println(true);
		} else {
			System.out.println(str.hashCode() + " " + str2.hashCode());
		}
		
		if(str == str3) {
			System.out.println(true);
		}
			
		String str6 = "Praveen" ;
		
		str6 = str6.concat("Kumar") ;
		
		System.out.println(str6);
		
	}
	
	static void multiplyNumber() {
		
		int [] num = {1,2,3,4,5};
		
		List<Integer> numList = Arrays.stream(num).boxed().sorted((s1,s2) -> s2 -s1).toList() ;
		
		System.out.println(numList.get(0) + " " + numList.get(1));
		
		int nm = numList.get(0) * numList.get(1) ;
		
		System.out.println(nm);
		
	}
	public static void main(String[] args) {
		
		staicvoidsa();
		multiplyNumber();

	}

}
