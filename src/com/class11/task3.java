package com.class11;

public class task3 {

	public static void main(String[] args) {
		// create a 2D array of integer values.
		//print the sum of all numbers.
	//    rows columns
		//   j i
		//   4 3
		int [][]array= {{10,21,10},  //0
                        {20,50,30},  //1
                        {40,50,70},  //2
			            {30,40,50}}; //3
		//             0, 1, 2, 
		int sum=0;
		for(int j=0; j<array.length; j++) {// now we will get 123,123,123,123
		for(int i=0; i<array[j].length; i++) {
		//System.out.println(j+ " "+i);// out 0,1,2 we need nested loop 
		//to print both i and j
			sum=sum+array[j][i];
		//System.out.println(sum);// if we put Syso before curly brackets
		//we will get step by step addition, and not just final results 
		//10 ,31,41,61,111,141,181,231,301,331,371,421,
		
		}
		}
		System.out.println(sum);
				
		
//			System.out.println(array[0][0]);
//			System.out.println(array[0][1]);
//			System.out.println(array[0][2]);
//			
//			System.out.println(array[1][0]);
//			System.out.println(array[1][1]);
//			System.out.println(array[1][2]);
//			
//			System.out.println(array[2][0]);
//			System.out.println(array[2][1]);
//			System.out.println(array[2][2]);
//			
//			System.out.println(array[3][0]);
//			System.out.println(array[3][1]);
//			System.out.println(array[3][2]);
			//10, 21, 10, 
			//20. 50, 30, 
			//40, 50, 70, 
			//30, 40, 50

	}
}
		
	
		
		
		
