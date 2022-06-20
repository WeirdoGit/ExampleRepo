package com.craft;

public class Calculator {
	
	
	public int addition(int  a, int b) {
		System.out.println("dlfjsdlfjsd");
		return a+b;
	}
	
	
	public int division(int a, int b) {
		return a/b;
	}
	
	
	public int multiplication(int a, int b) {
		return a*b;
	}
	
	
	public int subtraction(int a, int b) {
		return a-b;
	}
	
	public int modulus(int a, int b) {
		return a%b;
	}
	
	
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		System.out.println(c.addition(3, 5));
		
	}

}
