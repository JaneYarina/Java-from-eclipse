package replit;

import java.util.Scanner;

public class task025 {

	public static void main(String[] args) {
		/*
		The variable "num" holds an integer input from a user
		Write a conditional statement starting on line 9 that does the following:
		If num is positive, print "__ is positive"
		If num is negative, print "__ is negative"
		If num is equals to 0, then print "Entered number is equals to 0"
		Examples:
		In: 5
		5 is positive
		In: -2
		-2 is negative
		In: 0
		Entered number is equals to 0
		 */
		//Use if to specify a block of code to be executed, 
		//if a specified condition is true. Use else to specify 
		//a block of code to be executed, if the same condition 
		//is false. Use else if to specify a new condition to test,
		//if the first condition is false.
		
		   
		        Scanner inp = new Scanner(System.in);
		        System.out.print("In:");
		        int num = inp.nextInt();
		        
		        if (num > 0) {
		            System.out.println(num + " is positive");
		        } else if (num < 0) {
		            System.out.println(num + " is negative");
		        } else {
		            System.out.println("Entered number is equals to 0");
		        }
		    }
		
	}


