package com.syntax.class10;

import java.util.Scanner;

public class classCountryLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] country = { "America", "Russia", "France" };
		for (int i = 0; i < country.length; i++) {
		
			if (country[i].equals("America")) {
				System.out.println("Wha is the capital?");
				String capital = scan.next();
				System.out.println("The capital of " + country[i] + " is " + "Washington");
			}
			if (country[i].equals("Russia")) {
				System.out.println("What is the capital?");
				String capital = scan.next();
				System.out.println("The capital of " + country[i] + " is " + "Moscow");
			} else if (country[i].equals("France")) {
				System.out.println("What is the capital?");
				String capital = scan.next();
				System.out.println("The capital of " + country[i] + " is " + "Parice");
			}

		}
	}

	

	}


