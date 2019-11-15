package com.basic.demo;

public class PolicyHolderTest {

	
	
	public static void main(String[] args) {
		 PolicyHolder policyHolder = new PolicyHolder(600, 500);
		 
		 PolicyHolder policyHolder2 =getInstance();
		
		System.out.println(policyHolder.getBonus());
		System.out.println(policyHolder.getPolicyNo());
		
		System.out.println(policyHolder2.getBonus());
		System.out.println(policyHolder2.getPolicyNo());
		
		
		System.out.println(policyHolder.isSame(policyHolder2));
	}
	
	private static PolicyHolder getInstance(){
		return new PolicyHolder();
	}

}
