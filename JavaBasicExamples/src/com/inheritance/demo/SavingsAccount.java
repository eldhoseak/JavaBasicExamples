package com.inheritance.demo;

public class SavingsAccount extends Account {
	private double minbalance;
	public SavingsAccount(String name,double balance,double minBalance) {
		super(name, balance);
		this.minbalance=minBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if(balance>500)
		{
			balance=balance-amount;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	

}
