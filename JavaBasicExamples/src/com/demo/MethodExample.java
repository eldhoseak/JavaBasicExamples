package com.demo;

public class MethodExample {

	/*
		static int  calculateSum (int num1, int num2){
		System.out.println("int");	
		return num1 - num2;
	}
	
	
	static double  calculateSum (double num1, double num2){
		System.out.println("double");
		return num1 * num2;
		
	}
	
static float  calculateSum (float num1, float num2){
		System.out.println("float");
		return num1 / num2;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(calculateSum(10,5));
System.out.println(calculateSum(10.5,10.25));
System.out.println(calculateSum(20.1f,10.5f));
	}

(
	*/
	public static void welcome() {
		System.out.println("Welcome to Gurkaran's calculator");
	}
	public static void multiply(int a, int b) {
		System.out.println(a*b);
	}
	public static void divide(int a, int b) {
		System.out.println(a /b);
	}
	
	public static void main(String[] args) {
	
	welcome();
	multiply(5,1);
	multiply(20,2);
	divide(100, 5);
	
	}
}
	
	
	
