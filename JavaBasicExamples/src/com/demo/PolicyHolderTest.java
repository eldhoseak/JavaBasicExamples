package com.demo;

public class PolicyHolderTest {

	
	
	public static void main(String[] args) {
		 PolicyHolder policyHolder = new PolicyHolder();
		policyHolder.setPolicyNo(131030);
		policyHolder.setBonus(-1);

		System.out.println(policyHolder.getBonus());
		System.out.println(policyHolder.getPolicyNo());
		
	}

}
