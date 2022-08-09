package com.sytax.class03;

public class ifStatement02 {

	public static void main(String[] args) {
		/*declare a variable rate. If rate is more than 5
		 * --> I am not buying a house 
		 */
		
		double mortgageRate = 4.5;
		
		if (mortgageRate >5) {
			System.out.println("I am not buying a house ");
		}
		/*Declare 2 variables and check if num 1 is biggerthan num 2
		 * 
		 */
		
		int num1 = 100;
		int num2 = 99;
		if (num1>num2) {
			System.out.println(num1 + " is bigger than "+ num2);
		}
		
		/*
		 * declare temperature, if temp is higher than 75 -> i will go walk
		 */
		
		int tempreture = 89;
		if (tempreture > 75) {//code goes inside if {} condition is true
			
			
			System.out.println("I will go for a walk ");
			
		} else { // otherwise. Code comes to else {} //when conditions is false 
			System.out.println("I am going to study Java");
		}
		System.out.println("----------------------------------------");
		
		char gender = 'm';
		if (gender =='f') {
			System.out.println("You like shopping");
			
		}else {
			System.out.println("You like watching sports");
		}
		System.out.println("------------------------------------------");
		 String browser = "chrome";
		 if (browser.equals("chrome")) {
			 System.out.println("All test cases will be executed on chrome");
		 }else {
			 System.out.println("I am not executing any test cases");
			 System.out.println("Reason - wrong browser");
			 
}
}
}


