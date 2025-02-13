package com.DemoFilesSamples.SampleFiles;

public class OopsConcepts { 
	
	// OOPS_CONCEPT : ENCAPSULATION
	
	private String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		
		OopsConcepts nms = new OopsConcepts();
		nms.name = "Praveen";
		System.out.println(nms.name);

	}

}
