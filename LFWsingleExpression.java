package com.java;

import java.util.function.Predicate;

public class LFWsingleExpression {

	public static void main(String [] args) {
		 
	// Lambda Function With Single Expression  (No Curly Braces)
	Predicate<Integer> isEven = n -> n % 2 == 0;

	
	boolean even = isEven.test(6);
	System.out.println("Is even? " + even);

	}
}
