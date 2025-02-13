package com.Algorithms.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class functionInterface {

	public static void main(String[] args) {
		
		Map<String, String> hj = new HashMap<>();
		
		
		int [] num23 = {34,2,342,21};
		
		Arrays.asList(num23);
		
		
		List<Integer> sd = new ArrayList<>();
		
		sd.add(893);
		sd.add(93);
		sd.add(193);
		sd.add(393);
		
		System.out.println(sd);
		
		Collections.sort(sd);
		
		System.out.println(sd);
		
		System.out.println(sd.get(sd.size()-2));

		
		Optional<Integer> sdds = sd.stream().distinct().sorted((s1,s2) -> s2-s1).skip(1).findFirst();
		
		System.out.println(sdds.get());
		
		Optional<Integer> sddss = sd.stream().distinct().sorted((s1,s2) -> s1-s2).skip(1).findFirst();
		
		System.out.println(sddss.get());

	}

}
