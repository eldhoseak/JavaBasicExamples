package com.basic.demo;

public class PolicyHolder{
	
	private int policyNo;
	private double bonus;

	public PolicyHolder(){
		this.bonus =400.0;
		this.policyNo = 1001;
	}
	
	public PolicyHolder(int policyNo, double bonus){
		this.bonus =bonus;
		this.policyNo = policyNo;
	}
	
	
	public void setPolicyNo(int no){policyNo = no;}
	public int getPolicyNo(){return policyNo;}
	public void setBonus(double amount){
		if(amount>0){
			bonus = amount;}}
	public double getBonus(){return bonus;}

	public boolean isSame(PolicyHolder policyHolder){
		return this.policyNo == policyHolder.policyNo;
	}
	
}
