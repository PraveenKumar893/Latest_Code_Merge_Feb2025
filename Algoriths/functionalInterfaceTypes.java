package com.Algorithms.Algoriths;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class employee {
	
	private int empId;
	private String empname;
		public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public employee(int empId, String empname) {
		this.empId = empId;
		this.empname = empname;
	}
	
	public String toString() {
		return "employee [empId=" + empId + ", empname=" + empname + "]";
	}

	
}

public class functionalInterfaceTypes {
	
	static Predicate<Map<Integer,String>> testvalues = rt -> rt != null && !rt.isEmpty();
	static Function<Integer, String> funcresult = jk -> jk*10 + " " + " The Values has been Multiplied " ;
	
	 static void predicateMethods() {
		 
		 Map<Integer, String> predHash = new HashMap<>();
		 predHash.put(23, "Praveen");
		 System.out.println(testvalues.test(predHash));
		}
	 
	 static void functionFunctionalInterface() {
		 System.out.println(funcresult.apply(23));
		}


	public static void main(String[] args) {
		
		employee emp = new employee(36, "Prvaeen");
		Consumer<employee> empfnctionInterface = op -> op.setEmpname("Kumar");
		empfnctionInterface.accept(emp);
		System.out.println(emp.getEmpname());
		predicateMethods();
		functionFunctionalInterface();
	}
}
