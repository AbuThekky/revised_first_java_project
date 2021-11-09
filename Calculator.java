package com.qa.day1;

public class Calculator {

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int subtraction(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static double division(double a, double b) {
		if(a > b) {
			return a / b;
		} else {
			System.out.println("a has to be greater than b");
	}
		return b;
	

  }
}