package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors ;

import com.Algorithms.Stream.Employee;

class employees {
	
	 String name;
	 String department;
	 double salary ;
	
	public employees(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employees [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}	
	
}

public class intervieww {
	
	static void methodValidationss() {
		
		Map<String, Integer> frequencyMap = new HashMap<>();
		
		frequencyMap.put("String", 10) ;
		frequencyMap.put("sdk", 2) ;
		frequencyMap.put("Stsdsaring", 3) ;
		frequencyMap.put("Stcssg", 5) ;
		frequencyMap.put("Strinjdg", 7) ;
		frequencyMap.put("Stjjd", 90) ;
		
	Map<String, Integer> sdhsdh = frequencyMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		   .limit(2).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue));
	
		System.out.println(sdhsdh);		
		
		List<Integer> asakdlist = new ArrayList<>() ;
		asakdlist.add(893);
		asakdlist.add(989);
		asakdlist.add(83);
		asakdlist.add(193);
		asakdlist.add(8);
		
		System.out.println(asakdlist.stream().sorted(Comparator.reverseOrder()).toList()); 
		
		asakdlist.add(null);
		
		System.out.println(asakdlist.stream().sorted(Comparator.nullsLast(Comparator.reverseOrder())).toList()); 
		
		
	}

	public static void main(String[] args) {
		
		List<employees> employeelists = new  ArrayList<employees>();
		
		employeelists.add(new employees("Praveen", "IT", 120000));
		employeelists.add(new employees("kumar", "TECH", 10000));
		employeelists.add(new employees("sanjay", "SOFTWARE", 130000));
		employeelists.add(new employees("saran", "IT", 1000));
		employeelists.add(new employees("kumarfiel", "IT", 150000));
		employeelists.add(new employees("dshfsd", "IT", 1000));
		
		System.out.println(employeelists);
		
		Map<String, employees> dsfsd = employeelists.stream().collect(Collectors.groupingBy(employees :: getDepartment, 
				  Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(employees :: getSalary)), Optional :: get)
				  ));
		
		System.out.println(dsfsd);
		
		dsfsd.forEach((dep,emp) -> {
			System.out.println(emp.getName() + " " + emp.getSalary() + " " + emp.getDepartment());
		});
				  
		  String str = "Praveen Kumar";
		  
		  System.out.println(Arrays.stream(str.split(" ")).map(op -> new StringBuilder(op).reverse().toString()).toList());
		  
	String sdsd = Arrays.stream(str.split(" "))
			 .map(op -> {
				 return new StringBuilder(op).reverse();
			 }).collect(Collectors.joining(" ")) ;
	
	System.out.println(sdsd);
	methodValidationss();
		
//		Map<String, Object> sdsdasas = employeelists.stream().collect(Collectors.groupingBy(Employee :: getDepartment ,
//				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary)) , Optional :: get)));


	}

}
