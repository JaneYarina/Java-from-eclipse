package com.syntax.reviewclass2;

import java.util.Scanner;

public class ifElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your acount balance");
		double accountBalance=scanner.nextDouble();
		System.out.println("Please enter the amount you like to lend");
		double amountTolend=scanner.nextDouble();
		
		if(accountBalance>=amountTolend){
		System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		}
		
		
	}


