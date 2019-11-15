package com.basic.demo;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long longVal = 100l;
		
		// type casting examples
		int val1 = (int) longVal;
		
		int val2 = 50;
		System.out.println("val1 = "+val1+ ", val2 = "+val2);
		
		System.out.println("------  Arithmetic operators"+" START-------");
		System.out.println("val1+val2 = "+ (val1+val2));
		System.out.println("val1-val2 = "+ (val1-val2));
		System.out.println("val1*val2 = "+ (val1*val2));
		System.out.println("val1/val2 = "+ (val1/val2));
		System.out.println("val1%val2 = "+ (val1%val2));
		System.out.println("------  Arithmetic operators END-------");
		
		System.out.println("------  Relational operators START-------");
		System.out.println("val1>val2 = "+ (val1>val2));
		System.out.println("val1<val2 = " + (val1<val2));
		System.out.println("val1>=val2 = " + (val1>=val2));
		System.out.println("val1<=val2 = " + (val1<=val2));
		System.out.println("val1!=val2 = " + (val1!=val2));
		System.out.println("val1==val2 = " + (val1==val2));
		System.out.println("------  Relational operators END-------");
		
		System.out.println("------  Logical operators START-------");
		System.out.println("val1>val2 && val1<val2 = "+ (val1>val2 && val1<val2));
		System.out.println("val1>val2 || val1<val2 = "+ (val1>val2 || val1<val2));
		System.out.println("------  Logical operators END-------");

	}

}
