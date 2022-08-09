package com.syntax.class05;

import java.util.Scanner;

public class scanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner (System.in);
			
	System.out.println("Please enter your name");
	String name=scan.next();
	System.out.println(name);
	
	
	System.out.println("Please enter your age");
	int age=scan.nextInt();
	System.out.println(age);
	
	System.out.println("Please enter price");
	double price=scan.nextDouble();
	System.out.println(price);
	
	System.out.println("Please enter boolean");
	boolean boo=scan.nextBoolean();
	System.out.println(boo);
	
	System.out.println("Please enter any character");
	char character=scan.next().charAt(0);//capture 1 character
	System.out.println(character);
	
	
	
	
		
		
		
	}

}
