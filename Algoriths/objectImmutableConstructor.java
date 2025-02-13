package com.Algorithms.Algoriths;

public final class objectImmutableConstructor {
	
	private final String name;
	private final int empId;
	
	public String getName() {
		return name;
	}
	public int getEmpId() {
		return empId;
	}
	public objectImmutableConstructor(String name, int empId) {
		this.name = name;
		this.empId = empId;
		
		System.out.println(" dssddsddsdsdsds  " + name + " dsdsdsdsdsds " + empId);
	}
	
	
	

}
