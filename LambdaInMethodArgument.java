package com.java;

import java.util.Arrays;
import java.util.List;

public class LambdaInMethodArgument {
   public static void main(String[] args) {
	   
	//Lambda in method Argument
	// Using a lambda in the forEach method of a List
	List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
	names.forEach(name -> System.out.println("Hello, " + name));

   }
}
