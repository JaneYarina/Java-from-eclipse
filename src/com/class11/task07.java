package com.class11;

public class task07 {

	public static void main(String[] args) {
		// write a java program to check whether a given number is prime or not
/*prime number is a number is  >1 and not a product of two smaller numbers 5=1*5 
 * (2,3,5,7,11) 
 */
		int x=2;
		boolean isPrime=true;//ustanovka
		if(x>1) {//parametr
			
			for(int i=2; i<x; i++) {//parametr
				if(x%i==0) {// == is operator that compare an object to the pile of other objects
					        //= is ; % is check for reminder(ostatok)
             isPrime=false;
             break;//terminate inmidiatly and return to the loop
				}
			
			}
		}else {
				isPrime=false;
			
		}
		if(isPrime) {
			System.out.println(x+" is a prime number "+isPrime);
		}else {
			System.out.println(x+" is not prime number");
		}	
			
			
		
		
		//first we set the random exam number (int=10)
		//we know that 0, -1, 1 are not prime
		//we are creating boolean variable isPrime and we are gotn to check it for ture or fallse
		//for that we need if else to check condition
		//we need to say that (a) need to be > then 1, 
		//now we are getting that all negative numbers 
		//also 0 and 1 are out of Prime numbers
		//now we need to exlude numbers which are graiter then 1
		//we are going to use for loop and starting point is 2 becouse 2 is prime 
		//
		
		
	}

}
