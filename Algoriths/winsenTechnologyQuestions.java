package com.Algorithms.Algoriths;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

	
class threadState1 implements Runnable {
	private static int count = 0;
	
    private final int threadId ;

	private  static final int intValuess = 10;
		
	private static final  Object lock = new Object();

	

	public threadState1(int threadId) {
		this.threadId = threadId;
	}
	
    public void run() {
        while (true) {
            synchronized (lock) {
                if (count >= intValuess) {
                	break;
                }
                if (count % 3 == threadId) {
                    count++;
                    System.out.println(Thread.currentThread().getName() + ": " + count);
                    lock.notifyAll(); 
                } else {
                    try {
                        lock.wait(); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class interfacevalues implements interfaceconcepts {

	public void methodswrite() {
		
		System.out.println(" Concreatte method Called  ");
		
	}

	}

	
public class winsenTechnologyQuestions  {
	
	 static void 	addingArrayBetweenNumbers() { // [0,3,0,4,4,0,9,0] [3,8,9]

		 int [] num1 = {0,3,0,4,4,0,9,0,8,2,0};
		 int total = 0; int j = -1;
		 
		 for(int i = 0 ;i<num1.length-1;i++) {
			 
			 if(num1[i+1] == 0) {
				 j++;
				 num1[j] = total;
				 total = 0;
			 } else {
				 total = total + num1[i+1];
			 }
			 
		 }
		 
		 System.out.println(Arrays.toString(num1));
		 
		 System.out.println(Arrays.toString(Arrays.copyOfRange(num1, 0,j+1)));
	}

	 // input : [33,6,99] output : 99633 input : [33,6,31] output : 63331

	 
	 static void possiblityMatchingNumbers () {
		 int num23 [] = {33,9,31,99} ;
		 StringBuilder sdf = new StringBuilder();
		 
	//	 Arrays.sort(num23);
		 
		List<Integer> sds =  Arrays.stream(num23).boxed().sorted((s1,s2) -> s2%10-s1%10).toList();
		 
		 System.out.println(sds);
		 
		 for(int jkl : sds) {
			 sdf.append(jkl);
		 }
		 System.out.println(sdf.toString());
 	 }

	 static void  printListValuesByMultiply () {
		 //1,2,3,4,5 - multiple by 5 in each element and sum them
		 
		 Function<Integer, Integer> dsds = jk -> jk*5 ;
		 
		 List<Integer> ds = new ArrayList<>();
		 ds.add(1);
		 ds.add(2);
		 ds.add(3);
		 ds.add(4);
		 ds.add(5);
		 
		int total = 0;
		total = ds.stream().map(dsds).reduce(0 , Integer :: sum);

		 System.out.println(" Total values  " + total);
		 int totalValue = 0;
		 int ssdds = ds.stream().mapToInt(op -> op*5 + totalValue).sum();
		 int assa = ds.stream().mapToInt(pi -> pi*5).sum();
		 
		 System.out.println(" Totalll Valuessasa " + ssdds);

	 }
	 
	 static void finsdListOfStrings() {
		 
		 List<List<String>> skillset = Arrays.asList(Arrays.asList("Java" ,"Springboot" ,"Spring"),
				   Arrays.asList("react" , "Frontend" ,"javaScript")
				 );
		 
			List<String>dsds =  skillset.stream().flatMap(op -> op.stream()).toList();
			
			System.out.println(dsds);
			
			System.out.println(dsds.stream().filter(po -> po.startsWith("S")).toList());
	 }
	 
	 
	 static void renamingarrayValues() {
		 
		 int [] num = {9} ;
		 StringBuffer sdf = new StringBuffer();
		 
		 for(int i = 0 ; i<num.length;i++) {
			 sdf.append(num[i]);
		 }
		 int hj = Integer.parseInt(sdf.toString())+1;
		 
		 String.valueOf(hj).split(" ");
		 		 
	 }
	 
	 static boolean parenthesis () {
		 
		 String str = "(()"; // {[]}()
		 
		 Stack<Character> stack = new Stack<>();
		 
		 for(char hj :  str.toCharArray()) {
			 
			 if(hj == '{' || hj == '[' || hj == '(') {
				 stack.push(hj);
			 }  else {
				 if(stack.isEmpty()) {
					 return false;
				 }
				 stack.pop();
			 }		 
		 }
		return stack.isEmpty();
		 
	 }
	 
	 static void optionalClasses() {
		 
		 Optional<String> dsds = Optional.of("Praveen Kumar");
		 
		 if(dsds.isPresent()) {
			 System.out.println(dsds.get());
		 }
		 
	 }
	 
	 static void abcClasseswith() {
		 int num1 = 24;
		 System.out.println(num1/26 + "  " + num1%26);
		 StringBuilder builder = new StringBuilder();
		 while(num1 > 0) {
			 num1--;
	            char ch = (char) ('A' + (num1 % 26));
	            char cha = (char) ('Z' - (num1 % 26));
	            builder.insert(0, ch);  
	            num1 /= 26;
		 }
		 System.out.println(builder.toString());

	 }
	 
	 static void removeZerosValues() {
		 int [] arrs = {3, 2, 0, 0, 4, 0, 6}; 
		 int j = 0;
		 for(int i = 0 ; i<arrs.length;i++) {
			 if(arrs[i] != 0) {
				 int temp = arrs[i];
					arrs[i] = arrs[j];
					arrs[j]  = temp;
					j++;
				 
			 }
		 }
		 System.out.println(Arrays.toString(Arrays.copyOfRange(arrs, 0, j)));
		 
	//	 IntStream.range(0, arrs.length).filter(op -> op > 0).mapToObj(pl -> arrs[arrs.length-1-pl])
	//	   .toArray();
		 
		 System.out.println(Arrays.toString(Arrays.stream(arrs).filter(op -> op >0).toArray()));

	 }
	 
	    public static int sumOfDigits(int n) {
	        if (n == 0)
				return 0;
	        System.out.println(n % 10 + "sdssdsdds" + n/10 );
	        return (n % 10) + sumOfDigits(n / 10);
	    }
	    
	    public static int sumofPrimenumbers(int limit) {
	        int sum = 0;
	        for (int num = 2; num <= limit; num++) {
	            if (isPrime(num)) {
	                sum += num;
	            }
	        }
	        return sum;
	    }

	    public static  boolean isPrime(int num) {
	        if (num <= 1) return false;
	        if (num <= 3) return true;
	        if (num % 2 == 0 || num % 3 == 0) return false;

	        for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    
	    public static void getprimenumbersfunction() {
	    	
	    	System.out.println(" Prime Number finded started ");
	    	int limit  = 50 ; // 2,3,5,7,11,13,17,19
	    	List<Integer> primeList = new ArrayList<>();
	    	for(int i = 2 ; i<=limit;i++) {
	    		if(i<=3) {
	    			primeList.add(i);
	    		} else if(i == 5) {
	    			primeList.add(i);
	    		} else if(i%2 != 0 && i%3 != 0 && i%5 != 0) {
	    			primeList.add(i);
	    		}
	    	}
	    	
	    	primeList.forEach(op -> System.out.print(op + " "));
	    	System.out.println(" Added Prime Numberss ");
	    	int totalvalue = 0 ; int finalSum = 0;
	    	finalSum = primeList.stream().mapToInt(ko -> ko + totalvalue).sum();
	    	System.out.println( " Final Output Valuess " + finalSum);
	    }
	    
		public static void findfirstnonrepeatingCharacters() {

			String str = "PPrraveen";
			
			Map<Character, Integer> jdkal = new LinkedHashMap<>();
			
			for(Character ch : str.toCharArray()) {
				jdkal.put(ch, jdkal.getOrDefault(ch, 0)+1);
			}
			
			char sdsdaas = jdkal.entrySet().stream().filter(op -> op.getValue() == 1).findFirst().get().getKey();

			System.out.println(" findfirstnonrepeatingCharacters  " + sdsdaas);
		//	 List<Character> dsds = str.chars().mapToObj(c->(char)c)
			// sorted((s1,s2) -> s1.compareTo(s2)).toList();
			 

		}
		
		static void anagram() {
			
			String str1 = "Silent";
			String str2 = "listen" ;
			List<Character> dsd = new ArrayList<>();
			
			if(str1.toUpperCase().length() != str2.toUpperCase().length()) {
				System.out.println("length mismatch");
			} else {
			
			// to check anagram or not 
			
			for(int i = 0 ; i<str1.length();i++) {
				
				for(int j = 0 ; j<str2.length();j++) {
					if(str1.toUpperCase().charAt(i) == str2.toUpperCase().charAt(j)) {
						dsd.add(str1.charAt(i));
					}
				}
			}
		}
			System.out.println(dsd.toString());
			
			char [] char1 = str1.toUpperCase().toCharArray();
			char [] char2 = str2.toUpperCase().toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
				
		   boolean sdsdsd = 	Arrays.equals(char1,char2);
			
			System.out.println( " Is anagram or not  " + sdsdsd );
									
		}
		
		static void Panagram() {
			
	        String sentence = "The quick brown fox jumps over the lazy dog";
	        
	       int sizevalues =    sentence.toUpperCase().chars()
	            .filter(Character :: isAlphabetic)
	            .map(c -> (char) c)
	            .collect(HashSet::new, Set::add, Set::addAll)
	            .size();
	       
	       if(sizevalues == 26) {
	    	   System.out.println(" The panagramm program " + true);
	       }
		}
		
		static void SubStringProgramwithVowels() {
			
			String str1 = "pravepn" ;
			List<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
			
			String fix = " " ;
			String jkl = "";
			StringBuffer vowelss = new StringBuffer();
			
			int max = str1.length()-2;
			
			for (int i = 0; i < max; i++) {
				fix = str1.substring(i, i + 3);
				vowelss = new StringBuffer();
				for (int j = 0; j < fix.length(); j++) {
					if (vowels.contains(fix.charAt(j))) {
						vowelss.append(fix.charAt(j));
					}
				}
				if(vowelss.toString().length() >= jkl.length()) {
					jkl = vowelss.toString();
					vowelss = new StringBuffer();
					vowelss.append(fix);
				}
			}			
			
			System.out.println(" The Vowelsss " + vowelss.toString());
			
			List<String> hjk = new ArrayList<>();
			
			for(int i = 0 ; i<=2;i++) {
				String dsds = str1.substring(i, i+3);
				hjk.add(dsds);
			}
			
			System.out.println(hjk.toString() + " " + vowels.toString());
			
			Map<Character, Integer> vowelMap = new HashMap<>();
			
			for(String sf : hjk) {
				
				for(char ch : sf.toCharArray()) {
					
					if(vowels.contains(ch)) {
						vowelMap.put(ch, vowelMap.getOrDefault(ch, 0)+1);
					}
				}
				
			}
			
			System.out.println(" Vowelss   " + vowelMap.toString());
			
			// using java 8 methods
			
			System.out.println( IntStream.range(0, str1.length()-2).mapToObj(i -> str1.substring(i, i+3)).toList());
			
			Map<Object, Long> vowelsMap = new HashMap<>();
			
			vowelsMap = 	hjk.stream().flatMapToInt(String :: chars).mapToObj(c -> (char) c)
			  .filter(vowels :: contains)
			  .collect(Collectors.groupingBy(c->c , Collectors.counting()));
			
			System.out.println(" Vowelss   " + vowelsMap.toString());

		}
		
		static void AlternateSubStringProgramWithVowels () {
			
			String str = "Praveen" ;
			String subString = "";
			int count =  0;
			int maxcount = 0;
			String currentString = "";
			
			int max = str.length()-2;
			
			List<Character> vowelss = new ArrayList<>(List.of('a','e','i','o','u'));
			
			for(int i = 0; i<max;i++) {
				subString = str.substring(i, i+3);
				count = 0;
				for(int j = 0; j<subString.length();j++) {
					
					if(vowelss.contains(subString.charAt(j))) {
						count++;
					}
				}
				
				if(count >= maxcount) {
					maxcount = count;
					currentString = subString;
				}
				
			}
			
			System.out.println(" The SubString Valuesss   " + currentString);
		}
		
		static void ArrayReverseUsingJavaeigth() {
			
			int [] arr = {3,4,5,6,7};
			int j = arr.length-1;
			
			for(int i = 0; i<arr.length/2;i++) {
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;				
			}
			System.out.println(Arrays.toString(arr));
			
			int[] sdds = IntStream.range(0, arr.length)
                    .map(i -> arr[arr.length - 1 - i])
                    .toArray();
			
			System.out.println(Arrays.toString(sdds));
			
			String [] str = {"c" , "d" , "l" , "o" , "p"};
			
			String[] dsdsd = IntStream.range(0, str.length).mapToObj(l -> str[str.length-1-l])
			  .toArray(String[] :: new) ;
			
			System.out.println(" The Reversed String Valuesss " + Arrays.toString(dsdsd));
			
		}
		
		static void longestSubStringWithoutRepeatingCharcters() {
			
			String str = "Praveen" ;
			int max = 0;
			int maxLength = 0;
			Set<Character> setValues = new HashSet<>();
			
			for(int i=0; i<str.length();i++) {
				
				while(setValues.contains(str.charAt(i))) {
					setValues.remove(str.charAt(max));
					max++;
				}
					
				setValues.add(str.charAt(i));
				
	            maxLength = Math.max(maxLength, i - max + 1);
				
			}
			
			System.out.println(" jsdjdhjhsdjdhj " + maxLength);
			
			System.out.println(str.substring(0, maxLength));
			
		}
		
		static void concurrencesofeachChracter () {
			
			String kl = "Praveen";
			
			Map<Character, Long> concurrent = new HashMap<>();
			
			concurrent = kl.chars().mapToObj(p -> (char) p)
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			
			System.out.println(" Concurrent Valuess Methodss " + concurrent);
			
			// Remove Duplicates in String 
			
			StringBuilder ssasa = kl.chars().mapToObj(o -> (char) o).distinct()
					.collect(StringBuilder :: new , StringBuilder :: appendCodePoint , StringBuilder :: append);
			
			System.out.println(ssasa.toString());
			
			// Reverse String using java8
			
			  String reverseOrder =  IntStream.range(0, kl.length()).mapToObj(i -> kl.charAt(kl.length() - 1 - i))
			     .map(String :: valueOf).collect(Collectors.joining());
			
			  System.out.println(reverseOrder);
		}

		static void concurrenceofeachword() {
			
			String stg = "in%&*fo()89sy883*s";
			
			String sdd = stg.chars().filter(Character :: isAlphabetic)
			   .mapToObj(o -> (char)o).collect(StringBuffer :: new , StringBuffer :: appendCodePoint , StringBuffer :: append)
			     .toString();
			
			System.out.println("sddsdds " + sdd);
			
			String sdd21 = stg.chars().filter(Character :: isAlphabetic)
			  .mapToObj(p -> String.valueOf((char)p)).collect(Collectors.joining());
			
			System.out.println("sddsdds sdd21 " + sdd21	);
			
			Map<Character, Long> concurrentvaluess = new HashMap<>();
			String concurrent  = "This is Simple *&&**. This is Water.";
			
			 concurrentvaluess = concurrent.toUpperCase().chars().filter(Character :: isAlphabetic)
			   .mapToObj(l -> (char)l).
			   collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
			 
			 System.out.println(" concureent values in wordss " + concurrentvaluess);
			 
				
			  String sasassa =  concurrent.toUpperCase().chars().filter(Character :: isAlphabetic)
				 .mapToObj(k -> String.valueOf((char) k)).collect(Collectors.joining());
			  
			  System.out.println(sasassa);
			  
			  String sdsd = concurrent.toUpperCase().chars().filter(kl -> !Character.isLetterOrDigit(kl))
			     .mapToObj(h -> String.valueOf((char)h)).collect(Collectors.joining());
			  
			  System.out.println("djhsdhsjh  " + sdsd);
		}
		
		static void ArrayFormValues() {
			
			int [] num = {2,6,5,1,3,7};
			int total = 0;
			
			for(int i = 0 ;i<num.length;i++) {
				for(int j = i+1; j<num.length; j++) {
					if((num[i] + num[j]) == 8) {
						System.out.println(" Pointer Found  (" + num[i] + "," + num[j] + ")" );
						break;
					}
				}
			}
		}
		
		static void preIncreamentandPostIncrement() {
			
			int x = 10;
			int y = 2 ;
			int z = 0;
			
		//	System.out.println(++x+" " + ++y);
			
		//	System.out.println(x++ +" " + y++);
			
			System.out.println(x++ + y++);  // The values incremented after operation
			
			System.out.println(++x + ++y);  // The values incremented before operations
			
			System.out.println(++x + y++);

			
			List<Integer> sdsas = new ArrayList<>();
			sdsas.add(898);
			sdsas.add(899);
			sdsas.add(900);

			System.out.println(" LIST 1  " + sdsas);
			
			List<Integer> lists2 = new ArrayList<>();
			lists2 = sdsas;
			System.out.println(lists2);
			sdsas.clear();
			System.out.println(lists2);

			lists2.add(876);
			
			System.out.println(lists2);
			
		}
		
		static void StringNumberValues() {
			
			List<String> strinwithNumberList = new ArrayList<>();
			strinwithNumberList.add("Pr23aveeb22323");
			strinwithNumberList.add("Pr1a23");
			strinwithNumberList.add("Pra323");
			strinwithNumberList.add("Pra123");
			strinwithNumberList.add("Praveen");
			
			List<String> sdds = strinwithNumberList.stream().map(op -> 
			  op.chars().filter(ki -> Character.isLetter(ki)).mapToObj(j -> String.valueOf((char)j))
			    .collect(Collectors.joining())).toList();
			  
			  
			System.out.println(sdds);
		}
		
		static void findlargestandSmallestFromRightToLeft() {
			
			// find largest from right to left
			
			List<Integer> sas = new ArrayList<>();
			int [] num = { 1,232,4,54,47,90,8};
			int num1 = 0;
			
			for(int i = num.length-1; i>=0 ; i--) {
				
				if(num[i] > num1) {
					sas.add(0, num[i]);
					num1 = num[i];
					
				}
			}
			
			System.out.println(" largest from right to left " + sas);
			
			// find smallest from right to left
			
			List<Integer> sass = new ArrayList<>();
			int [] nums = { 1,232,4,54,47,90,8};
			int nums1 = Integer.MAX_VALUE;
			
			for(int i = nums.length-1; i >= 0 ;i--) {
				if(nums[i]<nums1) {
					sass.add(0, nums[i]);
					nums1 = nums[i];
				}
			}
			System.out.println(" smallest from right to left  " + sass);
		}
		
		static void findlargestandSmallestFromLeftToRight() {
			
	        int[] num = {1, 5, 4, 9, 7, 3};
	        List<Integer> result = new ArrayList<>();
	        boolean isSmallest = false;
	        
	        for(int i = 0 ; i<num.length;i++) {
	        	isSmallest = true;
	        	for(int j = i+1 ; j<num.length;j++) {
	        		
	        		if(num[j] <= num[i]) {
	        			isSmallest = false;
	        			break;
	        		}
	        	}
	        	if(isSmallest) {
	        		result.add(num[i]);
	        	}
	        }
	        System.out.println(" Smallest From Left TO Right  " + result);
		}
		
		
		static void shallowCopyDeepCopyPrograms() {
			
			// Shallow Copy == > copies the structur of original Object but not the nested within it
			//Changes to nested objects in the copied object affect the original object and vice versa
			// Instead, it copies references to those nested objects.
			
			ArrayList<Integer> oriList = new ArrayList<>();
			oriList.add(32);
			oriList.add(43);
			oriList.add(12);
			
			System.out.println(oriList);
			
			@SuppressWarnings("unchecked")
			ArrayList<Integer> dupList = (ArrayList<Integer>) oriList.clone() ;
			dupList.add(989);
			System.out.println(oriList);
			System.out.println(dupList);
			
			// Deep Copy : A deep copy creates a completely independent copy of the original object, 
			// including all objects nested within it.
			// Modifying the deep copy does not affect the original object.

			
		}
		
		static void dateApiInjava() {
			
			LocalDate date = LocalDate.now().plusDays(7) ;
			
			System.out.println(" Date  FieldsValues  " + date + " " + LocalDate.now());
			
			System.out.println(LocalTime.now().getHour() + " " + LocalTime.now().plusHours(2));
			
			System.out.println(LocalDateTime.now().getDayOfMonth() + " " + LocalDateTime.now().getDayOfYear());
		}
		
		
		static void SubStringArrayNumbers() {

			int[] arr = { 1, 2, 3, 4, 5, 9, 9 };

			List<int[]> intArrayListValues = IntStream.range(0, arr.length - 2)
					.mapToObj(op -> Arrays.copyOfRange(arr, op, op + 3)).toList();

			System.out.println(Arrays.toString(intArrayListValues.get(0)));

			List<Integer> finalList = new ArrayList<>();
			int finalValues = 0;
			
					
					
			System.out.println(finalList);

			for (int[] valuess : intArrayListValues) {

				int[] singleValues = valuess;
				
				List<Integer> fieldLists = Arrays.stream(singleValues).boxed().distinct()
						.sorted(Comparator.reverseOrder()).toList() ;

				if(singleValues.length == fieldLists.size()) {
					finalValues = fieldLists.get(0) ;
					finalList.add(finalValues);
				}
			}
			
			System.out.println(finalList);

			List<Integer> sds = intArrayListValues.stream().flatMapToInt(Arrays::stream).boxed()
					.sorted((s1, s2) -> s2 - s1).toList();
			// sorted(Comparator.reverseOrder()).toList() ;

			System.out.println(sds);
		}
		
		static void subSequenceOfArrays() {
			
			int [] arr = 
				{50, 3, 10, 7, 40, 80} ;
			
			int count = 0 ;
			List<Integer> countList = new ArrayList<>() ;
			
			for(int i = 1 ; i<arr.length;i++) {
				count = 0;
				for(int j = 0 ; j<i ;j++) {
					if(arr[i] > arr[j]) {
						count++;
					}
				}
				count = count == 0 ? (count >= 50 ? 1 : count)  : 989 ;
				countList.add(count);
			}
			
			System.out.println(countList.stream().max(Comparator.naturalOrder()).get());
			
			int [] dp = new int[arr.length];
			Arrays.fill(dp, 1);
			// find longest Subsequence
			
			for(int i = 1 ; i<arr.length;i++) {
			  for(int j =0 ; j<i ;j++) {
	                if (arr[i] > arr[j]) {
	                    dp[i] = Math.max(dp[i], dp[j] + 1);
	                }
			  }
			}
			
			System.out.println(Arrays.stream(dp).max().getAsInt());
		}
		
		static void insertNumberInMid() {
			int [] num = {1,3,6,7,8}; 
			int h = 98 ;
			int mid = num.length/2;
			int[] newArr = Arrays.copyOf(num, num.length+1) ;
			
			for(int i = newArr.length-1 ; i>mid ; i--) {
	            newArr[i] = newArr[i - 1];
			}
			newArr[mid] = h;
			
			System.out.println(Arrays.toString(newArr));
			
			int [] startArr  = Arrays.copyOf(num, num.length+1) ;
			
			for(int i = 0 ; i<num.length ; i++) {
				startArr[i+1] = num[i] ;
			}
			
			startArr[0] = h ;
			
			System.out.println(Arrays.toString(startArr));
			
			int [] endArr = Arrays.copyOf(num, num.length+1) ;
			
			endArr[endArr.length-1] = h ;
			
			System.out.println(Arrays.toString(endArr));
			
		}
		
		
		static void spirecodingRounds() {
			List<UserDetail> details = new ArrayList<>(Arrays.asList(

		            new UserDetail(1, "Alice", "Active"),

		            new UserDetail(2, "Bob", "Inactive"),

		            new UserDetail(3, "Charlie", "Active"),

		            new UserDetail(4, "David", "Inactive"),

		            new UserDetail(5, "Eve", null)

		        ));
			
			System.out.println(details);
			
		Map<Object, List<UserDetail>> SystemList = details.stream().
			collect(Collectors.groupingBy(op -> op.getStatus() == null ? "Invalid" : op.getStatus().toString())) ;
		 
		   System.out.println(SystemList);
		   		  
		}
		
		static void filesReaderAndWriterClass () {
			
			try {
				BufferedReader buffer = new BufferedReader(new FileReader("E:/Spr_Source_Files/Files_Write/Files_002.txt")) ;
				String line = buffer.readLine() ;
				System.out.println(line);
				
				buffer.close() ;
				
				BufferedWriter bufwrite = new BufferedWriter(new FileWriter("E:/Spr_Source_Files/Files_Write/Files_002.txt")) ;
				bufwrite.write("The Values Is Appended \n ");
				
				bufwrite.close() ;
								
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		static void removeDuplicatesInList() {
			
			List<Integer> list1 = new ArrayList<>(List.of(1,2,3,5,67));
			List<Integer> list2 = new ArrayList<>(List.of(11,23,43,5,67));
			
			System.out.println(list1 + " " + list2);
			
		List<Integer> scsdds = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList()) ;
		
		   System.out.println(scsdds);
		   
		  List<Integer> dssasa = Stream.concat(list1.stream(), list2.stream())
		     .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
		     .entrySet().stream().filter(po -> po.getValue() == 1)
		     .map(Map.Entry :: getKey).collect(Collectors.toList()) ;
		  
		  System.out.println(dssasa);
		   		   
		}
		
		static void longestSubstringWithRepeatingCharacters() {
			String str = "aabccbb" ;
			int i = 0;
			int count  = 0;
			
		Map<Character, Long> maps = str.chars().mapToObj(c -> (char) c)
			   .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		  
		   for(char ch : str.toCharArray()) {
			   if(ch == str.charAt(i+1)) {
				   count++;
				   i++;
			   }
		   }
		
		}

		public static void main(String[] args) throws InterruptedException {
		
			interfacevalues objwe = new interfacevalues();
			objwe.methodswrite();
			objwe.scope();
			interfaceconcepts.display();
			
        Thread th1 = new Thread(new threadState1(0), "Thread21");
        Thread th2 = new Thread(new threadState1(1), "Thread22");
        Thread th3 = new Thread(new threadState1(2), "Thread23");
      //  Thread th4 = new Thread(new threadState1(3), "Thread24");


	//	th1.start();		
	//	th2.start();
	//	th3.start();
	//	th4.start();
 //       [1,2,3] 1,2,4
        addingArrayBetweenNumbers();
        possiblityMatchingNumbers();
        printListValuesByMultiply();
        renamingarrayValues();
        finsdListOfStrings();
       boolean isparentesis =  parenthesis();
       System.out.println(" sdsdds  " + isparentesis);
       optionalClasses();
		abcClasseswith();
		removeZerosValues();
		System.out.println(sumOfDigits(12345));
		System.out.println(sumofPrimenumbers(50));
		getprimenumbersfunction();
		findfirstnonrepeatingCharacters();
		anagram();
		Panagram();
		SubStringProgramwithVowels();
		AlternateSubStringProgramWithVowels();
		ArrayReverseUsingJavaeigth();
		longestSubStringWithoutRepeatingCharcters();
		concurrencesofeachChracter();
		concurrenceofeachword();
		ArrayFormValues();
		preIncreamentandPostIncrement();
		StringNumberValues();
		findlargestandSmallestFromRightToLeft();
		findlargestandSmallestFromLeftToRight();
		//ispalindromeorNot();
		new protectedFiles();
		shallowCopyDeepCopyPrograms() ;
		dateApiInjava() ;
		SubStringArrayNumbers() ;
		subSequenceOfArrays();
		insertNumberInMid() ;
		spirecodingRounds();
		filesReaderAndWriterClass() ;
		removeDuplicatesInList();
		longestSubstringWithRepeatingCharacters();
	}

}
