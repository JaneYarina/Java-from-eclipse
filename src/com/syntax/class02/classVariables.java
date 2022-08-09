package com.syntax.class02;

public class classVariables {

	public static void main(String[] args) {
		// part a
		String name="Jane";
		String lastName="Yarina";
		char grade='A';
		String city="Brooklyn";
		String state="NY";
		String phone="(302)296-8983l";
		System.out.println("My name is "+name+" and "+" my last name is "+lastName);
		
		System.out.println("I am "+grade+" student");
		System.out.println("I live in "+state+" "+city);
		System.out.println("My phone number is "+phone);

		
		//part b
		grade='A';
		state="NY";
		phone="(302)296-8983";
		city="Brooklyn";
		System.out.println("My name is "+name+","+" my last name is "+lastName+". "+" I live in "+city+" "+state+". "+" My phone number is "+phone+".");
		
		
	}

}
