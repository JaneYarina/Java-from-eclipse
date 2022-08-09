package com.syntax.class02;

public class classNonPrimitives {

	public static void main(String[] args) {
		// 
		
		String name="Oleg";
		String lastName = "Smith";
		Long phone = 4653789878975l;
		//xxxxxxxxxxxx
		String phoneNumber = "456-567-6787";
		String address="7410 Ridge boulevard";
		
		int age =30;
		String city="Miami";
		city="Los Angeles";
		//shortcut for printing
		//type syso + ctrl +space --> hit enter
		
		/* we can use + -> works as concatenation operator
		 * to attach string to string
		 * to attach string to int
		 * to attach string to double
		 * to any other type
		 */
       System.out.println(name+ " " +lastName);//Oleg Smith
       //Oleg lives in Miami
       System.out.println(name+" Lives in "+city);
       
       //Oleg is 30 years old
   
       System.out.println(name+" is "+age+" years old ");
       /*
        * Rules for identifiers
        * 1. no space
        * 2. no keywords
        * 3. cannot start with numbers (numbers can be used after the letter)
        * 4. cannot have with special character(except _, $)
        */
//Sstring break="hello"; error
       //int 1number=10; error
       int number1=10;
       
       //int num%=20; error
       double $price=3.99;
       float f_=2.09f;
       /*
        * Naming Conventions:
        * follow camel casing
        * varaiable/methods names should start with lowercase and then follow camel casing
        * class names should start with uppercase
        */
		String MyCity="Tysons";
		
		
	}

}
