package com.syntax.class13;

public class Recap2 {

	public static void main(String[] args) {
		//          0123
		String str="Where is sameer?";//creating a string using double quotes 
		System.out.println(str.charAt(3));//r
		System.out.println(str.charAt(6));//space
		System.out.println(str.indexOf("i"));//6
		System.out.println(str.indexOf("e"));//2
		System.out.println(str.indexOf("e",5));
		System.out.println(str.indexOf("r",5));//?14
		
		int counter=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='e') {
				counter++;
				if(counter==4) {
					System.out.println(i);
					
				}
			}
		}

	}

}
