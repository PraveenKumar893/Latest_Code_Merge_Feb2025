package com.Algorithms.Algoriths;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class studentsVo {

	private String name;
	private int stdId;
	private String department;

	public studentsVo(String name, int stdId, String department) {
		super();
		this.name = name;
		this.stdId = stdId;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String toString() {
		return "studentsVo [name=" + name + ", stdId=" + stdId + ", department=" + department + "]";
	}

}

 class collectionsvalues implements Comparator<studentsVo> , Comparable<studentsVo> {

	@Override
	public int compareTo(studentsVo pol) {
		return pol.getStdId() - pol.getStdId();
	}

	@Override
	public int compare(studentsVo o1, studentsVo o2) {
		return o1.getStdId() - o2.getStdId();
	}

	
}

public class collectionsConcepts {

	public static void main(String[] args) {
		
		List<studentsVo> studentList = new ArrayList<>() ;
		studentList.add(new studentsVo("Praveen", 22, "Mech"));
		studentList.add(new studentsVo("gsdghd", 1221, "ash"));
		studentList.add(new studentsVo("jhsddshs", 222, "chs"));
		
		Collections.sort(studentList, new collectionsvalues() );
		
		System.out.println(" List Valuess  \n" + studentList);
		
		

	}

}
