package com.DemoFilesSamples.SampleFiles;

import java.util.*;

public class TNQSoftwareQuestions {
	
    public static int sumOfDigits(int n) {
        if (n == 0)
			return 0;
        System.out.println(n % 10 + "sdssdsdds" + n/10 );
        return (n % 10) + sumOfDigits(n / 10);
    }

	
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(sumOfDigits(number));
        
        Map<String ,String> hj = new HashMap<>();

        hj.put("praveen","software");
        hj.put("kumar" ,"software");
        
        System.out.println(hj);
        
        hj.put("praveen", "dssd");
        System.out.println(hj);
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        
        

    }
    
    


}
