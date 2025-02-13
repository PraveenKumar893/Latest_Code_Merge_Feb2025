package com.DemoFilesSamples.SampleFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class classBuffer {

	public static void main(String[] args) throws IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the values ");
		
		String gh = buffer.readLine();
		
		int count  = 0;
		int rad = 0;
		
		for(char ch : gh.toCharArray()) {
			if(ch == '#') count++;
			else if(ch == '@') rad++;
		}
		
        System.out.println("Number of '#' separators: " + count);
        System.out.println("Number of '@' separators: " + rad);
        
        StringTokenizer jksd = new StringTokenizer(gh, "#@");
        System.out.println("sddsdsd " + jksd.nextToken());

	}

}
