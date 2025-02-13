package com.DemoFilesSamples.SampleFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TechnicalSort {

	public static void main(String[] args) {
		
		String sd = "RACE CAR" ;
		
        int kl = 98932 ;
        
        String kjk = String.valueOf(kl);

		
		System.out.println(sd.replaceAll(" ", ""));
		
		StringBuffer s = new StringBuffer(sd.replaceAll(" ", "")) ;
		
          System.out.println(s.reverse());
          
          
          StringBuffer sjk = new StringBuffer(kjk);
          
         System.out.println(sjk.reverse());
         
         Map<String,String> dds  = new HashMap<>();
         
         dds.put("sds", "klk");
         dds.put("pravee", "nebdbd");
         
         
     String ddsd =     dds.entrySet().stream().filter(l -> l.getKey().toString().equalsIgnoreCase("pravee"))
           .map(k -> k.getValue()).collect(Collectors.joining());
     
     List<String> klk = new ArrayList<>();
     
     klk.add("NAME");
     klk.add("ALTERNATENAME");
     
         
         System.out.println(klk.toString());
         
         String query  =  "Select * from TESTING_TABLE_FUNCTION_5(##NAME##)" ;
         
        
       // String [] dss =  query.split("\\(")[1].split("[),]") ;
         
         String [] dss = query.split("[(=]")[1].split("[),]");
         
         System.out.println("sdsddssddsvcdacdadd   " +dss[0]);
        

        String  saas = "##NAME##";
        System.out.println("sddsdsdsds" + dss[0]);
    //    System.out.println(Arrays.asList(araydsh));
        

        
           List<String> jhg = Arrays.asList(dss);
           
           System.out.println(jhg);
           
           for (String  jkl : jhg) {
        	   
        	   System.out.println(jkl);
           }
           
       List<String> sdsd =     jhg.stream().map(lo ->  klk.stream().map(op -> {
        	   StringBuffer asa = new StringBuffer();
        	   if(lo.replace("##", "").equalsIgnoreCase(op)) {
        		   asa.append(op.replace(op, ""));
        	   }
        	   return asa.toString();
           })).flatMap(Stream -> Stream).collect(Collectors.toList());
       
          sdsd.removeIf(o -> o.equals(",") || o.isEmpty());
       
       System.out.println(sdsd); // >= <= 
       
       String lkl = "SELECT USER_NAME,USER_TYPE FROM SCENARIO_COLUMN >= ##AlternateName##" ;
     //  System.out.println(lkl.replace(">=", ">"));
      String[] sa = lkl.split("[=><(]")[1].split("[),]");
      System.out.println(sa.length + "  " );
       for(int i = 0 ; i<sa.length;i++) {
    	   System.out.println("dssdds  " + sa[i].replace("##", ""));
       }
              
	}

}
