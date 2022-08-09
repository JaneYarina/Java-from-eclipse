package com.syntax.class13;

public class Recap3 {

	public static void main(String[] args) {
		//substring
		//from a string get part switch starts from the symbol # and ends?
		//          012345678910,11,12
		String str="I am Confused";
		System.out.println(str.substring(5));//confused
		System.out.println(str.substring(2));//begging index
		System.out.println(str.substring(2,6));//6 are not included
		System.out.println(str.substring(0,3));//3 are not included
		
		str="Asghar is Great";
		System.out.println(str.substring(0,6));
	}

}
