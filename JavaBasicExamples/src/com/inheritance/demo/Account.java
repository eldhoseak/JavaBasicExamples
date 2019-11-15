package com.inheritance.demo;

public class Account {
	private int accNo;
	private String name;
	protected double balance;
	static private int idCounter = 100;
	Account(String name,double balance)
	{
		this.accNo = idCounter++;
		this.name=name;
		this.balance=balance;
	}
	public String showDetails() {
		return "ID: " + accNo +
				"\nName: " + name + 
				"\nBalance: " + balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public int getaccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}
	public boolean deposite(double amount)
	{
		if(amount>0) {
		balance=balance+amount;
		return true;
		}
		else {
			return false;
		}
	}
	
	public  boolean withdraw(double amount){
		return true;
	}

}
