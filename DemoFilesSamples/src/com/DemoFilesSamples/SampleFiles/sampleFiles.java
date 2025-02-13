package com.DemoFilesSamples.SampleFiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class sampleFiles {

	
	public static void main(String[] args) {
		
		String  ssa = "";
		
		if(!ssa.isEmpty()) {
			System.out.println("22");
		} 
		if(ssa!= null) {
			System.out.println("88");
		} 
		if(ssa.length() > 0){
			System.out.println("99");
		}
		
		String dds = "REL_EXECUTION_GROUP";
		
		if(!dds.equalsIgnoreCase("REL_EXECUTION_GROUP")) {
			System.out.println("True");
		} else {
			System.out.println("Fasle");
		}
		
		List<String> hj = new ArrayList<>();
		hj.add("Praveen");
		hj.add("Kumar");
		hj.add("gow");
				
Collections.sort(hj);


Map<String, String> dsd = new LinkedHashMap<>();
dsd.put("jk", "Praveen");
dsd.put("kl", "Sam");


for(String gh : dsd.keySet()) {
	
	System.out.println(gh);
}
	}
	

}
