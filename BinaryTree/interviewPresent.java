package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;


class changeinKey {
	int keyID;

	public changeinKey(int keyID) {
		super();
		this.keyID = keyID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(keyID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		changeinKey other = (changeinKey) obj;
		return keyID == other.keyID;
	}
	
	
}

public class interviewPresent {
	
	static void primeNumbersfunctions() {
		
		int num = 20; // Calculate prime Numbers
		
		List<Integer> resultList = new ArrayList<>() ;
		
		for(int i = 2 ; i<=num ; i++) {
			boolean isPrime = primeNumberfncs(i);

			if(isPrime) {
				resultList.add(i) ;
			}
		}
		
		System.out.println(resultList);
		
		int flias = resultList.stream().reduce(Integer :: sum).get() ;
		
		System.out.println(flias);
	}

	private static boolean primeNumberfncs(int num) {
		
		if(num <=3) {
			return true;
		}
		
		if(num %2 == 0 || num%3 ==0) {
			return false;
		}
		
		for(int i = 5; i*i <= num ; i+=6) {
		    if(num%i == 0 || num % (i+2) == 0) {
		    	return false;
		    }
		}
		return true;	
	}

	public static void main(String[] args) {
		
		primeNumbersfunctions();
		
		int [] arr = {900,12,34,567,89,900};
		
//	int max =	Arrays.stream(arr).boxed().distinct()
//			.sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//	
//	   System.out.println(max);
	   
	   for(int i = 0 ; i<arr.length;i++) {
		   int maxs = i;
		   for(int j = i ;j<arr.length;j++) {
			   if(arr[j] > arr[maxs]) {
				   maxs = j;
			   }	   
		   }
		   
		   int temp = arr[maxs];
		   arr[maxs] = arr[i];
		   arr[i] = temp;		   
	   }
	   
	   System.out.println(Arrays.toString(arr));
	   
	   System.out.println(arr[2]);
	   
		int [] arr1 = {900,12,34,567,89,900};
		int fstMax = 0 ;
		int seMax = 0 ;
		
		for(int num : arr1) {
			
			if(num > fstMax) {
				seMax = fstMax;
				fstMax = num;
			} else if(num > seMax && num != fstMax) {
				seMax = num;
			}	
		}
		
		System.out.println(seMax);
		
		Map<Integer, String> mapList = new HashMap<>() ;
		mapList.put(12,"Praveen");
				
	}	

}
