package com.DemoFilesSamples.SampleFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class checkifclasses {
	
	
	static int assasa(int[] as) {
		int res = 0;
		for(int i = 0 ; i<as.length;i++) {
			res = as[0];
			res = Math.max(res, as[i]);
		//	return res;
		}
		return res;
	}

	public static void main(String[] args) {
		
		List<String> sdd = new ArrayList<>();
		
		sdd.add("Praveen");
		sdd.add("Poobalan");
		
		System.out.println(sdd);
		
		List<List<String>> sdda  =  new ArrayList<>();
		
		sdda.add(sdd);
		
		System.out.println(sdda);
		
		String dsssaa = " SELECT NAME FROM dynamic4_table4_function WHERE scenario_column like '%##first_name##%' AND '##NAME##'  " ;
				 
		 List<String> aas = Arrays.asList(dsssaa);
		 
		 System.out.println(aas);
		
		 System.out.println(aas.stream().collect(Collectors.joining()));
		 
		 Map<String, String> dss = new HashMap<>();
		 
		 dss.put("sdsd", "dsdsa");
		 dss.put("sdsdsdd", "dsdasasa");
		 
		 StringBuilder op = new StringBuilder() ;
		
		  List<String> sds = new ArrayList<>() ;
		  
		  sds.add("MATCHINGPERCENTAGE");
		  sds.add("REVIEWSTATUS");
		  
		  String sa = "review_status";
		  
		  boolean jdsjds = sds.stream().anyMatch(sal -> sal.equalsIgnoreCase(sa));
		  
		 System.out.println(jdsjds);
		  System.out.println(sds.stream().filter(pi -> pi.equalsIgnoreCase(sa)).collect(Collectors.toList()).size()) ;
		
		 int[] as = {4,11,22,44,212} ;
			int cs = assasa(as);
			
			System.out.println(cs);
			
		     System.out.println(Arrays.stream(as).min().getAsInt());
		     
		     Map<String,String> lkd = new HashMap<>();
		     lkd.put("dds", "dsds");
		     StringBuilder lk = new StringBuilder();
		      lk.append(lkd.get("nbm"));
		      String hhjh = "";
		      
		      if(lkd.get("dhfj").equalsIgnoreCase(null)) {
		    	  System.out.println("boolean");
		      }

		      if(lk.toString().isEmpty()) {
		    	  System.out.println("true checked");
		    	  System.out.println(lk);
		      } else if(lk.toString().equalsIgnoreCase("null") ) {
		    	  System.out.println(lk.append(" "));
		    	  System.out.println(lk);
		      }
		    
	}

}
