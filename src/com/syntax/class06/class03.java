package com.syntax.class06;

import java.util.Scanner;

public class class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=2000;
		int num2=2000;
		int num3=20;
		/*compliler can initialize vairables to it's default values
		 * int ->0
		 * bouble->0.0
		 * Boolean ->False
		 * String->null
		 */
		int largest=0;

		if (num1 > num2 && num1 > num3) {
			largest=num1;
			
		}else if (num3 > num1 && num3 > num2) {
			largest=num3;
		} else if (num2 > num1 && num2 > num3) {
			largest=num2;
		}else {
			System.out.println("All numbers are equal");
			largest=num1;
		}
	if(largest!=0) {
		System.out.println("The largest number is"+ largest);
		//the variable largest may not have been initialized
}


	}	
	
	
}

//homework find out how say that two numbers are equal

