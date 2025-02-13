package com.DemoFilesSamples.SampleFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stringCheck {

	public static void main(String[] args) {
		int kl = 0;
		int[] as = {10,20,30,40,40,70,10,20};
		System.out.println(as.length);
		
		List<Integer> sasa = new ArrayList<>();
		
		for(int i = 0 ; i<as.length;i++) {
				kl = as[i];
				if(!sasa.contains(kl)) {
					sasa.add(kl);
				}							
		}
		System.out.println(sasa);
	}

}
