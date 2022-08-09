package com.sytax.class07;

import java.util.Scanner;

public class testCountryes01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   
		       int num = 10;
		       
		        String countries[] = new String[num];
		        String capitals[] = new String[num];
		        System.out.println("Enter " + num
		            + " countries and their capitals");
		        
		        for (int i = 0; i < num; i++) {
		            System.out.print("Enter country name: ");
		            countries[i] =next();
		            System.out.print("Enter its capital: ");
		            capitals[i] = next();
		        }
		        
		        System.out.println("Country Names"+" Capital");
		        for (int i = 0; i < num; i++) {
		            
		        }
		        
		    
		    }
	

}
