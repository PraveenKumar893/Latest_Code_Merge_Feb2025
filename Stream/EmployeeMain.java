package com.Algorithms.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		java8(employeeList);
	}
	
	public static void java8(List<Employee> employeeList) {
		//How many male and female employees are there in the organization?
	   employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));		
		//Print the name of all departments in the organization?
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		//What is the average age of male and female employees?
		 employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));		
		// Get the details of highest paid employee in the organization?
	   employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().get();
		
	  Employee dssd = employeeList.stream().sorted(Comparator.comparingDouble(Employee :: getSalary).reversed())
	      .skip(1).findFirst().get() ;
	   
		employeeList.stream().sorted((s1,s2) -> Double.compare(s2.getSalary(), s1.getSalary()))
		   .findFirst().get();

		
		//Get the names of all employees who have joined after 2015?
		employeeList.stream().filter(n->n.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);
		//Count the number of employees in each department?
	 employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		// What is the average salary of each department?
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		
		// get maximum salary in each department 
		Map<String, Object> sdsdasas = employeeList.stream().collect(Collectors.groupingBy(Employee :: getDepartment ,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary)) , Optional :: get)));
		
		System.out.println(" djhsdjsdjbsd  " + sdsdasas);
				
		//Get the details of youngest male employee in the product development department?
		employeeList.stream().filter(n->n.getDepartment().equalsIgnoreCase("Product Development")).min(Comparator.comparingInt(Employee::getAge)).get();
		
		 employeeList.stream().filter(io -> io.getDepartment().equalsIgnoreCase("Product Development"))
		  .min((s1,s2) -> s2.getAge() - s1.getAge()).get();
		
		//Who has the most working experience in the organization?
		employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get();
		
		double dasdsd = employeeList.stream().sorted((s1,s2) -> Double.compare(s2.getSalary(), s1.getSalary()) )
				.skip(1).findFirst().get().getSalary() ;
		System.out.println(dasdsd);
			
		 employeeList.stream().sorted(Comparator.comparingDouble(Employee :: getSalary).reversed());
		 
		Map<String, Object> sdsdd = employeeList.stream().collect(Collectors.groupingBy(Employee :: getDepartment,
				   Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary)), Optional ::get)
				 ));
		
		Map<String, Object> vncmcm = employeeList.stream().collect(Collectors.groupingBy( Employee :: getDepartment , 
				 Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingDouble(Employee :: getSalary)), 
					optional -> optional.orElse(null))));
		
		System.out.println(" The fieldsss....");
		vncmcm.entrySet().stream().forEachOrdered(op -> System.out.println(op.getKey() + " " + op.getValue()));
	}

}
