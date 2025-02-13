package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class listValuesfns {
	
	static void listValuesFields() {
		
		List<Integer> valueList = new ArrayList<>() ;
		valueList.add(1);
		valueList.add(4);
		valueList.add(5);
		valueList.add(6);
		
		System.out.println(valueList);
		
	 int[] vdsl = valueList.stream().mapToInt(Integer :: intValue).toArray() ;
	 
	 System.out.println(Arrays.toString(vdsl));
	 
	Optional<Integer> jkl =  Arrays.stream(vdsl).boxed().filter(op -> op%2 == 0).reduce(Integer :: sum) ;
	
	  if(jkl.isPresent()) {
		  System.out.println(jkl.get());
	  }		
	  
	  int sdds = Arrays.stream(vdsl).boxed().mapToInt(lk -> lk%2 == 0 ? lk*5 : 0).sum() ;
	  
	  System.out.println(sdds);
	  
	  int [] arr  = {1,2,3,4,5,6};
	  
	 List<int[]> hjsd = IntStream.range(0,arr.length-2)
	    .mapToObj(op -> Arrays.copyOfRange(arr, op, op+3)).toList() ;
	 
	 hjsd.stream().forEach(op -> System.out.println(Arrays.toString(op)));
	 
	 List<int[]> bnm = IntStream.range(0,arr.length/3)
	    .mapToObj(lk -> Arrays.copyOfRange(arr, lk*3, Math.min((lk+1)*3,arr.length))).toList() ;
	 
	 bnm.stream().forEach(lm -> System.out.println(Arrays.toString(lm))) ;
	  
	}
	
	public static void main(String[] args) {
		
		listValuesFields();
	}
}
