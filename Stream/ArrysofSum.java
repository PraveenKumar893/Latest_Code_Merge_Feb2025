package com.Algorithms.Stream;

import java.util.Arrays;

import com.Algorithms.Algoriths.complexArrayProblemUsingStringInteger;

public class ArrysofSum {
	
	 static void sumofArrays() {
		 
		 int [] num = {1,2,3,4} ; // 1,3,6,10
		 int total = 0;
		 for(int i = 0; i<num.length;i++) {
			 total = total + num[i];
			 num[i] = total;
		 }
		 System.out.println(Arrays.toString(num));
	}
	public static void main(String[] args) {
		sumofArrays();
		new complexArrayProblemUsingStringInteger().displayfields();
	}

}
