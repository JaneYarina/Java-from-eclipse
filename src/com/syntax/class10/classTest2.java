package com.syntax.class10;

import java.util.Scanner;

public class classTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String[]countries  = {"USA", "Russia", "Engand", "France"};
	
	    String[] capitals =  {"Washington", "Moscow", "London", "Parice"};
		 for(String n :countries){
			 
			 System.out.println("What is the capital of "+countries[0]+"?");
			 
		 }
		 for (int i=0; i <countries.length; i++);{
			 int size =scan.nextInt();
		 System.out.println("The capital of "+countries[0]+" is "+capitals[0]);
		

	}

}
}