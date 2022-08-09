package com.syntax.class01;

public class DataTypes {

	public static void main(String[] args) {
		//box1 is a variable 
		/*to create variable we need datatype and name
		 * 
		 */
		
		//to create a variable:datatype+name
		byte box1= 21;
		short box2=2022;
		int box3=788888; //mostly used
		long box4=5678910l;
		
		//decimal values
		float container=1.99f;
		double container2=55.99;
		
		//non numbers  
		/*(1 character)
		 */
	
	char gender='m';
	char dollar='$';
	
	 //to represent true or false
	boolean hungry=true;
	boolean sleepy=false;
	
	//how to access values from variables?
	
	System.out.println(box1);
	System.out.println(box2);
	System.out.println(box3);
	System.out.println(box4);
	System.out.println(container);
	System.out.println(container2);
	System.out.println(gender);
	System.out.println(dollar);
	System.out.println(hungry);
	System.out.println(sleepy);
	
	System.out.println(sleepy);//false
	System.out.println("sleepy");//sleepy
	
	// have to create a box befor use it (print it)
	
	}

}
