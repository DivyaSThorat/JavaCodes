package com.java;

import java.util.function.Consumer;

public class LambdaFunctionWithOneParameter {
    public static void main(String [] args) {
	// Lambda Function With One Parameter
	Consumer<String> printer = (message) -> {
	    System.out.println(message);
	};


	printer.accept("Hello, Lambda!");
}	
}
