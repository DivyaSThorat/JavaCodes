package com.java;

public class LambdaFunction {
	 public static void main(String[] args) {
		 
	// Lambda with No Parameters
	Runnable runnable = () -> {
	    System.out.println("Hello, Lambda!");
	};

	runnable.run();
	
	 }
	 
	
}
