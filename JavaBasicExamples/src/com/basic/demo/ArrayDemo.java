package com.basic.demo;

public class ArrayDemo {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Length of the longest increasing subsequence. below it is 4 -> 2,5,7,8

		int length = 0, counter =0;
		int [] numericArray = {1, 4, 7, 3, 2,5, 7 ,8};

		for (int i= 0; i<numericArray.length;i++){
			
			for (int j= i+1; j<numericArray.length;j++){
				if(numericArray[j]> numericArray[j-1]){
					counter ++;
				}
			}
			
			if(length< counter){
				length = counter;
			}
			counter = 0;
		}

		System.out.println("length "+ length);

	}
}
package com.demo;
					*/
public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length = 0,	counter =0;
		int [] numericArray = {1, 4, 7, 3, 2, 5, 7 ,8};
		
		for (int i=1; i<numericArray.length; i++) {
			
			for (int j =i+1; j<numericArray.length; j++) {
				if(numericArray[j] > numericArray[j-1]) {
					counter ++;}
		
		}
			
		if (length< counter) {
			length =  counter;
		
		}	
		counter = 0;
		}
		
	System.out.println("Length" + length);

		}
	}

	
