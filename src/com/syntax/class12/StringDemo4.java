package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		// equals
		//confirm
		String name ="kat";
		String name2="kat";
		System.out.println(name.equals(name2));
		name2="KAT";
		System.out.println(name.equalsIgnoreCase(name2));
		
		String userName="admin";
		String password="pass123";
		String confirmPassword="pass123";
		
	}

}
