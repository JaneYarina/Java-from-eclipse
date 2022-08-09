package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		// chartAt
		String str="Sameer is funny Sameer is gulbadan";
		//System.out.println(str.chartAt(2));
		//System.out.println(str.chartAt(5));
		/*
		 * for(int i=0;i<str.length(); i++){
		 * System.out.println(str.charAt(i);
		 * }
		 */
		int counter=0;
		for(int i=0; i<str.length(); i++) {
			if('a'==str.charAt(i)) {
			counter++;
			//if('s'==str.charAt(i)||'S'==str.charAt(i)||'a'==str.charAt(i)||'A'==str.charAt(i)) {
			}
			
		}
		System.out.println("a appeard "+counter+" in the string");
	}

}
