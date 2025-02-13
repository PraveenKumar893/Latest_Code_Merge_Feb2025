package com.oopsConcepts.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CandleBurner {
	
	
	private static void nonrepatingCharacters(String df) {
		
		Map<Character, Integer> gh = new HashMap<>();
		char bn = ' ';
		
		for(int i =0 ;i<df.length();i++) {
			gh.put(df.charAt(i), gh.getOrDefault(df.charAt(i), 0)+1);
		}
		
		System.out.println(gh);
		
		for(Entry<Character, Integer> sdd : gh.entrySet()) {
			
			if(sdd.getValue() == 1) {
				bn = sdd.getKey();
				break;
			}
			
		}
		
		System.out.println(df.indexOf(bn));
		
	}

	
	
    public static void main(String[] args) {
        int initialCandles = 7;
        int waxForNewCandle = 4;
        int totalBurnedCandles = 0;
        int unburntCandles = initialCandles;
        int burntWax = 0;

        // Burn all initial candles
        totalBurnedCandles += unburntCandles;
        burntWax += unburntCandles;
        unburntCandles = 0;

        // Create new candles from burnt wax
        while (burntWax >= waxForNewCandle) {
            int newCandles = burntWax / waxForNewCandle;
            burntWax = burntWax % waxForNewCandle;
            unburntCandles += newCandles;
            
            // Burn the newly created candles
            totalBurnedCandles += newCandles;
            burntWax += newCandles; // Each new candle creates burnt wax
            
            unburntCandles -= newCandles;
        }
        
        System.out.println("Total burned candles: " + totalBurnedCandles);
        
        String df = "aabbccdd";
        
        nonrepatingCharacters(df);

        
    }

}

