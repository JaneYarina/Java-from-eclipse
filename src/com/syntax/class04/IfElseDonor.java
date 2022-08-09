package com.syntax.class04;

public class IfElseDonor {

	public static void main(String[] args) {
		/*
		 * Create a Java program and call it a Donor. In order to be eligible 
		to donate
		 * your blood you have to be 18 years old. Also once you identify age
		 * eligibility then we have to see if person matches weight 
		requirements. If
		 * person weight it more than 110 lbs → then he/she is eligible, 
		otherwise we
		 * cannot accept such a patient.
		 * 
		 */
		
int age = 23; //initialise age
int weight = 111;//initialise weight
	if (age >=18){ //condition
	if (weight>110) {//condition
	System.out.println("You are  "+age+"  years old, and your weight is  "+weight+"  lbs. "+"You are eligible to be a donor");
}
	else { System.out.println("you are"+age+"years old. and your weight is "+weight+" lbs. It is less then 110 lbs. You are not eligible to be a donor.");
}
}// we closed weight problem
	else { System.out.println("You are not elligible to be a donor. You are younger than 18 years old");
}		
			
			
			
				
			}
		
		
			
			
		}
		

	


