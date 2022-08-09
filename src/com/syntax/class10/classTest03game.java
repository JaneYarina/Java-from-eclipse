package com.syntax.class10;

import java.util.Random;
import java.util.Scanner;

public class classTest03game {

	public static void main(String[] args) {
		

		
		        Random r = new Random();

		        Scanner input = new Scanner(System.in);



		        String[] capital = {"Lisbon", "Madrid", "Paris", "Berlin", "Warsaw", "Kiev", "Moscow", "Prague", "Rome"};
		        String[] country = {"Portugal", "Spain", "France", "Germany", "Poland", "Ukraine", "Russia", "Czech Republic", "Italy"};
		        Boolean[] was = new Boolean[9];

		        


		       
		        Scanner  = new Scanner();
		        
		        System.out.print("What is the capital of "+country);



		        for (int d = 1; d<4; d++) {
		            int randomint = r.nextInt(9);
		            while (was[randomint] == Boolean.FALSE){
		                randomint = r.nextInt(9);
		            }
		            was[randomint] = false;


		            while (was[randomint] == true);
		            for (int x = 0; x < 3; x++) {
		                System.out.print("What's capital of " + country[randomint] + "\n");
		                String answer = input.nextLine();
		               
		                }
		            }
		        }
		        
	   Sysytem.out.println("The capital of"+country+" is "+capital);

      
		        

	    
		
}
	}
	
	
