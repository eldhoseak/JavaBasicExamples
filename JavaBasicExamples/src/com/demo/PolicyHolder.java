package com.demo;

public class PolicyHolder{
	private int policyNo;
	private double bonus;

	public void setPolicyNo(int no){policyNo = no;}
	public int getPolicyNo(){return policyNo;}
	public void setBonus(double amount){
		if(amount>0){
			bonus = amount;}}
	public double getBonus(){return bonus;}

}
