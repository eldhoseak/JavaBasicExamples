package com.demo;

public class MDArrayDemo {

	public static void main(String[] args) {
		// 3 * 3 array
		
		int[][] numericArray = {
			      {1, 2, 3, 10}, 
			      {4, 5, 6}, 
			      {7, 8, 9, 12, 15}, 
			};

	
		System.out.println("length "+ numericArray[0].length);
		
		System.out.println("element "+ numericArray[0][0]);
		
for (int i= 0; i<numericArray.length;i++){
			
			for (int j= 0; j<numericArray[i].length;j++){
				System.out.print(numericArray[i][j] + " ");
			}
		System.out.println("\n");
		}

	}

}
