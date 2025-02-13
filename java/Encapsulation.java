package com.oopsConcepts.java;

class encapsule{
	
	private String name;
	private int cusid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	
	
}

public class Encapsulation {
	
	public static void main(String[] args) {
		
		encapsule en = new encapsule();
		en.setCusid(12);
		en.setName("Praveen");
		
		System.out.println(en.getCusid() + "  " + en.getName());

	}

}
