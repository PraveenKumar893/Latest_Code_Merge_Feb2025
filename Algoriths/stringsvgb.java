package com.Algorithms.Algoriths;

public class stringsvgb {
	
	static void StringHashCode() {
		
		String str1 = "klo";
		String str2 = "jkl";
		String str3 = "klo";
		
		System.out.println(str1 + " : " + str1.hashCode());
		System.out.println(str2 + " : " + str2.hashCode());
		System.out.println(str3 + " : " + str3.hashCode());
		
		if(str1 == str2) {
			System.out.println(true);
		} else if(str1 == str3 && str1.equals(str3)) {
			System.out.println(" Strsdsdsd " + true);
		}

		
	}

	public static void main(String[] args) {
		StringHashCode();
	}

}
