package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

class encapsulte {
	
	private String name;
	private double salary;
	private int userid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "encapsulte [name=" + name + ", salary=" + salary + ", userid=" + userid + "]";
	}
	public encapsulte(String name, double salary, int userid) {
		super();
		this.name = name;
		this.salary = salary;
		this.userid = userid;
	}	
	
	
	
}

public class programming {
	
	private String name ;
	
	static {
		int ad = 90;
		System.out.println(" The Values Is AD " + ad);
	}
	
	public programming() {
		this.name = "praveen";
		System.out.println(this.name);
	}
	
	static void anagram() {
		
		String str = "silent";
		String str2 = "team";
	
	char [] str3 = str.toCharArray();
	char [] str4 = str2.toCharArray();
	
	Arrays.sort(str3);
	Arrays.sort(str4);
	
	System.out.println(Arrays.equals(str3, str4));		
	}
	
	static void binarySearch() {
		int [] arr = {12,44,6,78,89,90};
		int target = 78;
		int start = 0;
		int end = arr.length-1;
		Arrays.sort(arr);
		
		while(start <= end) {
			int mid = (start+end)/2;
			if(arr[mid] == target) {
				System.out.println(" The file founds " + arr[mid] + " " + mid);
				break;
			} else if(arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid -1 ;
			}
		}
				
	}
	
	static void bubbleSortingtechnique() {
		
		int [] arr = {12 ,45,3,67,8,11,456} ;
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = 0 ; j <arr.length-i-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j] ;
					arr[j] = arr[j+1];
					arr[j+1] = temp ;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void selectionSortingtechnique () {
		
		int [] arr = {12 ,45,3,121,345,65,789,90};
		
		for(int i = 0 ; i<arr.length ; i++) {
			int maxIndex = i;
			
			for(int j = i+1 ; j < arr.length ;j++) {
				if(arr[maxIndex] > arr[j]) {
					maxIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void insertionSortingTechnique() {
		int [] num = {12,341,67,3,89,212,45} ;
		int key = 0;
		
		for(int i = 1 ; i<num.length ; i++) {
			key = num[i] ;
			int j = i -1 ;
			while(j >= 0 && key < num[j]) {
				num[j+1] = num[j];
				j = j-1;
			}			
			num[j+1] = key ;
		}
		
		System.out.println(Arrays.toString(num));
	}
	
	
	static void checkPrimeNumbers() {
		
		int num = 50 ; // 1357 11 13 17 19
		boolean num1 = false;
		
		List<Integer> resultList = new ArrayList<>();
		
		for(int i = 1 ; i<num; i++) {
			
			num1 = isPrime(i) ;
			if(num1) {
				resultList.add(i);
			}
		}
		
		System.out.println(resultList);
		
		num = 20 ;
		
		IntStream.range(1, num).filter(programming :: isprimeJava)
		   .forEach(op -> System.out.println(op));
	}
	
	static boolean isprimeJava(int num) {
		
		 if (num < 2) return false;
		
		return IntStream.range(2,(int)Math.sqrt(num))
		   .allMatch(n -> num%n != 0) ;
				
	}

	 static boolean isPrime(int num) {
		 boolean jk = true;
		 
		 if(num == 3 || num == 1 )
			 return true;
		 if(num %2 == 0 || num %3 == 0 )
			 return false;
		 
		 for(int i = 5 ; i*i <= num ; i++) {
			 if(num%i == 0)
				 return false;
		 }
		 
		return jk;
	}

	public static void main(String[] args) {
		anagram();
		binarySearch();
		encapsulte sdsd = new encapsulte("Praveen",2839.12,38);
		System.out.println(sdsd);
		sdsd.setName("PraveenKumar");
		System.out.println(sdsd);
		System.out.println(new programming());
		bubbleSortingtechnique() ;
		selectionSortingtechnique() ;
		insertionSortingTechnique() ;
		checkPrimeNumbers() ;
	}

}
