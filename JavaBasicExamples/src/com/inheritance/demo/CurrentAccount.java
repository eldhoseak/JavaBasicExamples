package com.inheritance.demo;

public class CurrentAccount extends Account {
	private double overDraft;
	public CurrentAccount(String name,double balance,double overDraft) {
		super(name, balance);
		this.overDraft=overDraft;
	}

	@Override
	public boolean withdraw(double amount) {
		if ((this.balance + overDraft) > amount) {
			balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	// is -a relationship with Account

}
