package com.java;

import java.util.function.BinaryOperator;

public class LFWmultipleParameter {

	public static void main(String[] args) {
	// lambda function with multiple parameter
	BinaryOperator<Integer> add = (a, b) -> a + b;

	int result = add.apply(5, 3);
	System.out.println("Result: " + result);

	}	
}
