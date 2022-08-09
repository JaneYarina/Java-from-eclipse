package com.syntax.class12;

public class StringDemo6 {

	public static void main(String[] args) {
		//count how many times digit 1 has appeared
		String str="1123456789909876543214";
		int counter=0;
		for (int i =0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				counter++;
			}
		}
System.out.println(counter);
	}

}
