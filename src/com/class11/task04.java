package com.class11;

public class task04 {

	public static void main(String[] args) {
		/*create a 2D array of integer type where you will store
		 * odd and even numbers.
		 * Develop a program which will identify/print the even number only.
		 */
		
		int [][]array= {{10,21,10},  //0
                        {20,50,30},  //1
                        {40,50,70},  //2
	                    {30,40,50}}; //3

		for(int j=0; j<array.length; j++) {// now we will get 123,123,123,123
			for(int i=0; i<array[j].length; i++) {
		if(array[j][i]%2==0) {
			System.out.println(array[j][i]);//30,40,50
			
		}
	}

		}
}

}


//we need to create 2D array where we stored random numbers
//to identify and print the even number only we use nested for loop