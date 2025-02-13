package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class studentVo {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public studentVo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "studentVo [name=" + name + ", age=" + age + "]";
	}
	
}

public class listchecks {
	
	static void removeduplicateValues(List<studentVo> studentList) {
		
		Set<studentVo> stringValues = new HashSet<>();
		
		for( studentVo saas : studentList) {
			System.out.println(saas.getName() + "  " + saas.getAge());
		}
		
		System.out.println(stringValues);
		
		List<String> asas = studentList.stream().map(op -> op.getName()).distinct().toList() ;
		
		System.out.println(asas);
		
		Map<String, Long> sds = studentList.stream().map(op -> op.getName()).
				collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) ;
		
		System.out.println(sds);
		
	 List<String> valuess =	 studentList.stream().map(op -> op.getName() + "-" +  op.getAge())
		  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 .entrySet().stream().filter(pl -> pl.getValue() > 1)
		  .map(Map.Entry :: getKey).toList() ;
	 
	    System.out.println(valuess);
	}
	
	static void rotateanList() {
		
		List<Integer> rotate = new ArrayList<>();
		rotate.add(32);
		rotate.add(23);
		rotate.add(31);
		rotate.add(321);
		
		System.out.println(rotate);
		
	//	Collections.reverse(rotate);
		
	//	System.out.println(rotate);
		
	List<Integer> sddsas = IntStream.range(0, rotate.size())
		  .mapToObj(op -> rotate.get(rotate.size()-1-op)).toList() ;
		
	   System.out.println(sddsas);
	   
	   String str = null;
	   // str = "%Praveen,%,PraveenKuamr" ;
	   str = "Praveen,Kumar";
	   
	   str.split("\\$$,");
	}
	
	static void findArrayMaxmimumNumbers() {
		
		int []  arr = {1,2,3,4,5,6};
		
	List<int[]> subStringList = IntStream.range(0,arr.length-2)
		    .mapToObj(op -> Arrays.copyOfRange(arr, op, op+3)).toList() ;
	
	subStringList.stream().forEach(lk -> System.out.println(Arrays.toString(lk)));
	
  List<Integer> resultList = subStringList.stream().map(op -> Arrays.stream(op).boxed().sorted(Comparator.reverseOrder())
			 .findFirst().get()
			).toList() ;
		
       System.out.println(" ResultListss " + resultList);
	}

	public static void main(String[] args) {
		
		findArrayMaxmimumNumbers();
		
		List<studentVo> studentList = new ArrayList<>();
		studentList.add(new studentVo("Praveen", 21));
		studentList.addAll(List.of(new studentVo("Kumar", 27),
				new studentVo("Dhana", 47) , new studentVo("Praveen", 27)
				));
		
		System.out.println(studentList);
		
		removeduplicateValues(studentList);
		
		rotateanList();
		
		findsliststoMap(studentList);
	}

	 static void findsliststoMap(List<studentVo> studentList) {
		 
		 System.out.println("List finisher");
		 
	  Map<String, Object> jdkl = studentList.stream()
		  .collect(Collectors.toMap(studentVo :: getName, stud -> stud , (e1,e2) -> e1)) ;
		 
	    System.out.println(jdkl);
	    
	    int [] arr = {1,2,34,5,1,2,34,5,6,6,1};
	    
	    System.out.println(Arrays.stream(arr).boxed().distinct().toList()) ;
	    
		String nmkl = "%Hello,%,World,Praveen";

		String[] parts = nmkl.split(",");

		String regexSymbols = "[.*+%?^=!:${}()|[\\\\]\\\\]";
		StringBuilder build = new StringBuilder();
		int i = 0;
		for (String par : parts) {
			if(i >0 && par.matches(".*[a-zA-Z]+.*") && par.matches(".*[^a-zA-Z0-9]+.*")) {
				break;
			}
			if (build.length() > 0 && par.matches(".*[" + regexSymbols + "].*")) {
				build.append(",");
			}
			build.append(par);
		}

     Arrays.stream(parts).filter(op -> op.matches(".*[" + regexSymbols + "].*"))
          .forEach(kl -> {
        	  if(build.length() > 0 ) {
        		  build.append(",") ;
        	  }
             build.append(kl); 
          }) ;
        
        System.out.println(build.toString());

	}

}
