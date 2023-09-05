package com.java;

import java.util.function.BinaryOperator;

public class LambdaAsFunctionParameter {

	//Lambda as Function Parameter                 
	 public static void main(String[] args) {
	        // Defining a method that takes a lambda as a parameter
	        int result = operate(5, 3, (x, y) -> x + y);
	        System.out.println("Result: " + result);
	    }

	    public static int operate(int a, int b, BinaryOperator<Integer> operator) {
	        return operator.apply(a, b);
	    }
}
