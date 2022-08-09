package com.syntax.class10;

import java.util.Scanner;

public class class02test {

	public static void main(String[] args) {
		String[] array = new String[4];
		String country = null;
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			country=sc.nextLine();
			if (country.equals("USA")) {
				System.out.println("The capital of " + country + " is Washigton");
			}
			else if (country.equals("Russia")) {
				System.out.println("The capital of " + country + " is Moscow");
			}
			else if (country.equals(""+ "France")) {
				System.out.println("The capital of " + country + " is Paris");

			}
			else if (country.equals("Spain")) {
				System.out.println("The capital of " + country + " is Madrid");

			} else {
				System.out.println("Error");
			}

		}
	}



	}

