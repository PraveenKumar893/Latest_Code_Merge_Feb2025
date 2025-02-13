package com.DemoFilesSamples.SampleFiles;

public interface interfaceexample1 {
	
	public void display() ;
	
    default void sleep() {
        System.out.println("Animal is sleeping");
    }

    static void printHello() {
        System.out.println("Hello, World!");
    }

}
