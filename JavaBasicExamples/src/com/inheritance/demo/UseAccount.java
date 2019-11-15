package com.inheritance.demo;

public class UseAccount {
	public static void main(String args[])
	{
		//Savings Account
		SavingsAccount sa=new SavingsAccount1("Madhu",10000,1500);
		
		
		System.out.println("Initial Information is : " + sa.showDetails());
		System.out.println("Trying to deposit Rs. 1000: " + sa.deposite(1000));
		System.out.println("Balance: " + sa.getBalance());
	
		System.out.println("Trying to withdraw Rs. 3000: " + sa.withdraw(3000));
		System.out.println("Balance: " + sa.getBalance());
		
		System.out.println("Trying to withdraw Rs. 3000 again: " + sa.withdraw(3000));
		System.out.println("Balance: " + sa.getBalance());
		//Current Account
		CurrentAccount ca=new CurrentAccount("XYZ",150000,10000);
		System.out.println("Initial info: \n" + ca.showDetails());
		
		System.out.println("Trying to withdraw Rs. 3000: " + ca.withdraw(3000));
		System.out.println("Balance: " + ca.getBalance());
	
		System.out.println("Trying to withdraw Rs. 3000 again: " + ca.withdraw(3000));
		System.out.println("Balance: " + ca.getBalance());
	
		System.out.println("Trying to withdraw Rs. 3000 again: " + ca.withdraw(3000));
		System.out.println("Balance: " + ca.getBalance());
	}
	
	// use - a relationship

}
