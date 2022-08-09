package com.syntax.class10;

import java.util.Scanner;

public class class10disney {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String[] country = {"America", "Russia","France"};
		
		
		for (int i = 0; i < country.length; i++) {
		if(country[i].equalsIgnoreCase("America")) {
		String capital=scan.next();	
		System.out.println(country[i]+" capital is Washington");
		}
        if(country[i].equalsIgnoreCase("Russia")) {
        String capital=scan.next();	
	    System.out.println(country[i]+" capital is Moscow");
	    }
        if(country[i].equalsIgnoreCase("France")) {
        	String capital=scan.next();	
	    System.out.println(country[i]+" capital is Parice");
}



}
}
}