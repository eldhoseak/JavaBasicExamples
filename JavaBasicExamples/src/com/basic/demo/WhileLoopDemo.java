package com.basic.demo;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =15;
		
		while(count <= 10){
			System.out.println(count);
			if(count == 5){
				continue;
			}
			count++;
			
		}
		
		
	/*	do{
			System.out.println(count);
			count++;
			
		}while(count <= 10);
*/
	}

}
