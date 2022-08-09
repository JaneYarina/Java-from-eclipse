package com.sytax.class07;

public class classWhileLoop01 {

	public static void main(String[] args) {
		int time=1;// value of time is 10. this is initial value
		 if(time<2) {//if time less then 2 then print the statement
			 System.out.println("Morning");//1 print
			 
			 System.out.println("------------------------");
			 
while(time<12) {// while execute infinite times. Value of time still 10. time<12 is termination value
System.out.println("Morning");//infinite time print, code will be stuck
time++;//it  will increment code and printed it 11 times because value of time
	//is 10
	// 11 times it will be true (time++) I'm still confused.
				 
				 
				 
				 
			 }
			
		 }

	}

}
