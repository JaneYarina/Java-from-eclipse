package com.syntax.class13;

public class Task1 {

	public static void main(String[] args) {
		/*create a string and if the String is not empty perform:
		 *  if the string has  an odd number of character and has 3 or 
		 * more characters, print the character in the middle of th String.
		 */

		//str2.length()%2!=0 Stringhas an odd number of characters
		//str2.length()?=3 has 3 or more character
		String str=new String("Hello");
		String str2="Hello";//this is preferred
		
		
		if(!str2.isEmpty()) {
			if(str2.length()%2!=0&&str2.length()>=3) {
				int middle=str2.length()/2;
				System.out.println(str2.charAt(middle));
			}
		}
		
		
		
		
	}

}
