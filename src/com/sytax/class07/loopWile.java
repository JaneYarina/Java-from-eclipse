package com.sytax.class07;

public class loopWile {

	public static void main(String[] args) {
	
		int time=1;//if it will = or > then 12 then it will go to "hello" line
		if(time<12) {
			System.out.println("Morning");
			
		}
	System.out.println("------------------------------");
	
	while(time<12) {
		System.out.println("Morning");//infinite, because statement time<12 is true
		//to control loop we put time++ to increment
		time++;
		}
	System.out.println("hello");
	}
	}
	