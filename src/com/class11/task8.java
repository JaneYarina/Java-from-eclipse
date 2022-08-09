package com.class11;

public class task8 {

	public static void main(String[] args) {
		//write a Java Program to print the first 10 numbers of Fibonacci series
		//0 1 1 2 3 5 8 13 21
		int previousNumber=0;
		int currentNumber=1;
		int nextNumber=0;
		int numbersToPrint=10;// how many 10
		System.out.println(0+" ");
		System.out.println(1+" ");
				for (int i=0; i<numbersToPrint-2; i++){
					nextNumber=previousNumber+currentNumber;
					System.out.println(nextNumber+" ");
					previousNumber=currentNumber;
					currentNumber=nextNumber;
					
				}

				
				
				
				
				
				/*
				 * 1) we stored 0 and 1 as fibonachi begginig numbers
				 * then we are goin to use that numbers to genegate others
				 * numbersToPrins is homany e want to print
				 * we are going to write aloop that can take previos number and current 
				 * number , perform the SUM and store the SUM inside nextNumber
				 * we will need not forget to print first two numbers 0and 1
				 * we put i<numbersToPrint-2; becouse we already printed first two numbers
				 * re
				 */
	}

}
