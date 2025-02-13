	package com.Algorithms.Algoriths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streamUsingPojo {
	

	static void comparatorMethods(List<sStudentsVo> studentsList) {
		
		List<Integer> sasad = studentsList.stream().sorted((s1,s2) -> s2.getStdId() - s1.getStdId())
				.map(pi -> pi.getStdId()).toList();
		
		System.out.println(" Rank Wise Desceding Order in Fields  " + sasad);
		
		List<String> sassad = studentsList.stream().sorted((s1,s2) -> s2.getStdId() - s1.getStdId())
				.map(pi -> pi.getStdId() + " - " + pi.getName() + " - " + pi.getDepartment()).toList();
		
		System.out.println(" Rank Wise Desceding Order in NameFields  " + sassad);

		
		studentsList.sort(Comparator.comparing(sStudentsVo :: getRank)
				  .thenComparing(Comparator.comparing(sStudentsVo :: getGrade)).reversed()) ;
		
		System.out.println(studentsList);
		
		    studentsList.sort(Comparator.comparing(sStudentsVo :: getStdId)
				 .thenComparing(Comparator.comparing(sStudentsVo :: getName))
				);
		
			System.out.println( " sjdghsdhgdshdsghdghs " + "\n"  + studentsList);
			
			Map<Object, List<sStudentsVo>> employeeMap = new HashMap<>();
			
			employeeMap = studentsList.stream().collect(Collectors.groupingBy(
					hjkl -> hjkl.getDepartment() == null ?  "UndefinedValues" : hjkl.getDepartment().toString()));			
		
			System.out.println(employeeMap);
			
			Optional<sStudentsVo> sddsz = studentsList.stream().
					filter(op -> op.getName().equalsIgnoreCase("Praveen"))
					.findFirst() ;
			
			
			studentsList.stream().sorted((s1,s2) -> s1.getName().compareTo(s2.getName()))
			  .toList();
			
			
	}

	public static void main(String[] args) {
		
		List<sStudentsVo> studentsList = new ArrayList<>();
		
		studentsList.add(new sStudentsVo(213, "Praveen", "Mech", "G", 7));
		studentsList.addAll(Arrays.asList(new sStudentsVo(342, "Kumar", "Mech", "D", 10),
				       new sStudentsVo(893, "Dhana", "Information", "H", 12),
				       new sStudentsVo(431, "Abisheik", "Mech", "M", 32),
				       new sStudentsVo(12, "vibin", "Information", "X",143),
				       new sStudentsVo(12, "njdjsnd", null, "X",143),
				       new sStudentsVo(12, "nsjdnsa", null, "X",143)
				 ));
		System.out.println(studentsList);
		System.out.println(studentsList.size());
		comparatorMethods(studentsList);

	}

}
