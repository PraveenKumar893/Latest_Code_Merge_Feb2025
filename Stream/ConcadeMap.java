package com.Algorithms.Stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcadeMap {

	public static void main(String[] args) {
		HashMap<String, Integer> subjectToStudentCountMap1 = new HashMap<>();
        
        subjectToStudentCountMap1.put("Maths", 45);
        subjectToStudentCountMap1.put("Physics", 57);
        subjectToStudentCountMap1.put("Chemistry", 52);
        subjectToStudentCountMap1.put("History", 41);
         
        //Map-2
         
        HashMap<String, Integer> subjectToStudentCountMap2 = new HashMap<>();
         
        subjectToStudentCountMap2.put("Economics", 49);
        subjectToStudentCountMap2.put("Maths", 42);
        subjectToStudentCountMap2.put("Biology", 41);
        subjectToStudentCountMap2.put("History", 55);
        
	Map<Object, Integer> sdds = Stream.of(subjectToStudentCountMap1, subjectToStudentCountMap2).flatMap(m -> m.entrySet().stream())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Integer::sum, HashMap::new));
		
	System.out.println(sdds);
		sdds  = Stream.concat(subjectToStudentCountMap1.entrySet().stream(), subjectToStudentCountMap2.entrySet().stream())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1 > v2 ? v1 : v2,
						HashMap::new));

		System.out.println(sdds);
		
		 List<Entry<String, Integer>> dsdsd = Stream.concat(subjectToStudentCountMap1.entrySet().stream(), subjectToStudentCountMap2.entrySet().stream())
		   .collect(Collectors.toMap(Map.Entry :: getKey,   Map.Entry :: getValue , Integer :: sum))
		    .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		     .skip(2)
		     .limit(2)
		  //    .limit((subjectToStudentCountMap2.size() + subjectToStudentCountMap1.size()))
		      .toList();
		      
		System.out.println(dsdsd);
	}

}
