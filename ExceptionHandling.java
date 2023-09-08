package com.java;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		 try {
	            int result = divide(10, 0); // This will throw an ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.err.println("An ArithmeticException occurred: " + e.getMessage());
	        } finally {
	            System.out.println("Finally block executed.");
	        }
	    }

	    public static int divide(int dividend, int divisor) {
	        if (divisor == 0) {
	            throw new ArithmeticException("Division by zero is not allowed.");
	        }
	        return dividend / divisor;
	    }
	
 
}
