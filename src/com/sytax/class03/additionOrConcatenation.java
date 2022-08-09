package com.sytax.class03;

public class additionOrConcatenation {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		String c="hello";
		String d="hi";
		
		System.out.println(a+b+c+d);//30HelloHi
		System.out.println(a+c+b+d);//10Hello20Hi
		System.out.println(c+d+a+b);//HelloHi1020
		System.out.println(c+d+(a+d));//HelloHi30
		
		boolean boo=true;
		System.out.println(c+boo);
		

	}

}
